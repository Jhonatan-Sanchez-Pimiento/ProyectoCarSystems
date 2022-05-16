package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.*;
import java.awt.Image;
import java.sql.*;
import java.util.*;
import services.VehiculoService;

/**
 * @author IntegraSoft
 */
public class VehiculoServiceImpl implements VehiculoService {

    ManejoImagen manejoImagen = new ManejoImagen();
    private static final String SQL_INSERT = "INSERT INTO vehiculo(id_vehiculo, tipo_id_usuario, id_usuario, "
            + "tipo_servicio, tipo_vehiculo, marca, linea, color, modelo, cupo_persona, utilitario,"
            + "blindado, precio, imagen, descripcion, estado_judicial, peso, alto, ancho, largo, tipo_maquinaria) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM vehiculo";
    private static final String SQL_UPDATE = "UPDATE vehiculo SET "
            + "tipo_servicio=?, tipo_vehiculo=?, marca=?, linea=?, color=?, modelo=?, cupo_persona=?, utilitario=?,"
            + "blindado=?, precio=?, imagen=?, descripcion=?, estado_judicial=?, peso=?, alto=?, ancho=?, largo=?, tipo_maquinaria=? "
            + "WHERE id_vehiculo = ?";
    private static final String SQL_DELETE = "DELETE FROM vehiculo WHERE id_vehiculo = ?";
    private static String SQL_CONSULTA = "SELECT * FROM vehiculo WHERE id_vehiculo = ?";

    @Override
    public void guardar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, vehiculo.getIdVehiculo());
            stmt.setString(2, vehiculo.getTipoIdUsuario());
            stmt.setLong(3, vehiculo.getIdUsuario());
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
            stmt.setBytes(14, vehiculo.getImagenByte());
            stmt.setString(15, vehiculo.getDescripcion());
            stmt.setBytes(16, vehiculo.getEstadoJudicial());
            stmt.setInt(17, vehiculo.getPeso());
            stmt.setInt(18, vehiculo.getAlto());
            stmt.setInt(19, vehiculo.getAncho());
            stmt.setInt(20, vehiculo.getLargo());
            stmt.setString(21, vehiculo.getTipoMaquinaria());

            registros = stmt.executeUpdate();
            System.out.println("Vehiculo guardada.");
            
        } catch (SQLException ex) {
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
    public void eliminar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setString(1, vehiculo.getIdVehiculo());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
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
    public List<Vehiculo> listarVehiculo() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public Vehiculo encontrarVehiculo(String idVehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Vehiculo vehiculo = null;
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE id_vehiculo = ?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, idVehiculo);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String tipoIdUsuario = rs.getString("tipo_id_usuario");
                long idUsuario = rs.getLong("id_usuario");
                String tipoServicio = rs.getString("tipo_servicio");
                String tipoVehiculo = rs.getString("tipo_vehiculo");
                String marca = rs.getString("marca");
                String linea = rs.getString("linea");
                String color = rs.getString("color");
                int modelo = rs.getInt("modelo");
                int cupo = rs.getInt("cupo_persona");
                boolean utilitario = rs.getBoolean("utilitario");
                boolean blindado = rs.getBoolean("blindado");
                double precio = rs.getDouble("precio");
                String descripcion = rs.getString("descripcion");
                byte[] estadoJudicial = rs.getBytes("estado_judicial");
                int peso = rs.getInt("peso");
                int alto = rs.getInt("alto");
                int ancho = rs.getInt("ancho");
                int largo = rs.getInt("largo");
                String tipoMaquinaria = rs.getString("tipo_maquinaria");
                //se obtiene la imagen en Blob de BD y se convierte a Image
                Blob blob = rs.getBlob("imagen");
                byte[] imagenByte = manejoImagen.convertirBlobaByte(blob);
                Image imagen = manejoImagen.convertirBlobaImagen(blob);

                vehiculo = new Vehiculo(idVehiculo, tipoIdUsuario, idUsuario, tipoServicio, tipoVehiculo, marca, linea, color, modelo, cupo, utilitario, blindado, precio, imagen, imagenByte, descripcion, estadoJudicial, peso, alto, ancho, largo, tipoMaquinaria) {
                };

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

        return vehiculo;
    }

    @Override
    public void actualizar(Vehiculo vehiculo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, vehiculo.getTipoServicio());
            stmt.setString(2, vehiculo.getTipoVehiculo());
            stmt.setString(3, vehiculo.getMarca());
            stmt.setString(4, vehiculo.getLinea());
            stmt.setString(5, vehiculo.getColor());
            stmt.setInt(6, vehiculo.getModelo());
            stmt.setInt(7, vehiculo.getCupoPersona());
            stmt.setBoolean(8, vehiculo.isUtilitario());
            stmt.setBoolean(9, vehiculo.isBlindado());
            stmt.setDouble(10, vehiculo.getPrecio());
            stmt.setBytes(11, vehiculo.getImagenByte());
            stmt.setString(12, vehiculo.getDescripcion());
            stmt.setBytes(13, vehiculo.getEstadoJudicial());
            stmt.setInt(14, vehiculo.getPeso());
            stmt.setInt(15, vehiculo.getAlto());
            stmt.setInt(16, vehiculo.getAncho());
            stmt.setInt(17, vehiculo.getLargo());
            stmt.setString(18, vehiculo.getTipoMaquinaria());
            stmt.setString(19, vehiculo.getIdVehiculo());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
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
    public List<Vehiculo> listarVehiculoCamioneta() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_vehiculo=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, "Camioneta");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoMaquinariaPesada() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_vehiculo=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, "Maquinaria pesada");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoBlindado() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE blindado=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setBoolean(1, true);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoServicioPublico() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_servicio=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, "Publico");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoServicioPrivado() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_servicio=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, "Privado");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoAutomovil() {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_vehiculo=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, "Automovil");
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoMarca(String marca) {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE marca=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, marca);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

    @Override
    public List<Vehiculo> listarVehiculoTipoMaquinariaPesada(String tipoMaquinaria) {
        Vehiculo vehiculo = null;
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Vehiculo> vehiculos = new ArrayList<>();
        SQL_CONSULTA = "SELECT * FROM vehiculo WHERE tipo_maquinaria=?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, tipoMaquinaria);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                vehiculo = this.encontrarVehiculo(idVehiculo);
                vehiculos.add(vehiculo);
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
        //retorna la lista de objetos vehiculos
        return vehiculos;
    }

}
