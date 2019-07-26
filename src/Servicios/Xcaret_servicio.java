/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Udns;
import modelo.Xcaret;
import servidoresxcaret.AgregarServers;

/**
 *
 * @author HP
 */
public class Xcaret_servicio {
    

   public void guardar(Connection conexion, Xcaret xcaret) throws SQLException {
         
          try{
             PreparedStatement consulta;
             if(xcaret.getIdserv() == 0){
             consulta=conexion.prepareStatement("INSERT INTO servidores (idserv,numero,idudn,idsite,host,"
             + "nameserver,tipo,ip,estado,servicio, sqlversion, idedicion, antivirus, sistemaoperativo, sockets, cores, "
                     + "cpu, rammb,ramdinamik,architecture,diskgb,unidadesgb,networkisci,hypervisor,versionhyper,idmarca,modelo,procesador,servicestag,activo)"
                     + " VALUES (?, ?, (select idudn from udn where udn=?), (select idsite from site where site=?), ?, ?, ?, ?, ?, ?, ?, (select idedicion from edicion where edicion=?), ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,(select idmarca from marca where marca=?), ?, ?, ?, ?)");
             consulta.setInt(1, xcaret.getIdserv());
             consulta.setString(2, xcaret.getNumero());
             consulta.setString(3, xcaret.getIdudn());
             consulta.setString(4, xcaret.getIdsite());
             consulta.setString(5, xcaret.getHost());
             consulta.setString(6, xcaret.getNameserver());
             consulta.setString(7, xcaret.getTipo());
             consulta.setString(8, xcaret.getIp());
             consulta.setString(9, xcaret.getEstado());
             consulta.setString(10,xcaret.getServicio()); 
             consulta.setString(11, xcaret.getSqlversion());
             consulta.setString(12, xcaret.getIdedicion());
             consulta.setString(13, xcaret.getAntivirus());
             consulta.setString(14, xcaret.getSistemaoperativo());
             consulta.setString(15, xcaret.getSockets());
             consulta.setString(16, xcaret.getCores());
             consulta.setString(17, xcaret.getCpu());
             consulta.setString(18, xcaret.getRammb());
             consulta.setString(19, xcaret.getRamdinamik());
             consulta.setString(20, xcaret.getArchitecture());
             consulta.setString(21, xcaret.getDiskgb());
             consulta.setString(22, xcaret.getUnidadesgb());
             consulta.setString(23, xcaret.getNetworkisci());
             consulta.setString(24, xcaret.getHypervisor());
             consulta.setString(25, xcaret.getVersionhyper());
             consulta.setString(26, xcaret.getIdmarca());
             consulta.setString(27, xcaret.getModelo());
             consulta.setString(28, xcaret.getProcesador());
             consulta.setString(29, xcaret.getServicestag());
             consulta.setString(30, xcaret.getActivo());
            
          
             
             }else{
                 String query =
                 "UPDATE servidores SET numero = ?, idudn = (select idudn from udn where udn=?), idsite =(select idsite from site where site=?), host = ?, nameserver = ?, tipo = ?,"
                 + "ip = ?, estado = ?, servicio = ?, sqlversion = ?,idedicion =(select idedicion from edicion where edicion=?),antivirus=?,sistemaoperativo=?,sockets=?,"
                         + "cores=?,cpu=?,rammb=?,ramdinamik=?,architecture=?,diskgb=?,unidadesgb=?,networkisci=?,"
                         + " hypervisor=?,versionhyper=?, idmarca = (select idmarca from marca where marca=?), modelo = ?, "
                         + "procesador = ?,servicestag=?,activo=? WHERE idserv =?";
                 consulta = conexion.prepareStatement(query);
                 consulta.setString(1, xcaret.getNumero());
                 consulta.setString(2, xcaret.getIdudn());
                 consulta.setString(3, xcaret.getIdsite());
                 consulta.setString(4, xcaret.getHost());
                 consulta.setString(5, xcaret.getNameserver());
                 consulta.setString(6, xcaret.getTipo());
                 consulta.setString(7, xcaret.getIp());
                 consulta.setString(8, xcaret.getEstado());
                 consulta.setString(9, xcaret.getServicio());
                 consulta.setString(10, xcaret.getSqlversion());
                 consulta.setString(11, xcaret.getIdedicion());
                 consulta.setString(12, xcaret.getAntivirus());
                 consulta.setString(13, xcaret.getSistemaoperativo());
                 consulta.setString(14, xcaret.getSockets());
                 consulta.setString(15, xcaret.getCores());
                 consulta.setString(16, xcaret.getCpu());
                 consulta.setString(17, xcaret.getRammb());
                 consulta.setString(18, xcaret.getRamdinamik());
                 consulta.setString(19, xcaret.getArchitecture());
                 consulta.setString(20, xcaret.getDiskgb());
                 consulta.setString(21, xcaret.getUnidadesgb());
                 consulta.setString(22, xcaret.getNetworkisci());
                 consulta.setString(23, xcaret.getHypervisor());
                 consulta.setString(24, xcaret.getVersionhyper());
                 consulta.setString(25, xcaret.getIdmarca());
                 consulta.setString(26, xcaret.getModelo());
                 consulta.setString(27, xcaret.getProcesador());
                 consulta.setString(28, xcaret.getServicestag());
                 consulta.setString(29, xcaret.getActivo());
                 consulta.setInt(30, xcaret.getIdserv());
             }
             consulta.execute();
         }catch(SQLException ex){
             throw new SQLException(ex);
         }
   }
  
  public static ArrayList<Xcaret_servicio> lista( Connection con ) {
        try {

           con = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers?serverTimezone=UTC", "root", "");
            ArrayList<Xcaret_servicio> c = new ArrayList<Xcaret_servicio>();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM servidores";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Xcaret_servicio cl = new Xcaret_servicio();
                cl.setIdserv (rs.getInt(1));
                cl.setNumero (rs.getString(2));
                cl.setIdudn(rs.getString(3) );
                cl.setIdsite(rs.getString(4) );
                cl.setHost(rs.getString(5) );
                cl.setNameserver(rs.getString(6) );
                cl.setTipo(rs.getString(7) );
                cl.setIp(rs.getString(8));
                cl.setEstado(rs.getString(9));
                cl.setServicio(rs.getString(10));
                cl.setSqlversion(rs.getString(11));
                cl.setIdedicion(rs.getString(12));
                cl.setAntivirus(rs.getString(13));
                cl.setSistemaoparativo(rs.getString(14));
                cl.setSockets(rs.getString(15));
                cl.setCores(rs.getString(16));
                cl.setCpu(rs.getString(17));
                cl.setRammb(rs.getString(18));
                cl.setRamdinamik(rs.getString(19));
                cl.setArchitecture(rs.getString(20));
                cl.setDiskgb(rs.getString(21));
                cl.setUnidadesgb(rs.getString(22));
                cl.setNetworkisci(rs.getString(23));
                cl.setHypervisor(rs.getString(24));
                cl.setVersionhyper(rs.getString(25));
                cl.setIdmarca(rs.getString(26));
                cl.setModelo(rs.getString(27));
                cl.setProcesador(rs.getString(28));
                cl.setServicestag(rs.getString(29));
                cl.setActivo(rs.getString(30));
             
                c.add(cl);
            }
            stmt.close();
            return c;
        } catch( Exception e ) {
            e.printStackTrace();
            return null;
        }
    }   
     
    int idserv;
    String numero;
    String idudn;
    String idsite;
    String host;
    String nameserver;
    String tipo;
    String ip;
    String estado;
    String servicio;
    String sqlversion;
    String idedicion;
    String antivirus;
    String sistemaoparativo;
    String sockets;
    String cores;
    String cpu;
    String rammb;
    String ramdinamik;
    String architecture;
    String diskgb;
    String unidadesgb;
    String networkisci;
    String hypervisor;
    String versionhyper;
    String idmarca;
    String modelo;
    String procesador;
    String servicestag;
    String activo;

    
    public Xcaret_servicio() {
        this.idserv = 0;
        this.numero = "";
        this.idudn = "";
        this.idsite="";
        this.host = "";
        this.nameserver = "";
        this.tipo = "";
        this.ip = "";
        this.estado = "";
        this.servicio = "";
        this.sqlversion = "";
        this.idedicion = "";
        this.antivirus = "";
        this.sistemaoparativo = "";
        this.sockets = "";
        this.cores = "";
        this.cpu = "";
        this.rammb = "";
        this.ramdinamik = "";
        this.architecture = "";
        this.diskgb = "";
        this.unidadesgb = "";
        this.networkisci = "";
        this.hypervisor = "";
        this.versionhyper = "";
        this.idmarca = "";
        this.modelo = "";
        this.procesador = "";
        this.servicestag = "";
        this.activo = "";
    
    }

    public int getIdserv() {
        return idserv;
    }

    public void setIdserv(int idserv) {
        this.idserv = idserv;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIdudn() {
        return idudn;
    }

    public void setIdudn(String idudn) {
        this.idudn = idudn;
    }

    public String getIdsite() {
        return idsite;
    }

    public void setIdsite(String idsite) {
        this.idsite = idsite;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getNameserver() {
        return nameserver;
    }

    public void setNameserver(String nameserver) {
        this.nameserver = nameserver;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getSqlversion() {
        return sqlversion;
    }

    public void setSqlversion(String sqlversion) {
        this.sqlversion = sqlversion;
    }

    public String getIdedicion() {
        return idedicion;
    }

    public void setIdedicion(String idedicion) {
        this.idedicion = idedicion;
    }

    public String getAntivirus() {
        return antivirus;
    }

    public void setAntivirus(String antivirus) {
        this.antivirus = antivirus;
    }

    public String getSistemaoparativo() {
        return sistemaoparativo;
    }

    public void setSistemaoparativo(String sistemaoparativo) {
        this.sistemaoparativo = sistemaoparativo;
    }

    public String getSockets() {
        return sockets;
    }

    public void setSockets(String sockets) {
        this.sockets = sockets;
    }

    public String getCores() {
        return cores;
    }

    public void setCores(String cores) {
        this.cores = cores;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRammb() {
        return rammb;
    }

    public void setRammb(String rammb) {
        this.rammb = rammb;
    }

    public String getRamdinamik() {
        return ramdinamik;
    }

    public void setRamdinamik(String ramdinamik) {
        this.ramdinamik = ramdinamik;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    public String getDiskgb() {
        return diskgb;
    }

    public void setDiskgb(String diskgb) {
        this.diskgb = diskgb;
    }

    public String getUnidadesgb() {
        return unidadesgb;
    }

    public void setUnidadesgb(String unidadesgb) {
        this.unidadesgb = unidadesgb;
    }

    public String getNetworkisci() {
        return networkisci;
    }

    public void setNetworkisci(String networkisci) {
        this.networkisci = networkisci;
    }

    public String getHypervisor() {
        return hypervisor;
    }

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    public String getVersionhyper() {
        return versionhyper;
    }

    public void setVersionhyper(String versionhyper) {
        this.versionhyper = versionhyper;
    }

    public String getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(String marca) {
        this.idmarca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getServicestag() {
        return servicestag;
    }

    public void setServicestag(String servicestag) {
        this.servicestag = servicestag;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

   
  

 public List<Xcaret> recuperarTodas(Connection conexion) throws SQLException{
         List<Xcaret> xcaret = new ArrayList<>();
    try{
 PreparedStatement consulta = conexion.prepareStatement("select idserv,numero,udn,site,host,nameserver,tipo,\n" +
"ip,estado,servicio,sqlversion,edicion,antivirus,sistemaoperativo,\n" +
"sockets,cores,cpu,rammb,ramdinamik,architecture,diskgb,unidadesgb,networkisci,hypervisor,\n" +
"versionhyper,marca,modelo,procesador,servicestag,activo\n" +
"from servidores  inner join udn  on udn.idudn=servidores.idudn\n" +
"inner join site  on site.idsite=servidores.idsite  inner join edicion on edicion.idedicion=servidores.idedicion\n" +
"inner join marca on marca.idmarca=servidores.idmarca\n" +
"order by (idserv) asc");
ResultSet resultado = consulta.executeQuery();
while(resultado.next()){
 xcaret.add( new Xcaret(resultado.getInt("idserv"),resultado.getString("numero"), resultado.getString("udn")
 ,resultado.getString("site"),resultado.getString("host"), resultado.getString("nameserver"), resultado.getString("tipo")
 ,resultado.getString("ip"),resultado.getString("estado"),resultado.getString("servicio"),resultado.getString("sqlversion"),
 resultado.getString("edicion"),resultado.getString("antivirus"),resultado.getString("sistemaoperativo"),
 resultado.getString("sockets"),resultado.getString("cores"),resultado.getString("cpu"),resultado.getString("rammb"),
 resultado.getString("ramdinamik"),resultado.getString("architecture"),resultado.getString("diskgb"),
 resultado.getString("unidadesgb"),resultado.getString("networkisci"),resultado.getString("hypervisor"),
 resultado.getString("versionhyper"), resultado.getString("marca")
 ,resultado.getString("modelo"),resultado.getString("procesador"),resultado.getString("servicestag"),resultado.getString("activo")));
             
            }
}catch(SQLException ex){
    
    throw new SQLException (ex);
}
    return xcaret;
    }

    public void eliminar(Connection conexion, Xcaret xcaret)  {
         String query="DELETE  FROM servidores WHERE idserv=?";
     try{    
     PreparedStatement consulta=conexion.prepareStatement(query);
         consulta.setInt(1,xcaret.getIdserv());
         consulta.executeUpdate();    
     

     }catch (SQLException ex){
             try {
                 throw new SQLException (ex);
             } catch (SQLException ex1) {
                 Logger.getLogger(Xcaret_servicio.class.getName()).log(Level.SEVERE, null, ex1);
             }
     }
 
    }  
    
}
   

    

   
     
     
     
