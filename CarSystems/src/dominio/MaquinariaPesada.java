package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public class MaquinariaPesada extends Vehiculo {

    //Método constructor vacio y con las variables de Maquinaria Pesada
    public MaquinariaPesada() {
    }

    public MaquinariaPesada(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, byte[] imagenByte, String descripcion, byte[] estadoJudicial, int peso, int alto, int ancho, int largo, String tipoMaquinaria) {
        super(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, "Maquinaria pesada", marca, linea, color, modelo, cupoPersona, utilitario, blindado, precio, imagen, imagenByte, descripcion, estadoJudicial, peso, alto, ancho, largo, tipoMaquinaria);
    }


}