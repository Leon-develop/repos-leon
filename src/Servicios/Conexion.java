/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;



/**
 *
 * @author Hector
 */

public class Conexion {     
     private static Connection  link = null;
    public static Connection obtener() {
        if (link == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                link = DriverManager.getConnection("jdbc:mysql://localhost/xcaretservers", "root", "");
                System.out.println("Conexion exitosa");
            } catch (SQLException ex) {
                try {
                    throw new SQLException(ex);
                } catch (SQLException ex1) {
                    Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex1);
                }
            }catch (ClassNotFoundException ex) {
                throw new ClassCastException(ex.getMessage());
            }
        }
        return link;
                
    }
    public static void cerrar() throws SQLException {
        if (link !=null){
            link.close();
            
        }
    }

    static Connection getConnection() {
         return null;
      }


    
    
}
