
package services;

import dominio.MaquinariaPesada;
import dominio.Usuario;
import java.util.List;

/**
 *
 * @author Integrasoft
 */
public interface MaquinariaPesadaService {
    public void guardar(MaquinariaPesada maquinariaPesada, Usuario usuario);
    
    public void eliminar(MaquinariaPesada maquinariaPesada);
    
    public List<MaquinariaPesada> listarMaquinariaPesada();
    
    public MaquinariaPesada encontrarMaquinariaPesada (MaquinariaPesada maquinariaPesada);
}

