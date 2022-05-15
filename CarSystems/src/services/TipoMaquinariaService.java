package services;

import dominio.TipoMaquinaria;
import java.util.List;

/**
 *
 * @author Jhonatan Sánchez
 */
public interface TipoMaquinariaService {
    public void guardar(TipoMaquinaria tipoMaquinaria);
    
    public void eliminar(TipoMaquinaria tipoMaquinaria);
    
    public List<TipoMaquinaria> listarTipoMaquinaria();
    
    public TipoMaquinaria encontrarTipoMaquinaria (String nombreTipoMaquinaria);
    
    public void actualizar (TipoMaquinaria tipoMaquinaria);
}
