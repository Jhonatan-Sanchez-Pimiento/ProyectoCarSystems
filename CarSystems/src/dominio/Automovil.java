package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class Automovil extends Vehiculo{

    //Método constructor para cargar y crear un objeto Automovil
    public Automovil() {
    }

    public Automovil(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, byte[] imagenByte, String descripcion, byte[] estadoJudicial) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, "Automovil", marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, imagenByte, descripcion, estadoJudicial);
    }

}