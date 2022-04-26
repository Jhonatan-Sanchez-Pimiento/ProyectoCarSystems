package test;

import dominio.Departamento;
import java.util.List;
import serviceImpl.DepartamentoServiceImpl;

/**
 *
 * @author CarSystem
 */
public class testDepartamento {
    
    public static void main(String[] args) {
        
    DepartamentoServiceImpl departamentoServicio = new DepartamentoServiceImpl();
    
    /**
         * @Method Listar
         */
        //Listar departamentos
        List<Departamento> departamentos = departamentoServicio.listarDepartamento();
        //departamentos.
        departamentos.forEach(departamentoLista -> {
        System.out.println("departamento = " + departamentoLista.getNombreDepartamento());
        }
        );
    }
}
