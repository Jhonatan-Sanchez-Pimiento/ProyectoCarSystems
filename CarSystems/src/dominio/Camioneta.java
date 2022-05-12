package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class Camioneta extends Vehiculo{

    //Método constructor vacio y con las variables para crear un objeto Camioneta
    public Camioneta() {
    }

    public Camioneta(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, byte[] imagenByte, String descripcion, byte[] estadoJudicial) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, "Camioneta", marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, imagenByte, descripcion, estadoJudicial);
    }

}