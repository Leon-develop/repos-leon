/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;




import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import servidoresxcaret.AgregarServers;
import servidoresxcaret.ConsultarServers;


/**
 *
 * @author Leo González
 */
public class VentanaInvitado extends javax.swing.JFrame {

AgregarServers masc;
ConsultarServers cons;

public static boolean estacerrado(Object obj){
JInternalFrame[] activos=panel.getAllFrames();
boolean cerrado=true;
int i=0;
while (i<activos.length && cerrado){
if(activos[i]==obj){
cerrado=false;
}
i++;
}
return cerrado;
}
    
public static boolean vXcestacerrado(Object obj){
JInternalFrame[] activos=panel.getAllFrames();
boolean cerrado=true;
int i=0;
while (i<activos.length && cerrado){
if(activos[i]==obj){
cerrado=false;
}
i++;
}
return cerrado;
}
public static boolean vNIFcestacerrado(Object obj){
JInternalFrame[] activos=panel.getAllFrames();
boolean cerrado=true;
int i=0;
while (i<activos.length && cerrado){
if(activos[i]==obj){
cerrado=false;
}
i++;
}
return cerrado;
}
    public VentanaInvitado() {
    
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        lblconectado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        logout = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        AgregarServers = new javax.swing.JMenuItem();
        Consserv = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        probando = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory-Servers-Xcaret");

        lblconectado.setText("jLabel1");

        jLabel1.setText("Usuario conectado:");

        panel.setLayer(lblconectado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblconectado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(631, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblconectado)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/imagenes/archivo.jpg"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        logout.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        logout.setText("Cerrar sesión");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        exit.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Servidores");

        AgregarServers.setText("Agregar");
        AgregarServers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarServersActionPerformed(evt);
            }
        });
        jMenu3.add(AgregarServers);

        Consserv.setText("Consultar");
        Consserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsservActionPerformed(evt);
            }
        });
        jMenu3.add(Consserv);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("UDN");

        probando.setText("newjinternalframe");
        probando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                probandoActionPerformed(evt);
            }
        });
        jMenu4.add(probando);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Site");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Marcas ");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Edición");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Reportes");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
    IngresoSistema principal= new IngresoSistema();
    principal.setVisible(true);
    principal.pack();
    this.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
  int desicion =  JOptionPane.showConfirmDialog(null, "¿Realmente desea salir?" ,"CONFIRMAR SALIDA", 
      JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
  if(desicion== JOptionPane.YES_OPTION){
      this.dispose(); 
  }else{
      
  }
   
    
    }//GEN-LAST:event_exitActionPerformed

    private void AgregarServersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarServersActionPerformed
      if(estacerrado(masc)){
          masc = new AgregarServers();
          panel.add(masc);
          masc.setVisible(true);
      }else{
          JOptionPane.showMessageDialog(null, " La ventana Agregar servers ya esta abierta");
      }
    }//GEN-LAST:event_AgregarServersActionPerformed

    private void ConsservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsservActionPerformed
      /*if(vXcestacerrado(cons)){ 
      cons = new ConsultarServers();
      panel.add(cons);
      cons.setVisible(true);
       
       }else{
       JOptionPane.showMessageDialog(this, "La ventana Consultar Datos ya esta abierta");
       }*/
    }//GEN-LAST:event_ConsservActionPerformed

    private void probandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_probandoActionPerformed
      
    }//GEN-LAST:event_probandoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInvitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AgregarServers;
    private javax.swing.JMenuItem Consserv;
    private javax.swing.JMenuItem exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JLabel lblconectado;
    private javax.swing.JMenuItem logout;
    public static javax.swing.JDesktopPane panel;
    private javax.swing.JMenuItem probando;
    // End of variables declaration//GEN-END:variables
}
