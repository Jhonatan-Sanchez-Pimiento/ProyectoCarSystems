package test;

import dominio.Automovil;
import dominio.ManejoImagen;
import dominio.ManejoPDF;
import dominio.Usuario;
import dominio.Vehiculo;
import java.io.IOException;
import java.util.List;
import serviceImpl.UsuarioServiceImpl;
import serviceImpl.VehiculoServiceImpl;

/**
 * @author IntegraSoft
 */
public class testAutomovil {

    public static void main(String[] args) throws IOException {
        VehiculoServiceImpl vehiculoServicio = new VehiculoServiceImpl();
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
        ManejoPDF manejoPDF = new ManejoPDF();
        ManejoImagen manejoImagen = new ManejoImagen();
        String rutaArchivoPDF;
        String rutaArchivoImagen;

        Usuario usuario = new Usuario(1090442900L,"Pasaporte" , "Arias", "Pachon", "Juan Fernando", "Bogota", "Bogota", "Calle 32 22 - 80", "3123577331", "pachon1234@sanmateo.edu.co", "Vendedor", "123456");
        usuarioServicio.guardar(usuario);
        
        /**
         * @Method guardar Vehiculo
         */
        
        //Seleccion del archivo PDF e Imagen y se guarda la ruta de los mismos
        rutaArchivoPDF = manejoPDF.seleccionarPDF();
        rutaArchivoImagen = manejoImagen.seleccionarImagen();
        
        //Instancia del objeto Automovil
        Automovil automovil = new Automovil("QWE-123", usuario.getTipoId(), usuario.getIdUsuario(), "Publico", "Toyota", 
                "Hilux", "Negro", 2020, 7, false, false, 12800000F, manejoImagen.guardarImagenVehiculo(rutaArchivoImagen),
                manejoImagen.convertirImagenaByte(rutaArchivoImagen), "Vehiculo con excelentes condiciones", manejoPDF.convertirPDFaByte(rutaArchivoPDF));
        
        //Imprime vehiculo creado
        System.out.println("automovil = " + automovil);
        //Guarda Vehiculo en BD invocando el servicio guardar
        vehiculoServicio.guardar(automovil, usuario);

        /**
         * @Method Encontrar Vehiculo por idVehiculo y descargar PDF e Imagen en disco duro
         */
        Vehiculo vehiculoEncontrado = vehiculoServicio.encontrarVehiculo("QWE-123");
        manejoPDF.descargarPDF(vehiculoEncontrado.getEstadoJudicial(), vehiculoEncontrado.getIdVehiculo());
        manejoImagen.descargarImagen(vehiculoEncontrado.getImagenByte());
        //Muestra la imagen encontrada en un Jlabel
        manejoImagen.mostrarImagen(vehiculoEncontrado.getImagen());

        /**
         * @Method Listar Vehiculo por Marca
         */
        List<Vehiculo> vehiculos = vehiculoServicio.listarVehiculoMarca("Toyota");
        vehiculos.forEach(vehiculo -> {
            System.out.println("Vehiculo = " + vehiculo.toString());
        });
    }
}