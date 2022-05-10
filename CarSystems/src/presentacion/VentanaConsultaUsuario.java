package presentacion;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Departamento;
import dominio.Marca;
import dominio.Municipio;
import dominio.Usuario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import serviceImpl.UsuarioServiceImpl;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import serviceImpl.DepartamentoServiceImpl;
import serviceImpl.MunicipioServiceImpl;

/**
 *
 * @author User
 */
public class VentanaConsultaUsuario extends javax.swing.JFrame {

    public VentanaConsultaUsuario() throws SQLException {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.camposBloqueados();
        btnEditar.setEnabled(false);
        btnGuardarCambios.setEnabled(false);

        cmbTipoDocumento.setBackground(new java.awt.Color(80, 80, 80, 80));
        txt_documento.setBackground(new java.awt.Color(180, 180, 180, 180));

        txtTipoDocumento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txtDocumento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_apellido1.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_apellido2.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_nombre.setBackground(new java.awt.Color(180, 180, 180, 180));

        txt_correo.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_direccion.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_telefono.setBackground(new java.awt.Color(180, 180, 180, 180));
        txtRol.setBackground(new java.awt.Color(180, 180, 180, 180));
        txtDepartamento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txtMunicipio.setBackground(new java.awt.Color(180, 180, 180, 180));

        btnConsultar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_limpiar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_cerrar.setBackground(new java.awt.Color(80, 80, 80, 80));
        ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_documento = new javax.swing.JTextField();
        txt_apellido1 = new javax.swing.JTextField();
        txt_apellido2 = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTipoDocumento1 = new javax.swing.JComboBox<>();
        txtMunicipio = new javax.swing.JTextField();
        txtRol = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        txtTipoDocumento = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        btnGuardarCambios = new javax.swing.JButton();
        jlbConsulta = new javax.swing.JLabel();
        jlbConsulta1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rol usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Myanmar Text", 1, 38)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cosulta Usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo documento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Número Identidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, -1, -1));

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Correo electronico");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Primer apellido");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Municipio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Departamento");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Segundo apellido");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 580, 30));

        txt_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 270, 30));

        txt_documento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 170, 30));

        txt_apellido1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 170, 30));

        txt_apellido2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 200, 190, 30));

        txt_direccion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 340, 30));

        txt_telefono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 190, 30));

        cmbTipoDocumento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));
        jPanel2.add(cmbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 30));

        btnConsultar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 120, 30));

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 120, 30));

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 120, 30));

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Número Identidad");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tipo documento");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, -1, -1));

        cmbTipoDocumento1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));
        jPanel2.add(cmbTipoDocumento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 180, 30));
        jPanel2.add(txtMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 310, 220, 30));
        jPanel2.add(txtRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 260, 30));
        jPanel2.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 250, 30));
        jPanel2.add(txtTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 170, 30));
        jPanel2.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 140, 190, 30));

        btnEditar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, 140, 30));

        btnGuardarCambios.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btnGuardarCambios.setText("Guardar cambios");
        btnGuardarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCambiosActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 490, 170, 30));

        jlbConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 3));
        jPanel2.add(jlbConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 820, 420));

        jlbConsulta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 255), 3));
        jPanel2.add(jlbConsulta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1170, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed

        btnEditar.setEnabled(false);
        btnGuardarCambios.setEnabled(false);
        
        this.cmbTipoDocumento.setSelectedItem("Seleccionar");
        this.txt_documento.setText("");
        this.txtTipoDocumento.setText("");
        this.txtDocumento.setText("");
        this.txt_apellido1.setText("");
        this.txt_apellido2.setText("");
        this.txt_nombre.setText("");
        this.txtRol.setText("");
        this.txtDepartamento.setText("");
        this.txtMunicipio.setText("");
        this.txt_correo.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");

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

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        consultarUsuario();
        btnEditar.setEnabled(true);
        
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       
        btnGuardarCambios.setEnabled(true);
        
        txt_apellido1.setEditable(true);
        txt_apellido2.setEditable(true);
        txt_nombre.setEditable(true);
        txtRol.setEditable(true);
        txtDepartamento.setEditable(true);
        txtMunicipio.setEditable(true);
        txt_correo.setEditable(true);
        txt_direccion.setEditable(true);
        txt_telefono.setEditable(true);
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnGuardarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCambiosActionPerformed
        
        
        
    }//GEN-LAST:event_btnGuardarCambiosActionPerformed

    public void camposBloqueados() {
        txt_apellido2.setEditable(false);
        txt_apellido1.setEditable(false);
        txt_apellido2.setEditable(false);
        txtTipoDocumento.setEditable(false);
        txtDocumento.setEditable(false);
        txt_nombre.setEditable(false);
        txtRol.setEditable(false);
        txtDepartamento.setEditable(false);
        txtMunicipio.setEditable(false);
        txt_correo.setEditable(false);
        txt_direccion.setEditable(false);
        txt_telefono.setEditable(false);
    }

    public String validarTipoDocumento() {
        String tipoDocumento = null;
        String cmbTipoDoc = cmbTipoDocumento.getSelectedItem().toString();

        //validacion y asignacion del campo Tipo de Documento
        if (cmbTipoDoc == "Cédula de Ciudadanía") {
            tipoDocumento = "CC";
        } else if (cmbTipoDoc.equals("Cédula de Extranjeria")) {
            tipoDocumento = "CE";
        } else if (cmbTipoDoc.equals("Permiso Especial Permanencia")) {
            tipoDocumento = "PEP";
        } else if (cmbTipoDoc.equals("Salvoconducto")) {
            tipoDocumento = "SAL";
        } else if (cmbTipoDoc.equals("Pasaporte")) {
            tipoDocumento = "PAS";
        }
        return tipoDocumento;
    }

    public void consultarUsuario() {

        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();

        Usuario usuarioEncontrada = usuarioServicio.encontrarUsuario(Long.parseLong(txt_documento.getText()), validarTipoDocumento());

        txtTipoDocumento.setText(usuarioEncontrada.getTipoId());
        txtDocumento.setText(String.valueOf(usuarioEncontrada.getIdUsuario()));
        txt_apellido1.setText(usuarioEncontrada.getApellido1());
        txt_apellido2.setText(usuarioEncontrada.getApellido2());
        txt_nombre.setText(usuarioEncontrada.getNombreUsuario());
        txtRol.setText(usuarioEncontrada.getRol());
        txtDepartamento.setText(usuarioEncontrada.getDepartamento());
        txtMunicipio.setText(usuarioEncontrada.getMunicipio());
        txt_correo.setText(usuarioEncontrada.getEmailUsuario());
        txt_direccion.setText(usuarioEncontrada.getDireccion());
        txt_telefono.setText(usuarioEncontrada.getTelefono());

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
    private javax.swing.JComboBox<String> cmbTipoDocumento;
    private javax.swing.JComboBox<String> cmbTipoDocumento1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlbConsulta;
    private javax.swing.JLabel jlbConsulta1;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtRol;
    private javax.swing.JTextField txtTipoDocumento;
    private javax.swing.JTextField txt_apellido1;
    private javax.swing.JTextField txt_apellido2;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_documento;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

}
