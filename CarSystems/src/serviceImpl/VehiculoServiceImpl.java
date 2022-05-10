package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.*;
import services.VehiculoService;

/**
 *
 * @author IntegraSoft
 */
public class VehiculoServiceImpl implements VehiculoService {

    private static final String SQL_INSERT = "INSERT INTO vehiculo(id_vehiculo, tipo_id_usuario, id_usuario, "
            + "tipo_servicio, tipo_vehiculo, marca, linea, color, modelo, cupo_persona, utiliario,"
            + "blindado, precio, imagen, descripcion, estado_judicial, peso, alto, ancho, largo, tipo_maquinaria) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM vehiculo";
    private static final String SQL_UPDATE = "UPDATE vehiculo SET id_vehiculo, tipo_id_usuario, id_usuario,"
            + "tipo_servicio, tipo_vehiculo, marca, linea, color, modelo, cupo_persona, utiliario,"
            + "blindado, precio, imagen, descripcion, estado_judicial, peso, alto, ancho, largo, tipo_maquinaria"
            + "WHERE id_vehiculo = ?";
    private static final String SQL_DELETE = "DELETE FROM vehiculo WHERE id_vehiculo = ?";
    private static String SQL_CONSULTA = "SELECT * FROM vehiculo WHERE id_vehiculo = ?";
    
    
    @Override
    public void guardar(Vehiculo vehiculo, String ruta, Usuario usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        FileInputStream imagen = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            File file = new File(ruta);
            imagen = new FileInputStream(file);
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vehiculo.getIdVehiculo());
            stmt.setString(2, usuario.getTipoId());
            stmt.setLong(3, usuario.getIdUsuario());
            stmt.setString(4, vehiculo.getTipoServicio());
            stmt.setString(5, vehiculo.getTipoVehiculo());
            stmt.setString(6, vehiculo.getMarca());
            stmt.setString(7, vehiculo.getLinea());
            stmt.setString(8, vehiculo.getColor());
            stmt.setInt(9, vehiculo.getModelo());
            stmt.setInt(10, vehiculo.getCupoPersona());
            stmt.setBoolean(11, vehiculo.isUtilitario());
            stmt.setBoolean(12, vehiculo.isBlindado());
            stmt.setDouble(13, vehiculo.getPrecio());
            //stmt.setBytes(14, vehiculo.getImagen());
            
            
            
            registros = stmt.executeUpdate();
            System.out.println("Marca guardada.");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
    }

    @Override
    public void guardarEstadoJudicial(File estadoJudicial) {
    }

    @Override
    public void eliminar(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vehiculo encontrarVehiculo(String idVehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoCamioneta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoMaquinariaPesada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoBlindado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoServicioPublico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoServicioPrivado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoAutomovil() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoMarca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Vehiculo> listarVehiculoTipoMaquinariaPesada(MaquinariaPesada maquinariaPesada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
