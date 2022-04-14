
package test;

import dominio.Marca;
import serviceImpl.MarcaServiceImpl;

/**
 * @author IntegraSoft
 */
public class test {
    public static void main(String[] args) {
        MarcaServiceImpl marcaServicio = new MarcaServiceImpl();
        
        Marca marca = new Marca("Chevrolet");
        
        marcaServicio.guardar(marca);
        
    }
    
}
