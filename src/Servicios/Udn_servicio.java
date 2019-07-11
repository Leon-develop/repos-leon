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
import javax.swing.JOptionPane;
import modelo.Udns;
import modelo.Xcaret;
import servidoresxcaret.AgregarUdn;

/**
 *
 * @author heriberto guzman
 */
public class Udn_servicio {
  
   public void guardar(Connection conexion, Udns udns) throws SQLException{
         
          try{
             PreparedStatement consulta;
             if(udns.getIdudn() == 0){
             consulta=conexion.prepareStatement("INSERT INTO udn (idudn,udn) VALUES (?,?)");
              consulta.setInt(1, udns.getIdudn());
             consulta.setString(2, udns.getUdn());
           
             }else{
                 String query =
                 "UPDATE udn SET udn =? WHERE idudn =?";
                 consulta = conexion.prepareStatement(query);
                
                  consulta.setString(1, udns.getUdn());
                 consulta.setInt(2, udns.getIdudn());
              
               
             }
             consulta.execute();
         }catch(SQLException ex){
             throw new SQLException(ex);
         }
    
}
   public List<Udns> recuperarTodas(Connection conexion) throws SQLException{
         List<Udns> udns= new ArrayList<>();
    try{
         PreparedStatement consulta = conexion.prepareStatement("select idudn,udn from udn");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             udns.add( new Udns(resultado.getInt("idudn"),resultado.getString("udn")));
             
            }
}catch(SQLException ex){
    
    throw new SQLException (ex);
}
    return udns;
    }   
     
  public static ArrayList<Udn_servicio> lista( Connection con ) {
        try {

           con = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers?serverTimezone=UTC", "root", "");
            ArrayList<Udn_servicio> c = new ArrayList<Udn_servicio>();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM udn";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Udn_servicio cl = new Udn_servicio();
                cl.setIdudn(rs.getInt(1));
                cl.setUdn(rs.getString(2) );
              
                c.add(cl);
            }
            stmt.close();
            return c;
        } catch( Exception e ) {
            e.printStackTrace();
            return null;
        }}
  
     
     
     
   private int idudn;
   private String udn;
   

    public Udn_servicio() {
        this.idudn = 0;
        this.udn = "";
       
    }

    public int getIdudn() {
        return idudn;
    }

    public void setIdudn (int idudn) {
        this.idudn = idudn;
    }

    public String getUdn() {
        return udn;
    }

    public void setUdn(String udn) {
        this.udn = udn;
    }

  


    public void eliminar(Connection conexion, Udns udns) {
            String query="DELETE  FROM udn WHERE idudn=?";
     try{    
     PreparedStatement consulta=conexion.prepareStatement(query);
         consulta.setInt(1,udns.getIdudn());
         consulta.executeUpdate();    
     

     }catch (SQLException ex){
             try {
                 JOptionPane.showMessageDialog(null, "El registro no se puede eliminar\n "
                         + "porque existen otras dependencias " + ex.getMessage());
                 throw new SQLException (ex);
             } catch (SQLException ex1) {
                 
                 Logger.getLogger(Xcaret_servicio.class.getName()).log(Level.SEVERE, null, ex1);
             }
         }
    }}

    
    
 
    
    


   
     
     
 

