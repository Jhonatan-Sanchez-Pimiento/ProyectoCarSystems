package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class Camioneta extends Vehiculo{
    
    public Camioneta(String idVehiculo, String tipoIdUsuario, int idUsuario, String tipoServicio, int tipoVehiculo, int idMarca, int idLinea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, String descripcion, String estadoJudicial) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, tipoVehiculo, idMarca, idLinea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, descripcion, estadoJudicial);
    }
    
    
}
