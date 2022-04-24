package test;

import dominio.Marca;
import java.util.List;
import serviceImpl.MarcaServiceImpl;

/**
 * @author IntegraSoft
 */
public class test {

    public static void main(String[] args) {
        MarcaServiceImpl marcaServicio = new MarcaServiceImpl();
        /**
         * @Method Registrar
         */
        //Marca marca = new Marca("Chevrolet");
        //       marcaServicio.guardar(marca);
        
        /**
         * @Method Listar
         */
        //Listar marcas
        //List<Marca> marcas = marcaServicio.listarMarca();
        //marcas.forEach(marcasList -> {
        //System.out.println("marca = " + marcasList.getNombreMarca());
        //}
        //);
        
        /**
         * @Method Actualizar
         */
        //Marca marcaModificar = new Marca(2, "AUDI");
        //marcaServicio.actualizar(marcaModificar);
        
        /**
         * @Method Encontrar Marca por ID
         */
        Marca marcaEncontrada = marcaServicio.encontrarMarca(1);
        
        /**
         * @Method Eliminar Marca
         */
        marcaServicio.eliminar(marcaEncontrada);
    }
}