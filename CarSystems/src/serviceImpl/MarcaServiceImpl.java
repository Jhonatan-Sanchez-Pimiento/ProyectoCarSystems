package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import services.MarcaService;

/**
 * @author IntegraSoft
 */
public class MarcaServiceImpl implements MarcaService {

    private static final String SQL_INSERT = "INSERT INTO marca(nombre_marca) VALUES (?)";
    private static final String SQL_SELECT = "SELECT id_marca, nombre_marca FROM marca";
    private static final String SQL_UPDATE = "UPDATE marca SET nombre_marca = ? WHERE id_marca = ?";
    private static final String SQL_DELETE = "DELETE FROM marca WHERE id_marca = ?";
    private static String SQL_CONSULTA = "SELECT * FROM marca WHERE nombre_marca =?";

    @Override
    public void guardar(Marca marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, marca.getNombreMarca());
            registros = stmt.executeUpdate();
            System.out.println("Marca guardada.");
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
    public void eliminar(Marca marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, marca.getIdMarca());
            registros = stmt.executeUpdate();
            System.out.println("Marca eliminada");
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
    public List<Marca> listarMarca() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Marca marca = null;
        List<Marca> marcas = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idMarca = rs.getInt("id_marca");
                String nombreMarca = rs.getString("nombre_marca");

                marca = new Marca(idMarca, nombreMarca);

                marcas.add(marca);
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

        return marcas;
    }

    @Override
    public Marca encontrarMarca (String nombreMarca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Marca marca = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, nombreMarca);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idMarca = rs.getInt("id_marca");
                marca = new Marca(idMarca, nombreMarca);
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

        return marca;
    }

    @Override
    public void actualizar(Marca marca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, marca.getNombreMarca());
            stmt.setInt(2, marca.getIdMarca());
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
    public Marca encontrarMarca (int idMarca) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Marca marca = null;
        SQL_CONSULTA = "SELECT * FROM marca WHERE id_marca = ?";
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setInt(1, idMarca);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String nombreMarca = rs.getString("nombre_marca");
                marca = new Marca(idMarca, nombreMarca);
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

        return marca;
    }
    
}