package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Linea;
import dominio.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import services.LineaService;

/**
 * @author IntegraSoft
 */
public class LineaServiceImpl implements LineaService{
    private static final String SQL_INSERT = "INSERT INTO linea(id_marca,nombre_linea) VALUES (?,?)";
    private static final String SQL_SELECT = "SELECT * FROM linea";
    private static final String SQL_UPDATE = "UPDATE linea SET (id_marca,nombre_linea) VALUES(?,?) WHERE id_linea = ?";
    private static final String SQL_DELETE = "DELETE FROM linea WHERE id_linea = ?";
    private static String SQL_CONSULTA = "SELECT * FROM linea WHERE id_linea = ?";

    @Override
    public void guardar(Linea linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, linea.getIdMarca());
            stmt.setString(2, linea.getNombreLinea());
            registros = stmt.executeUpdate();
            System.out.println("Linea guardada.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Linea no pudo ser registrada en la base de datos. Error: "+ex.getMessage(), "Registrar Linea", JOptionPane.ERROR_MESSAGE);
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
    public void eliminar(Linea linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, linea.getIdLinea());
            registros = stmt.executeUpdate();
            System.out.println("Linea eliminada");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Linea no pudo ser eliminada en la base de datos. Error: "+ex.getMessage(), "Eliminar Linea", JOptionPane.ERROR_MESSAGE);
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
    public List<Linea> listarLinea() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Linea linea = null;
        List<Linea> lineas = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idLinea = rs.getInt("id_linea");
                int idMarca = rs.getInt("id_marca");
                String nombreLinea = rs.getString("nombre_marca");

                linea = new Linea(idLinea, idMarca, nombreLinea);

                lineas.add(linea);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo ser listadas las Lineas de la base de datos. Error: "+ex.getMessage(), "Listar Lineas", JOptionPane.ERROR_MESSAGE);
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

        return lineas;
    }

    @Override
    public Linea encontrarLinea(int idLinea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Linea linea = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setInt(1, idLinea);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idMarca = rs.getInt("id_marca");
                String nombreLinea = rs.getString("nombre_linea");
                linea = new Linea(idLinea, idMarca, nombreLinea);
                System.out.println("Linea = " + linea);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo ser encontrado la línea con id="+idLinea+" en la base de datos. Error: "+ex.getMessage(), "Buscar Línea", JOptionPane.ERROR_MESSAGE);
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

        return linea;
    }

    @Override
    public void actualizar(Linea linea) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, linea.getIdMarca());
            stmt.setString(2, linea.getNombreLinea());
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
    public List<Linea> listarLineaXMarca(String nombreMarca){
        MarcaServiceImpl marcaServicio = new MarcaServiceImpl();
        Marca marca = marcaServicio.encontrarMarca(nombreMarca);
        List<Linea> lineas = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Linea linea = null;
        SQL_CONSULTA = "SELECT * FROM linea WHERE id_marca = ?";
        
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setInt(1,marca.getIdMarca());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idLinea = rs.getInt("id_linea");
                String nombreLinea = rs.getString("nombre_linea");
                linea = new Linea(idLinea, marca.getIdMarca(), nombreLinea);
                lineas.add(linea);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No pudo ser listadas las Lineas de la base de datos. Error: "+ex.getMessage(), "Listar Lineas", JOptionPane.ERROR_MESSAGE);
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
        return lineas;
    }
    
}