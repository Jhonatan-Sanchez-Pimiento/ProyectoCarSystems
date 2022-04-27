package services;

import dominio.Camioneta;
import dominio.Usuario;
import java.util.List;

/**
 * @author IntegraSoft
 */
public interface CamionetaService {
    public void guardar(Camioneta camioneta, Usuario usuario);
    
    public void eliminar(Camioneta camioneta);
    
    public List<Camioneta> listarCamioneta();
    
    public Camioneta encontrarCamioneta (Camioneta camioneta);
}
