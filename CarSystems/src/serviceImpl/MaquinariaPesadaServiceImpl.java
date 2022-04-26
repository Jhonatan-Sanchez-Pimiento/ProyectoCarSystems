
package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.MaquinariaPesada;
import dominio.Usuario;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.MaquinariaPesadaService;


/**
 *
 * @author IntegraSoft 
 */
public class MaquinariaPesadaServiceImpl implements MaquinariaPesadaService{
    
    public static final String SQL_INSERT = "INSERT INTO vehiculo(id_vehiculo,tipo_id_usuario,id_usuario, id_tipo_servicio, tipo_vehiculo, id_marca, id_linea, color,"
            + "modelo, cupo_persona, utiliario, blindado, precio, imagen, descripción, estado_judicial, peso, alto, ancho, largo, tipo_maquinaria"
            + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
   
@Override
    public void guardar(MaquinariaPesada maquinariaPesada, Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, maquinariaPesada.getIdVehiculo());
            stmt.setString(2, usuario.getTipoId());
            stmt.setInt(3, usuario.getIdUsuario());
            stmt.setString(4, maquinariaPesada.getTipoServicio());
            stmt.setInt(5, maquinariaPesada.getTipoVehiculo());
            stmt.setInt(6, maquinariaPesada.getIdMarca());
            stmt.setInt(7, maquinariaPesada.getIdLinea());
            stmt.setString(8, maquinariaPesada.getColor());
            stmt.setInt(9, maquinariaPesada.getModelo());
            stmt.setInt(10, maquinariaPesada.getCupoPersona());
            stmt.setBoolean(11, maquinariaPesada.isUtilitario());
            stmt.setBoolean(12, maquinariaPesada.isBlindado());
            stmt.setDouble(13, maquinariaPesada.getPrecio());
            stmt.setString(14, maquinariaPesada.getDescripcion());
            stmt.setString(15, maquinariaPesada.getEstadoJudicial());
            
            
            
       
            registros = stmt.executeUpdate();
            System.out.println("Maquinaria guardada.");
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
    public void eliminar(MaquinariaPesada maquinariaPesada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MaquinariaPesada> listarMaquinariaPesada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MaquinariaPesada encontrarMaquinariaPesada(MaquinariaPesada maquinariaPesada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Image(int i, Image imagen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
