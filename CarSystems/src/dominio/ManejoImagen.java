package dominio;

import java.awt.Desktop;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author IntegraSoft
 */
public class ManejoImagen extends javax.swing.JFrame {

    private String rutaArchivo;

    public ManejoImagen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //método que selecciona un archivo Imagen del disco duro
    public String seleccionarImagen() {
        try {
            JFileChooser buscadorArchivo = new JFileChooser();
            FileNameExtensionFilter extension = new FileNameExtensionFilter("jpg,png", "jpg,png");
            buscadorArchivo.setFileFilter(extension);
            int seleccion = buscadorArchivo.showOpenDialog(this);
            if (seleccion == 0) {
                rutaArchivo = buscadorArchivo.getSelectedFile().getAbsolutePath();
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return rutaArchivo;
    }

    //convierte una ruta seleccionada de un archivo a Byte[] para ser almacenada en BD
    public byte[] convertirImagenaByte(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        byte[] archivoImagen;
        File archivo = new File(rutaArchivo);
        try {
            archivoImagen = new byte[(int) archivo.length()];
            InputStream input = new FileInputStream(archivo);
            input.read(archivoImagen);
        } catch (Exception e) {
            archivoImagen = null;
            e.printStackTrace(System.out);
        }
        //Agregar archivo Imagen convertido Byte a la clase que pertenece
        //vehiculo.setImagen(archivoImagen);
        return archivoImagen;
    }

    //Descarga el archivo Byte[] como Imagen en una ruta especifica del disco
    public void descargarImagen(byte[] archivoImagen) {
        System.out.println("archivoImagen = " + archivoImagen);
        try {
            //convierte el archivo byte enviado en uno nuevo Imagen para almacenar
                       
            
            
            InputStream archivo = new ByteArrayInputStream(archivoImagen);
            int tamanoImagen = archivo.available();
            byte[] nuevoArchivoImagen = new byte[tamanoImagen];
            archivo.read(nuevoArchivoImagen, 0, tamanoImagen);
            //Seleccionar carpeta a donde se almacenara el Imagen
            JFileChooser seleccionarCarpeta = new JFileChooser();
            seleccionarCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionarCarpeta.showSaveDialog(this);
            File carpetaSeleccionada = seleccionarCarpeta.getSelectedFile();
            //guardar archivo en carpeta seleccionada
            OutputStream salida = new FileOutputStream(carpetaSeleccionada.getAbsolutePath() + File.separator + "archivoPrueba.pdf");
            salida.write(archivoImagen);
            salida.close();
        } catch (Exception e) {
        }
    }

    //Abre un Imagen extraido de la BD guardandolo en la carpeta del proyecto
    public void abriImagen(byte[] archivoImagen){
        try {
            //convierte el archivo byte enviado en uno nuevo Imagen para almacenar
            InputStream archivo = new ByteArrayInputStream(archivoImagen);
            int tamanoImagen = archivo.available();
            byte[] nuevoArchivoImagen = new byte[tamanoImagen];
            archivo.read(nuevoArchivoImagen, 0, tamanoImagen);
            OutputStream salida = new FileOutputStream("."+File.separator+"archivosImagen"+File.separator+"archivoPrueba.pdf");
            salida.write(archivoImagen);
            salida.close();
        } catch (Exception e) {
        }
    }
    
    //Abre un archivo Imagen de una ruta especifica
    public void abrirImagen(File archivoImagen) {
        try {
            Desktop.getDesktop().open(archivoImagen);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo Imagen", "Abrir Imagen", JOptionPane.ERROR);
        }
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
            java.util.logging.Logger.getLogger(ManejoImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoImagen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoImagen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
