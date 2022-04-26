package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Departamento;
import dominio.Departamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import services.DepartamentoService;

/**
 *
 * @author IntegraSoft
 */
public class DepartamentoServiceImpl implements DepartamentoService{
    private static final String SQL_INSERT = "INSERT INTO departamento(nombre_departamento) VALUES (?)";
    private static final String SQL_SELECT = "SELECT id_departamento, nombre_departamento FROM departamento";
    private static final String SQL_UPDATE = "UPDATE departamento SET nombre_departamento = ? WHERE id_departamento = ?";
    private static final String SQL_DELETE = "DELETE FROM departamento WHERE id_departamento = ?";
    private static String SQL_CONSULTA = "SELECT id_departamento FROM departamento WHERE nombre_departamento = ?";

    @Override
    public void guardar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, departamento.getNombreDepartamento());
            registros = stmt.executeUpdate();
            System.out.println("Departamento guardada.");
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
    public void eliminar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, departamento.getIdDepartamento());
            registros = stmt.executeUpdate();
            System.out.println("Departamento eliminada");
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
    public List<Departamento> listarDepartamento() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Departamento departamento = null;
        List<Departamento> departamentos = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idDepartamento = rs.getInt("id_departamento");
                String nombreDepartamento = rs.getString("nombre_departamento");

                departamento = new Departamento(idDepartamento, nombreDepartamento);

                departamentos.add(departamento);
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

        return departamentos;
    }

    @Override
    public Departamento encontrarDepartamento(String nombreDepartamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Departamento departamento = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setString(1, nombreDepartamento);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idDepartamento = rs.getInt("id_departamento");
                departamento = new Departamento(idDepartamento, nombreDepartamento);
                System.out.println("nombreDepartamento = " + nombreDepartamento);
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

        return departamento;
    }

    @Override
    public void actualizar(Departamento departamento) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, departamento.getNombreDepartamento());
            stmt.setInt(2, departamento.getIdDepartamento());
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
