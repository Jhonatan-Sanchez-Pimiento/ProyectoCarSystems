

package services;

import dominio.Municipio;
import java.util.List;

/**
 *
 * @author Integrasoft
 */
public interface MunicipioService {
    
    public void guardar(Municipio municipio);
    
    public void eliminar(Municipio municipio);
    
    public List<Municipio> listarMunicipio(String nombreDepartamento);
    
    public List<Municipio> encontrarMunicipioxDepartamento (String nombreDepartamento);
    
    public void actualizar (Municipio municipio);
    
}
