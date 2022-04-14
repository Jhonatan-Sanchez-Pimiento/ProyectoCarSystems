package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Marca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import services.MarcaService;

/**
 *
 * @author Jhonatan Sánchez
 */
public class MarcaServiceImpl implements MarcaService{

     private static final String SQL_INSERT = "INSERT INTO marca(nombre_marca) VALUES (?)";
    
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
    public void eliminar(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Marca> listarMarca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Marca encontrarMarca(Marca marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
