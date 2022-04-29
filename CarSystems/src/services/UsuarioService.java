package services;

import dominio.Usuario;
import java.util.List;
/**
 * @author IntegraSoft
 */
public interface UsuarioService {
    
    public void guardar(Usuario usuario);
    
    public void eliminar(Usuario usuario);
    
    public List<Usuario> listarUsuario();
    
    public Usuario encontrarUsuario (Usuario usuario);
}
