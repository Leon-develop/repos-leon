/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Site;


/**
 *
 * @author heriberto guzman
 */
public class Site_servicio {
    
public void guardar(Connection conexion, Site site) throws SQLException{
         
          try{
             PreparedStatement consulta;
             if(site.getIdsite() == 0){
             consulta=conexion.prepareStatement("INSERT INTO site(idsite,site) VALUES (?,?)");
              consulta.setInt(1, site.getIdsite());
             consulta.setString(2, site.getSite());
           
             }else{
                 String query =
                 "UPDATE site SET site = ? WHERE idsite =?";
                 consulta = conexion.prepareStatement(query);
                 consulta.setString(1,site.getSite());
                 consulta.setInt(2,site.getIdsite());
               
             }
             consulta.execute();
         }catch(SQLException ex){
             throw new SQLException(ex);
         }
    
}
   public List<Site> recuperarTodas(Connection conexion) throws SQLException{
         List<Site> site= new ArrayList<>();
    try{
         PreparedStatement consulta = conexion.prepareStatement("select idsite,site from site");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             site.add( new Site(resultado.getInt("idsite"),resultado.getString("site")));
             
            }
}catch(SQLException ex){
    
    throw new SQLException (ex);
}
    return site;
    }   
     
  public static ArrayList<Site_servicio> lista( Connection con ) {
        try {

           con = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers?serverTimezone=UTC", "root", "");
            ArrayList<Site_servicio> c = new ArrayList<Site_servicio>();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM site";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Site_servicio cl = new Site_servicio();
                cl.setIdsite(rs.getInt(1));
                cl.setSite(rs.getString(2) );
              
                c.add(cl);
            }
            stmt.close();
            return c;
        } catch( Exception e ) {
            e.printStackTrace();
            return null;
        }}
  
     
     
     
   private int idsite;
   private String site;
   

    public Site_servicio() {
        this.idsite = 0;
        this.site = "";
       
    }

    public int getIdsite() {
        return idsite;
    }

    public void setIdsite (int idsite) {
        this.idsite = idsite;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

  


    public void eliminar(Connection conexion, Site site) {
            String query="DELETE  FROM site WHERE idsite=?";
     try{    
     PreparedStatement consulta=conexion.prepareStatement(query);
         consulta.setInt(1,site.getIdsite());
         consulta.executeUpdate();    
     

     }catch (SQLException ex){
             try {
                 throw new SQLException (ex);
             } catch (SQLException ex1) {
                 Logger.getLogger(Site_servicio.class.getName()).log(Level.SEVERE, null, ex1);
             }
         }
}}
