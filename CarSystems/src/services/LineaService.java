package services;

import dominio.Linea;
import java.util.List;

/**
 * @author IntegraSoft
 */
public interface LineaService {
    public void guardar(Linea linea);
    
    public void eliminar(Linea linea);
    
    public List<Linea> listarLinea();
    
    public Linea encontrarLinea (int idLinea);
    
    public void actualizar (Linea linea);
    
    public List<Linea> listarLineaXMarca(String nombreMarca);
}
