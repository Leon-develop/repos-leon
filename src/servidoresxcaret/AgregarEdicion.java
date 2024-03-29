/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Edicion_servicio;
import Vista.VentanaAdmin;
import ds.desktop.notify.DesktopNotify;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Edicion;

/**
 *
 * @author Leo González
 */
public class AgregarEdicion extends javax.swing.JInternalFrame {
    private final Edicion_servicio edicion_servicio = new Edicion_servicio();
    private Edicion edit;
    private List<Edicion> edits;
    Connection conexion;


    
    public AgregarEdicion() {
        initComponents();
        this.setLocation(450, 220);
        jPanel1.setFocusable(true);
        this.edit = new Edicion();
    }
    private void guardar(){
        String ided = edition.getText();
        
        this.edit.setEdicion(ided);
        
        try{
            this.edicion_servicio.guardar(Conexion.obtener(), this.edit);
                        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
            
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se ha podido guardar el registro");
        }
    
}
    public AgregarEdicion(Edicion ad_p){
        initComponents();
        this.edit = ad_p;
        this.edition.setText(this.edit.getEdicion());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        edition = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Edición");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        edition.setText("Nombre de la edicion");
        edition.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editionFocusLost(evt);
            }
        });
        edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editionActionPerformed(evt);
            }
        });
        edition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                editionKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Edicion");

        Registrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrarMouseExited(evt);
            }
        });
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
                    .addComponent(edition, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edition, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editionActionPerformed

    private void editionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editionKeyTyped

    }//GEN-LAST:event_editionKeyTyped

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(edition.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No puedes dejar campos vacios");
        }else{
            guardar();
            cargar_lista_edicion();
            DesktopNotify.showDesktopMessage("INFORMACIÓN", "Datos guardados con exito", DesktopNotify.SUCCESS,5000L);
            this.dispose();
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void editionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editionFocusGained
       if(edition.getText().trim().equals("Nombre de la edicion")){
           edition.setText("");
       }
       edition.setForeground(Color.blue);
    }//GEN-LAST:event_editionFocusGained

    private void editionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editionFocusLost
       if(edition.getText().trim().equals("")){
           edition.setText("Nombre de la edicion");
       }
       edition.setForeground(new Color(135, 135, 100));
    }//GEN-LAST:event_editionFocusLost

    private void RegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseEntered
        Registrar.setBackground(Color.green);
    }//GEN-LAST:event_RegistrarMouseEntered

    private void RegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarMouseExited
        Registrar.setBackground(new Color(204,204,255));
    }//GEN-LAST:event_RegistrarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Registrar;
    private javax.swing.JTextField edition;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private void cargar_lista_edicion() {
     ConsultarEdicion consE = new ConsultarEdicion();
        VentanaAdmin.panel.add(consE);
        consE.setVisible(true);
    }
}
