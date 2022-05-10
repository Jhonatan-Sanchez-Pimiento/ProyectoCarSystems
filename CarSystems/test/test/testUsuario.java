/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Usuario;
import serviceImpl.UsuarioServiceImpl;

/**
 *
 * @author User
 */
public class testUsuario {
    public static void main(String[] args) {
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
        
        Usuario usuario = new Usuario(1090442900L,"Cedula de Ciudadanía" , "Saenz", "Rodriguez", "Juan Mateo", "Norte de Santander", "Cúcuta", "Calle 32 22 - 80", "3123577331", "Jmsanchezp1234@sanmateo.edu.co", "Vendedor", "123456");
        
        usuarioServicio.guardar(usuario);
        
    }
}
