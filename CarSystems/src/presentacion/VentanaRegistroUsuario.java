
package presentacion;

import dominio.Departamento;
import dominio.Municipio;
import dominio.Usuario;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class VentanaRegistroUsuario extends javax.swing.JFrame {

    public VentanaRegistroUsuario() throws SQLException {
        initComponents();
        cargarDepartamentos();
        
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        txt_apellido1.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_apellido2.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_nombre.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_documento.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_correo.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_direccion.setBackground(new java.awt.Color(180, 180, 180, 180));
        txt_telefono.setBackground(new java.awt.Color(180, 180, 180, 180));

        cmbTipoDocumento.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbRol.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbDepartamento.setBackground(new java.awt.Color(80, 80, 80, 80));
        cmbMunicipio.setBackground(new java.awt.Color(80, 80, 80, 80));

        btn_guardar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_limpiar.setBackground(new java.awt.Color(80, 80, 80, 80));
        btn_cerrar.setBackground(new java.awt.Color(80, 80, 80, 80));

        pasf_contrasena.setBackground(new java.awt.Color(180, 180, 180, 180));
        pasf_confirmacion.setBackground(new java.awt.Color(180, 180, 180, 180));

        checkbox.setBackground(new java.awt.Color(0, 0, 0, 0));
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
        txt_apellido2 = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        cmbTipoDocumento = new javax.swing.JComboBox<>();
        cmbRol = new javax.swing.JComboBox<>();
        cmbDepartamento = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        btn_guardar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        pasf_confirmacion = new javax.swing.JPasswordField();
        pasf_contrasena = new javax.swing.JPasswordField();
        checkbox = new java.awt.Checkbox();
        RegistroUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Rol usuario");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 38)); // NOI18N
        jLabel2.setText("Registro usuario");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Tipo documento");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Número Identidad");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Teléfono");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Correo electronico");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Contraseña");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("Confirmar Contraseña");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("Primer apellido");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setText("Municipio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel15.setText("Departamento");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Segundo apellido");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        txt_correo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_correo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 540, 30));

        txt_nombre.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel2.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, 270, 30));

        txt_documento.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_documento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_documento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documentoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 170, 30));

        txt_apellido1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_apellido1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_apellido1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellido1KeyTyped(evt);
            }
        });
        jPanel2.add(txt_apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 170, 30));

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
        jPanel2.add(txt_apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 180, 30));

        txt_direccion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_direccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 340, 30));

        txt_telefono.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt_telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        jPanel2.add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 260, 190, 30));

        cmbTipoDocumento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Cédula de Ciudadanía", "Cédula de Extranjeria", "Permiso Especia de permanencia", "Salvoconducto", "Pasaporte" }));
        cmbTipoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoDocumentoActionPerformed(evt);
            }
        });
        jPanel2.add(cmbTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 100, 180, 30));

        cmbRol.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Vendedor", "Comprador", "Funcionario" }));
        jPanel2.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 220, 30));

        cmbDepartamento.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        cmbDepartamento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDepartamentoItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 220, 30));

        cmbMunicipio.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jPanel2.add(cmbMunicipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 210, 30));

        btn_guardar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 120, 30));

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 110, 30));

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        jPanel2.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 110, 30));

        pasf_confirmacion.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pasf_confirmacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(pasf_confirmacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, 190, 30));

        pasf_contrasena.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pasf_contrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(pasf_contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 190, 30));

        checkbox.setFont(new java.awt.Font("Comic Sans MS", 3, 10)); // NOI18N
        checkbox.setForeground(new java.awt.Color(255, 255, 255));
        checkbox.setLabel("He leido y acepto los terminos y condiciones la politica de privacidad de CarSystem");
        jPanel2.add(checkbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 450, 20));

        RegistroUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/fondo opcion 1.png"))); // NOI18N
        jPanel2.add(RegistroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            
            //validar congtrasena
            if (conficontrasena.equals(contrasena)) {
                guardarUsuario();
                javax.swing.JOptionPane.showMessageDialog(this, "Registro exitoso! \n", "AVISO!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Confirmar contraseña \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    public void guardarUsuario() {
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
//        long campoTxt_documento = (txt_documento.getText().toString().equals(null))? 0 : Long.parseLong(txt_documento.getText());
        Usuario usuario = new Usuario(Long.parseLong(txt_documento.getText()), validarTipoDocumento(), 
                txt_apellido1.getText(), txt_apellido2.getText(), txt_nombre.getText(), 
                cmbDepartamento.getSelectedItem().toString(), cmbMunicipio.getSelectedItem().toString(),
                txt_direccion.getText(), txt_telefono.getText(), txt_correo.getText(), 
                cmbRol.getSelectedItem().toString(), pasf_contrasena.getText());
        usuarioServicio.guardar(usuario);
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

    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void cmbDepartamentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDepartamentoItemStateChanged
        if(cmbDepartamento.getItemCount()!= 0){
        if(! (cmbDepartamento.getSelectedItem().toString().equals("Seleccionar"))){
            cargarMunicipio();
        }
        }
    }//GEN-LAST:event_cmbDepartamentoItemStateChanged

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

    private void cmbTipoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoDocumentoActionPerformed

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
    private javax.swing.JLabel RegistroUsuario;
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
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
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
