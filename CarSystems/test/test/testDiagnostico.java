package test;

import dominio.Diagnostico;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import serviceImpl.DiagnosticoServiceImpl;

/**
 * @author IntegraSoft
 */
public class testDiagnostico {
    public static void main(String[] args) {
        DiagnosticoServiceImpl diagnosticoServicio = new DiagnosticoServiceImpl();
        
        /**
         * @Method Registrar diagnostico
         */
        Diagnostico diagnostico = new Diagnostico("QWE-123", "2022-04-04", "2022-08-12", "2022-02-02", "2022-04-01", 1520, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "2022-04-04", true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, "Vehiculo en excelentes condiciones");
        diagnosticoServicio.guardar(diagnostico);
        
        diagnosticoServicio.encontrarDiagnostico(5);
    }
}
