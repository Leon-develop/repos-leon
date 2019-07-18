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


    
/* Variables para paginacion */     
    private int numPage=0;
    private int numPages=0;
    private String[] columnames;
    private Object[][] data;

   /**
 * Paginacion
 * @param numRegPagina Numero de registros por pagina
 * @param numPage Numero de Pagina
 * @return Matriz nxm con los registros que corresponde a Numero de Pagina dado por numPage
 */ 
   public Object[][]  getPagina( int numPage, int numRegPagina )
   {        
       //Numero de pagina 
       this.numPage = ( numPage<=1 )? 1 : numPage;        

       //Consulta SQL para obtener todos los registros
       String q  = "select idserv,numero,udn,site,host,nameserver,tipo,\n" +
"ip,estado,servicio,sqlversion,edicion,antivirus,sistemaoperativo,\n" +
"sockets,cores,cpu,rammb,ramdinamik,architecture,diskgb,unidadesgb,networkisci,hypervisor,\n" +
"versionhyper,marca,modelo,procesador,servicestag,activo\n" +
"from servidores  inner join udn  on udn.idudn=servidores.idudn\n" +
"inner join site  on site.idsite=servidores.idsite  inner join edicion on edicion.idedicion=servidores.idedicion\n" +
"inner join marca on marca.idmarca=servidores.idmarca\n" +
"order by (site) asc" ;

       Statement st;
       ResultSet rs;

        try {
            st = link.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY );            
            rs = st.executeQuery( q );

            //Obtiene la cantidad total de registros en la tabla
            rs.last();
            int numReg = rs.getRow();            
            rs.first();         

            //calcula posicion de registro de inicio de paginacion
            int fila = numRegPagina * ( this.numPage - 1 ) + 1;           
            this.numPages = numReg / numRegPagina + ((numReg%numRegPagina > 0)? 1 : 0);

            //obtencion de metadatos de la tabla
            //nombre de las columnas
            ResultSetMetaData md = rs.getMetaData(); 
            int numeroColumnas = md.getColumnCount();//numero de columnas de la tabla 
            //recorre las columnas de la tabla y asigna a array de columnas
            columnames = new String[numeroColumnas];
            for (int i = 1; i <= numeroColumnas; i++) 
            {                
                this.columnames[i-1] = md.getColumnName(i);                
            }
            //-- end metadatos

            //Inicia matriz para los registros
            this.data = new String[ numRegPagina ][ numeroColumnas ];
            int cont = 1;
            // Se mueve a la "fila" indicada y si hay datos llena la matriz con los registros
            if ( rs.absolute( fila ) && numRegPagina > 0 ) 
            {
                int f = 0;
                do {                    
                    for (int i = 1; i <= numeroColumnas; i++ ) 
                    {                        
                        data[f][i-1] = rs.getString( i );
                    }                    
                    f++; cont++;
                }
                while ( rs.next() && ( cont <= numRegPagina ) );
            }                   

        } catch ( Exception e ) {
            System.err.println( "Error: "+ e.getMessage() );
        }  

        return data;
   }

   /**
 * @return String[] Nombres de las columnas
 */   
   public String[] ColumNames()
   {       
       return columnames;
   }

   /**
 * @return Numero de pagina actual de paginacion
 */
   public int getNumPage()
   {
       return this.numPage;
   }

   /**
 * Numero total de paginas 
 */
   public int getNumPages()
   {
       return this.numPages;
   }

}//--> fin clase

