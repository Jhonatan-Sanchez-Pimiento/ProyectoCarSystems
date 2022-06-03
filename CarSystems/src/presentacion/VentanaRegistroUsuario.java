package presentacion;

import dominio.Departamento;
import dominio.Funciones;
import dominio.Municipio;
import dominio.Usuario;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
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
public class VentanaRegistroUsuario extends javax.swing.JFrame {

    private static Usuario usuarioLogueado;
    Funciones funciones = new Funciones();

    public VentanaRegistroUsuario(){
        initComponents();
        cargarDepartamentos();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblLogoCarSystems = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        txt_apellido2 = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        cmbRol = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cmbMunicipio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_documento = new javax.swing.JTextField();
        txt_apellido1 = new javax.swing.JTextField();
        pasf_confirmacion = new javax.swing.JPasswordField();
        pasf_contrasena = new javax.swing.JPasswordField();
        jLabel17 = new javax.swing.JLabel();
        btnPoliticaPrivacidad = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        btnDatosPersonales = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro usuario");

        lblLogoCarSystems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCarSystems.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblLogoCarSystems.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblLogoCarSystems.setIconTextGap(1);

        jSeparator1.setBackground(new java.awt.Color(37, 196, 164));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(692, 759));

        jPanel3.setBackground(new java.awt.Color(30, 41, 57));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(692, 380));

        txt_apellido2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido2ActionPerformed(evt);
            }
        });
        txt_apellido2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido2KeyTyped(evt);
            }
        });

        txt_direccion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_telefono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_telefonoActionPerformed(evt);
            }
        });
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });

        cmbTipoDocumento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));
        cmbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocumentoActionPerformed(evt);
            }
        });

        cmbRol.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vendedor", "Comprador" }));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Rol de usuario:");

        cmbDepartamento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre:");

        cmbMunicipio.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Tipo documento:");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Email:");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Contraseña:");

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Confirmar Cont.:");

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Primer apellido:");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Municipio:");

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Departamento:");

        jLabel16.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Segundo apellido:");

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correoKeyReleased(evt);
            }
        });

        txt_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });

        txt_documento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_documentoActionPerformed(evt);
            }
        });
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });

        txt_apellido1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellido1ActionPerformed(evt);
            }
        });
        txt_apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido1KeyTyped(evt);
            }
        });

        pasf_confirmacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pasf_confirmacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pasf_contrasena.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pasf_contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pasf_contrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasf_contrasenaActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("No. de Identidad:");

        btnPoliticaPrivacidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnPoliticaPrivacidad.setText("<html>He leído y acepto los terminos y condiciones la <span style=\"color: aqua;\"><strong>Política de privacidad</strong></span></html>");
        btnPoliticaPrivacidad.setContentAreaFilled(false);
        btnPoliticaPrivacidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPoliticaPrivacidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnPoliticaPrivacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPoliticaPrivacidadActionPerformed(evt);
            }
        });

        btnDatosPersonales.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDatosPersonales.setText("<html>He leído y acepto el tratamiento de <span style=\"color: aqua;\"><strong>los datos personales.</strong></span></html>");
        btnDatosPersonales.setContentAreaFilled(false);
        btnDatosPersonales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDatosPersonales.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnDatosPersonales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosPersonalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txt_apellido1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(txt_nombre, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_apellido2)
                                            .addComponent(cmbRol, 0, 160, Short.MAX_VALUE)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(pasf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pasf_confirmacion))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPoliticaPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(19, 19, 19))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pasf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(pasf_confirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPoliticaPrivacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDatosPersonales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(395, 395, 395))
        );

        jScrollPane2.setViewportView(jPanel3);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/My project (9) (1) (1) (1).png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel19.setIconTextGap(1);

        btn_cerrar.setBackground(new java.awt.Color(37, 196, 164));
        btn_cerrar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_cerrar.setText("Volver");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        btn_cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_cerrarKeyReleased(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(37, 196, 164));
        btn_limpiar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        btn_limpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_limpiarKeyReleased(evt);
            }
        });

        btn_guardar.setBackground(new java.awt.Color(37, 196, 164));
        btn_guardar.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        btn_guardar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btn_guardarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(292, 292, 292)
                        .addComponent(lblLogoCarSystems))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblLogoCarSystems, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 756, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_apellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido2ActionPerformed

    private void txt_apellido2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido2KeyTyped

        char b = evt.getKeyChar();
        if ((b < 'a' || b > 'z') && (b < 'A' || b > 'Z') && (b < ' ' || b > ' ')) {
            evt.consume();
        }

        if (txt_apellido2.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_apellido2KeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped

        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')) {
            evt.consume();
        }

        if (txt_telefono.getText().length() >= 10) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void cmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentoItemStateChanged
        if (cmbDepartamento.getItemCount() != 0) {
            if (!(cmbDepartamento.getSelectedItem().toString().equals("Seleccionar"))) {
                cargarMunicipio();
            }
        }
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped

        char d = evt.getKeyChar();
        if ((d < 'a' || d > 'z') && (d < 'A' || d > 'Z') && (d < ' ' || d > ' ')) {
            evt.consume();
        }

        if (txt_nombre.getText().length() >= 25) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_documentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_documentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_documentoActionPerformed

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

    private void txt_apellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellido1ActionPerformed

    private void txt_apellido1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellido1KeyTyped

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }

        if (txt_apellido1.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txt_apellido1KeyTyped

    private void pasf_contrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasf_contrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pasf_contrasenaActionPerformed

    private void cmbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDocumentoActionPerformed

    private void txt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            pasf_contrasena.requestFocus();
        }
    }//GEN-LAST:event_txt_correoKeyReleased

    private void txt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_telefonoActionPerformed

    private void btnPoliticaPrivacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPoliticaPrivacidadActionPerformed
        funciones.irAPaginaWeb("https://www.privacypolicies.com/live/1d715a70-b58a-47df-bb44-119543b188bd");
    }//GEN-LAST:event_btnPoliticaPrivacidadActionPerformed

    private void btnDatosPersonalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPersonalesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDatosPersonalesActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        VentanaInicioDeSesion inicioSesion = new VentanaInicioDeSesion();
        inicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_cerrarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cerrarKeyReleased
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuarioLogueado);
            ventanaPrincipal.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btn_cerrarKeyReleased

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_limpiarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_limpiarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            limpiar();
        }
    }//GEN-LAST:event_btn_limpiarKeyReleased

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        guardar();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_guardarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_guardarKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            guardar();
        }
    }//GEN-LAST:event_btn_guardarKeyReleased

    public void guardar() {
        String contrasena = (String.valueOf(pasf_contrasena.getPassword()));
        String conficontrasena = String.valueOf(pasf_contrasena.getPassword());
        UsuarioServiceImpl usuarioService = new UsuarioServiceImpl();
        Usuario usuarioConsultar = usuarioService.encontrarUsuario(Long.parseLong(txt_documento.getText()),cmbTipoDocumento.getSelectedItem().toString());
        
        if(usuarioConsultar == null){
        
        if (txt_documento.getText().equals("")
                || (cmbTipoDocumento.getSelectedItem().equals("Seleccionar"))
                || (txt_apellido1.getText().equals(""))
                || (txt_nombre.getText().equals(""))
                || (txt_correo.getText().equals(""))
                || (txt_direccion.getText().equals(""))
                || (cmbDepartamento.getSelectedItem().equals("Seleccionar"))
                || (cmbMunicipio.getSelectedItem().equals("Seleccionar"))
                || (txt_telefono.getText().equals(""))
                || (cmbRol.getSelectedItem().equals("Seleccionar"))
                || (String.valueOf(pasf_contrasena.getPassword()).equals(""))
                || (String.valueOf(pasf_contrasena.getPassword()).equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this, "Debe diligenciar los capos vacios \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {

            //validar contrasena
            if (conficontrasena.equals(contrasena)) {
                Usuario usuarioGuardado = guardarUsuario();
                javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuarioGuardado);
                ventanaPrincipal.setVisible(true);
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Confirmar contraseña \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ya existe en el sistema, por favor validar e intentar nuevamente.","Usuario ya registrado en el sistema",JOptionPane.ERROR_MESSAGE);
            txt_documento.selectAll();
            txt_documento.requestFocus();
        }
    }

    public void limpiar() {
        this.txt_nombre.setText("");
        this.txt_correo.setText("");
        this.txt_apellido1.setText("");
        this.txt_telefono.setText("");
        this.txt_apellido2.setText("");
        this.txt_direccion.setText("");
        this.txt_documento.setText("");
        this.pasf_contrasena.setText("");
        this.pasf_confirmacion.setText("");
        limpiarCmbMunicipio();
        cmbDepartamento.removeAllItems();
        cmbDepartamento.addItem("Seleccionar");
        cmbRol.setSelectedItem("Seleccionar");
        cmbTipoDocumento.setSelectedItem("Seleccionar");
        cargarDepartamentos();
        btn_guardar.setEnabled(true);
    }

    public Usuario guardarUsuario() {
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();

        Usuario usuario = new Usuario(Long.parseLong(txt_documento.getText()), cmbTipoDocumento.getSelectedItem().toString(),
                txt_apellido1.getText(), txt_apellido2.getText(), txt_nombre.getText(),
                cmbDepartamento.getSelectedItem().toString(), cmbMunicipio.getSelectedItem().toString(),
                txt_direccion.getText(), txt_telefono.getText(), txt_correo.getText(),
                cmbRol.getSelectedItem().toString(), String.valueOf(pasf_contrasena.getPassword()));
        usuarioServicio.guardar(usuario);
        return usuario;
    }

    public void cargarDepartamentos() {
        DepartamentoServiceImpl departamentoServicio = new DepartamentoServiceImpl();
        List<Departamento> departamentos = departamentoServicio.listarDepartamento();
        departamentos.forEach(departamentoLista -> {
            cmbDepartamento.addItem(departamentoLista.getNombreDepartamento());
        }
        );
    }

    public void cargarMunicipio() {
        try {
            limpiarCmbMunicipio();
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
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public void limpiarCmbMunicipio() {
        cmbMunicipio.removeAllItems();
        cmbMunicipio.addItem("Seleccionar");
        cmbMunicipio.setSelectedItem(1);
    }

    public boolean validarCampos() {

        boolean cumplenCampos = true;

        if (txt_correo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Email se encuentra vacio, por favor validar campo.", "Campo Email Vacio", JOptionPane.INFORMATION_MESSAGE);
            cumplenCampos = false;
            txt_correo.requestFocus();
        } else if (!(funciones.isEmail(txt_correo.getText()))) {
            JOptionPane.showMessageDialog(null, "Email no cumple con la estructura de un correo", "Validar Email", JOptionPane.INFORMATION_MESSAGE);
            txt_correo.selectAll();
            txt_correo.requestFocus();
            cumplenCampos = false;
        }
        return false;
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
            java.util.logging.Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VentanaRegistroUsuario().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatosPersonales;
    private javax.swing.JButton btnPoliticaPrivacidad;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblLogoCarSystems;
    private javax.swing.JPasswordField pasf_confirmacion;
    private javax.swing.JPasswordField pasf_contrasena;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_documento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
