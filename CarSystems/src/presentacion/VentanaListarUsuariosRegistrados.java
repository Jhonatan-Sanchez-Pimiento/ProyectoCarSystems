
package presentacion;

import dominio.Funciones;
import dominio.Usuario;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import serviceImpl.UsuarioServiceImpl;

/**
 *
 * @author nicol
 */
public class VentanaListarUsuariosRegistrados extends javax.swing.JFrame {
    
    DefaultTableModel modelo;
    private static Usuario usuarioLogueado;
    Funciones funciones = new Funciones();
    
    public VentanaListarUsuariosRegistrados(Usuario usuarioLogueado) {
        initComponents();
        this.usuarioLogueado = usuarioLogueado;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("Tipo documento");//Con este comando se le coloca el nombre a las columnas
        modelo.addColumn("Docuemto");
        modelo.addColumn("Primer apellido");
        modelo.addColumn("Segundo apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Departamento");
        modelo.addColumn("Municipio");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        modelo.addColumn("Rol");
        this.jtablaUsuarios.setModel(modelo);//aquí le asigna el modelo a la tabla
        cargarUsiaros();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(30, 41, 57));
        jPanel1.setPreferredSize(new java.awt.Dimension(835, 600));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/My project (9) (1) (2).png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setIconTextGap(1);

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LISTADO USUARIO REGISTRADOS");

        jSeparator1.setBackground(new java.awt.Color(37, 196, 164));

        jtablaUsuarios.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtablaUsuarios.setFont(new java.awt.Font("Myanmar Text", 0, 12)); // NOI18N
        jtablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo Documento", "Documento", "Pirmer apellido", "Segundo apellido", "Nombre", "Correo", "Departamento", "Municipio", "Direccion", "Telefono", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtablaUsuarios.setColumnSelectionAllowed(true);
        jtablaUsuarios.setGridColor(new java.awt.Color(51, 255, 255));
        jScrollPane1.setViewportView(jtablaUsuarios);
        jtablaUsuarios.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jtablaUsuarios.getColumnModel().getColumnCount() > 0) {
            jtablaUsuarios.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(2).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(3).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(4).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(5).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(6).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(7).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(8).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(9).setPreferredWidth(20);
            jtablaUsuarios.getColumnModel().getColumn(10).setPreferredWidth(20);
        }

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jButton1.setText("Menú principal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jButton2.setText("Consultar usuario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jButton2)
                .addGap(268, 268, 268)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1146, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(usuarioLogueado);
        ventanaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaConsultaUsuario consultarUsuario = new VentanaConsultaUsuario();
        consultarUsuario.setVisible(true);
        this.dispose();;
    }//GEN-LAST:event_jButton2ActionPerformed

        private void cargarUsiaros() {
        
            UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
            
            modelo = (DefaultTableModel) jtablaUsuarios.getModel();

                List<Usuario> usuario = usuarioServicio.listarUsuario();
                int tamanoLista = usuario.size(); //Tamaño de filas
                modelo.setRowCount(tamanoLista);//Se establecen la cantidad de filas

                for(int posicionFila = 0; posicionFila<tamanoLista;posicionFila++){
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getTipoId(),posicionFila , 0);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getIdUsuario(),posicionFila , 1);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getApellido1(),posicionFila , 2);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getApellido2(),posicionFila , 3);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getNombreUsuario(),posicionFila , 4);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getEmailUsuario(),posicionFila , 5);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getDepartamento(),posicionFila , 6);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getMunicipio(),posicionFila , 7);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getDireccion(),posicionFila , 8);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getTelefono(),posicionFila , 9);
                    jtablaUsuarios.setValueAt(usuario.get(posicionFila).getRol(),posicionFila , 10);
                }
                
    }

        
        //probemos este por favor
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
            java.util.logging.Logger.getLogger(VentanaListarUsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListarUsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListarUsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListarUsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaListarUsuariosRegistrados(usuarioLogueado).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jtablaUsuarios;
    // End of variables declaration//GEN-END:variables

}
