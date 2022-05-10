package test;

import dominio.Automovil;
import dominio.ManejoPDF;
import dominio.Usuario;
import serviceImpl.UsuarioServiceImpl;
import serviceImpl.VehiculoServiceImpl;

/**
 * @author IntegraSoft
 */
public class testAutomovil {
    public static void main(String[] args) {
        VehiculoServiceImpl vehiculoServicio = new VehiculoServiceImpl();
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
        ManejoPDF manejoPDF = new ManejoPDF();
        String rutaArchivo;
        
        Usuario usuario = new Usuario(1090442900L,"Cedula de Ciudadanía" , "Saenz", "Rodriguez", "Juan Mateo", "Norte de Santander", "Cúcuta", "Calle 32 22 - 80", "3123577331", "Jmsanchezp1234@sanmateo.edu.co", "Vendedor", "123456");
        
        
        //Guardar Automovil
        Automovil automovil = new Automovil("PQA-321", "Cedula de Ciudadanía", 1090497465L, "Publico", "Automovil", "Hyundai", "Accent Vision", "Amarillo", 2022, 4, false, false, 12431452F, "Vehiculo de servicio publico en buen estado");
                
        rutaArchivo = manejoPDF.seleccionarPDF();
        automovil.setEstadoJudicial(manejoPDF.convertirPDFaByte(rutaArchivo));
        
        vehiculoServicio.guardar(automovil, rutaArchivo, usuario);
    }
}
