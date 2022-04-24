package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.InicioSesion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.InicioSesionService;

/**
 * @author IntegraSoft
 */
public class InicioSesionServiceImpl implements InicioSesionService{

    private static final String SQL_INSERT = "INSERT INTO inicio_sesion(email_usuario,estado_login) VALUES (?,?)";
    
    @Override
    public void guardar(InicioSesion inicioSesion) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, inicioSesion.getEmailUsuario());
            stmt.setInt(2, inicioSesion.getEstado());
            registros = stmt.executeUpdate();
            System.out.println("Inicio de sesion guardada.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        finally{
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void eliminar(InicioSesion inicioSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InicioSesion> listarInicioSesion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InicioSesion encontrarInicioSesion(InicioSesion inicioSesion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
