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
public class ManejoPDF extends javax.swing.JFrame {

    private String rutaArchivo;

    public ManejoPDF() {
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

    //método que selecciona un archivo PDF del disco duro
    public String seleccionarPDF() {
        try {
            JFileChooser buscadorArchivo = new JFileChooser();
            FileNameExtensionFilter extension = new FileNameExtensionFilter("pdf", "pdf");
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
    public byte[] convertirPDFaByte(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        byte[] archivoPDF;
        File archivo = new File(rutaArchivo);
        try {
            archivoPDF = new byte[(int) archivo.length()];
            InputStream input = new FileInputStream(archivo);
            input.read(archivoPDF);
        } catch (Exception e) {
            archivoPDF = null;
            e.printStackTrace(System.out);
        }
        //Agregar archivo PDF convertido Byte a la clase que pertenece
        //vehiculo.setArchivoPDF(archivoPDF);
        return archivoPDF;
    }

    //Descarga el archivo Byte[] como PDF en una ruta especifica del disco
    public void descargarPDF(byte[] archivoPDF) {
        System.out.println("archivoPDF = " + archivoPDF);
        try {
            //convierte el archivo byte enviado en uno nuevo PDF para almacenar
            InputStream archivo = new ByteArrayInputStream(archivoPDF);
            int tamanoPDF = archivo.available();
            byte[] nuevoArchivoPDF = new byte[tamanoPDF];
            archivo.read(nuevoArchivoPDF, 0, tamanoPDF);
            //Seleccionar carpeta a donde se almacenara el PDF
            JFileChooser seleccionarCarpeta = new JFileChooser();
            seleccionarCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionarCarpeta.showSaveDialog(this);
            File carpetaSeleccionada = seleccionarCarpeta.getSelectedFile();
            //guardar archivo en carpeta seleccionada
            OutputStream salida = new FileOutputStream(carpetaSeleccionada.getAbsolutePath() + File.separator + "archivoPrueba.pdf");
            salida.write(archivoPDF);
            salida.close();
        } catch (Exception e) {
        }
    }

    //Abre un PDF extraido de la BD guardandolo en la carpeta del proyecto
    public void abriPDF(byte[] archivoPDF){
        try {
            //convierte el archivo byte enviado en uno nuevo PDF para almacenar
            InputStream archivo = new ByteArrayInputStream(archivoPDF);
            int tamanoPDF = archivo.available();
            byte[] nuevoArchivoPDF = new byte[tamanoPDF];
            archivo.read(nuevoArchivoPDF, 0, tamanoPDF);
            OutputStream salida = new FileOutputStream("."+File.separator+"archivosPDF"+File.separator+"archivoPrueba.pdf");
            salida.write(archivoPDF);
            salida.close();
        } catch (Exception e) {
        }
    }
    
    //Abre un archivo PDF de una ruta especifica
    public void abrirPDF(File archivoPDF) {
        try {
            Desktop.getDesktop().open(archivoPDF);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al abrir el archivo PDF", "Abrir PDF", JOptionPane.ERROR);
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
            java.util.logging.Logger.getLogger(ManejoPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManejoPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManejoPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManejoPDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManejoPDF().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
