package dominio;

import java.awt.Image;

/**
 *
 * @author Jhonatan Sánchez
 */
public abstract class Vehiculo {
    private String idVehiculo;
    private String tipoIdUsuario;
    private int idUsuario;
    private String tipoServicio;
    private int tipoVehiculo;
    private int idMarca;
    private int idLinea;
    private String color;
    private int modelo;
    private int cupoPersona;
    private boolean utilitario;
    private boolean blindado;
    private double precio;
    private Image imagen;
    private String descripcion;
    private String estadoJudicial;
    private int peso;
    private int alto;
    private int ancho;
    private int largo;
    private int tipoMaquinaria;

    public Vehiculo(String idVehiculo, String tipoIdUsuario, int idUsuario, String tipoServicio, int tipoVehiculo, int idMarca, int idLinea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, String descripcion, String estadoJudicial) {
        this.idVehiculo = idVehiculo;
        this.tipoIdUsuario = tipoIdUsuario;
        this.idUsuario = idUsuario;
        this.tipoServicio = tipoServicio;
        this.tipoVehiculo = tipoVehiculo;
        this.idMarca = idMarca;
        this.idLinea = idLinea;
        this.color = color;
        this.modelo = modelo;
        this.cupoPersona = cupoPersona;
        this.utilitario = utilitario;
        this.blindado = blindado;
        this.precio = precio;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estadoJudicial = estadoJudicial;
    }

    public String getTipoIdUsuario() {
        return tipoIdUsuario;
    }

    public void setTipoIdUsuario(String tipoIdUsuario) {
        this.tipoIdUsuario = tipoIdUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isUtilitario() {
        return utilitario;
    }

    public void setUtilitario(boolean utilitario) {
        this.utilitario = utilitario;
    }

    public boolean isBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public String getEstadoJudicial() {
        return estadoJudicial;
    }

    public void setEstadoJudicial(String estadoJudicial) {
        this.estadoJudicial = estadoJudicial;
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
    
    public int  getpeso() {
        return peso;
    }

    public void setpeso(int peso) {
        this.peso = peso;
    }
    
    public int  getalto() {
        return alto;
    }

    public void setalto(int alto) {
        this.alto = alto;
    }
    
    public int  getancho() {
        return ancho;
    }

    public void setancho(int ancho) {
        this.ancho = ancho;
    }
    
    public int  getlargo() {
        return largo;
    }

    public void setlargo(int largo) {
        this.largo = largo;
    }
    
    public int  gettipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void settipoMaquinaria(int tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }
   
}
