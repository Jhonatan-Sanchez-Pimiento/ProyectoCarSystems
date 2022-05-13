package dominio;

import java.awt.Image;

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
    
    public boolean convertirStringBoolean(String valorString){
        boolean valorBoolean=false;
        if(valorString.equals("Si")){
         valorBoolean = true;   
        }else if(valorString.equals("No")){
            valorBoolean = false;
        }
        return valorBoolean;
    }
}
