package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class MaquinariaPesada extends Vehiculo {

    //Método constructor vacio y con las variables de Maquinaria Pesada
    public MaquinariaPesada() {
    }

    public MaquinariaPesada(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String tipoVehiculo, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, String descripcion, int peso, int alto, int ancho, int largo, String tipoMaquinaria) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, tipoVehiculo, marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, descripcion, peso, alto, ancho, largo, tipoMaquinaria);
    }

    public MaquinariaPesada(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, String descripcion, byte [] estadoJudicial, int peso, int alto, int ancho, int largo, String tipoMaquinaria) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, "Maquinaria pesada", marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, descripcion, estadoJudicial, peso, alto, ancho, largo, tipoMaquinaria);
    }
    
}