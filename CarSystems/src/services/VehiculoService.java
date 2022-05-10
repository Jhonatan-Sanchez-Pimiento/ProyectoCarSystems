package services;

import dominio.*;
import java.io.File;
import java.util.List;

/**
 *
 * @author IntegraSoft
 */
public interface VehiculoService {
    
    public void guardar(Vehiculo vehiculo, String ruta, Usuario usuario);
    
    public void guardarEstadoJudicial(File estadoJudicial);
    
    public void eliminar(Vehiculo vehiculo);
    
    public List<Vehiculo> listarVehiculo();
    
    public Vehiculo encontrarVehiculo (String idVehiculo);
    
    public void actualizar (Vehiculo vehiculo);
    
    public List<Vehiculo> listarVehiculoCamioneta();
    
    public List<Vehiculo> listarVehiculoMaquinariaPesada();
    
    public List<Vehiculo> listarVehiculoBlindado();
    
    public List<Vehiculo> listarVehiculoServicioPublico();
    
    public List<Vehiculo> listarVehiculoServicioPrivado();
    
    public List<Vehiculo> listarVehiculoAutomovil();
    
    public List<Vehiculo> listarVehiculoMarca();
    
    public List<Vehiculo> listarVehiculoTipoMaquinariaPesada(MaquinariaPesada maquinariaPesada);
}