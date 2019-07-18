/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Edicion_servicio;
import Vista.VentanaAdmin;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Edicion;



/**
 *
 * @author Leo González
 */
public class ConsultarEdicion extends javax.swing.JInternalFrame {
    DefaultTableModel n=new DefaultTableModel();
 private final Edicion_servicio edicion_servicio = new Edicion_servicio();
 private List<Edicion> edit;

    /**
     * Creates new form ConsultarMarca
     */
    public ConsultarEdicion() {
        initComponents();
        n.addColumn("ID");
        n.addColumn("Edición");
        this.si.setModel(n);
        this.cargar_lista_edicion();
    }
private void cargar_lista_edicion(){
     try{
            this.edit= this.edicion_servicio.recuperarTodas(Conexion.obtener());
            /*DefaultTableModel dtm= (DefaultTableModel) tabla.getModel();*/
            n.setRowCount(0);
            for(int i = 0; i < this.edit.size(); i++){
                n.addRow(new Object[]{
                this.edit.get(i).getIdedicion(),
                this.edit.get(i).getEdicion(),
              
                        });
                
            }
        
        
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
    }


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
        jScrollPane1 = new javax.swing.JScrollPane();
        si = new javax.swing.JTable();
        eliminar = new javax.swing.JButton();
        editar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Edición");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        si.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Num", "Site"
            }
        ));
        jScrollPane1.setViewportView(si);

        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarMousePressed(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar)
                    .addComponent(editar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        int fila_seleccionada =si.getSelectedRow();
        if(fila_seleccionada>=0){
            int decision=JOptionPane.showConfirmDialog(this, "Estas Seguro de eliminar este registro?", "Advertencia",JOptionPane.YES_OPTION);
            if(decision==0){
                this.edicion_servicio.eliminar(Conexion.obtener(),this.edit.get(fila_seleccionada));
                this.cargar_lista_edicion();
            }
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione una fila");
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        int fila_seleccionada = si.getSelectedRow();
        if(fila_seleccionada >=0){
            this.dispose();
            AgregarEdicion xa=new AgregarEdicion(this.edit.get(fila_seleccionada));

            xa.setVisible(true);
            VentanaAdmin.panel.add(xa);

        }else{
            JOptionPane.showMessageDialog(this, "Selecciona un registro");

        }
    }//GEN-LAST:event_editarActionPerformed

    private void eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMousePressed
        
    }//GEN-LAST:event_eliminarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable si;
    // End of variables declaration//GEN-END:variables
}
