/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidoresxcaret;

import Servicios.Conexion;
import Servicios.Xcaret_servicio;
import Vista.VentanaAdmin;
import static Vista.VentanaAdmin.panel;
import static Vista.VentanaInvitado.vXcestacerrado;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Xcaret;


/**
 *
 * @author Leo González
 */
public class AgregarServers extends javax.swing.JInternalFrame {
    ConsultarServers cons;
    private  Xcaret_servicio xcaret_servicio = new Xcaret_servicio();
    private final Xcaret xcaret;
 
    public Connection conexion;
    Xcaret xcaretEditar;
    
    public AgregarServers() {
        this.xcaret = new Xcaret();      
        initComponents();
        
    }

   public void guardar(){
        
            String numero = no.getText();
            Object idudns=udnnn.getText();
            Object idsites= ids.getText();
            String host=Host.getText();
            String nameserver=Nameserver.getText();
            String tipos=tipo.getSelectedItem().toString();
            String ip=IP.getText();
            String estado=idestado.getSelectedItem().toString();
            String servicio = serv.getText();
            String sqlversion = sql.getText();
            Object idedicion = ed.getText();
            String antivirus = ant.getText();
            String sistemaoperativo = so.getText();
            String sockets = soc.getText();
            String cores = co.getText();
            String cpu = cp.getText();
            String rammb = ra.getText();
            String ramdinamik = ram.getSelectedItem().toString();
            String architecture = arq.getText();
            String disgb = di.getText();
            String unidadesgb = unid.getText();
            String networkisci = net.getText();
            String hypervisor = hy.getText();
            String versionhyper = vh.getText();
            Object idmarca=idmarc.getText();
            String modelo=mode.getText();
            String procesador=process.getText();
            String servicestag = sertag.getText();
            String activo = act.getText();
             
         
            
            
            
            
            
            //this.producto.setId(id);
            this.xcaret.setNumero(numero);
            this.xcaret.setIdudn((String) idudns);
            this.xcaret.setIdsite((String) idsites);
            this.xcaret.setHost(host);
            this.xcaret.setNameserver(nameserver);
            this.xcaret.setTipo(tipos);
            this.xcaret.setIp(ip);
            this.xcaret.setEstado(estado);
            this.xcaret.setServicio(servicio);
            this.xcaret.setSqlversion(sqlversion);
            this.xcaret.setIdedicion((String) idedicion);
            this.xcaret.setAntivirus(antivirus);
            this.xcaret.setSistemaoperativo(sistemaoperativo);
            this.xcaret.setSockets(sockets);
            this.xcaret.setCores(cores);
            this.xcaret.setCpu(cpu);
            this.xcaret.setRammb(rammb);
            this.xcaret.setRamdinamik(ramdinamik);
            this.xcaret.setArchitecture(architecture);
            this.xcaret.setDiskgb(disgb);
            this.xcaret.setUnidadesgb(unidadesgb);
            this.xcaret.setNetworkisci(networkisci);
            this.xcaret.setHypervisor(hypervisor);
            this.xcaret.setVersionhyper(versionhyper);
            this.xcaret.setIdmarca((String) idmarca);
            this.xcaret.setModelo(modelo);
            this.xcaret.setProcesador(procesador);
            this.xcaret.setServicestag(servicestag);
            this.xcaret.setActivo(activo);
            
            
            try {
                this.xcaret_servicio.guardar(Conexion.obtener(), this.xcaret);
                // this.dispose();
                //xcaret vista = new xcaret();
                //vista.setVisible(true);
                // this.llenaTabla();
            } catch (SQLException ex) {
                
                Logger.getLogger(AgregarServers.class.getName()).log(Level.SEVERE, null, ex);
            }
     
   }
    public AgregarServers(Xcaret ad_p){ //quitar el throws si no sirve 
    initComponents();
    this.xcaret = ad_p;
    this.no.setText(this.xcaret.getNumero());
    this.Host.setText(this.xcaret.getHost());
    this.Nameserver.setText(this.xcaret.getNameserver());
    this.tipo.setSelectedItem(this.xcaret.getTipo());
    this.IP.setText(this.xcaret.getIp());
    this.idestado.setSelectedItem(this.xcaret.getEstado());
    this.serv.setText(this.xcaret.getServicio());
    this.sql.setText(this.xcaret.getSqlversion());
   // this.ed.setText(this.xcaret.getIdedicion());
    this.ant.setText(this.xcaret.getAntivirus());
    this.so.setText(this.xcaret.getSistemaoperativo());
    this.soc.setText(this.xcaret.getSockets());
    this.co.setText(this.xcaret.getCores());
    this.cp.setText(this.xcaret.getCpu());
    this.ra.setText(this.xcaret.getRammb());
    this.ram.setSelectedItem(this.xcaret.getRamdinamik());
    this.arq.setText(this.xcaret.getArchitecture());
    this.di.setText(this.xcaret.getDiskgb());
    this.unid.setText(this.xcaret.getUnidadesgb());
    this.hy.setText(this.xcaret.getHypervisor());
    this.vh.setText(this.xcaret.getVersionhyper());
   // this.idmarc.setText(this.xcaret.getIdmarca());
    this.mode.setText(this.xcaret.getModelo());
    this.process.setText(this.xcaret.getProcesador());
    this.sertag.setText(this.xcaret.getServicestag());
    this.act.setText(this.xcaret.getActivo());
    
    
   
}
 
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        no = new javax.swing.JTextField();
        udnnn = new javax.swing.JTextField();
        ids = new javax.swing.JTextField();
        Host = new javax.swing.JTextField();
        Nameserver = new javax.swing.JTextField();
        tipo = new javax.swing.JComboBox<>();
        Buscar = new javax.swing.JButton();
        Buscar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idestado = new javax.swing.JComboBox<>();
        mode = new javax.swing.JTextField();
        process = new javax.swing.JTextField();
        Registrar = new javax.swing.JButton();
        IP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        serv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sql = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ant = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        so = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        soc = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        co = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ra = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        arq = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        di = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        unid = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        net = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        hy = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        vh = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        sertag = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        act = new javax.swing.JTextField();
        ram = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        idmarc = new javax.swing.JTextField();
        ed = new javax.swing.JTextField();
        Buscar2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Registrar Servidores");
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar\n"));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("No");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Unidad de negocio");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("site");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("HOST");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("NameServer");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tipo");

        udnnn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                udnnnActionPerformed(evt);
            }
        });
        udnnn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                udnnnKeyPressed(evt);
            }
        });

        ids.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idsActionPerformed(evt);
            }
        });
        ids.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idsKeyPressed(evt);
            }
        });

        Nameserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameserverActionPerformed(evt);
            }
        });

        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fisico", "Virtual" }));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Buscar.setText("Consultar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        Buscar1.setBackground(new java.awt.Color(255, 255, 255));
        Buscar1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Buscar1.setText("Consultar");
        Buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("IP");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Status");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Marca");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Modelo");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Mod_Procesador");

        idestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Running", "OFF", "Replica" }));

        Registrar.setBackground(new java.awt.Color(255, 255, 255));
        Registrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Servicio");

        jLabel3.setText("Sql-Version");

        jLabel4.setText("Edición");

        jLabel15.setText("Antivirus");

        jLabel16.setText("Sistema Operativo");

        jLabel17.setText("Sockets");

        jLabel18.setText("Cores");

        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });

        jLabel19.setText("CPU");

        jLabel20.setText("RAM-MB");

        ra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raActionPerformed(evt);
            }
        });

        jLabel21.setText("RAM-Dinamik");

        jLabel22.setText("Arquitectura");

        jLabel23.setText("Disk-GB");

        jLabel24.setText("Unidades-GB");

        jLabel25.setText("Network-SCI");

        jLabel26.setText("Hypervisor");

        jLabel27.setText("Version-Hypervisor");

        jLabel29.setText("Services-Tag");

        jLabel30.setText("Activo");

        ram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No" }));

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        idmarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idmarcActionPerformed(evt);
            }
        });
        idmarc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idmarcKeyPressed(evt);
            }
        });

        ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edActionPerformed(evt);
            }
        });
        ed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edKeyPressed(evt);
            }
        });

        Buscar2.setBackground(new java.awt.Color(255, 255, 255));
        Buscar2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Buscar2.setText("Consultar");
        Buscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Buscar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(udnnn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ids)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Buscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(no, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(Nameserver, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel13)
                            .addComponent(jLabel7)
                            .addComponent(Host)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(idestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel5)
                            .addComponent(serv))
                        .addGap(170, 170, 170)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel15)
                                .addComponent(ant, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel16)
                                .addComponent(so, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addComponent(soc, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addComponent(co, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(sql)
                                .addComponent(IP, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8)
                            .addComponent(jLabel20)
                            .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ed, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Buscar2, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25)
                            .addComponent(net, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(unid)
                            .addComponent(di)
                            .addComponent(jLabel22)
                            .addComponent(cp, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jLabel19)
                            .addComponent(arq)
                            .addComponent(jLabel26)
                            .addComponent(hy)
                            .addComponent(jLabel27)
                            .addComponent(vh)
                            .addComponent(ram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(idmarc, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel29)
                        .addComponent(sertag, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel30)
                            .addGap(158, 158, 158))
                        .addComponent(jLabel10)
                        .addComponent(mode)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(process)
                        .addComponent(act)))
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(idmarc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(12, 12, 12)
                                        .addComponent(sql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel4)
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(so, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(arq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Buscar2)
                                            .addComponent(ed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(di, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(udnnn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Buscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Buscar1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Nameserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Host, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                        .addComponent(Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(net, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(co, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(vh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(process, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sertag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void udnnnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_udnnnActionPerformed
     
    }//GEN-LAST:event_udnnnActionPerformed

    private void udnnnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_udnnnKeyPressed
        JOptionPane.showMessageDialog(null, "Clic en el boton Buscar para agregar");
        udnnn.setText("");
    }//GEN-LAST:event_udnnnKeyPressed

    private void idsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idsActionPerformed

    private void idsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idsKeyPressed
        JOptionPane.showMessageDialog(null, "Clic en el boton Buscar para agregar");
        ids.setText("");
    }//GEN-LAST:event_idsKeyPressed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        ModalUdn dialog = new ModalUdn(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);

    }//GEN-LAST:event_BuscarActionPerformed

    private void Buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar1ActionPerformed
      ModalSite dialog = new ModalSite(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);

        dialog.setVisible(true);
    }//GEN-LAST:event_Buscar1ActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed
        if(no.getText().isEmpty()){
  DesktopNotify.showDesktopMessage("Advertencia", "El campo Numero es obligatorio", DesktopNotify.TIP);
        }
        else if(udnnn.getText().isEmpty()){
        DesktopNotify.showDesktopMessage("Advertencia", "Llene el campo Udn", DesktopNotify.TIP);    
        }
        else if( ids.getText().isEmpty() ){
        DesktopNotify.showDesktopMessage("Advertencia", "Llene el campo Site", DesktopNotify.TIP);    
        }
       
                
                   
            guardar();
              
            DesktopNotify.showDesktopMessage("Información", " Datos actualizados exitosamente", DesktopNotify.SUCCESS, 4000L);
            cargar_lista_producto();
            this.dispose();
            
            
           
             
            //VentanaAdmin prin = new VentanaAdmin();
            //prin.setVisible(true);
       // }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
      
    }//GEN-LAST:event_formComponentAdded

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void raActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_raActionPerformed

    private void NameserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameserverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameserverActionPerformed

    private void idmarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idmarcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idmarcActionPerformed

    private void idmarcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idmarcKeyPressed
       JOptionPane.showMessageDialog(null, "Clic en el boton Consultar para agregar");
       idmarc.setText("");
    }//GEN-LAST:event_idmarcKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
ModalMarca dialog = new ModalMarca(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edActionPerformed

    private void edKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_edKeyPressed

    private void Buscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Buscar2ActionPerformed
      ModalEdicion dialog = new ModalEdicion(new javax.swing.JFrame(), true);
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true); 
    }//GEN-LAST:event_Buscar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Buscar1;
    private javax.swing.JButton Buscar2;
    private javax.swing.JTextField Host;
    private javax.swing.JTextField IP;
    private javax.swing.JTextField Nameserver;
    public static javax.swing.JButton Registrar;
    private javax.swing.JTextField act;
    private javax.swing.JTextField ant;
    private javax.swing.JTextField arq;
    private javax.swing.JTextField co;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField di;
    public static javax.swing.JTextField ed;
    private javax.swing.JTextField hy;
    private javax.swing.JComboBox<String> idestado;
    public static javax.swing.JTextField idmarc;
    public static javax.swing.JTextField ids;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mode;
    private javax.swing.JTextField net;
    private javax.swing.JTextField no;
    private javax.swing.JTextField process;
    private javax.swing.JTextField ra;
    private javax.swing.JComboBox<String> ram;
    private javax.swing.JTextField sertag;
    private javax.swing.JTextField serv;
    private javax.swing.JTextField so;
    private javax.swing.JTextField soc;
    private javax.swing.JTextField sql;
    private javax.swing.JComboBox<String> tipo;
    public static javax.swing.JTextField udnnn;
    private javax.swing.JTextField unid;
    private javax.swing.JTextField vh;
    // End of variables declaration//GEN-END:variables
Conexion cc=new Conexion();
  
 Connection cn=cc.obtener();

 
 
    private void cargar_lista_producto() {
     
       //JOptionPane.showMessageDialog(this, "La ventana Consultar Datos ya esta abierta");
      
       ConsultarServers cons = new ConsultarServers();
        VentanaAdmin.panel.add(cons);
        cons.setVisible(true);
        }  
    }

