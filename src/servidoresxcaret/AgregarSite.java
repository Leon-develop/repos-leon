/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Site_servicio;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import modelo.Site;
import modelo.Udns;

/**
 *
 * @author heriberto guzman
 */
public class AgregarSite extends javax.swing.JInternalFrame {
 
    private final Site_servicio site_servicio = new Site_servicio();
    private Site sit;
    private List<Site> sites;
    Connection conexion;
    
   
    public AgregarSite() {
        getContentPane().setBackground(java.awt.Color.gray);
        initComponents();
        this.sit = new Site();
    }

   
    
     
      private void guardar(){
        
        //String id=ID.getText();
        String sited=site.getText();
       
        
        //this.producto.setId(id);
        this.sit.setSite(sited);
           
        try{
            this.site_servicio.guardar(Conexion.obtener(), this.sit);
                        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
            
            JOptionPane.showMessageDialog(this, "Error:No se ha podido Gurdar\nDatos ya fue registrado Anteriomente");
        this.limpiar();
        }
    }
     //

      public AgregarSite(Site ad_p){
    initComponents();
    this.sit = ad_p;
    //this.ID.setText(this.producto.getId());
     this.site.setText(this.sit.getSite());
//yeahhh.....................
   
}
      public void limpiar(){
    this.site.setText(null);
}
    /**
     * Creates new form AgregarSite
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        site = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Site");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        site.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteActionPerformed(evt);
            }
        });
        site.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                siteKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Site");

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
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(site, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(site, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(site.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
       }else{
        guardar();
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void siteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siteKeyTyped

    }//GEN-LAST:event_siteKeyTyped

    private void siteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField site;
    // End of variables declaration//GEN-END:variables
}
