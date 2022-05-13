package serviceImpl;

import conexion.Conexion;
import static conexion.Conexion.close;
import dominio.Diagnostico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import services.DiagnosticoService;

/**
 * @author IntegraSoft
 */
public class DiagnosticoServiceImpl implements DiagnosticoService {

    //Creación de variables locales
    static final String CAMPOSBD = "(id_vehiculo,fecha_inspeccion, fecha_ven_soat,"
            + "fecha_man_preventivo,fecha_ult_cambio_aceite, km_actual, liquido_refrigerante, liquido_freno, aceite_motor,"
            + "liquido_hidraulico, agua_limpiavidrios, acelerador, clutsh, freno, luces, direccionales, estacionarias, stops,"
            + "testigo_tablero, luz_reversa, luces_internas, equipo_carretera, extintor, fecha_ven_extintor,"
            + "llanta_repuesto, cruceta, senales_reflectivas, caja_herramientas, linterna, gato, botiquin,"
            + "llantas, bateria, rines, cinturon_seguridad, pito_reversa, pito, freno_emergencia, espejos, carcasa_luces,"
            + "limpia_parabrisa, tapizado, panoramico, observacion) ";
    static final String VALORESCAMPOSBD = "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String SQL_INSERT = "INSERT INTO inspeccion" + CAMPOSBD + VALORESCAMPOSBD;
    private static final String SQL_SELECT = "SELECT * FROM inspeccion";
    private static final String SQL_UPDATE = "UPDATE inspeccion SET " + CAMPOSBD + VALORESCAMPOSBD + " WHERE id_inspeccion=?";
    private static final String SQL_DELETE = "DELETE FROM inspeccion WHERE id_inspeccion = ?";
    private static final String SQL_CONSULTA = "SELECT * FROM inspeccion WHERE id_inspeccion = ?";
    private final SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void guardar(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, diagnostico.getIdVehiculo());
            stmt.setString(2, diagnostico.getFechaInspeccion());
            stmt.setString(3, diagnostico.getFechaVenSoat());
            stmt.setString(4, diagnostico.getFechaManPreventivo());
            stmt.setString(5, diagnostico.getFechaUltCamAceite());
            stmt.setInt(6, diagnostico.getKmActual());
            stmt.setBoolean(7, diagnostico.isLiquidoRefrigerante());
            stmt.setBoolean(8, diagnostico.isLiquidoFreno());
            stmt.setBoolean(9, diagnostico.isAceiteMotor());
            stmt.setBoolean(10, diagnostico.isLiquidoHidraulico());
            stmt.setBoolean(11, diagnostico.isAguaLimpiavidrios());
            stmt.setBoolean(12, diagnostico.isAcelerador());
            stmt.setBoolean(13, diagnostico.isClutsh());
            stmt.setBoolean(14, diagnostico.isFreno());
            stmt.setBoolean(15, diagnostico.isLuces());
            stmt.setBoolean(16, diagnostico.isDireccionales());
            stmt.setBoolean(17, diagnostico.isEstacionarias());
            stmt.setBoolean(18, diagnostico.isStops());
            stmt.setBoolean(19, diagnostico.isTestigoTablero());
            stmt.setBoolean(20, diagnostico.isLuzReversa());
            stmt.setBoolean(21, diagnostico.isLucesInternas());
            stmt.setBoolean(22, diagnostico.isEquipoCarretera());
            stmt.setBoolean(23, diagnostico.isExtintor());
            stmt.setString(24, diagnostico.getFechaVenExtintor());
            stmt.setBoolean(25, diagnostico.isLlantaRepuesto());
            stmt.setBoolean(26, diagnostico.isCruceta());
            stmt.setBoolean(27, diagnostico.isSenalesReflectivas());
            stmt.setBoolean(28, diagnostico.isCajaHerramientas());
            stmt.setBoolean(29, diagnostico.isLinterna());
            stmt.setBoolean(30, diagnostico.isGato());
            stmt.setBoolean(31, diagnostico.isBotiquin());
            stmt.setBoolean(32, diagnostico.isLlantas());
            stmt.setBoolean(33, diagnostico.isBateria());
            stmt.setBoolean(34, diagnostico.isRines());
            stmt.setBoolean(35, diagnostico.isCinturonSeguridad());
            stmt.setBoolean(36, diagnostico.isPitoReversa());
            stmt.setBoolean(37, diagnostico.isPito());
            stmt.setBoolean(38, diagnostico.isFrenoEmergencia());
            stmt.setBoolean(39, diagnostico.isEspejos());
            stmt.setBoolean(40, diagnostico.isCarcasaLuces());
            stmt.setBoolean(41, diagnostico.isLimpiaparabrisas());
            stmt.setBoolean(42, diagnostico.isTapizado());
            stmt.setBoolean(43, diagnostico.isPanoramico());
            stmt.setBoolean(44, diagnostico.isLlantas());

            registros = stmt.executeUpdate();
            System.out.println("Diagnostico guardado.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar diagnostico : " + ex.getMessage(), "Guardar Diagnostico", JOptionPane.ERROR_MESSAGE);
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
    public void eliminar(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setLong(1, diagnostico.getIdInspeccion());
            registros = stmt.executeUpdate();
            System.out.println("Diagnostico eliminado");
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
    public List<Diagnostico> listarDiagnostico() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Diagnostico diagnostico;
        List<Diagnostico> diagnosticos = new ArrayList<>();

        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                long idDiagnostico = rs.getLong("id_inspeccion");
                String idVehiculo = rs.getString("id_vehiculo");
                String fechaInspeccion = rs.getString("fecha_inspeccion");
                String fechaVenSoat = rs.getString("fecha_ven_soat");
                String fechaManPreventivo = rs.getString("fecha_man_preventivo");
                String fechaUltCambioAceite = rs.getString("fecha_ult_cambio_aceite");
                int kmActual = rs.getInt("km_actual");
                boolean liquidoRefrigerante = rs.getBoolean("liquido_refrigerante");
                boolean liquidoFreno = rs.getBoolean("liquido_freno");
                boolean aceiteMotor = rs.getBoolean("aceite_motor");
                boolean liquidoHidraulico = rs.getBoolean("liquido_hidraulico");
                boolean aguaLimpiavidrios = rs.getBoolean("agua_limpiavidrios");
                boolean acelerador = rs.getBoolean("acelerador");
                boolean clutsh = rs.getBoolean("clutsh");
                boolean freno = rs.getBoolean("freno");
                boolean luces = rs.getBoolean("luces");
                boolean direccionales = rs.getBoolean("direccionales");
                boolean estacionarias= rs.getBoolean("estacionarias");
                boolean stops = rs.getBoolean("stops");
                boolean testigoTablero = rs.getBoolean("testigo_tablero");
                boolean luzReversa = rs.getBoolean("luz_reversa");
                boolean lucesInternas = rs.getBoolean("luces_internas");
                boolean equipoCarretera = rs.getBoolean("equipo_carretera");
                boolean extintor = rs.getBoolean("extintor");
                String fechaVenExtintor = rs.getString("fecha_ven_extintor");
                boolean llantaRepuesto = rs.getBoolean("llanta_repuesto");
                boolean cruceta = rs.getBoolean("cruceta");
                boolean senalesReflectivas = rs.getBoolean("senales_reflectivas");
                boolean cajaHerramientas = rs.getBoolean("caja_herramientas");
                boolean linterna = rs.getBoolean("linterna");
                boolean gato = rs.getBoolean("gato");
                boolean botiquin = rs.getBoolean("botiquin");
                boolean llantas = rs.getBoolean("llantas");
                boolean bateria = rs.getBoolean("bateria");
                boolean rines = rs.getBoolean("rines");
                boolean cinturonSeguridad = rs.getBoolean("cinturon_seguridad");
                boolean pitoReversa = rs.getBoolean("pito_reversa");
                boolean pito = rs.getBoolean("pito");
                boolean frenoEmergencia = rs.getBoolean("freno_emergencia");
                boolean espejos = rs.getBoolean("espejos");
                boolean carcasaLuces = rs.getBoolean("carcasa_luces");
                boolean limpiaparabrisas = rs.getBoolean("limpia_parabrisa");
                boolean tapizado = rs.getBoolean("tapizado");
                boolean panoramico = rs.getBoolean("panoramico");
                String observacion = rs.getString("observacion");

                diagnostico = new Diagnostico(idDiagnostico, idVehiculo, fechaInspeccion, fechaVenSoat, fechaManPreventivo, fechaUltCambioAceite, kmActual, liquidoRefrigerante, liquidoFreno, aceiteMotor, liquidoHidraulico, aguaLimpiavidrios, acelerador, clutsh, freno, luces, direccionales, estacionarias, stops, testigoTablero, luzReversa, lucesInternas, equipoCarretera, extintor, fechaVenExtintor, llantaRepuesto, cruceta, senalesReflectivas, cajaHerramientas, linterna, gato, botiquin, llantas, bateria, rines, cinturonSeguridad, pitoReversa, pito, frenoEmergencia, espejos, carcasaLuces, limpiaparabrisas, tapizado, panoramico, observacion);
                diagnosticos.add(diagnostico);
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

        return diagnosticos;
    }

    @Override
    public Diagnostico encontrarDiagnostico(long idDiagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Diagnostico diagnostico = null;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_CONSULTA);
            stmt.setLong(1, idDiagnostico);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String idVehiculo = rs.getString("id_vehiculo");
                String fechaInspeccion = rs.getString("fecha_inspeccion");
                String fechaVenSoat = rs.getString("fecha_ven_soat");
                String fechaManPreventivo = rs.getString("fecha_man_preventivo");
                String fechaUltCambioAceite = rs.getString("fecha_ult_cambio_aceite");
                int kmActual = rs.getInt("km_actual");
                boolean liquidoRefrigerante = rs.getBoolean("liquido_refrigerante");
                boolean liquidoFreno = rs.getBoolean("liquido_freno");
                boolean aceiteMotor = rs.getBoolean("aceite_motor");
                boolean liquidoHidraulico = rs.getBoolean("liquido_hidraulico");
                boolean aguaLimpiavidrios = rs.getBoolean("agua_limpiavidrios");
                boolean acelerador = rs.getBoolean("acelerador");
                boolean clutsh = rs.getBoolean("clutsh");
                boolean freno = rs.getBoolean("freno");
                boolean luces = rs.getBoolean("luces");
                boolean direccionales = rs.getBoolean("direccionales");
                boolean estacionarias= rs.getBoolean("estacionarias");
                boolean stops = rs.getBoolean("stops");
                boolean testigoTablero = rs.getBoolean("testigo_tablero");
                boolean luzReversa = rs.getBoolean("luz_reversa");
                boolean lucesInternas = rs.getBoolean("luces_internas");
                boolean equipoCarretera = rs.getBoolean("equipo_carretera");
                boolean extintor = rs.getBoolean("extintor");
                String fechaVenExtintor = rs.getString("fecha_ven_extintor");
                boolean llantaRepuesto = rs.getBoolean("llanta_repuesto");
                boolean cruceta = rs.getBoolean("cruceta");
                boolean senalesReflectivas = rs.getBoolean("senales_reflectivas");
                boolean cajaHerramientas = rs.getBoolean("caja_herramientas");
                boolean linterna = rs.getBoolean("linterna");
                boolean gato = rs.getBoolean("gato");
                boolean botiquin = rs.getBoolean("botiquin");
                boolean llantas = rs.getBoolean("llantas");
                boolean bateria = rs.getBoolean("bateria");
                boolean rines = rs.getBoolean("rines");
                boolean cinturonSeguridad = rs.getBoolean("cinturon_seguridad");
                boolean pitoReversa = rs.getBoolean("pito_reversa");
                boolean pito = rs.getBoolean("pito");
                boolean frenoEmergencia = rs.getBoolean("freno_emergencia");
                boolean espejos = rs.getBoolean("espejos");
                boolean carcasaLuces = rs.getBoolean("carcasa_luces");
                boolean limpiaparabrisas = rs.getBoolean("limpia_parabrisa");
                boolean tapizado = rs.getBoolean("tapizado");
                boolean panoramico = rs.getBoolean("panoramico");
                String observacion = rs.getString("observacion");
                
                diagnostico = new Diagnostico(idDiagnostico, idVehiculo, fechaInspeccion, fechaVenSoat, fechaManPreventivo, fechaUltCambioAceite, kmActual, liquidoRefrigerante, liquidoFreno, aceiteMotor, liquidoHidraulico, aguaLimpiavidrios, acelerador, clutsh, freno, luces, direccionales, estacionarias, stops, testigoTablero, luzReversa, lucesInternas, equipoCarretera, extintor, fechaVenExtintor, llantaRepuesto, cruceta, senalesReflectivas, cajaHerramientas, linterna, gato, botiquin, llantas, bateria, rines, cinturonSeguridad, pitoReversa, pito, frenoEmergencia, espejos, carcasaLuces, limpiaparabrisas, tapizado, panoramico, observacion);
                System.out.println("Diagnostico = " + diagnostico);
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

        return diagnostico;
    }

    @Override
    public void actualizar(Diagnostico diagnostico) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int registros = 0;
        try {
            conn = new Conexion().getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, diagnostico.getIdVehiculo());
            stmt.setString(2, diagnostico.getFechaInspeccion());
            stmt.setString(3, diagnostico.getFechaVenSoat());
            stmt.setString(4, diagnostico.getFechaManPreventivo());
            stmt.setString(5, diagnostico.getFechaUltCamAceite());
            stmt.setInt(6, diagnostico.getKmActual());
            stmt.setBoolean(7, diagnostico.isLiquidoRefrigerante());
            stmt.setBoolean(8, diagnostico.isLiquidoFreno());
            stmt.setBoolean(9, diagnostico.isAceiteMotor());
            stmt.setBoolean(10, diagnostico.isLiquidoHidraulico());
            stmt.setBoolean(11, diagnostico.isAguaLimpiavidrios());
            stmt.setBoolean(12, diagnostico.isAcelerador());
            stmt.setBoolean(13, diagnostico.isClutsh());
            stmt.setBoolean(14, diagnostico.isFreno());
            stmt.setBoolean(15, diagnostico.isLuces());
            stmt.setBoolean(16, diagnostico.isDireccionales());
            stmt.setBoolean(17, diagnostico.isEstacionarias());
            stmt.setBoolean(18, diagnostico.isStops());
            stmt.setBoolean(19, diagnostico.isTestigoTablero());
            stmt.setBoolean(20, diagnostico.isLuzReversa());
            stmt.setBoolean(21, diagnostico.isLucesInternas());
            stmt.setBoolean(22, diagnostico.isEquipoCarretera());
            stmt.setBoolean(23, diagnostico.isExtintor());
            stmt.setString(24, diagnostico.getFechaVenExtintor());
            stmt.setBoolean(25, diagnostico.isLlantaRepuesto());
            stmt.setBoolean(26, diagnostico.isCruceta());
            stmt.setBoolean(27, diagnostico.isSenalesReflectivas());
            stmt.setBoolean(28, diagnostico.isCajaHerramientas());
            stmt.setBoolean(29, diagnostico.isLinterna());
            stmt.setBoolean(30, diagnostico.isGato());
            stmt.setBoolean(31, diagnostico.isBotiquin());
            stmt.setBoolean(32, diagnostico.isLlantas());
            stmt.setBoolean(33, diagnostico.isBateria());
            stmt.setBoolean(34, diagnostico.isRines());
            stmt.setBoolean(35, diagnostico.isCinturonSeguridad());
            stmt.setBoolean(36, diagnostico.isPitoReversa());
            stmt.setBoolean(37, diagnostico.isPito());
            stmt.setBoolean(38, diagnostico.isFrenoEmergencia());
            stmt.setBoolean(39, diagnostico.isEspejos());
            stmt.setBoolean(40, diagnostico.isCarcasaLuces());
            stmt.setBoolean(41, diagnostico.isLimpiaparabrisas());
            stmt.setBoolean(42, diagnostico.isTapizado());
            stmt.setBoolean(43, diagnostico.isPanoramico());
            stmt.setBoolean(44, diagnostico.isLlantas());
            registros = stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el diagnostico : "+ex.getMessage(), "Actualizar Diagnostico",JOptionPane.ERROR_MESSAGE);
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
