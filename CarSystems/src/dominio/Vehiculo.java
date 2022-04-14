package dominio;

/**
 *
 * @author Jhonatan Sánchez
 */
public abstract class Vehiculo {
    private String idVehiculo;
    private int tipoVehiculo;
    private int idMarca;
    private int idLinea;
    private int modelo;
    private int cupoPersona;
    private double precio;
    private String descripcion;

    public Vehiculo(String idVehiculo, int tipoVehiculo, int idMarca, int idLinea, int modelo, int cupoPersona, double precio, String descripcion) {
        this.idVehiculo = idVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.idMarca = idMarca;
        this.idLinea = idLinea;
        this.modelo = modelo;
        this.cupoPersona = cupoPersona;
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    
}
