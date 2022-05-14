package dominio;

import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author Jhonatan Sánchez
 */
public class ManejoImagen {
    private String rutaArchivo;
    private String nombreArchivo;

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
    public String seleccionarImagen() {
        try {
            JFileChooser buscadorArchivo = new JFileChooser();
            FileNameExtensionFilter extension = new FileNameExtensionFilter("Imagenes JPG, JPEG & PNG", "jpg", "jpeg", "png");
            buscadorArchivo.setFileFilter(extension);
            int seleccion = buscadorArchivo.showOpenDialog(null);
            if (seleccion == 0) {
                nombreArchivo = buscadorArchivo.getName();
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
    public byte[] convertirImagenaByte(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        byte[] archivoImagen = null;
        //valida si la ruta de archivo enviada sea diferente de vacio
        if (rutaArchivo != null) {
            File archivo = new File(rutaArchivo);
            try {
                archivoImagen = new byte[(int) archivo.length()];
                InputStream input = new FileInputStream(archivo);
                input.read(archivoImagen);
            } catch (IOException e) {
                e.printStackTrace(System.out);
            }
        }
        //Agregar archivo Imagen convertido Byte a la clase que pertenece
        //vehiculo.setImagen(archivoImagen);
        return archivoImagen;
    }

    //Retorna una imagen de acuerdo a un archivo Blob traído de la BD
    public Image convertirBlobaImagen(Blob imagenBlob) {
        BufferedImage imagen = null;
        try {
            imagen = ImageIO.read(new ByteArrayInputStream(this.convertirBlobaByte(imagenBlob)));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return imagen;
    }

    //Retorna un archivo Image de acuerdo a una ruta especifica para almacenar en el @param Imagen @class Vehiculo
    public Image guardarImagenVehiculo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
        Image imagen;
        try {
            imagen = Toolkit.getDefaultToolkit().getImage(this.rutaArchivo);
        } catch (Exception e) {
            imagen = null;
            e.printStackTrace(System.out);
        }
        return imagen;
    }

    //Retorna un byte [] de un archivo Blob traído de la BD
    public byte[] convertirBlobaByte(Blob imagenBlob) {
        byte[] imagenByte;
        try {
            imagenByte = imagenBlob.getBytes(1, (int) imagenBlob.length());
        } catch (SQLException ex) {
            imagenByte = null;
            ex.printStackTrace(System.out);
        }
        return imagenByte;
    }

    //Descarga el archivo Byte[] como Imagen en una ruta especifica del disco
    public void descargarImagen(byte[] imagenByte) {
        System.out.println("archivoImagen = " + Arrays.toString(imagenByte));
        try {
            //convierte el archivo byte enviado en uno nueva Imagen para almacenar
            InputStream archivo = new ByteArrayInputStream(imagenByte);
            int tamanoImagen = archivo.available();
            byte[] nuevoArchivoImagen = new byte[tamanoImagen];
            archivo.read(nuevoArchivoImagen, 0, tamanoImagen);
            //Seleccionar carpeta a donde se almacenara el Imagen
            JFileChooser seleccionarCarpeta = new JFileChooser();
            seleccionarCarpeta.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            seleccionarCarpeta.showSaveDialog(null);
            File carpetaSeleccionada = seleccionarCarpeta.getSelectedFile();
            try { //guardar archivo en carpeta seleccionada
                OutputStream salida = new FileOutputStream(carpetaSeleccionada.getAbsolutePath() + File.separator + "archivoPrueba.jpg");
                salida.write(imagenByte);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        } catch (HeadlessException | IOException e) {
            JOptionPane.showMessageDialog(null, "Error al descargar la Imagen : " + e.getMessage(), "Descargar Imagen", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(System.out);
        }
    }

    //Abre un archivo Imagen de una ruta especifica
    public void abrirImagen(File archivoImagen) {
        try {
            Desktop.getDesktop().open(archivoImagen);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al abrir el archivo Imagen", "Abrir Imagen", JOptionPane.ERROR);
        }
    }
}
