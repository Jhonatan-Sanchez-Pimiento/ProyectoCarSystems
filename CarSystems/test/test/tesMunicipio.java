
package test;

import dominio.Municipio;
import java.util.List;
import serviceImpl.MunicipioServiceImpl;


/**
 *
 * @author IntegraSoft
 */
public class tesMunicipio {
    
        public static void main(String[] args) {
    
        MunicipioServiceImpl municipioServicio = new MunicipioServiceImpl();
        /**
         * @Method Listar
         */
        //Listar municipios
        List<Municipio> municipios = municipioServicio.encontrarMunicipioxDepartamento("Cundinamarca");
        municipios.forEach(municipiosList -> {
        System.out.println("municipio = " + municipiosList.getNombreMunicipio());
        }
        );
        }
}
