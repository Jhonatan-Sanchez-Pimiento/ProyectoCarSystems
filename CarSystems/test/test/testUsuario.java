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
        
<<<<<<< HEAD
        Usuario usuario = new Usuario(1090442900L,"Cedula de Ciudadanía" , "Saenz", "Rodriguez", "Juan Mateo", "Norte de Santander", "Cúcuta", "Calle 32 22 - 80", "3123577331", "Jmsanchezp1234@sanmateo.edu.co", "Vendedor", "123456");
=======
        //Usuario usuario = new Usuario( 1022968969 ,"CC","ahumada","forero","sandra","bogota","bogota","callecarrera","3123578945","smahumadao159@gmail.com","vendedor","1235");
        
       // usuarioServicio.guardar(usuario);
>>>>>>> 972d6c9f86c33aeedef4c553cae0e3505d9cc9c5
        
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
