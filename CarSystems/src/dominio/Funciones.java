package dominio;

import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import serviceImpl.LineaServiceImpl;
import serviceImpl.MarcaServiceImpl;
import serviceImpl.TipoMaquinariaServiceImpl;

/**
 *
 * @author Jhonatan Sánchez
 */
public class Funciones {

    //muestra la imagen en un Label
    public void mostrarImagen(Image imagen) {
        //ImageIcon icono = new ImageIcon(imagen.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_DEFAULT));
        //lblImagen.setIcon(icono);
        //this.setVisible(true);
    }

    //Convertir boolean a String
    public String convertirBooleanString(boolean valorBoolean) {
        String valorString;
        if (valorBoolean == true) {
            valorString = "Si";
        } else {
            valorString = "No";
        }
        return valorString;
    }

    /**
     * @return List
     * @Method listarMarcas
     */
    public List<Marca> listarMarcas() {
        List<Marca> marcas = null;
        try {
            MarcaServiceImpl marcaServicio = new MarcaServiceImpl();
            marcas = marcaServicio.listarMarca();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return marcas;
    }

    public void irAPaginaWeb(String URL) {
        if(Desktop.isDesktopSupported()){
            Desktop escritorio = Desktop.getDesktop();
            
            if(escritorio.isSupported(Desktop.Action.BROWSE)){
                try {
                    URI uri = new URI(URL);
                    escritorio.browse(uri);
                } catch (IOException | URISyntaxException e) {
                    JOptionPane.showMessageDialog(null, "Error al abrir el sitio "+URL+" en el navegador.","Error al abrir página Web",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
    
    public void validarCampoTexto(KeyEvent evt, JTextField campo,int tamano){
        char caracter = evt.getKeyChar();
        if ((caracter < 'a' || caracter > 'z') && (caracter < 'A' || caracter > 'Z') && (caracter < ' ' || caracter > ' ')) {
            evt.consume();
        }

        if (campo.getText().length() >= tamano) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void limitarCaracteresAreaText(KeyEvent evt, JTextArea campo,int tamano){
        if (campo.getText().length() >= tamano) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void limitarCaracteresTextField(KeyEvent evt, JTextField campo,int tamano){
        if (campo.getText().length() >= tamano) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }
    
    public void convertirMinusculaAMayascula(KeyEvent evt){
        char caracter = evt.getKeyChar();
            if (Character.isLowerCase(caracter)) {
                evt.setKeyChar(Character.toUpperCase(caracter));
            }
    }

    public boolean validarCampoNumero(KeyEvent evt, JTextField campo,int tamano){
        boolean campoValidado=false;
        char a = evt.getKeyChar();
        if ((a < '0' || a > '9')) {
            evt.consume();
            campoValidado = true;
        }
        if (campo.getText().length() >= tamano) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
        return campoValidado;
    }
    
    public List<Linea> listarLineaXMarca(String marca) {
        List<Linea> lineas = null;
        try {
            LineaServiceImpl lineaServicio = new LineaServiceImpl();
            lineas = lineaServicio.listarLineaXMarca(marca);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return lineas;
    }

    public List<TipoMaquinaria> listarTipoMaquinaria() {
        List<TipoMaquinaria> tipoMaquinarias = null;
        try {
            TipoMaquinariaServiceImpl tipoMaquinariaServicio = new TipoMaquinariaServiceImpl();
            tipoMaquinarias = tipoMaquinariaServicio.listarTipoMaquinaria();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return tipoMaquinarias;
    }
    
    //Convierte un valor String en un Booleano
    public boolean convertirStringBoolean(String valorString) {
        boolean valorBoolean = false;
        if (valorString.equals("Si")) {
            valorBoolean = true;
        } else if (valorString.equals("No")) {
            valorBoolean = false;
        }
        return valorBoolean;
    }

    //Valida si una cadena String cumple con las condiciones de Email y retorna un Boolean
    public boolean isEmail(String correo) {
        Pattern pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        Matcher mat = pat.matcher(correo);
        return mat.find();
    }
}
