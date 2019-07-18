/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Udn_servicio;
import Vista.VentanaAdmin;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Udns;

/**
 *
 * @author HP
 */
public class AgregarUdn extends javax.swing.JInternalFrame {

    
    private final Udn_servicio udn_servicio = new Udn_servicio();
    private Udns udn;
    private List<Udns> udns;
    Connection conexion;
    

    
     public AgregarUdn() {
        this.udn = new Udns();
        initComponents();
        
      
        
    }
    
     
      private void guardar(){
        
        
         String udn=udnss.getText();
       
        
        //this.producto.setId(id);
        this.udn.setUdn(udn);
           
        try{
            this.udn_servicio.guardar(Conexion.obtener(), this.udn);
                        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
            
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro");
        }
    }
     //

      public AgregarUdn(Udns ad_p){
    initComponents();
    this.udn = ad_p;
    
     this.udnss.setText(this.udn.getUdn());
   
}
 /**
  * pensé en llevarte a la luna 
  * para que no tengas otra opción
  * más que enamorarte de mi,
  * pero despues pienso que puedes enamorarte de un 
  * extraterrestre y se me pasa :(
  */

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        udnss = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setResizable(true);
        setTitle("Agregar Udn");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        udnss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                udnssKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Udn");

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                    .addComponent(udnss))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(udnss, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void udnssKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_udnssKeyTyped

    }//GEN-LAST:event_udnssKeyTyped

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        this.guardar();
       cargar_lista_producto();
            DesktopNotify.showDesktopMessage("Información", " Datos actualizados exitosamente", DesktopNotify.SUCCESS, 4000L);
            this.dispose();
        
    }//GEN-LAST:event_RegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField udnss;
    // End of variables declaration//GEN-END:variables
private void cargar_lista_producto() {
       ConsultarUdn cons = new ConsultarUdn();
        VentanaAdmin.panel.add(cons);
        cons.setVisible(true);
        }  
}
