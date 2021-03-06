package conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author IntegraSoft
 */
public class Conexion {
   /**Parametros de conexion*/
   private static final String JDBC_BD = "carsystems";
   private static final String JDBC_USER = "root";
   private static final String JDBC_PASSWORD = "12345678";
   private static final String JDBC_URL = "jdbc:mysql://localhost/" + JDBC_BD;

    private static Connection connection = null;

   /** Constructor de DbConnection */
   public Conexion() {
      try{
         //obtenemos el driver de para mysql
         Class.forName("com.mysql.jdbc.Driver");
         //obtenemos la conexión enviando el parametro de la URL, User y Contrasena
         connection = DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);

      }
      catch(SQLException e){
         JOptionPane.showMessageDialog(null, "El sistema no se encuentra disponible en este momento, por favor intente más tarde o comuniquese con el administrador.", "Fallo en el sistema", JOptionPane.ERROR_MESSAGE);
         System.exit(0);
         System.out.println(e);
      }catch(ClassNotFoundException e){
         System.out.println(e);
      }catch(Exception e){
         System.out.println(e);
      }
   }
   
   /**Permite retornar la conexion a la BD
     * @return n*/
   public Connection getConnection(){
      return connection;
   }
   
   public static void close(ResultSet rs) throws SQLException{
       rs.close();
   }
   
   public static void close(Statement smtm) throws SQLException {
        smtm.close();
    }
   
   public static void close(PreparedStatement stmt) throws SQLException{
       stmt.close();
   }
   
   public static void close(Connection conexion) throws SQLException{
       conexion.close();
   }
   
   //Desconecta la conexion a la BD
   public void desconectar(){
      connection = null;
   }
}