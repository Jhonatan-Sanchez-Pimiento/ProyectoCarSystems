
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
public class VentanaRegistroUsuario extends javax.swing.JFrame {

    public VentanaRegistroUsuario() throws SQLException {
        initComponents();
        cargarDepartamentos();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
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
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JButton();
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
        checkbox = new java.awt.Checkbox();
        jLabel17 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 90));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        lblLogoCarSystems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoCarSystems.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblLogoCarSystems.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblLogoCarSystems.setIconTextGap(1);
        jPanel2.add(lblLogoCarSystems, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, -10, -1, 110));

        jSeparator1.setBackground(new java.awt.Color(37, 196, 164));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1270, 10));

        jPanel3.setBackground(new java.awt.Color(30, 41, 57));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(921, 757));

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
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vendedor", "Comprador", "Funcionario" }));

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
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
        jLabel3.setText("Nombre:");

        cmbMunicipio.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo documento:");

        btn_guardar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección:");

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono:");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo electrónico:");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña:");

        jLabel11.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirmar Contraseña:");

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Primer apellido:");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Municipio:");

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Departamento:");

        jLabel16.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Segundo apellido:");

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

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

        checkbox.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        checkbox.setForeground(new java.awt.Color(255, 255, 255));
        checkbox.setLabel("He leido y acepto los terminos y condiciones la politica de privacidad de CarSystem");

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("No. de Identidad:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel3)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_apellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txt_documento, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(txt_correo, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(cmbDepartamento, 0, 193, Short.MAX_VALUE)
                            .addComponent(pasf_contrasena)
                            .addComponent(cmbRol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(txt_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(cmbMunicipio, 0, 209, Short.MAX_VALUE)
                                    .addComponent(pasf_confirmacion)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_apellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txt_documento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(pasf_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(pasf_confirmacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbRol, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(272, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 870, 370));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, 70));

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/My project (9) (1) (2).png"))); // NOI18N
        jLabel19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel19.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel19.setIconTextGap(1);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 911, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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
        if(cmbDepartamento.getItemCount()!= 0){
            if(! (cmbDepartamento.getSelectedItem().toString().equals("Seleccionar"))){
                cargarMunicipio();
            }
        }
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed

        String contrasena = pasf_contrasena.getText();
        String conficontrasena = pasf_confirmacion.getText();

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
            || (pasf_contrasena.getText().equals(""))
            || (pasf_confirmacion.getText().equals(""))) {

            javax.swing.JOptionPane.showMessageDialog(this, "Debe diligenciar los capos vacios \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }  else {

            //validar contrasena
            if (conficontrasena.equals(contrasena)) {
                guardarUsuario();
                javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Confirmar contraseña \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

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
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        try {
            int cerrar = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Desea volver","EXIT",cerrar);
            if (result==0) {
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_cerrarActionPerformed

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

    public void guardarUsuario() {
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();

        Usuario usuario = new Usuario(Long.parseLong(txt_documento.getText()), cmbTipoDocumento.getSelectedItem().toString(), 
                txt_apellido1.getText(), txt_apellido2.getText(), txt_nombre.getText(), 
                cmbDepartamento.getSelectedItem().toString(), cmbMunicipio.getSelectedItem().toString(),
                txt_direccion.getText(), txt_telefono.getText(), txt_correo.getText(), 
                cmbRol.getSelectedItem().toString(), pasf_contrasena.getText());
        usuarioServicio.guardar(usuario);
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
        try{ 
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
        }catch(Exception e){
            e.printStackTrace(System.out);
        }
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
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaRegistroUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private java.awt.Checkbox checkbox;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
