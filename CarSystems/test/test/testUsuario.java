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
        
        Usuario usuario = new Usuario("CC", 10203578, "Sandra", "Ahumada", "Calle 62 22 ", "3123578945", "smahumadao159@gmail.com", "12345678", 1);
        
        usuarioServicio.guardar(usuario);
        
    }
}
