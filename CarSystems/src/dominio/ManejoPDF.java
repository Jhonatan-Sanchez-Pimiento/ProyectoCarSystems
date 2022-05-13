package dominio;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author IntegraSoft
 */
public class ManejoPDF {

    private String rutaArchivo;

    //método que selecciona un archivo PDF del disco duro
    public String seleccionarPDF() {
        try {
            JFileChooser buscadorArchivo = new JFileChooser();
            FileNameExtensionFilter extension = new FileNameExtensionFilter("pdf", "pdf");
            buscadorArchivo.setFileFilter(extension);
            int seleccion = buscadorArchivo.showOpenDialog(null);
            if (seleccion == 0) {
                rutaArchivo = buscadorArchivo.getSelectedFile().getAbsolutePath();
            } else {
                rutaArchivo = null;
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
    public void descargarPDF(byte[] archivoPDF, String vehiculo) {
        System.out.println("archivoPDF = " + Arrays.toString(archivoPDF));
        try {
            //convierte el archivo byte enviado en uno nuevo PDF para almacenar
            InputStream archivo = new ByteArrayInputStream(archivoPDF);
            int tamanoPDF = archivo.available();
            byte[] nuevoArchivoPDF = new byte[tamanoPDF];
            archivo.read(nuevoArchivoPDF, 0, tamanoPDF);
            //Seleccionar carpeta a donde se almacenara el PDF
            JFileChooser seleccionarCarpeta = new JFileChooser();
            seleccionarCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionarCarpeta.showSaveDialog(null);
            File carpetaSeleccionada = seleccionarCarpeta.getSelectedFile();
            try ( //guardar archivo en carpeta seleccionada
                    OutputStream salida = new FileOutputStream(carpetaSeleccionada.getAbsolutePath() + File.separator + "Informe_Diagnostico_" + vehiculo + ".pdf")) {
                salida.write(archivoPDF);
            }
        } catch (HeadlessException | IOException e) {
            e.printStackTrace(System.out);
            JOptionPane.showMessageDialog(null, "Error al descargar el archivo PDF : " + e, "Descargar PDF", JOptionPane.ERROR_MESSAGE);
        }
    }

    //Abre un PDF extraido de la BD guardandolo en la carpeta del proyecto
    public void abriPDF(byte[] archivoPDF) {
        try {
            //convierte el archivo byte enviado en uno nuevo PDF para almacenar
            InputStream archivo = new ByteArrayInputStream(archivoPDF);
            int tamanoPDF = archivo.available();
            byte[] nuevoArchivoPDF = new byte[tamanoPDF];
            archivo.read(nuevoArchivoPDF, 0, tamanoPDF);
            OutputStream salida = new FileOutputStream("." + File.separator + "archivosPDF" + File.separator + "archivoPrueba.pdf");
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
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo PDF", "Abrir PDF", JOptionPane.ERROR);
        }
    }
}
