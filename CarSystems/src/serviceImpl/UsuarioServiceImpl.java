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
    private static final String SQL_UPDATE = "UPDATE usuario SET primer_apellido=?, segundo_apellido=?, nombre_usuario=?, departamento=?, municipio=?, correo=?,direccion=?, telefono=?, rol=?, contrasena = ? WHERE id_Usuario = ? AND tipo_id=?";
    private static final String SQL_DELETE = "DELETE FROM usuario WHERE id_usuario = ?, tipo_id=?";
    private static String SQL_CONSULTA = "SELECT * FROM usuario WHERE id_usuario = ? AND tipo_id = ?";
    private static final String SQL_INSERT = "INSERT INTO usuario (id_usuario, tipo_id, primer_apellido, segundo_apellido, nombre_usuario,correo,departamento, municipio, direccion, telefono, rol, contrasena)"
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
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setLong(1, usuario.getIdUsuario());
            registros = stmt.executeUpdate();
            System.out.println("Usuario eliminado");
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
    public Usuario encontrarUsuario(Long idUsuario, String tipoId) {
    Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setLong(1, idUsuario);
            stmt.setString(2, tipoId);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                String primerApellido = rs.getString("primer_apellido");
                String segundoApellido = rs.getString("segundo_apellido");
                String nombreUsuario = rs.getString("nombre_usuario");
                String correo = rs.getString("correo");
                String departamento = rs.getString("departamento");
                String municipio = rs.getString("municipio");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String rol = rs.getString("rol");
                String contrasena = rs.getString("contrasena");
                usuario = new Usuario(idUsuario, tipoId, primerApellido, segundoApellido, nombreUsuario, departamento, municipio, direccion, telefono, correo, rol, contrasena);
                System.out.println("Usuario = " + usuario);
                
                
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuario;
    }
    

    @Override
    public List<Usuario> listarUsuario() {
            Connection conn;
            PreparedStatement stmt;
            ResultSet rs;
            List<Usuario> listaUsuario = new ArrayList<>();
        try {
             conn= new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            
            while(rs.next()){   
            Usuario usuario = new Usuario();
            
                usuario.setTipoId(rs.getString("tipo_id"));
                usuario.setIdUsuario(rs.getInt("id_usuario"));
                usuario.setApellido1(rs.getString("primer_apellido"));
                usuario.setApellido2(rs.getString("segundo_apellido"));
                usuario.setNombreUsuario(rs.getString("nombre_usuario"));
                usuario.setEmailUsuario(rs.getString("correo"));
                usuario.setDepartamento(rs.getString("departamento"));
                usuario.setMunicipio(rs.getString("municipio"));
                usuario.setDireccion(rs.getString("direccion"));
                usuario.setTelefono(rs.getString("telefono"));
                usuario.setRol(rs.getString("rol"));
                usuario.setContrasena(rs.getString("contrasena"));
                listaUsuario.add(usuario);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuario;
    }

    @Override
    public void actualizar(Usuario usuario) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, usuario.getApellido1());
            stmt.setString(2, usuario.getApellido2());
            stmt.setString(3, usuario.getNombreUsuario());
            stmt.setString(4, usuario.getEmailUsuario());
            stmt.setString(5, usuario.getDepartamento());
            stmt.setString(6, usuario.getMunicipio());
            stmt.setString(7, usuario.getDireccion());
            stmt.setString(8, usuario.getTelefono());
            stmt.setString(9, usuario.getRol());
            stmt.setString(10, usuario.getContrasena());
            stmt.setLong(11, usuario.getIdUsuario());
            stmt.setString(12, usuario.getTipoId());
            registros = stmt.executeUpdate();
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
    public Usuario encontrarUsuario(String correo){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = null;
        SQL_CONSULTA = "SELECT * FROM usuario WHERE correo = ?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, correo);
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                String tipoId = rs.getString("tipo_id");
                long idUsuario = rs.getLong("id_usuario");
                String primerApellido = rs.getString("primer_apellido");
                String segundoApellido = rs.getString("segundo_apellido");
                String nombreUsuario = rs.getString("nombre_usuario");
                String departamento = rs.getString("departamento");
                String municipio = rs.getString("municipio");
                String direccion = rs.getString("direccion");
                String telefono = rs.getString("telefono");
                String rol = rs.getString("rol");
                String contrasena = rs.getString("contrasena");
                usuario = new Usuario(idUsuario, tipoId, primerApellido, segundoApellido, nombreUsuario, departamento, municipio, direccion, telefono, correo, rol, contrasena);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return usuario;
    }
    }
