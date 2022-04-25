package test;

import dominio.InicioSesion;
import serviceImpl.InicioSesionServiceImpl;

/**
 * @author IntegraSoft
 */
public class testInicioSesion {
    public static void main(String[] args) {
        InicioSesionServiceImpl inicioSesionServicio = new InicioSesionServiceImpl();
        
        InicioSesion inicioSesion = new InicioSesion("lmariasc@sanmateo.edu.co", 0);
        
        inicioSesionServicio.guardar(inicioSesion);
        
    }
}
