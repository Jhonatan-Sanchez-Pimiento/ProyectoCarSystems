
package dominio;

import java.awt.Image;

/**
 *
 * @author Asus IntegraSoft
 */
public class MaquinariaPesada extends Vehiculo {
    
    public MaquinariaPesada(String idVehiculo, String tipoIdUsuario, int idUsuario, String tipoServicio, int tipoVehiculo, int idMarca, int idLinea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, String descripcion, String estadoJudicial) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, tipoVehiculo, idMarca, idLinea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, descripcion, estadoJudicial);
    }
    
}



