
package dominio;

/**
 *
 * @author Integrasoft
 */
public class Municipio {
    
    private int idMunicipio;
    private String nombreMunicipio;
    private int idDepartamento;

    public Municipio(int idMunicipio, String nombreMunicipio, int idDepartamento) {
        this.idMunicipio = idMunicipio;
        this.nombreMunicipio = nombreMunicipio;
        this.idDepartamento = idDepartamento;
    }

    public Municipio(String nombreMunicipio, int idDepartamento) {
        this.nombreMunicipio = nombreMunicipio;
        this.idDepartamento = idDepartamento;
    }

    public Municipio() {
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Municipio{" + "idMunicipio=" + idMunicipio + ", nombreMunicipio=" + nombreMunicipio + ", idDepartamento=" + idDepartamento + '}';
    }
   
    
}
