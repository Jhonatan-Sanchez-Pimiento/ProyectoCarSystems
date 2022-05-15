package presentacion;

import dominio.Departamento;
import dominio.Municipio;
import dominio.Usuario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import serviceImpl.UsuarioServiceImpl;
import javax.swing.JOptionPane;
import serviceImpl.DepartamentoServiceImpl;
import serviceImpl.MunicipioServiceImpl;

/**
 *
 * @author User
 */
public class VentanaConsultaUsuario extends javax.swing.JFrame {

    Usuario usuarioEncontrada;
    
    public VentanaConsultaUsuario() throws SQLException {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.camposBloqueados();
        cargarDepartamentos();
        btnEditar.setEnabled(false);
        btnGuardarCambios.setEnabled(false);

        cmbTipoDocumento.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbRol.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbDepartamento.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbMunicipio.setBackground(new java.awt.Color(80, 80, 80, 80));
        
        txt_documento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txtDocumento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_apellido1.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_apellido2.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_nombre.setBackground(new java.awt.Color(180, 180, 180, 180));

        txt_correo.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_direccion.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_telefono.setBackground(new java.awt.Color(180, 180, 180, 180));

        btnConsultar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_limpiar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_cerrar.setBackground(new java.awt.Color(80, 80, 80, 80));
        ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_documento = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jlbConsulta1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        txt_correo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        txt_apellido2 = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        cmbMunicipio = new javax.swing.JComboBox<>();
        cmbTipoDocumento1 = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        txt_apellido1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Consulta Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 70));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/My project (9) (1) (2).png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel19.setIconTextGap(1);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo documento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        txt_documento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 170, 30));

        cmbTipoDocumento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));
        jPanel2.add(cmbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 170, 30));

        btnConsultar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 120, 30));

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 120, 30));

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 30));

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Número Identidad");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jlbConsulta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 3));
        jPanel2.add(jlbConsulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 250, 370));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));

        jPanel3.setBackground(new java.awt.Color(30, 41, 57));

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel30.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Correo electrónico:");

        jLabel31.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Primer apellido:");

        txt_apellido2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmbRol.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vendedor", "Comprador", "Funcionario" }));
        cmbRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRolActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Municipio:");

        jLabel33.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Departamento:");

        cmbMunicipio.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbMunicipio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMunicipioActionPerformed(evt);
            }
        });

        cmbTipoDocumento1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));

        jLabel34.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Número Identidad:");

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Teléfono:");

        btnEditar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnGuardarCambios.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Rol usuario:");

        txt_apellido1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel37.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Tipo documento:");

        jLabel38.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Nombre:");

        jLabel39.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Dirección:");

        txt_telefono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_direccion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        cmbDepartamento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentoItemStateChanged(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Segundo apellido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)
                                .addComponent(cmbDepartamento, 0, 181, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_direccion)
                                    .addComponent(txt_nombre)
                                    .addComponent(txt_apellido2)
                                    .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbTipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_apellido1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(cmbMunicipio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbRol, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(18, 18, 18)
                        .addComponent(txt_correo)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(btnGuardarCambios)
                .addGap(155, 155, 155)
                .addComponent(btnEditar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDocumento1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCambios)
                    .addComponent(btnEditar))
                .addGap(65, 65, 65))
        );

        jScrollPane1.setViewportView(jPanel3);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 770, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_documentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documentoKeyTyped

        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')) {
            evt.consume();
        }

        if (txt_documento.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_documentoKeyTyped

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed

        consultarUsuario();
        btnEditar.setEnabled(true);

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        btnEditar.setEnabled(false);
        btnGuardarCambios.setEnabled(false);

        this.cmbTipoDocumento.setSelectedItem("Seleccionar");
        this.txt_documento.setText("");
        this.cmbTipoDocumento1.setSelectedItem("Seleccionar");
        this.txtDocumento.setText("");
        this.txt_apellido1.setText("");
        this.txt_apellido2.setText("");
        this.txt_nombre.setText("");
        this.txt_correo.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.cmbRol.setSelectedItem("Seleccionar");
        limpiarCmbMunicipio();
        cmbDepartamento.removeAllItems();;
        cmbTipoDocumento.setSelectedItem("Seleccionar");
        cargarDepartamentos();

        btnConsultar.setEnabled(true);
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed

        try {
            int cerrar = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null, "Desea volver", "EXIT", cerrar);
            if (result == 0) {
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void cmbRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbRolActionPerformed

    private void cmbMunicipioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMunicipioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbMunicipioActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void cmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

    public void camposBloqueados() {
        txt_apellido2.setEditable(false);
        txt_apellido1.setEditable(false);
        txt_apellido2.setEditable(false);
        cmbTipoDocumento1.setEnabled(false);
        txtDocumento.setEditable(false);
        txt_nombre.setEditable(false);
        cmbRol.setEnabled(false);
        cmbDepartamento.setEnabled(false);
        cmbMunicipio.setEnabled(false);
        txt_correo.setEditable(false);
        txt_direccion.setEditable(false);
        txt_telefono.setEditable(false);
    }

    public void consultarUsuario() {

        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();

         this.usuarioEncontrada = usuarioServicio.encontrarUsuario(Long.parseLong(txt_documento.getText()), cmbTipoDocumento.getSelectedItem().toString());

        cmbTipoDocumento1.setSelectedItem(usuarioEncontrada.getTipoId());
        cmbTipoDocumento.setSelectedItem(usuarioEncontrada.getTipoId());
        txtDocumento.setText(String.valueOf(usuarioEncontrada.getIdUsuario()));
        txt_apellido1.setText(usuarioEncontrada.getApellido1());
        txt_apellido2.setText(usuarioEncontrada.getApellido2());
        txt_nombre.setText(usuarioEncontrada.getNombreUsuario());
        cmbRol.setSelectedItem(usuarioEncontrada.getRol().toString());
        cmbDepartamento.setSelectedItem(usuarioEncontrada.getDepartamento().toString());
        cmbMunicipio.setSelectedItem(usuarioEncontrada.getMunicipio().toString());
        txt_correo.setText(usuarioEncontrada.getEmailUsuario());
        txt_direccion.setText(usuarioEncontrada.getDireccion());
        txt_telefono.setText(usuarioEncontrada.getTelefono());
        
    }
        private void cargarDepartamentos() {
            
        DepartamentoServiceImpl departamentoServicio = new DepartamentoServiceImpl();
        List<Departamento> departamentos = departamentoServicio.listarDepartamento();
        departamentos.forEach(departamentoLista -> {
            cmbDepartamento.addItem(departamentoLista.getNombreDepartamento());
        }
        );
    }    
    
        public void cargarMunicipio() {
        try{ 
       // limpiarCmbMunicipio();
        MunicipioServiceImpl municipioServicio = new MunicipioServiceImpl();
        /**
         * @Method Listar
         */
        //Listar municipios
        List<Municipio> municipios = municipioServicio.encontrarMunicipioxDepartamento(cmbDepartamento.getSelectedItem().toString());
        municipios.forEach(municipiosList -> {
        cmbMunicipio.addItem(municipiosList.getNombreMunicipio());
        }
        );
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
    }
        public void actualizarUsuario(){
            
            UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
            
            usuarioEncontrada.setApellido1(txt_apellido1.getText());
            usuarioEncontrada.setApellido2(txt_apellido2.getText());
            usuarioEncontrada.setNombreUsuario(txt_nombre.getText());
            usuarioEncontrada.setRol(cmbRol.getSelectedItem().toString());
            usuarioEncontrada.setDepartamento(cmbDepartamento.getSelectedItem().toString());
            usuarioEncontrada.setMunicipio(cmbMunicipio.getSelectedItem().toString());
            usuarioEncontrada.setEmailUsuario(txt_correo.getText());
            usuarioEncontrada.setDireccion(txt_direccion.getText());
            usuarioEncontrada.setTelefono(txt_telefono.getText());
            
            usuarioServicio.actualizar(usuarioEncontrada);
            
            JOptionPane.showMessageDialog(this, "Usuario actualizado correctamente.","Actualización de Usuario",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
       public void limpiarCmbMunicipio(){
            cmbMunicipio.removeAllItems();
            cmbMunicipio.addItem("Seleccionar");
            cmbMunicipio.setSelectedItem(1);
    }
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
            java.util.logging.Logger.getLogger(VentanaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaConsultaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaConsultaUsuario().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaConsultaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnGuardarCambios;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JComboBox<String> cmbTipoDocumento1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbConsulta1;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_documento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
