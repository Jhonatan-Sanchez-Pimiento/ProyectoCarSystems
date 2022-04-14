package interfaces;

/**
 *
 * @author IntegraSoft
 */
public class IVehiculo {
    private String idVehiculo;
    private int tipoVehiculo;
    private int idMarca;
    private int idLinea;
    private int modelo;
    private int cupoPersona;
    private double precio;
    private String descripcion;

    public IVehiculo(String idVehiculo, int tipoVehiculo, int idMarca, int idLinea, int modelo, int cupoPersona, double precio, String descripcion) {
        this.idVehiculo = idVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.idMarca = idMarca;
        this.idLinea = idLinea;
        this.modelo = modelo;
        this.cupoPersona = cupoPersona;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCupoPersona() {
        return cupoPersona;
    }

    public void setCupoPersona(int cupoPersona) {
        this.cupoPersona = cupoPersona;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
