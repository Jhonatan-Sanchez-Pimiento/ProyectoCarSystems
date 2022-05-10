/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Usuario;
import java.util.List;
import serviceImpl.UsuarioServiceImpl;

/**
 *
 * @author User
 */
public class testUsuario {
    public static void main(String[] args) {
        
        UsuarioServiceImpl usuarioServicio = new UsuarioServiceImpl();
        
        //Usuario usuario = new Usuario( 1022968969 ,"CC","ahumada","forero","sandra","bogota","bogota","callecarrera","3123578945","smahumadao159@gmail.com","vendedor","1235");
        
       // usuarioServicio.guardar(usuario);
        
        /**
         * @Method Listar
         */
        //Listar usuarios
        //List<Usuario> usuarios = usuarioServicio.listarUsuario();
//        //usuarios.forEach(usuariosList -> {
//        System.out.println("usuario = " + usuariosList.getNombreUsuario());
//        }
//        );
//        
//                /**
//         * @Method Actualizar
//         */
        Usuario usuarioModificar = new Usuario("ahumada","forero","sandra","bogota","bogota","callecarrera","3123578945","smahumadao159@gmail.com","vendedor","1235");
        usuarioServicio.actualizar(usuarioModificar);
       
         /**
         * @Method Encontrar Usuario por ID
         */
        //Usuario usuarioEncontrada = usuarioServicio.encontrarUsuario(1022968969L, "CC");
        
        /**
         * @Method Eliminar Usuario
         */
       //usuarioServicio.eliminar(usuarioEncontrada);
    }
        
    }
