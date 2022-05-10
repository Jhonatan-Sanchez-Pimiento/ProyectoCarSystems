package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class Camioneta extends Vehiculo{

    //Método constructor vacio y con las variables para crear un objeto Camioneta
    public Camioneta() {
    }

    public Camioneta(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String tipoVehiculo, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, String descripcion) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, tipoVehiculo, marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, descripcion);
    }

    public Camioneta(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, String descripcion, byte [] estadoJudicial) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, "Camioneta", marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, descripcion, estadoJudicial);
    }

}