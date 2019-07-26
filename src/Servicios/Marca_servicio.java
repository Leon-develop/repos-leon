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
import modelo.Marca;
import modelo.Site;

/**
 *
 * @author Leo González
 */
public class Marca_servicio {
    public void guardar(Connection conexion, Marca marca) throws SQLException{
         
          try{
             PreparedStatement consulta;
             if(marca.getIdmarca() == 0){
             consulta=conexion.prepareStatement("INSERT INTO marca(idmarca,marca) VALUES (?,?)");
              consulta.setInt(1, marca.getIdmarca());
             consulta.setString(2, marca.getMarca());
           
             }else{
                 String query =
                 "UPDATE marca SET marca = ? WHERE idmarca =?";
                 consulta = conexion.prepareStatement(query);
                 consulta.setString(1,marca.getMarca());
                 consulta.setInt(2,marca.getIdmarca());
               
             }
             consulta.execute();
         }catch(SQLException ex){
             throw new SQLException(ex);
         }
    
}
     public List<Marca> recuperarTodas(Connection conexion) throws SQLException{
         List<Marca> marca= new ArrayList<>();
    try{
         PreparedStatement consulta = conexion.prepareStatement("select idmarca,marca from marca");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             marca.add( new Marca(resultado.getInt("idmarca"),resultado.getString("marca")));
             
            }
}catch(SQLException ex){
    
    throw new SQLException (ex);
}
    return marca;
    } 
     public static ArrayList<Marca_servicio> lista( Connection con ) {
        try {

           con = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers?serverTimezone=UTC", "root", "");
            ArrayList<Marca_servicio> c = new ArrayList<Marca_servicio>();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM marca";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Marca_servicio cl = new Marca_servicio();
                cl.setIdmarca(rs.getInt(1));
                cl.setMarca(rs.getString(2) );
              
                c.add(cl);
            }
            stmt.close();
            return c;
        } catch( Exception e ) {
            e.printStackTrace();
            return null;
        }}
     private int idmarca;
     private String marca;
     
     public Marca_servicio(){
         this.idmarca = 0;
         this.marca = "";
     }

    public int getIdmarca() {
        return idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
      public void eliminar(Connection conexion, Marca marca) {
            String query="DELETE  FROM marca WHERE idmarca=?";
     try{    
     PreparedStatement consulta=conexion.prepareStatement(query);
         consulta.setInt(1,marca.getIdmarca());
         consulta.executeUpdate();    
     

     }catch (SQLException ex){
             try {
                 throw new SQLException (ex);
             } catch (SQLException ex1) {
                 Logger.getLogger(Marca_servicio.class.getName()).log(Level.SEVERE, null, ex1);
             }
         }
}}


