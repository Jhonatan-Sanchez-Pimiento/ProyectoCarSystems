package dominio;

/**
 *
 * @author IntegraSoft
 */
public class Marca {
    private int idMarca;
    private String nombreMarca;

    public Marca() {
    }

    @Override
    public String toString() {
        return "Marca{" + "idMarca=" + idMarca + ", nombreMarca=" + nombreMarca + '}';
    }

    public Marca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }
    
    public Marca(int idMarca, String nombreMarca) {
        this.idMarca = idMarca;
        this.nombreMarca = nombreMarca;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombreMarca() {
        return nombreMarca;
    }

    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

}
