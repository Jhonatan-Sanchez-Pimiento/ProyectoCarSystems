package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Camioneta;
import dominio.Usuario;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.CamionetaService;

/**
 * @author IntegraSoft
 */
public class CamionetaServiceImpl implements CamionetaService{

    private static final String SQL_INSERT = "INSERT INTO vehiculo(id_vehiculo,tipo_id_usuario,id_usuario, id_tipo_servicio, tipo_vehiculo, id_marca, id_linea, color,"
            + "modelo, cupo_persona, utiliario, blindado, precio, imagen, descripción, estado_judicial,"
            + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    @Override
    public void guardar(Camioneta camioneta, Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, camioneta.getIdVehiculo());
            stmt.setString(2, usuario.getTipoId());
            stmt.setInt(3, usuario.getIdUsuario());
            stmt.setString(4, camioneta.getTipoServicio());
            stmt.setInt(5, camioneta.getTipoVehiculo());
            stmt.setInt(6, camioneta.getIdMarca());
            stmt.setInt(7, camioneta.getIdLinea());
            stmt.setString(8, camioneta.getColor());
            stmt.setInt(9, camioneta.getModelo());
            stmt.setInt(10, camioneta.getCupoPersona());
            stmt.setBoolean(11, camioneta.isUtilitario());
            stmt.setBoolean(12, camioneta.isBlindado());
            stmt.setDouble(13, camioneta.getPrecio());
            stmt.setString(14, camioneta.getDescripcion());
            stmt.setString(15, camioneta.getEstadoJudicial());
            
            
       
            registros = stmt.executeUpdate();
            System.out.println("Marca guardada.");
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
    public void eliminar(Camioneta camioneta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Camioneta> listarCamioneta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Camioneta encontrarCamioneta(Camioneta camioneta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
