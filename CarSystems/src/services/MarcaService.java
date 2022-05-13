package services;

import dominio.Marca;
import java.util.List;

/**
 * @author IntegraSoft
 */
public interface MarcaService {
    public void guardar(Marca marca);
    
    public void eliminar(Marca marca);
    
    public List<Marca> listarMarca();
    
    public Marca encontrarMarca (int idMarca);
    
    public void actualizar (Marca marca);
}
