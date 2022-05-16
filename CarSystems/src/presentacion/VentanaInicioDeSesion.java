package presentacion;

import dominio.Funciones;
import dominio.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import serviceImpl.UsuarioServiceImpl;

/**
 * @author IntegraSoft
 */
public class VentanaInicioDeSesion extends javax.swing.JFrame {

    Funciones funciones = new Funciones();
    UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();

    /**
     * Creates new form VentanaInicioDeSesion
     */
    public VentanaInicioDeSesion() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        this.setTitle("Login");

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnAcceder = new javax.swing.JButton();
        btnOlvidoContrasena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 41, 57));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 196, 164), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(835, 600));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/inicio de sesion usuario.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/My project (9) (1) (2).png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setIconTextGap(1);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(37, 196, 164));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Inicio de sesión");

        txtEmail.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Myanmar Text", 0, 14)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contraseña");

        btnRegistrar.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(0, 255, 204));
        btnRegistrar.setText("¿No se encuentra registrado? !Cree una cuenta ahora¡");
        btnRegistrar.setContentAreaFilled(false);

        btnAcceder.setBackground(new java.awt.Color(37, 196, 164));
        btnAcceder.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        btnAcceder.setText("Acceder");
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        btnOlvidoContrasena.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        btnOlvidoContrasena.setForeground(new java.awt.Color(0, 255, 204));
        btnOlvidoContrasena.setText("¿Olvidó su contraseña?");
        btnOlvidoContrasena.setContentAreaFilled(false);
        btnOlvidoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvidoContrasenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(86, 86, 86)
                .addComponent(jLabel2)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnRegistrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btnOlvidoContrasena)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                    .addGap(3, 3, 3)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnOlvidoContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(467, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        acceder();
    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            acceder();
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void btnOlvidoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvidoContrasenaActionPerformed
        recuperarPassword(JOptionPane.showInputDialog(null, "Ingrese el correo registrado en el sistema de información.", "Recuperación de Contraseña", JOptionPane.QUESTION_MESSAGE));
    }//GEN-LAST:event_btnOlvidoContrasenaActionPerformed

    public void recuperarPassword(String correoReceptor) {
        Usuario usuario = usuarioServicio.encontrarUsuario(correoReceptor);
        if (usuario != null) {
            enviarCorreo(usuario);
        } else {
            JOptionPane.showMessageDialog(null, "El correo diligenciado no se encuentra registrado en el sistema de información.", "Correo no registrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void enviarCorreo(Usuario usuario) {
        try {
            Properties propiedades = new Properties();
            propiedades.setProperty("mail.smtp.host", "smtp.gmail.com");
            propiedades.setProperty("mail.smtp.starttls.enable", "true");
            propiedades.setProperty("mail.smtp.port", "587");
            propiedades.setProperty("mail.smtp.auth", "true");
            propiedades.put("mail.smtp.ssl.protocols", "TLSv1.2");

            Session session = Session.getDefaultInstance(propiedades);

            String correoRemitente = "integrasoft.carsystems@gmail.com";
            String passwordRemitente = "carsystems";
            String asunto = "Recuperación de contraseña - CarSystems";
            String correoReceptor = usuario.getEmailUsuario();
            String mensaje = "<p>Hola,</p>\n"
                    + "<p>Hemos recibido una solicitud de restablecimiento de contrase&ntilde;a:&nbsp;</p>\n"
                    + "<ul style=\"list-style-type: disc;\">\n"
                    + "<li><span style=\"color: #ff0000;\"><strong>Nombre</strong></span> :&nbsp;" + usuario.getNombreUsuario()
                    + "</li>\n"
                    + "<li><span style=\"color: #ff0000;\"><strong>Apellidos</strong></span> :&nbsp;"
                    + usuario.getApellido1() + " " + usuario.getApellido2() + "</li>\n"
                    + "<li><span style=\"color: #ff0000;\"><strong>Correo</strong></span> :&nbsp;" + usuario.getEmailUsuario() + "</li>\n"
                    + "<li><span style=\"color: #ff0000;\"><strong>Contrase&ntilde;a</strong></span> :&nbsp;" + usuario.getContrasena() + "</li>\n"
                    + "</ul>\n"
                    + "<p>Este correo ha sido enviado desde el correo institucional del Sistema de Informaci&oacute;n CarSystems, si usted no ha hecho esta solicitud por favor hacer caso omiso del mismo.</p>\n"
                    + "<p><em><strong>IntegraSoft.</strong></em></p>";

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(correoRemitente));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(correoReceptor));
            message.setSubject(asunto);
            message.setText(mensaje, "ISO-8859-1", "html");

            Transport transporte = session.getTransport("smtp");
            transporte.connect(correoRemitente, passwordRemitente);
            transporte.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            transporte.close();

            JOptionPane.showMessageDialog(null, "Hemos enviado la información al correo " + usuario.getEmailUsuario(), "Recuperación de contraseña", JOptionPane.INFORMATION_MESSAGE);

        } catch (AddressException ex) {
            Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void acceder() {
        if (validarCampos()) {
            Usuario usuario = usuarioServicio.encontrarUsuario(txtEmail.getText());
            if (usuario != null) {
                if (usuario.getContrasena().equals(txtPassword.getText())) {
                    JOptionPane.showMessageDialog(null, "Acceso Correcto.", "Login", JOptionPane.INFORMATION_MESSAGE);
                    VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
                    ventanaPrincipal.setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Acceso inválido. Por favor, inténtelo otra vez.", "Credenciales incorrectas", JOptionPane.INFORMATION_MESSAGE);
                    limpiarCampos();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Acceso inválido. Por favor, inténtelo otra vez.", "Credenciales incorrectas", JOptionPane.INFORMATION_MESSAGE);
                limpiarCampos();
            }
        }
    }

    public boolean validarCampos() {
        boolean cumplenCampos = true;
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Email se encuentra vacio, por favor validar campo.", "Campo Email Vacio", JOptionPane.INFORMATION_MESSAGE);
            cumplenCampos = false;
            txtEmail.requestFocus();
        } else if (txtPassword.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "El campo Contraseña se encuentra vacio, por favor validar campo.", "Campo Contraseña Vacio", JOptionPane.INFORMATION_MESSAGE);
            cumplenCampos = false;
            txtPassword.requestFocus();
        } else if (!(funciones.isEmail(txtEmail.getText()))) {
            JOptionPane.showMessageDialog(null, "Email no cumple con la estructura de un correo", "Validar Email", JOptionPane.INFORMATION_MESSAGE);
            txtEmail.selectAll();
            txtEmail.requestFocus();
            cumplenCampos = false;
        }

        return cumplenCampos;
    }

    public void limpiarCampos() {
        txtEmail.setText("");
        txtPassword.setText("");
        txtEmail.requestFocus();
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
            java.util.logging.Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicioDeSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicioDeSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnOlvidoContrasena;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
