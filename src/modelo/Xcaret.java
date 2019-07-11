/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.sql.Date;
import java.util.Calendar;



/**
 *
 * @author heriberto guzman
 */
public class Xcaret {
  
   private   int idserv;
   private String numero;
   private String idudn;
   private String  idsite;
   private String host;
   private String nameserver;
   private String tipo;
   private String ip;
   private String estado;
   private String servicio;
   private String sqlversion;
   private String edicion;
   private String antivirus;
   private String sistemaoperativo;
   private String sockets;
   private String cores;
   private String cpu;
   private String rammb;
   private String ramdinamik;
   private String architecture;
   private String diskgb;
   private String unidadesgb;
   private String networkisci;
   private String hypervisor;
   private String versionhyper;
   private String marca;  
   private String modelo;   
   private String procesador;
   private String servicestag;
   private String activo;
   private String fecha;
  
    public Xcaret() {
  
        this.idserv = 0;
        this.numero = null;
        this.idudn = null;
        this.idsite = null;
        this.host = null;
        this.nameserver = null;
        this.tipo = null;
        this.ip = null;
        this.estado = null;
        this.servicio = null;
        this.sqlversion = null;
        this.edicion = null;
        this.antivirus = null;
        this.sistemaoperativo = null;
        this.sockets = null;
        this.cores = null;
        this.cpu = null;
        this.rammb = null;
        this.ramdinamik = null;
        this.architecture = null;
        this.diskgb = null;
        this.unidadesgb = null;
        this.networkisci = null;
        this.hypervisor = null;
        this.versionhyper = null;
        this.marca = null;
        this.modelo = null;
        this.procesador = null;
        this.servicestag = null;
        this.activo = null;
        this.fecha = null;
    }
    public Xcaret(int idserv, String numero, String idudn, String idsite, String host, String nameserver, 
        String tipo, String ip, String estado, String servicio, String sqlversion, String edicion, String antivirus,
        String sistemaoperativo, String sockets, String cores, String cpu, String rammb, String ramdinamik, String architecture,
        String diskgb, String unidadesgb, String networkisci, String hypervisor, String versionhyper, String marca, String modelo,
        String procesador, String servicestag, String activo, String fecha){
        
        this.idserv = idserv;
        this.numero = numero;
        this.idudn = idudn;
        this.idsite = idsite;
        this.host = host;
        this.nameserver = nameserver;
        this.tipo = tipo;
        this.ip = ip;
        this.estado = estado;
        this.servicio = servicio;
        this.sqlversion = sqlversion;
        this.edicion = edicion;
        this.antivirus = antivirus;
        this.sistemaoperativo = sistemaoperativo;
        this.sockets = sockets;
        this.cores = cores;
        this.cpu = cpu;
        this.rammb = rammb;
        this.ramdinamik = ramdinamik;
        this.architecture = architecture;
        this.diskgb = diskgb;
        this.unidadesgb = unidadesgb;
        this.networkisci = networkisci;
        this.hypervisor = hypervisor;
        this.versionhyper = versionhyper;
        this.marca = marca;
        this.modelo = modelo;
        this.procesador = procesador;
        this.servicestag = servicestag;
        this.activo = activo;
        this.fecha = fecha;
    }
    
 public int getIdserv() {
        return idserv;
    }
    public void setIdserv(int idserv) {
        this.idserv = idserv;
        }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
       this.numero = numero; 
    }
    public String getIdudn() {
        return idudn;
    }
    public void setIdudn(String idudn) {
        this.idudn = idudn;
        }
  public  String getIdsite() {
        return idsite;
    }
    public void setIdsite( String idsite) {
        this.idsite = idsite;
        }
 public String getHost() {
        return host;
    }
    public void setHost(String host) {
        this.host=host;
        
         }
 public String getNameserver() {
        return nameserver;
    }
    public void setNameserver(String nameserver) {
        this.nameserver=nameserver;
        }
 public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo=tipo;
        }
 public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip=ip;
          }
 public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado=estado;
         }
    public String getServicio(){
        return servicio;
    }
    public void setServicio(String servicio){
        this.servicio = servicio;
    }
    public String getSqlversion(){
        return sqlversion;
    }
    public void setSqlversion(String sqlversion){
        this.sqlversion = sqlversion;
    }
    public String getEdicion(){
        return edicion;
    }
    public void setEdicion(String edicion){
        this.edicion = edicion;
    }
    public String getAntivirus(){
        return antivirus;
    }
    public void setAntivirus(String antivirus){
        this.antivirus = antivirus;
    }
    public String getSistemaoperativo(){
        return sistemaoperativo;
    }
    public void setSistemaoperativo(String sistemaoperativo){
        this.sistemaoperativo = sistemaoperativo;
    }
    public String getSockets(){
        return sockets;
    }
    public void setSockets(String sockets){
        this.sockets = sockets;
    }
    public String getCores(){
        return cores;
    }
    public void setCores(String cores){
        this.cores = cores;
    }
    public String getCpu(){
        return cpu;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public String getRammb(){
        return rammb;
    }
    public void setRammb(String rammb){
        this.rammb = rammb;
    }
    public String getRamdinamik() {
        return ramdinamik;
    }

    public void setRamdinamik(String ramdinamik) {
        this.ramdinamik = ramdinamik;
    }
    public String getArchitecture(){
        return architecture;
    }
    public void setArchitecture(String architecture){
        this.architecture = architecture;
    }
    public String getDiskgb(){
        return diskgb;
    }
    public void setDiskgb(String diskgb){
        this.diskgb = diskgb;
    }
    public String getUnidadesgb(){
        return unidadesgb;
    }
    public void setUnidadesgb(String unidadesgb){
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

    public String getServicestag() {
        return servicestag;
    }
   public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
            this.marca=marca;
        }
   public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo=modelo;
       }
   public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador=procesador;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
     
        
        this.fecha = fecha;// 
    }
   
 
   
   
   public String toString() {
   return "Xcaret{" + "idserv=" + idserv +", numero="+ numero + ",idudn="+idudn+",idsite="+idsite+", "
   + " nameserver=" + nameserver + ", tipo=" + tipo + ", ip=" + ip + ", estado=" + estado +",servicio=" +servicio
   +",sqlversion="+sqlversion +", edicion="+edicion+",sistemaoperativo="+sistemaoperativo
   +",sockets="+sockets+",cores"+cores+",cpu="+cpu+",rammb="+rammb+",ramdinamik="+ramdinamik+",architecture="+architecture
   +",diskgb="+diskgb+", unidadesgb="+unidadesgb+",networkisci="+networkisci+",hypervisor="+hypervisor
   +",versionhyper="+versionhyper+", marca=" + marca 
   +", modelo=" + modelo +", procesador=" + procesador +",servicestag="+servicestag +", activo="+activo+",fecha="+fecha + '}';
    }

    public void setFecha(Date fechaParseada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}