package dominio;

import java.awt.Image;

/**
 * @author IntegraSoft
 */
public abstract class Vehiculo {
    private String idVehiculo;
    private String tipoIdUsuario;
    private long idUsuario;
    private String tipoServicio;
    private String tipoVehiculo;
    private String marca;
    private String linea;
    private String color;
    private int modelo;
    private int cupoPersona;
    private boolean utilitario;
    private boolean blindado;
    private double precio;
    private Image imagen;
    private byte[] imagenByte;
    private String descripcion;
    private byte[] estadoJudicial;
    private int peso;
    private int alto;
    private int ancho;
    private int largo;
    private String tipoMaquinaria;

    public Vehiculo() {
    }

       public Vehiculo(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String tipoVehiculo, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, byte[] imagenByte, String descripcion, byte[] estadoJudicial) {
        this.idVehiculo = idVehiculo;
        this.tipoIdUsuario = tipoIdUsuario;
        this.idUsuario = idUsuario;
        this.tipoServicio = tipoServicio;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.cupoPersona = cupoPersona;
        this.utilitario = utilitario;
        this.blindado = blindado;
        this.precio = precio;
        this.imagen = imagen;
        this.imagenByte = imagenByte;
        this.descripcion = descripcion;
        this.estadoJudicial = estadoJudicial;
    }

    public Vehiculo(String idVehiculo, String tipoIdUsuario, long idUsuario, String tipoServicio, String tipoVehiculo, String marca, String linea, String color, int modelo, int cupoPersona, boolean utilitario, boolean blindado, double precio, Image imagen, byte[] imagenByte, String descripcion, byte[] estadoJudicial, int peso, int alto, int ancho, int largo, String tipoMaquinaria) {
        this.idVehiculo = idVehiculo;
        this.tipoIdUsuario = tipoIdUsuario;
        this.idUsuario = idUsuario;
        this.tipoServicio = tipoServicio;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.cupoPersona = cupoPersona;
        this.utilitario = utilitario;
        this.blindado = blindado;
        this.precio = precio;
        this.imagen = imagen;
        this.imagenByte = imagenByte;
        this.descripcion = descripcion;
        this.estadoJudicial = estadoJudicial;
        this.peso = peso;
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
        this.tipoMaquinaria = tipoMaquinaria;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getTipoIdUsuario() {
        return tipoIdUsuario;
    }

    public void setTipoIdUsuario(String tipoIdUsuario) {
        this.tipoIdUsuario = tipoIdUsuario;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public byte[] getImagenByte() {
        return imagenByte;
    }

    public void setImagenByte(byte[] imagenByte) {
        this.imagenByte = imagenByte;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public byte[] getEstadoJudicial() {
        return estadoJudicial;
    }

    public void setEstadoJudicial(byte[] estadoJudicial) {
        this.estadoJudicial = estadoJudicial;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getTipoMaquinaria() {
        return tipoMaquinaria;
    }

    public void setTipoMaquinaria(String tipoMaquinaria) {
        this.tipoMaquinaria = tipoMaquinaria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo + ", tipoIdUsuario=" + tipoIdUsuario + ", idUsuario=" + idUsuario + ", tipoServicio=" + tipoServicio + ", tipoVehiculo=" + tipoVehiculo + ", marca=" + marca + ", linea=" + linea + ", color=" + color + ", modelo=" + modelo + ", cupoPersona=" + cupoPersona + ", utilitario=" + utilitario + ", blindado=" + blindado + ", precio=" + precio + ", imagen=" + imagen + ", imagenByte=" + imagenByte + ", descripcion=" + descripcion + ", estadoJudicial=" + estadoJudicial + ", peso=" + peso + ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", tipoMaquinaria=" + tipoMaquinaria + '}';
    }

}