package test;

import dominio.Automovil;
import dominio.Usuario;
import static javafx.application.Platform.exit;
import serviceImpl.UsuarioServiceImpl;
import serviceImpl.VehiculoServiceImpl;

/**
 * @author IntegraSoft
 */
public class testAutomovil {
    public static void main(String[] args) {
        VehiculoServiceImpl vehiculoServicio = new VehiculoServiceImpl();
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
        
        Usuario usuario = usuarioServicio.encontrarUsuario(1022968969L, "CC");
        
        Automovil vehiculo = new Automovil("WWW-123", usuario.getTipoId(), usuario.getIdUsuario(), 
                "Publico", "Hyundai", "Accent Vision", "Rojo", 2022, 4, false, false, 12500, null, null, "Esta en buen estado", null);
        vehiculoServicio.guardar(vehiculo);
        
    }
}