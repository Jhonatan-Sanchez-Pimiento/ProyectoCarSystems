package services;

import dominio.Departamento;
import java.util.List;

/**
 *
 * @author IntegraSoft
 */
public interface DepartamentoService {
    public void guardar(Departamento departamento);
    
    public void eliminar(Departamento departamento);
    
    public List<Departamento> listarDepartamento();
    
    public Departamento encontrarDepartamento (String nombreDepartamento);
    
    public void actualizar (Departamento departamento);
}
