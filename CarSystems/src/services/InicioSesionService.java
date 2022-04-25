package services;

import dominio.InicioSesion;
import java.util.List;

/**
 * @author Jhonatan Sánchez
 */
public interface InicioSesionService {
    public void guardar(InicioSesion inicioSesion);
    
    public void eliminar(InicioSesion inicioSesion);
    
    public List<InicioSesion> listarInicioSesion();
    
    public InicioSesion encontrarInicioSesion (InicioSesion inicioSesion);
}
