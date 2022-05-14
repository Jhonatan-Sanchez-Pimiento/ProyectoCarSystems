package services;

import dominio.Diagnostico;
import java.util.List;

/**
 * @author IntegraSoft
 */
public interface DiagnosticoService {
    
    public void guardar(Diagnostico diagnostico);
    
    public void eliminar(Diagnostico diagnostico);
    
    public List<Diagnostico> listarDiagnostico();
    
    public Diagnostico encontrarDiagnostico (long idDiagnostico);
    
    public void actualizar (Diagnostico diagnostico);
}
