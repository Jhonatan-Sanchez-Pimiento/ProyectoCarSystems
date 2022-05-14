package dominio;

import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    public String convertirBooleanString(boolean valorBoolean){
        String valorString;
        if(valorBoolean==true){
            valorString = "Si";
        }else{
            valorString = "No";
        }
        return valorString;
    }
    
    //Convierte un valor String en un Booleano
    public boolean convertirStringBoolean(String valorString){
        boolean valorBoolean=false;
        if(valorString.equals("Si")){
         valorBoolean = true;   
        }else if(valorString.equals("No")){
            valorBoolean = false;
        }
        return valorBoolean;
    }
    
    //Valida si una cadena String cumple con las condiciones de Email y retorna un Boolean
    public boolean isEmail (String correo){
        Pattern pat = Pattern.compile("^[\\w\\-\\_\\+]+(\\.[\\w\\-\\_]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z]{2,4}$");
        Matcher mat = pat.matcher(correo);
        return mat.find();
    }
}
