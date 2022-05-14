package dominio;

/**
 * @author IntegraSoft
 */
public class Linea {
    private int idLinea;
    private int idMarca;
    private String nombreLinea;

    public Linea() {
    }

    public Linea(int idMarca, String nombreLinea) {
        this.idMarca = idMarca;
        this.nombreLinea = nombreLinea;
    }

    public Linea(int idLinea, int idMarca, String nombreLinea) {
        this.idLinea = idLinea;
        this.idMarca = idMarca;
        this.nombreLinea = nombreLinea;
    }

    public int getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(int idLinea) {
        this.idLinea = idLinea;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreLinea() {
        return nombreLinea;
    }

    public void setNombreLinea(String nombreLinea) {
        this.nombreLinea = nombreLinea;
    }

    @Override
    public String toString() {
        return "Linea{" + "idLinea=" + idLinea + ", idMarca=" + idMarca + ", nombreLinea=" + nombreLinea + '}';
    }
    
}