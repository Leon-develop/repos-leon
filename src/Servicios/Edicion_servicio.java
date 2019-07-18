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
import modelo.Edicion;


/**
 *
 * @author Leo González
 */
public class Edicion_servicio {
    public void guardar(Connection conexion, Edicion edicion) throws SQLException{
        try{
        PreparedStatement consulta;
        if(edicion.getIdedicion()== 0){
            consulta= conexion.prepareStatement("INSERT INTO edicion (idedicion , edicion) VALUES (?,?)");
            consulta.setInt(1, edicion.getIdedicion());
            consulta.setString(2, edicion.getEdicion());
        }else{
            String query=
                    "UPDATE edicion SET edicion = ? WHERE idedicion=?";
            consulta = conexion.prepareStatement(query);
            consulta.setString(1, edicion.getEdicion());
            consulta.setInt(2, edicion.getIdedicion());
        }
        consulta.execute();
    }catch(SQLException ex){
        throw new SQLException(ex);
    }
    }
    public List<Edicion> recuperarTodas(Connection conexion) throws SQLException{
         List<Edicion> edicion= new ArrayList<>();
    try{
         PreparedStatement consulta = conexion.prepareStatement("select idedicion, edicion from edicion");
         ResultSet resultado = consulta.executeQuery();
         while(resultado.next()){
             edicion.add( new Edicion(resultado.getInt("idedicion"),resultado.getString("edicion")));
             
            }
}catch(SQLException ex){
    
    throw new SQLException (ex);
}
    return edicion;
    } 
    public static ArrayList<Edicion_servicio> lista( Connection con ) {
        try {

           con = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers?serverTimezone=UTC", "root", "");
            ArrayList<Edicion_servicio> c = new ArrayList<Edicion_servicio>();
            Statement stmt = con.createStatement();
            String query = "SELECT * FROM edicion";
            System.out.println(query);
            ResultSet rs = stmt.executeQuery(query);
            while( rs.next() ) {
                Edicion_servicio cl = new Edicion_servicio();
                cl.setIdedicion(rs.getInt(1));
                cl.setEdicion(rs.getString(2) );
              
                c.add(cl);
            }
            stmt.close();
            return c;
        } catch( Exception e ) {
            e.printStackTrace();
            return null;
        }}
    
    private int idedicion;
    private String edicion;
    
    public Edicion_servicio(){
        this.idedicion = 0;
        this.edicion = "";
    }

    public int getIdedicion() {
        return idedicion;
    }

    public void setIdedicion(int idedicion) {
        this.idedicion = idedicion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
    public void eliminar(Connection conexion, Edicion edicion) {
            String query="DELETE  FROM edicion WHERE idedicion=?";
     try{    
     PreparedStatement consulta=conexion.prepareStatement(query);
         consulta.setInt(1,edicion.getIdedicion());
         consulta.executeUpdate();    
     

     }catch (SQLException ex){
             try {
                 throw new SQLException (ex);
             } catch (SQLException ex1) {
                 Logger.getLogger(Edicion_servicio.class.getName()).log(Level.SEVERE, null, ex1);
             }
         }
}
    
}
    
    

