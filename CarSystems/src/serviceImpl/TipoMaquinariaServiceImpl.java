package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.TipoMaquinaria;
import dominio.TipoMaquinaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import services.TipoMaquinariaService;

/**
 * @author IntegraSoft
 */
public class TipoMaquinariaServiceImpl implements TipoMaquinariaService{

    private static final String SQL_INSERT = "INSERT INTO tipo_maquinaria(nombre_tipo_maquinaria) VALUES (?)";
    private static final String SQL_SELECT = "SELECT * FROM tipo_maquinaria";
    private static final String SQL_UPDATE = "UPDATE tipo_maquinaria SET nombre_tipo_maquinaria = ? WHERE id_tipo_maquinaria = ?";
    private static final String SQL_DELETE = "DELETE FROM tipo_maquinaria WHERE id_tipo_maquinaria = ?";
    private static String SQL_CONSULTA = "SELECT * FROM tipo_maquinaria WHERE nombre_tipo_maquinaria = ?";

    @Override
    public void guardar(TipoMaquinaria tipoMaquinaria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, tipoMaquinaria.getNombreTipoMaquinaria());
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
    public void eliminar(TipoMaquinaria tipoMaquinaria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, tipoMaquinaria.getIdTipoMaquinaria());
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
    public List<TipoMaquinaria> listarTipoMaquinaria() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoMaquinaria tipoMaquinaria = null;
        List<TipoMaquinaria> tipoMaquinarias = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTipoMaquinaria = rs.getInt("id_tipo_maquinaria");
                String nombreTipoMaquinaria = rs.getString("nombre_tipo_maquinaria");

                tipoMaquinaria = new TipoMaquinaria(idTipoMaquinaria, nombreTipoMaquinaria);

                tipoMaquinarias.add(tipoMaquinaria);
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

        return tipoMaquinarias;
    }

    @Override
    public TipoMaquinaria encontrarTipoMaquinaria (String nombreTipoMaquinaria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        TipoMaquinaria tipoMaquinaria = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, nombreTipoMaquinaria);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idTipoMaquinaria = rs.getInt("id_tipo_maquinaria");
                tipoMaquinaria = new TipoMaquinaria(idTipoMaquinaria, nombreTipoMaquinaria);
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

        return tipoMaquinaria;
    }

    @Override
    public void actualizar(TipoMaquinaria tipoMaquinaria) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, tipoMaquinaria.getNombreTipoMaquinaria());
            stmt.setInt(2, tipoMaquinaria.getIdTipoMaquinaria());
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

}
