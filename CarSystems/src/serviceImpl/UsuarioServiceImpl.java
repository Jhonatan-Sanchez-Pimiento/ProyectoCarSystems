package serviceImpl;

import dominio.Usuario;
import services.UsuarioService;
import conexion.Conexion;
import static conexion.Conexion.close;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author IntegraSoft
 */
public class UsuarioServiceImpl implements UsuarioService{
    
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_UPDATE = "UPDATE usuario SET primer_apellido=?, segundo_apellido=?, nombre_usuario=?,correo=?, departamento=?, municipio=?, direccion=?, telefono=?, rol=?, contrasena = ? WHERE id_departamento = ?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?, tipo_id=?";
    private static String SQL_CONSULTA = "SELECT * FROM usuario WHERE id_usuario = ?, tipo_id = ?";
    private static final String SQL_INSERT = "INSERT INTO usuario (id_usuario, tipo_id, primer_apellido, segundo_apellido, nombre_usuario,correo, departamento, municipio, direccion, telefono, rol, contrasena)"
            + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";

    @Override
    public void guardar(Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setLong(1, usuario.getIdUsuario());
            stmt.setString(2, usuario.getTipoId());
            stmt.setString(3, usuario.getApellido1());
            stmt.setString(4, usuario.getApellido2());
            stmt.setString(5, usuario.getNombreUsuario());
            stmt.setString(6, usuario.getEmailUsuario());
            stmt.setString(7, usuario.getDepartamento());
            stmt.setString(8, usuario.getMunicipio());
            stmt.setString(9, usuario.getDireccion());
            stmt.setString(10, usuario.getTelefono());
            stmt.setString(11, usuario.getRol());
            stmt.setString(12, usuario.getContrasena());
            
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
    public Usuario encontrarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarUsuario() {
            
            Connection conn = new Conexion().getConnection();
            PreparedStatement stmt;
            ResultSet rs =null;
            
            List<Usuario> listaUsuario = new ArrayList<>();

        try {
            stmt = (PreparedStatement) conn.createStatement();
            rs = stmt.executeQuery("SELEC * FROM Usuarios ");
            
            while(rs.next())
            {   
            Usuario usuario = new Usuario();
            
                usuario.setIdUsuario(rs.getInt("id"));
                usuario.setApellido1(rs.getString("apellido1"));
                usuario.setApellido2(rs.getString("apellido2"));
                usuario.setNombreUsuario(rs.getString("nombre usuario"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setEmailUsuario(rs.getString("correo electronico"));
                usuario.setRol(rs.getString("rol"));
                usuario.setContrasena(rs.getString("contrasena"));
                listaUsuario.add(usuario);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuario;
        
    }
    
}
