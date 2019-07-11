/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;
import Servicios.Conexion;
import Servicios.Xcaret_servicio;
import Vista.VentanaAdmin;
import static Vista.VentanaAdmin.estacerrado;
import static Vista.VentanaAdmin.panel;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;


import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.Xcaret;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Leo González
 */
public class ConsultarServers extends javax.swing.JInternalFrame {

   DefaultTableModel dm;
   DefaultTableModel n=new DefaultTableModel();
   


 private final Xcaret_servicio xcaret_servicio = new Xcaret_servicio();
    private List<Xcaret> xcaret;
    private TableRowSorter trsFiltro;
AgregarServers masc;
    public ConsultarServers() {
        initComponents();
         n.addColumn("No");
        n.addColumn("Udn");
        n.addColumn("Site");
        n.addColumn("Host");
        n.addColumn("Nameserver");
        n.addColumn("Tipo");
        n.addColumn("Ip");
        n.addColumn("Status");
        n.addColumn("Servicio");
        n.addColumn("SQL-Versión");
        n.addColumn("Edición");
        n.addColumn("Antivirus");
        n.addColumn("Sistema-Op");
        n.addColumn("Sockets");
        n.addColumn("Cores");
        n.addColumn("CPU");
        n.addColumn("RAM-MB");
        n.addColumn("RAM-Dinamik");
        n.addColumn("Architecture");
        n.addColumn("DiskC-Gb");
        n.addColumn("Unidades-Gb");
        n.addColumn("Network-iSCI");
        n.addColumn("Hpervisor");
        n.addColumn("Versión-Hypervisor");
        n.addColumn("Marca");
        n.addColumn("Modelo");
        n.addColumn("Procesador");
        n.addColumn("Services-Tag");
        n.addColumn("Activo");
        n.addColumn("Fecha");
        this.m.setModel(n);
        this.cargar_lista_producto();
        
    }
AgregarServers abrirventana = new AgregarServers();
 private void cargar_lista_producto(){
        try{
            this.xcaret= this.xcaret_servicio.recuperarTodas(Conexion.obtener());
            /*DefaultTableModel dtm= (DefaultTableModel) tabla.getModel();*/
            n.setRowCount(0);
            for(int i = 0; i < this.xcaret.size(); i++){
                n.addRow(new Object[]{
                this.xcaret.get(i).getNumero(),
                this.xcaret.get(i).getIdudn(),
                this.xcaret.get(i).getIdsite(),
                this.xcaret.get(i).getHost(),
                this.xcaret.get(i).getNameserver(),
                this.xcaret.get(i).getTipo(),
                this.xcaret.get(i).getIp(),
                this.xcaret.get(i).getEstado(),
                this.xcaret.get(i).getServicio(),
                this.xcaret.get(i).getSqlversion(),
                this.xcaret.get(i).getEdicion(),
                this.xcaret.get(i).getAntivirus(),
                this.xcaret.get(i).getSistemaoperativo(),
                this.xcaret.get(i).getSockets(),
                this.xcaret.get(i).getCores(),
                this.xcaret.get(i).getCpu(),
                this.xcaret.get(i).getRammb(),
                this.xcaret.get(i).getRamdinamik(),
                this.xcaret.get(i).getArchitecture(),
                this.xcaret.get(i).getDiskgb(),
                this.xcaret.get(i).getUnidadesgb(),
                this.xcaret.get(i).getNetworkisci(),
                this.xcaret.get(i).getHypervisor(),
                this.xcaret.get(i).getVersionhyper(),
                this.xcaret.get(i).getMarca(),
                this.xcaret.get(i).getModelo(),
                this.xcaret.get(i).getProcesador(),
                this.xcaret.get(i).getServicestag(),
                this.xcaret.get(i).getActivo(),
                this.xcaret.get(i).getFecha()
                        });
                 m.setModel(n);
                 txtcant.setText(""+m.getRowCount());
                
            }
        
        
    }catch(SQLException ex){
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, "Ha surgido un error y no se han podido recuperar los registros");
    }
}
 public static boolean NuevoCons=false;
 
 public void filtro(){
    int columnaABuscar = 0;
        if(comboFiltro.getSelectedItem()=="No"){
            columnaABuscar = 0;
        }
        if ("Udn".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 1;
        }
        if ("Site".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 2;
        }
       if ("Host".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 3;
        }
       if ("NameServer".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 4;
        }
       if ("Tipo".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 5;
        }
       if ("IP".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 6;
        }
       if ("Estado".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 7;
        }
       if ("Marca".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 8;
        }
       if ("Modelo".equals(comboFiltro.getSelectedItem().toString())) {
            columnaABuscar = 9;
        }
       if("Procesador".equals(comboFiltro.getSelectedItem().toString())){
           columnaABuscar = 10;
       }
        trsFiltro.setRowFilter(RowFilter.regexFilter(txtFiltro.getText(), columnaABuscar)); 
 }
 public void abrirventana(){
      ConsultarServers consult = new ConsultarServers();
      panel.add(consult);
      consult.setVisible(true);
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
        Eliminar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        NuevoCoonsul = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        m = new javax.swing.JTable();
        txtFiltro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        comboFiltro = new javax.swing.JComboBox<>();
        pdf = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtcant = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Consultar servers");
        setPreferredSize(new java.awt.Dimension(1000, 593));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

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

        NuevoCoonsul.setText("Nuevo");
        NuevoCoonsul.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                NuevoCoonsulComponentAdded(evt);
            }
        });
        NuevoCoonsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoCoonsulActionPerformed(evt);
            }
        });

        m.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        m.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Udn", "Site", "HOST", "NameServer", "Tipo", "IP", "Estado", "Servicio", "Sql-version", "Edicion", "Antivirus", "Sistema-Operativo", "Sockets", "Cores", "CPU", "Ram-MB", "Ram-Dinamik", "Architecture", "DiskC-GB", "Unidades-Gb", "Network-iSCI", "Hypervisor", "Version-Hypervisor", "Marca", "Modelo", "Mod_Procesador", "Services-Tag", "Activo", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        m.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(m);

        txtFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFiltroKeyTyped(evt);
            }
        });

        jLabel1.setText("Buscar por");

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Udn", "Site", "Host", "NameServer", "Tipo", "IP", "Estado", "Marca", "Modelo", "Procesador" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });
        comboFiltro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                comboFiltroKeyTyped(evt);
            }
        });

        pdf.setText("pdf");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de registros:");

        txtcant.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(NuevoCoonsul, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboFiltro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFiltro)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NuevoCoonsul, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed

    }//GEN-LAST:event_comboFiltroActionPerformed

    private void comboFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_comboFiltroKeyTyped

    }//GEN-LAST:event_comboFiltroKeyTyped

    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFiltroKeyTyped
        txtFiltro.addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(final KeyEvent e) {
                String cadena = (txtFiltro.getText());
                txtFiltro.setText(cadena);
                repaint();
                filtro();
            }

        });
        trsFiltro = new TableRowSorter(m.getModel());
        m.setRowSorter(trsFiltro);
    }//GEN-LAST:event_txtFiltroKeyTyped

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        int fila_seleccionada =m.getSelectedRow();
        if(fila_seleccionada>=0){
            int decision=JOptionPane.showConfirmDialog(this, "Estas Seguro de eliminar este registro?", "Advertencia",JOptionPane.YES_OPTION);
            if(decision==0){
                this.xcaret_servicio.eliminar(Conexion.obtener(),this.xcaret.get(fila_seleccionada));
                
                this.cargar_lista_producto();
            }
        }else{
            JOptionPane.showMessageDialog(this,"Por favor seleccione una fila");
        }

    }//GEN-LAST:event_EliminarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        // TODO add your handling code here:
        int fila_seleccionada = m.getSelectedRow();
        if(fila_seleccionada >=0){
          this.dispose();
          AgregarServers xa=new AgregarServers(this.xcaret.get(fila_seleccionada));
            
           xa.setVisible(true);
            VentanaAdmin.panel.add(xa);
            this.cargar_lista_producto();
            
            
            
        }else{
            JOptionPane.showMessageDialog(this, "Selecciona un registro");

        }
    }//GEN-LAST:event_EditarActionPerformed

    private void NuevoCoonsulComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_NuevoCoonsulComponentAdded

    }//GEN-LAST:event_NuevoCoonsulComponentAdded

    private void NuevoCoonsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoCoonsulActionPerformed
        if(estacerrado(masc)){
            masc= new AgregarServers();
            panel.add(masc);
            masc.setVisible(true);

        }else{
            JOptionPane.showMessageDialog(null, "La ventana Registrar Datos ya esta abierta");

        }

    }//GEN-LAST:event_NuevoCoonsulActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
       Conexion p=new Conexion();
       Connection c=p.obtener();
          try {
            String ruta=System.getProperty("user.dir")+"/src/reportes/reportes.jasper";
            JasperReport jp=(JasperReport)JRLoader.loadObjectFromFile(ruta);
            JasperPrint print=JasperFillManager.fillReport(jp, null,c);
            JasperViewer view=new JasperViewer(print,false);
            view.setVisible(true);
        } catch (JRException ex) {
            Logger.getLogger(ConsultarServers.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    

    }//GEN-LAST:event_pdfActionPerformed

     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Editar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton NuevoCoonsul;
    private javax.swing.JComboBox<String> comboFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable m;
    private javax.swing.JButton pdf;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtcant;
    // End of variables declaration//GEN-END:variables
}
