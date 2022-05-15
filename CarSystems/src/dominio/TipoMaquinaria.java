package dominio;

/**
 * @author IntegraSoft
 */
public class TipoMaquinaria {
    private int idTipoMaquinaria;
    private String nombreTipoMaquinaria;

    public TipoMaquinaria() {
    }

    public TipoMaquinaria(String nombreTipoMaquinaria) {
        this.nombreTipoMaquinaria = nombreTipoMaquinaria;
    }

    public TipoMaquinaria(int idTipoMaquinaria, String nombreTipoMaquinaria) {
        this.idTipoMaquinaria = idTipoMaquinaria;
        this.nombreTipoMaquinaria = nombreTipoMaquinaria;
    }

    public String getNombreTipoMaquinaria() {
        return nombreTipoMaquinaria;
    }

    public void setNombreTipoMaquinaria(String nombreTipoMaquinaria) {
        this.nombreTipoMaquinaria = nombreTipoMaquinaria;
    }

    public int getIdTipoMaquinaria() {
        return idTipoMaquinaria;
    }

    public void setIdTipoMaquinaria(int idTipoMaquinaria) {
        this.idTipoMaquinaria = idTipoMaquinaria;
    }
    
    
}