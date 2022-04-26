
package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Departamento;
import dominio.Municipio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import services.MunicipioService;

/**
 *
 * @author IntegraSoft
 */
public class MunicipioServiceImpl implements MunicipioService {
    
    private static final String SQL_INSERT = "INSERT INTO municipio(nombre_municipio) VALUES (?)";
    private static final String SQL_SELECT = "SELECT id_municipio, nombre_municiío FROM municipio";
    private static final String SQL_UPDATE = "UPDATE municipio SET nombre_municipio = ? WHERE id_municipio = ?";
    private static final String SQL_DELETE = "DELETE FROM municipio WHERE id_municipio = ?";
    private static String SQL_CONSULTA = "SELECT * FROM municipio WHERE id_departamento = ?";
    
    @Override
    public void guardar(Municipio municipio) {
                Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, municipio.getNombreMunicipio());
            registros = stmt.executeUpdate();
            System.out.println("Municipio guardada.");
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
    public void eliminar(Municipio municipio) {
                Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, municipio.getIdMunicipio());
            registros = stmt.executeUpdate();
            System.out.println("Municipio eliminada");
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
    
    public List<Municipio> listarMunicipio() {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Municipio municipio = null;
        List<Municipio> municipios = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idMunicipio = rs.getInt("id_municipio");
                String nombreMunicipio = rs.getString("nombre_municipio");
                int idDepartamento = rs.getInt("id_departamento");
                municipio = new Municipio(idMunicipio, nombreMunicipio, idDepartamento);

                municipios.add(municipio);
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

        return municipios;
    }

    public List<Municipio> encontrarMunicipioxDepartamento(String nombreDepartamento) {
        DepartamentoServiceImpl departamentoServicio = new DepartamentoServiceImpl();
        Departamento departamento = new Departamento();
        departamento = departamentoServicio.encontrarDepartamento(nombreDepartamento);
        
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Municipio municipio = null;
        List<Municipio> municipios = new ArrayList<>();
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setInt(1, departamento.getIdDepartamento());
            rs = stmt.executeQuery();
            while (rs.next()) {
                int idMunicipio = rs.getInt("id_municipio");
                String nombreMunicipio = rs.getString("nombre_municipio");
                
                municipio = new Municipio(idMunicipio, nombreMunicipio,departamento.getIdDepartamento());

                municipios.add(municipio);
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

        return municipios;
    }

    @Override
    public void actualizar(Municipio municipio) {
        
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, municipio.getNombreMunicipio());
            stmt.setInt(2, municipio.getIdMunicipio());
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
    public List<Municipio> listarMunicipio(String nombreDepartamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Municipio> listarDepartamento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

