/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Udn_servicio;
import Servicios.Xcaret_servicio;
import Vista.VentanaAdmin;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Udns;
import modelo.Xcaret;

/**
 *
 * @author heriberto guzman
 */
public class ConsultarUdn extends javax.swing.JInternalFrame {
 DefaultTableModel n=new DefaultTableModel();
 private final Udn_servicio udn_servicio = new Udn_servicio();
    private List<Udns> udns;
     private TableRowSorter trsFiltro;
    /**
     * Creates new form ConsultarUdn
     */
    public ConsultarUdn() {
        initComponents();
         n.addColumn("Idudn");
        n.addColumn("Udn");
        this.m.setModel(n);
        this.cargar_lista_producto();
    }


    /**
     * Creates new form ConsultarXc
     */
  
 private void cargar_lista_producto(){
        try{
            this.udns= this.udn_servicio.recuperarTodas(Conexion.obtener());
            /*DefaultTableModel dtm= (DefaultTableModel) tabla.getModel();*/
            n.setRowCount(0);
            for(int i = 0; i < this.udns.size(); i++){
                n.addRow(new Object[]{
                this.udns.get(i).getIdudn(),
                this.udns.get(i).getUdn(),
              
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
        jScrollPane2 = new javax.swing.JScrollPane();
        m = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setIconifiable(true);
        setTitle("Consultar Udn");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        m.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero", "Unidad de Negocio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        m.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(m);

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel1.setText("Buscar por Unidad de negocio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(Eliminar)
                .addGap(111, 111, 111)
                .addComponent(Editar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar)
                    .addComponent(Editar)))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        int fila_seleccionada = m.getSelectedRow();
        if(fila_seleccionada >=0){
            this.dispose();
            AgregarUdn xa=new AgregarUdn(this.udns.get(fila_seleccionada));

            xa.setVisible(true);
            VentanaAdmin.panel.add(xa);

        }else{
            JOptionPane.showMessageDialog(this, "Selecciona un registro");

        }
    }//GEN-LAST:event_EditarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila_seleccionada =m.getSelectedRow();
        if(fila_seleccionada>=0){
            int decision=JOptionPane.showConfirmDialog(this, "Estas Seguro de eliminar este registro?", "Advertencia",JOptionPane.YES_OPTION);
            if(decision==0){
                this.udn_servicio.eliminar(Conexion.obtener(),this.udns.get(fila_seleccionada));
                this.cargar_lista_producto();
            }
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione una fila");
        }

    }//GEN-LAST:event_EliminarActionPerformed

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
       txtFiltro.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText()).toUpperCase();
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }

        });
        trsFiltro = new TableRowSorter(m.getModel());
        m.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

  public void filtro() {
trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), 1));
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable m;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
