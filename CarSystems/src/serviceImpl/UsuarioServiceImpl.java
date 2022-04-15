package serviceImpl;

import dominio.Usuario;
import services.UsuarioService;
import conexion.Conexion;
import static conexion.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author IntegraSoft
 */
public class UsuarioServiceImpl implements UsuarioService{

    private static final String SQL_INSERT = "INSERT INTO usuario(tipo_id, id_usuario, nombre_usuario, apellido_usuario,direccion,telefono,email_usuario, contrasena,id_rol)"
            + " VALUES (?,?,?,?,?,?,?,?,?)";
    
    @Override
    public void guardar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getTipoId());
            stmt.setInt(2, usuario.getIdUsuario());
            stmt.setString(3, usuario.getNombreUsuario());
            stmt.setString(4, usuario.getApellidoUsuario());
            stmt.setString(5, usuario.getDireccion());
            stmt.setString(6, usuario.getTelefono());
            stmt.setString(7, usuario.getEmailUsuario());
            stmt.setString(8, usuario.getContrasena());
            stmt.setInt(9, usuario.getIdRol());
            registros = stmt.executeUpdate();
            System.out.println("Usuario guardado.");
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
    public void eliminar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario encontrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
