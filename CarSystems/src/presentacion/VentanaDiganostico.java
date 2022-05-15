
package presentacion;

import dominio.Diagnostico;
import java.awt.HeadlessException;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import serviceImpl.DiagnosticoServiceImpl;

/**
 *
 * @author CarSystems
 */
public class VentanaDiganostico extends javax.swing.JFrame {

    public VentanaDiganostico() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        baLiquidoRefrigerante = new javax.swing.ButtonGroup();
        baAceiteMotor = new javax.swing.ButtonGroup();
        baLiquidoFrenos = new javax.swing.ButtonGroup();
        baLiquidoHidraulico = new javax.swing.ButtonGroup();
        baAguaVidrios = new javax.swing.ButtonGroup();
        baAcelerador = new javax.swing.ButtonGroup();
        baClutch = new javax.swing.ButtonGroup();
        baFreno = new javax.swing.ButtonGroup();
        baLuces = new javax.swing.ButtonGroup();
        baLucesDireccionales = new javax.swing.ButtonGroup();
        baLucesEstacionarias = new javax.swing.ButtonGroup();
        baStop = new javax.swing.ButtonGroup();
        baTestigoTablero = new javax.swing.ButtonGroup();
        baLucesReversa = new javax.swing.ButtonGroup();
        baLucesInternas = new javax.swing.ButtonGroup();
        baEquipoCarretera = new javax.swing.ButtonGroup();
        baExtintor = new javax.swing.ButtonGroup();
        baFechaVenExtintor = new javax.swing.ButtonGroup();
        baLlantasRepuesto = new javax.swing.ButtonGroup();
        baCruceta = new javax.swing.ButtonGroup();
        baSenalesReflectivas = new javax.swing.ButtonGroup();
        baCajaHerramientas = new javax.swing.ButtonGroup();
        baLinterna = new javax.swing.ButtonGroup();
        baGato = new javax.swing.ButtonGroup();
        baBotiquin = new javax.swing.ButtonGroup();
        baLlantas = new javax.swing.ButtonGroup();
        baBateria = new javax.swing.ButtonGroup();
        baRines = new javax.swing.ButtonGroup();
        baCinturonSeguridad = new javax.swing.ButtonGroup();
        baPitoReversa = new javax.swing.ButtonGroup();
        baPito = new javax.swing.ButtonGroup();
        baFrenoEmergencia = new javax.swing.ButtonGroup();
        baEspejos = new javax.swing.ButtonGroup();
        baCarcasaLuces = new javax.swing.ButtonGroup();
        baLimpiaParabrisas = new javax.swing.ButtonGroup();
        baTapizado = new javax.swing.ButtonGroup();
        baPanoramico = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaInspeccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtFechaManPreventivo = new javax.swing.JTextField();
        txtFechaVenSOAT = new javax.swing.JTextField();
        txtFechaUltimoCambioAce = new javax.swing.JTextField();
        txtKilometrajeActual = new javax.swing.JTextField();
        txtPlacaVehiculo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jrbLiquidoRefriS = new javax.swing.JRadioButton();
        jrbLiquidoRefriN = new javax.swing.JRadioButton();
        jrbAceiteMotorS = new javax.swing.JRadioButton();
        jrbAceiteMotorN = new javax.swing.JRadioButton();
        jrbLiquidoFrenosS = new javax.swing.JRadioButton();
        jrbLiquidoFrenosN = new javax.swing.JRadioButton();
        jrbLiquidoHidraulicoN = new javax.swing.JRadioButton();
        jrbLiquidoHidraulicoS = new javax.swing.JRadioButton();
        jrbAguaVidriosS = new javax.swing.JRadioButton();
        jrbAguaVidriosN = new javax.swing.JRadioButton();
        jrbAceleradorS = new javax.swing.JRadioButton();
        jrbAceleradorN = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jrbClutchS = new javax.swing.JRadioButton();
        jrbClutchN = new javax.swing.JRadioButton();
        jrbFrenoS = new javax.swing.JRadioButton();
        jrbFrenoN = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jrbLucesS = new javax.swing.JRadioButton();
        jrbLucesN = new javax.swing.JRadioButton();
        jrbLucesDireccionalesS = new javax.swing.JRadioButton();
        jrbLucesDireccionalesN = new javax.swing.JRadioButton();
        jrbLucesEstacionariasS = new javax.swing.JRadioButton();
        jrbLucesEstacionariasN = new javax.swing.JRadioButton();
        jrbStopS = new javax.swing.JRadioButton();
        jrbStopN = new javax.swing.JRadioButton();
        jrbTestigoTableroS = new javax.swing.JRadioButton();
        jrbTestigoTableroN = new javax.swing.JRadioButton();
        jrbLucesReversaS = new javax.swing.JRadioButton();
        jrbLucesReversaN = new javax.swing.JRadioButton();
        jrbLucesInternasS = new javax.swing.JRadioButton();
        jrbLucesInternasN = new javax.swing.JRadioButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jrbEquipoCarreteraS = new javax.swing.JRadioButton();
        jrbEquipoCarreteraN = new javax.swing.JRadioButton();
        jrbExtintorS = new javax.swing.JRadioButton();
        jrbExtintorN = new javax.swing.JRadioButton();
        jrbFechaVenExtintorS = new javax.swing.JRadioButton();
        jrbFechaVenExtintorN = new javax.swing.JRadioButton();
        jrbLlantasRepuestoS = new javax.swing.JRadioButton();
        jrbLlantasRepuestoN = new javax.swing.JRadioButton();
        jrbCrucetaS = new javax.swing.JRadioButton();
        jrbCrucetaN = new javax.swing.JRadioButton();
        jrbSenalesReflectivasS = new javax.swing.JRadioButton();
        jrbSenalesReflectivasN = new javax.swing.JRadioButton();
        jrbCajaHerramientasN = new javax.swing.JRadioButton();
        jrbCajaHerramientasS = new javax.swing.JRadioButton();
        jrbLinternaS = new javax.swing.JRadioButton();
        jrbLinternaN = new javax.swing.JRadioButton();
        jrbGatoS = new javax.swing.JRadioButton();
        jrbGatoN = new javax.swing.JRadioButton();
        jrbBotiquinS = new javax.swing.JRadioButton();
        jrbLlantasS = new javax.swing.JRadioButton();
        jrbBotiquinN = new javax.swing.JRadioButton();
        jrbLlantasN = new javax.swing.JRadioButton();
        jrbBateriaS = new javax.swing.JRadioButton();
        jrbBateriaN = new javax.swing.JRadioButton();
        jrbRinesS = new javax.swing.JRadioButton();
        jrbRinesN = new javax.swing.JRadioButton();
        jrbCinturonSeguridadS = new javax.swing.JRadioButton();
        jrbCinturonSeguridadN = new javax.swing.JRadioButton();
        jrbPitoReversaS = new javax.swing.JRadioButton();
        jrbPitoReversaN = new javax.swing.JRadioButton();
        jrbPitoS = new javax.swing.JRadioButton();
        jrbPitoN = new javax.swing.JRadioButton();
        jrbFrenoEmergenciaS = new javax.swing.JRadioButton();
        jrbFrenoEmergenciaN = new javax.swing.JRadioButton();
        jrbEspejosS = new javax.swing.JRadioButton();
        jrbEspejosN = new javax.swing.JRadioButton();
        jrbCarcasaLucesS = new javax.swing.JRadioButton();
        jrbCarcasaLucesN = new javax.swing.JRadioButton();
        jrbLimpiaParabrisasS = new javax.swing.JRadioButton();
        jrbLimpiaParabrisasN = new javax.swing.JRadioButton();
        jrbTapizadoS = new javax.swing.JRadioButton();
        jrbTapizadoN = new javax.swing.JRadioButton();
        jrbPanoramicoS = new javax.swing.JRadioButton();
        jrbPanoramicoN = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtDescripcion = new javax.swing.JTextArea();
        BotonLimpiar = new javax.swing.JButton();
        BotonCerrar = new javax.swing.JButton();
        cmbTipoVehiculo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 41, 57));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 196, 164), 2, true));

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 2000));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Placa del vehiculo :");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Fecha de vencimiento del SOAT :");

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Fecha del último mantenimiento :");

        jLabel8.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("Tipo de vehiculo :");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Fecha de inspección :");

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Fecha del último cambio de aceite :");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Kilometraje actual :");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Formato de diagnóstico del vehiculo");

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Buen estado");

        jLabel18.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Liquido hidráulico :");

        jLabel22.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel22.setText("Liquido frenos :");

        jLabel23.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel23.setText("Aceite del motor :");

        jLabel24.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel24.setText("Agua limpia vidrios :");

        jLabel25.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Pedales");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Para las opciones de \"si y \"no indique si el elemento se encuentra en el vehiculo el cual se le está realizando el respectivo diagnóstico");

        jLabel27.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Niveles");

        jLabel28.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("Acelerador :");

        jLabel29.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel29.setText("Clutch :");

        jLabel30.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(240, 240, 240));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel30.setText("Freno :");

        jLabel31.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Luces");

        jLabel32.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Stop :");

        jLabel33.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Luces direccionales :");

        jLabel34.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("Luces estacionarias :");

        jLabel35.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel35.setText("Luces:");

        jLabel36.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel36.setText("Testigos tablero :");

        jLabel37.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel37.setText("Luces de reversa :");

        jLabel38.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("Luces internas :");

        jLabel39.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Equipo de carretera y botiquín");

        jLabel40.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel40.setText("Llantas :");

        jLabel41.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(240, 240, 240));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel41.setText("Bateria :");

        jLabel42.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel42.setText("Rines :");

        jLabel43.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(240, 240, 240));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel43.setText("Pito :");

        jLabel44.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(240, 240, 240));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel44.setText("Freno de emergencia :");

        jLabel45.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(240, 240, 240));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel45.setText("Cinturón de seguridad :");

        jLabel46.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel46.setText("Pito de reversa :");

        jLabel47.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(240, 240, 240));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel47.setText("Espejos :");

        jLabel48.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(240, 240, 240));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel48.setText("Carcasa de luces :");

        jLabel49.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(240, 240, 240));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel49.setText("Tapizado :");

        jLabel50.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(240, 240, 240));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel50.setText("Limpia parabrisas :");

        jLabel51.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(240, 240, 240));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel51.setText("Panorámica :");

        jLabel53.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(240, 240, 240));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel53.setText("Extintor");

        jLabel54.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(240, 240, 240));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel54.setText("Fecha ven extintor");

        jLabel55.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(240, 240, 240));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel55.setText("Llantas repuesto");

        jLabel56.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(240, 240, 240));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel56.setText("Cruceta");

        jLabel57.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(240, 240, 240));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel57.setText("señales reflectivas");

        jLabel58.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(240, 240, 240));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel58.setText("Linterna");

        jLabel59.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(240, 240, 240));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel59.setText("Caja herramientas");

        jLabel60.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(240, 240, 240));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel60.setText("gato");

        jLabel61.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(240, 240, 240));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel61.setText("Botiquin");

        BotonGuardar.setText("Guardar");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Liquido refrigerante :");

        jLabel20.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Mal estado");

        jrbLiquidoRefriS.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoRefrigerante.add(jrbLiquidoRefriS);

        jrbLiquidoRefriN.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoRefrigerante.add(jrbLiquidoRefriN);

        jrbAceiteMotorS.setBackground(new java.awt.Color(0, 51, 51));
        baAceiteMotor.add(jrbAceiteMotorS);

        jrbAceiteMotorN.setBackground(new java.awt.Color(0, 51, 51));
        baAceiteMotor.add(jrbAceiteMotorN);

        jrbLiquidoFrenosS.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoFrenos.add(jrbLiquidoFrenosS);

        jrbLiquidoFrenosN.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoFrenos.add(jrbLiquidoFrenosN);

        jrbLiquidoHidraulicoN.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoHidraulico.add(jrbLiquidoHidraulicoN);

        jrbLiquidoHidraulicoS.setBackground(new java.awt.Color(0, 51, 51));
        baLiquidoHidraulico.add(jrbLiquidoHidraulicoS);

        jrbAguaVidriosS.setBackground(new java.awt.Color(0, 51, 51));
        baAguaVidrios.add(jrbAguaVidriosS);

        jrbAguaVidriosN.setBackground(new java.awt.Color(0, 51, 51));
        baAguaVidrios.add(jrbAguaVidriosN);

        jrbAceleradorS.setBackground(new java.awt.Color(0, 51, 51));
        baAcelerador.add(jrbAceleradorS);

        jrbAceleradorN.setBackground(new java.awt.Color(0, 51, 51));
        baAcelerador.add(jrbAceleradorN);

        jLabel21.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Buen estado");

        jLabel62.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(240, 240, 240));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Mal estado");

        jrbClutchS.setBackground(new java.awt.Color(0, 51, 51));
        baClutch.add(jrbClutchS);

        jrbClutchN.setBackground(new java.awt.Color(0, 51, 51));
        baClutch.add(jrbClutchN);

        jrbFrenoS.setBackground(new java.awt.Color(0, 51, 51));
        baFreno.add(jrbFrenoS);

        jrbFrenoN.setBackground(new java.awt.Color(0, 51, 51));
        baFreno.add(jrbFrenoN);

        jLabel63.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(240, 240, 240));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Buen estado");

        jLabel64.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(240, 240, 240));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Mal estado");

        jrbLucesS.setBackground(new java.awt.Color(0, 51, 51));
        baLuces.add(jrbLucesS);

        jrbLucesN.setBackground(new java.awt.Color(0, 51, 51));
        baLuces.add(jrbLucesN);

        jrbLucesDireccionalesS.setBackground(new java.awt.Color(0, 51, 51));
        baLucesDireccionales.add(jrbLucesDireccionalesS);

        jrbLucesDireccionalesN.setBackground(new java.awt.Color(0, 51, 51));
        baLucesDireccionales.add(jrbLucesDireccionalesN);

        jrbLucesEstacionariasS.setBackground(new java.awt.Color(0, 51, 51));
        baLucesEstacionarias.add(jrbLucesEstacionariasS);

        jrbLucesEstacionariasN.setBackground(new java.awt.Color(0, 51, 51));
        baLucesEstacionarias.add(jrbLucesEstacionariasN);

        jrbStopS.setBackground(new java.awt.Color(0, 51, 51));
        baStop.add(jrbStopS);

        jrbStopN.setBackground(new java.awt.Color(0, 51, 51));
        baStop.add(jrbStopN);

        jrbTestigoTableroS.setBackground(new java.awt.Color(0, 51, 51));
        baTestigoTablero.add(jrbTestigoTableroS);

        jrbTestigoTableroN.setBackground(new java.awt.Color(0, 51, 51));
        baTestigoTablero.add(jrbTestigoTableroN);

        jrbLucesReversaS.setBackground(new java.awt.Color(0, 51, 51));
        baLucesReversa.add(jrbLucesReversaS);

        jrbLucesReversaN.setBackground(new java.awt.Color(0, 51, 51));
        baLucesReversa.add(jrbLucesReversaN);

        jrbLucesInternasS.setBackground(new java.awt.Color(0, 51, 51));
        baLucesInternas.add(jrbLucesInternasS);

        jrbLucesInternasN.setBackground(new java.awt.Color(0, 51, 51));
        baLucesInternas.add(jrbLucesInternasN);

        jLabel65.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(240, 240, 240));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("Buen estado");

        jLabel66.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(240, 240, 240));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("Mal estado");

        jLabel67.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(240, 240, 240));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel67.setText("Equipo Carretera");

        jLabel68.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(240, 240, 240));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Buen estado");

        jLabel69.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(240, 240, 240));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Mal estado");

        jrbEquipoCarreteraS.setBackground(new java.awt.Color(0, 51, 51));
        baEquipoCarretera.add(jrbEquipoCarreteraS);

        jrbEquipoCarreteraN.setBackground(new java.awt.Color(0, 51, 51));
        baEquipoCarretera.add(jrbEquipoCarreteraN);

        jrbExtintorS.setBackground(new java.awt.Color(0, 51, 51));
        baExtintor.add(jrbExtintorS);

        jrbExtintorN.setBackground(new java.awt.Color(0, 51, 51));
        baExtintor.add(jrbExtintorN);

        jrbFechaVenExtintorS.setBackground(new java.awt.Color(0, 51, 51));
        baFechaVenExtintor.add(jrbFechaVenExtintorS);

        jrbFechaVenExtintorN.setBackground(new java.awt.Color(0, 51, 51));
        baFechaVenExtintor.add(jrbFechaVenExtintorN);

        jrbLlantasRepuestoS.setBackground(new java.awt.Color(0, 51, 51));
        baLlantasRepuesto.add(jrbLlantasRepuestoS);

        jrbLlantasRepuestoN.setBackground(new java.awt.Color(0, 51, 51));
        baLlantasRepuesto.add(jrbLlantasRepuestoN);

        jrbCrucetaS.setBackground(new java.awt.Color(0, 51, 51));
        baCruceta.add(jrbCrucetaS);

        jrbCrucetaN.setBackground(new java.awt.Color(0, 51, 51));
        baCruceta.add(jrbCrucetaN);

        jrbSenalesReflectivasS.setBackground(new java.awt.Color(0, 51, 51));
        baSenalesReflectivas.add(jrbSenalesReflectivasS);

        jrbSenalesReflectivasN.setBackground(new java.awt.Color(0, 51, 51));
        baSenalesReflectivas.add(jrbSenalesReflectivasN);

        jrbCajaHerramientasN.setBackground(new java.awt.Color(0, 51, 51));
        baCajaHerramientas.add(jrbCajaHerramientasN);

        jrbCajaHerramientasS.setBackground(new java.awt.Color(0, 51, 51));
        baCajaHerramientas.add(jrbCajaHerramientasS);

        jrbLinternaS.setBackground(new java.awt.Color(0, 51, 51));
        baLinterna.add(jrbLinternaS);

        jrbLinternaN.setBackground(new java.awt.Color(0, 51, 51));
        baLinterna.add(jrbLinternaN);

        jrbGatoS.setBackground(new java.awt.Color(0, 51, 51));
        baGato.add(jrbGatoS);

        jrbGatoN.setBackground(new java.awt.Color(0, 51, 51));
        baGato.add(jrbGatoN);

        jrbBotiquinS.setBackground(new java.awt.Color(0, 51, 51));
        baBotiquin.add(jrbBotiquinS);

        jrbLlantasS.setBackground(new java.awt.Color(0, 51, 51));
        baLlantas.add(jrbLlantasS);

        jrbBotiquinN.setBackground(new java.awt.Color(0, 51, 51));
        baBotiquin.add(jrbBotiquinN);

        jrbLlantasN.setBackground(new java.awt.Color(0, 51, 51));
        baLlantas.add(jrbLlantasN);

        jrbBateriaS.setBackground(new java.awt.Color(0, 51, 51));
        baBateria.add(jrbBateriaS);

        jrbBateriaN.setBackground(new java.awt.Color(0, 51, 51));
        baBateria.add(jrbBateriaN);

        jrbRinesS.setBackground(new java.awt.Color(0, 51, 51));
        baRines.add(jrbRinesS);

        jrbRinesN.setBackground(new java.awt.Color(0, 51, 51));
        baRines.add(jrbRinesN);

        jrbCinturonSeguridadS.setBackground(new java.awt.Color(0, 51, 51));
        baCinturonSeguridad.add(jrbCinturonSeguridadS);

        jrbCinturonSeguridadN.setBackground(new java.awt.Color(0, 51, 51));
        baCinturonSeguridad.add(jrbCinturonSeguridadN);

        jrbPitoReversaS.setBackground(new java.awt.Color(0, 51, 51));
        baPitoReversa.add(jrbPitoReversaS);

        jrbPitoReversaN.setBackground(new java.awt.Color(0, 51, 51));
        baPitoReversa.add(jrbPitoReversaN);

        jrbPitoS.setBackground(new java.awt.Color(0, 51, 51));
        baPito.add(jrbPitoS);

        jrbPitoN.setBackground(new java.awt.Color(0, 51, 51));
        baPito.add(jrbPitoN);

        jrbFrenoEmergenciaS.setBackground(new java.awt.Color(0, 51, 51));
        baFrenoEmergencia.add(jrbFrenoEmergenciaS);

        jrbFrenoEmergenciaN.setBackground(new java.awt.Color(0, 51, 51));
        baFrenoEmergencia.add(jrbFrenoEmergenciaN);

        jrbEspejosS.setBackground(new java.awt.Color(0, 51, 51));
        baEspejos.add(jrbEspejosS);

        jrbEspejosN.setBackground(new java.awt.Color(0, 51, 51));
        baEspejos.add(jrbEspejosN);

        jrbCarcasaLucesS.setBackground(new java.awt.Color(0, 51, 51));
        baCarcasaLuces.add(jrbCarcasaLucesS);

        jrbCarcasaLucesN.setBackground(new java.awt.Color(0, 51, 51));
        baCarcasaLuces.add(jrbCarcasaLucesN);

        jrbLimpiaParabrisasS.setBackground(new java.awt.Color(0, 51, 51));
        baLimpiaParabrisas.add(jrbLimpiaParabrisasS);

        jrbLimpiaParabrisasN.setBackground(new java.awt.Color(0, 51, 51));
        baLimpiaParabrisas.add(jrbLimpiaParabrisasN);

        jrbTapizadoS.setBackground(new java.awt.Color(0, 51, 51));
        baTapizado.add(jrbTapizadoS);

        jrbTapizadoN.setBackground(new java.awt.Color(0, 51, 51));
        baTapizado.add(jrbTapizadoN);

        jrbPanoramicoS.setBackground(new java.awt.Color(0, 51, 51));
        baPanoramico.add(jrbPanoramicoS);

        jrbPanoramicoN.setBackground(new java.awt.Color(0, 51, 51));
        baPanoramico.add(jrbPanoramicoN);

        jtxtDescripcion.setColumns(20);
        jtxtDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtxtDescripcion);

        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });

        BotonCerrar.setText("Cerrar");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        cmbTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Automivil", "Camioneta", "Maquinaria pesada" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(315, 315, 315)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbEquipoCarreteraS)
                                    .addComponent(jrbExtintorS)
                                    .addComponent(jrbFechaVenExtintorS)
                                    .addComponent(jrbLlantasRepuestoS)
                                    .addComponent(jrbCrucetaS))
                                .addGap(96, 96, 96)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbEquipoCarreteraN)
                                    .addComponent(jrbExtintorN)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(179, 179, 179)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbFechaVenExtintorN)
                                            .addComponent(jrbLlantasRepuestoN)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(69, 69, 69)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jrbSenalesReflectivasS, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jrbBotiquinS)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jrbBotiquinN))
                                                .addComponent(jrbGatoS, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addGap(121, 121, 121)
                                                    .addComponent(jrbCrucetaN))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jrbLlantasS)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jrbLlantasN)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrbCajaHerramientasS)
                                                    .addComponent(jrbLinternaS))
                                                .addGap(102, 102, 102)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrbLinternaN)
                                                    .addComponent(jrbCajaHerramientasN)
                                                    .addComponent(jrbSenalesReflectivasN)
                                                    .addComponent(jrbGatoN))))))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(101, 101, 101)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbPitoReversaN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbBateriaS)
                                .addGap(120, 120, 120)
                                .addComponent(jrbBateriaN))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbCinturonSeguridadS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbRinesS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPitoReversaS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPitoS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbEspejosS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbCarcasaLucesS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbLimpiaParabrisasS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbTapizadoS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPanoramicoS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbFrenoEmergenciaS, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbRinesN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbCinturonSeguridadN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPitoN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbFrenoEmergenciaN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbEspejosN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbCarcasaLucesN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbLimpiaParabrisasN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbTapizadoN, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPanoramicoN, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(txtFechaInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(132, 132, 132)
                                .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 997, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbAceiteMotorS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoHidraulicoS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbAguaVidriosS))
                                        .addGap(160, 160, 160)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbAceiteMotorN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoHidraulicoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbAguaVidriosN)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbLiquidoRefriS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoFrenosS))
                                        .addGap(160, 160, 160)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbLiquidoRefriN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoFrenosN)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jrbFrenoS)
                                                .addComponent(jrbClutchS)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(48, 48, 48)
                                                    .addComponent(jrbAceleradorS))))
                                        .addGap(136, 136, 136)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbAceleradorN, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jrbClutchN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbFrenoN))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(321, 321, 321)
                                        .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesInternasS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbLucesInternasN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesReversaS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbLucesReversaN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbTestigoTableroS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbTestigoTableroN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesEstacionariasS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbLucesEstacionariasN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesS)
                                                .addGap(157, 157, 157)
                                                .addComponent(jrbLucesN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesDireccionalesS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbLucesDireccionalesN))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbStopS)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbStopN)))))))
                        .addGap(0, 115, Short.MAX_VALUE))
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaManPreventivo)
                                    .addComponent(cmbTipoVehiculo, 0, 183, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(144, 144, 144)
                                .addComponent(txtKilometrajeActual))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BotonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFechaVenSOAT, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtFechaUltimoCambioAce)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaVenSOAT, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtFechaManPreventivo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(cmbTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtFechaUltimoCambioAce, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtKilometrajeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addGap(16, 16, 16)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbLiquidoRefriN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbLiquidoFrenosN)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jrbLiquidoRefriS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jrbLiquidoFrenosS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbAceiteMotorN)
                                .addGap(16, 16, 16)
                                .addComponent(jrbLiquidoHidraulicoN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbAceiteMotorS)
                                .addGap(16, 16, 16)
                                .addComponent(jrbLiquidoHidraulicoS)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jrbAguaVidriosS)
                    .addComponent(jrbAguaVidriosN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jrbAceleradorS)
                    .addComponent(jrbAceleradorN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(jrbClutchS)
                    .addComponent(jrbClutchN))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addComponent(jrbFrenoN)
                    .addComponent(jrbFrenoS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jrbLucesN)
                    .addComponent(jrbLucesS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jrbLucesDireccionalesN))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbLucesEstacionariasN)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jrbLucesDireccionalesS)
                        .addGap(18, 18, 18)
                        .addComponent(jrbLucesEstacionariasS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jrbStopS)
                    .addComponent(jrbStopN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jrbTestigoTableroS)
                    .addComponent(jrbTestigoTableroN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jrbLucesReversaS)
                    .addComponent(jrbLucesReversaN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jrbLucesInternasN)
                    .addComponent(jrbLucesInternasS))
                .addGap(11, 11, 11)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69)
                    .addComponent(jLabel66)
                    .addComponent(jLabel21))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbEquipoCarreteraS)
                            .addComponent(jrbEquipoCarreteraN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbExtintorS)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel45)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jrbFrenoEmergenciaN)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbEspejosN))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbExtintorN)
                                .addGap(18, 18, 18)
                                .addComponent(jrbFechaVenExtintorN)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jrbCrucetaN)
                                .addGap(18, 18, 18)
                                .addComponent(jrbSenalesReflectivasN)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jrbBateriaN)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbRinesN))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel41)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbBateriaS)
                                .addGap(18, 18, 18)
                                .addComponent(jrbRinesS)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jrbFechaVenExtintorS)
                                            .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel55)
                                            .addComponent(jrbLlantasRepuestoS)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jrbLlantasRepuestoN)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jrbPitoN))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel44))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbCrucetaS)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel57)
                                                    .addComponent(jrbSenalesReflectivasS))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel47)
                                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jrbCajaHerramientasS))
                                                            .addComponent(jrbEspejosS))
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jrbLinternaS)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jrbGatoS))
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(jLabel60))
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jLabel48)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jrbLimpiaParabrisasS)
                                                                            .addComponent(jLabel50)
                                                                            .addComponent(jrbLimpiaParabrisasN)))))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jrbCarcasaLucesS))))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jrbCajaHerramientasN)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jrbLinternaN)
                                                            .addComponent(jrbCarcasaLucesN))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jrbGatoN)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                        .addComponent(jLabel61)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel40)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addGap(5, 5, 5)
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                    .addComponent(jrbTapizadoS)
                                                                                    .addComponent(jrbTapizadoN))
                                                                                .addGap(20, 20, 20))
                                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel49)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addComponent(jLabel51)
                                                                            .addComponent(jrbPanoramicoS)
                                                                            .addComponent(jrbPanoramicoN)))
                                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                                        .addComponent(jrbBotiquinN)
                                                                        .addGap(23, 23, 23)
                                                                        .addComponent(jrbLlantasN)))
                                                                .addGap(0, 8, Short.MAX_VALUE))
                                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jrbBotiquinS)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jrbLlantasS)
                                                                .addGap(19, 19, 19)))
                                                        .addGap(41, 41, 41)))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addComponent(BotonGuardar)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(BotonLimpiar)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(BotonCerrar))))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jrbFrenoEmergenciaS)
                                                .addGap(0, 0, Short.MAX_VALUE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbCinturonSeguridadN)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbPitoReversaN))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jrbCinturonSeguridadS)
                                        .addGap(18, 18, 18)
                                        .addComponent(jrbPitoReversaS)))
                                .addGap(18, 18, 18)
                                .addComponent(jrbPitoS)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Icono IntegraSoft.png"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/My project (9) (1) (2).png"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jLabel2.setIconTextGap(1);

        jLabel3.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Diagnóstico del vehiculo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jLabel2)
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        
        validarCampos();
        
    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
       
        this.txtPlacaVehiculo.setText("");
        this.txtFechaInspeccion.setText("");
        this.txtFechaVenSOAT.setText("");
        this.txtFechaUltimoCambioAce.setText("");
        this.txtFechaManPreventivo.setText("");
        cmbTipoVehiculo.setSelectedItem("Seleccionar");
        this.txtKilometrajeActual.setText("");
        baLiquidoRefrigerante.clearSelection();
        baLiquidoFrenos.clearSelection();
        baAceiteMotor.clearSelection();
        baLimpiaParabrisas.clearSelection();
        baLiquidoHidraulico.clearSelection();
        baAguaVidrios.clearSelection();
        baAcelerador.clearSelection();
        baClutch.clearSelection();
        baFreno.clearSelection();
        baLuces.clearSelection();
        baLucesDireccionales.clearSelection();
        baLucesEstacionarias.clearSelection();
        baStop.clearSelection();
        baTestigoTablero.clearSelection();
        baLucesReversa.clearSelection();
        baLucesInternas.clearSelection();
        baEquipoCarretera.clearSelection();
        baExtintor.clearSelection();
        baFechaVenExtintor.clearSelection();
        baLlantasRepuesto.clearSelection();
        baCruceta.clearSelection();
        baSenalesReflectivas.clearSelection();
        baCajaHerramientas.clearSelection();
        baLinterna.clearSelection();
        baGato.clearSelection();
        baBotiquin.clearSelection();
        baLlantas.clearSelection();
        baBateria.clearSelection();
        baRines.clearSelection();
        baCinturonSeguridad.clearSelection();
        baPitoReversa.clearSelection();
        baPito.clearSelection();
        baFrenoEmergencia.clearSelection();
        baEspejos.clearSelection();
        baCarcasaLuces.clearSelection();
        baTapizado.clearSelection();
        baPanoramico.clearSelection();

    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
                try {
            int cerrar = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Desea volver","EXIT",cerrar);
            if (result==0) {
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_BotonCerrarActionPerformed

        public void ValidarCamposSeleccionados() {
            
            baLiquidoRefrigerante.add(jrbLiquidoRefriS);
            baLiquidoRefrigerante.add(jrbLiquidoRefriN);
            
            baLiquidoFrenos.add(jrbLiquidoFrenosS);
            baLiquidoFrenos.add(jrbLiquidoFrenosN);
            
            baAceiteMotor.add(jrbAceiteMotorS);
            baAceiteMotor.add(jrbAceiteMotorN);
            
            baLiquidoHidraulico.add(jrbLiquidoHidraulicoS);
            baLiquidoHidraulico.add(jrbLiquidoHidraulicoN);
            
            baAguaVidrios.add(jrbAguaVidriosS);
            baAguaVidrios.add(jrbAguaVidriosN);
            
            baAcelerador.add(jrbAceleradorS);
            baAcelerador.add(jrbAceleradorN);
            
            baClutch.add(jrbClutchS);
            baClutch.add(jrbClutchN);
            
            baFreno.add(jrbFrenoS);
            baFreno.add(jrbFrenoN);
            
            baLuces.add(jrbLucesS);
            baLuces.add(jrbLucesN);
            
            baLucesDireccionales.add(jrbLucesDireccionalesS);
            baLucesDireccionales.add(jrbLucesDireccionalesN);
            
            baLucesEstacionarias.add(jrbLucesEstacionariasS);
            baLucesEstacionarias.add(jrbLucesEstacionariasN);
            
            baStop.add(jrbStopS);
            baStop.add(jrbStopN);
            
            baTestigoTablero.add(jrbTestigoTableroS);
            baTestigoTablero.add(jrbTestigoTableroN);
            
            baLucesReversa.add(jrbLucesReversaS);
            baLucesReversa.add(jrbLucesReversaN);
            
            baLucesInternas.add(jrbLucesInternasS);
            baLucesInternas.add(jrbLucesInternasN);
            
            baEquipoCarretera.add(jrbEquipoCarreteraS);
            baEquipoCarretera.add(jrbEquipoCarreteraN);
            
            baExtintor.add(jrbExtintorS);
            baExtintor.add(jrbExtintorN);
            
            baFechaVenExtintor.add(jrbFechaVenExtintorS);
            baFechaVenExtintor.add(jrbFechaVenExtintorN);
            
            baLlantasRepuesto.add(jrbLlantasRepuestoS);
            baLlantasRepuesto.add(jrbLlantasRepuestoN);
            
            baCruceta.add(jrbCrucetaS);
            baCruceta.add(jrbCrucetaN);
            
            baSenalesReflectivas.add(jrbSenalesReflectivasS);
            baSenalesReflectivas.add(jrbSenalesReflectivasN);
            
            baCajaHerramientas.add(jrbCajaHerramientasS);
            baCajaHerramientas.add(jrbCajaHerramientasN);
            
            baLinterna.add(jrbLinternaS);
            baLinterna.add(jrbLinternaN);
            
            baGato.add(jrbGatoS);
            baGato.add(jrbGatoN);
            
            baBotiquin.add(jrbBotiquinS);
            baBotiquin.add(jrbBotiquinN);
            
            baLlantas.add(jrbLlantasS);
            baLlantas.add(jrbLlantasN);
            
            baBateria.add(jrbBateriaS);
            baBateria.add(jrbBateriaN);
            
            baRines.add(jrbRinesS);
            baRines.add(jrbRinesN);
            
            baCinturonSeguridad.add(jrbCinturonSeguridadS);
            baCinturonSeguridad.add(jrbCinturonSeguridadN);
            
            baPitoReversa.add(jrbPitoReversaS);
            baPitoReversa.add(jrbPitoReversaN);
            
            baPito.add(jrbPitoS);
            baPito.add(jrbPitoN);
            
            baFrenoEmergencia.add(jrbFrenoEmergenciaS);
            baFrenoEmergencia.add(jrbFrenoEmergenciaN);
            
            baEspejos.add(jrbEspejosS);
            baEspejos.add(jrbEspejosN);
            
            baCarcasaLuces.add(jrbCarcasaLucesS);
            baCarcasaLuces.add(jrbCarcasaLucesN);
            
            baLimpiaParabrisas.add(jrbLimpiaParabrisasS);
            baLimpiaParabrisas.add(jrbLimpiaParabrisasN);
            
            baTapizado.add(jrbTapizadoS);
            baTapizado.add(jrbTapizadoN);
            
            baPanoramico.add(jrbPanoramicoS);
            baPanoramico.add(jrbPanoramicoN);
            
        }  
        
        public boolean validarCampos() {
            boolean camposValidados = true;
            if (txtPlacaVehiculo.getText().equals("")){
                imprimirCampoVacio("Placa vehiculo");
                camposValidados = false;
                txtPlacaVehiculo.requestFocus();
            }else if(txtFechaInspeccion.getText().equals("")){
                imprimirCampoVacio("Fecha de Inspeccion");
                camposValidados = false;
                txtFechaInspeccion.requestFocus();
            }else if(txtFechaVenSOAT.getText().equals("")){
                imprimirCampoVacio("Fecha vencimiento SOAT");
                camposValidados = false;
                txtFechaVenSOAT.requestFocus();
            }else if(txtFechaManPreventivo.getText().equals("")){
                imprimirCampoVacio("Fecha del ultimo Mntenimiento");
                camposValidados = false;
                txtFechaManPreventivo.requestFocus();
            }else if(txtFechaUltimoCambioAce.getText().equals("")){
                imprimirCampoVacio("Fecha ultimo cambio de aceite");
                camposValidados = false;
                txtFechaUltimoCambioAce.requestFocus();
            }else if(cmbTipoVehiculo.getSelectedItem().equals("Seleccionar")){
                imprimirCampoVacio("Tipo de vehiculo");
                camposValidados = false;
                cmbTipoVehiculo.requestFocus();
            }else if(txtKilometrajeActual.getText().equals("")){
                imprimirCampoVacio("Kilometraje actual");
                camposValidados = false;
                txtKilometrajeActual.requestFocus();
            }else if((jrbLiquidoRefriS.isSelected() == false) && (jrbLiquidoRefriN.isSelected() == false)){
                imprimirCampoVacio("Liquido refrigerante");
                camposValidados = false;
                jrbLiquidoRefriS.requestFocus();
            }else if((jrbLiquidoFrenosS.isSelected() == false) && (jrbLiquidoFrenosN.isSelected() == false)){
                imprimirCampoVacio("Liquido de frenos");
                camposValidados = false;
                jrbLiquidoFrenosS.requestFocus();
            }else if((jrbAceiteMotorS.isSelected() == false) && (jrbAceiteMotorN.isSelected() == false)){
                imprimirCampoVacio("Aceite de motor");
                camposValidados = false;
                jrbAceiteMotorS.requestFocus();
            }else if((jrbLiquidoHidraulicoS.isSelected() == false) && (jrbLiquidoHidraulicoN.isSelected() == false)){
                imprimirCampoVacio("Liquido hidraulico");
                camposValidados = false;
                jrbLiquidoHidraulicoS.requestFocus();
            }else if((jrbAguaVidriosS.isSelected() == false) && (jrbAguaVidriosN.isSelected() == false)){
                imprimirCampoVacio("Agua limpia vidrios");
                camposValidados = false;
                jrbAguaVidriosS.requestFocus();
            }else if((jrbAceleradorS.isSelected() == false) && (jrbAceleradorN.isSelected() == false)){
                imprimirCampoVacio("Acelerador");
                camposValidados = false;
                jrbAceleradorS.requestFocus();
            }else if((jrbClutchS.isSelected() == false) && (jrbClutchN.isSelected() == false)){
                imprimirCampoVacio("Clutch");
                camposValidados = false;
                jrbClutchS.requestFocus();
            }else if((jrbFrenoS.isSelected() == false) && (jrbFrenoN.isSelected() == false)){
                imprimirCampoVacio("Frenos");
                camposValidados = false;
                jrbFrenoS.requestFocus();
            }else if((jrbLucesS.isSelected() == false) && (jrbLucesN.isSelected() == false)){
                imprimirCampoVacio("Luces");
                camposValidados = false;
                jrbLucesS.requestFocus();
            }else if((jrbLucesDireccionalesS.isSelected() == false) && (jrbLucesDireccionalesN.isSelected() == false)){
                imprimirCampoVacio("Luces direccionales");
                camposValidados = false;
                jrbLucesDireccionalesS.requestFocus();
            }else if((jrbLucesEstacionariasS.isSelected() == false) && (jrbLucesEstacionariasN.isSelected() == false)){
                imprimirCampoVacio("Luces estacionarias");
                camposValidados = false;
                jrbLucesEstacionariasS.requestFocus();
            }else if((jrbStopS.isSelected() == false) && (jrbStopN.isSelected() == false)){
                imprimirCampoVacio("stop");
                camposValidados = false;
                jrbStopS.requestFocus();
            }else if((jrbTestigoTableroS.isSelected() == false) && (jrbTestigoTableroN.isSelected() == false)){
                imprimirCampoVacio("Testigos tablero");
                camposValidados = false;
                jrbTestigoTableroS.requestFocus();
            }else if((jrbLucesReversaS.isSelected() == false) && (jrbLucesReversaN.isSelected() == false)){
                imprimirCampoVacio("Luces de reversa");
                camposValidados = false;
                jrbLucesReversaS.requestFocus();
            }else if((jrbLucesInternasS.isSelected() == false) && (jrbLucesInternasN.isSelected() == false)){
                imprimirCampoVacio("Luces internas");
                camposValidados = false;
                jrbLucesInternasS.requestFocus();
            }else if((jrbEquipoCarreteraS.isSelected() == false) && (jrbEquipoCarreteraN.isSelected() == false)){
                imprimirCampoVacio("Equipo carretera");
                camposValidados = false;
                jrbEquipoCarreteraS.requestFocus();
            }else if((jrbExtintorS.isSelected() == false) && (jrbExtintorN.isSelected() == false)){
                imprimirCampoVacio("Extintor");
                camposValidados = false;
                jrbExtintorS.requestFocus();
            }else if((jrbFechaVenExtintorS.isSelected() == false) && (jrbFechaVenExtintorN.isSelected() == false)){
                imprimirCampoVacio("Fecha vencimiento extintor");
                camposValidados = false;
                jrbFechaVenExtintorS.requestFocus();
            }else if((jrbLlantasRepuestoS.isSelected() == false) && (jrbLlantasRepuestoN.isSelected() == false)){
                imprimirCampoVacio("Llantas de repuesto");
                camposValidados = false;
                jrbLlantasRepuestoS.requestFocus();
            }else if((jrbCrucetaS.isSelected() == false) && (jrbCrucetaN.isSelected() == false)){
                imprimirCampoVacio("Cruceta");
                camposValidados = false;
                jrbCrucetaS.requestFocus();
            }else if((jrbSenalesReflectivasS.isSelected() == false) && (jrbSenalesReflectivasN.isSelected() == false)){
                imprimirCampoVacio("Señales reflectivas");
                camposValidados = false;
                jrbSenalesReflectivasS.requestFocus();
            }else if((jrbCajaHerramientasS.isSelected() == false) && (jrbCajaHerramientasN.isSelected() == false)){
                imprimirCampoVacio("Caja de herramientas");
                camposValidados = false;
                jrbCajaHerramientasS.requestFocus();
            }else if((jrbLinternaS.isSelected() == false) && (jrbLinternaN.isSelected() == false)){
                imprimirCampoVacio("Linterna");
                camposValidados = false;
                jrbLinternaS.requestFocus();
            }else if((jrbGatoS.isSelected() == false) && (jrbGatoN.isSelected() == false)){
                imprimirCampoVacio("Gato");
                camposValidados = false;
                jrbGatoS.requestFocus();
            }else if((jrbBotiquinS.isSelected() == false) && (jrbBotiquinN.isSelected() == false)){
                imprimirCampoVacio("Botiquin");
                camposValidados = false;
                jrbBotiquinS.requestFocus();
            }else if((jrbLlantasS.isSelected() == false) && (jrbLlantasN.isSelected() == false)){
                imprimirCampoVacio("Llantas");
                camposValidados = false;
                jrbLlantasS.requestFocus();
            }else if((jrbBateriaS.isSelected() == false) && (jrbBateriaN.isSelected() == false)){
                imprimirCampoVacio("Bateria");
                camposValidados = false;
                jrbBateriaS.requestFocus();
            }else if((jrbRinesS.isSelected() == false) && (jrbRinesN.isSelected() == false)){
                imprimirCampoVacio("Rines");
                camposValidados = false;
                jrbRinesS.requestFocus();
            }else if((jrbCinturonSeguridadS.isSelected() == false) && (jrbCinturonSeguridadN.isSelected() == false)){
                imprimirCampoVacio("Cinturon de seguridad");
                camposValidados = false;
                jrbCinturonSeguridadS.requestFocus();
            }else if((jrbPitoReversaS.isSelected() == false) && (jrbPitoReversaN.isSelected() == false)){
                imprimirCampoVacio("Pito reversa");
                camposValidados = false;
                jrbPitoReversaS.requestFocus();
            }else if((jrbPitoS.isSelected() == false) && (jrbPitoN.isSelected() == false)){
                imprimirCampoVacio("Pito");
                camposValidados = false;
                jrbPitoS.requestFocus();
            }else if((jrbFrenoEmergenciaS.isSelected() == false) && (jrbFrenoEmergenciaN.isSelected() == false)){
                imprimirCampoVacio("Frenos de emergencia");
                camposValidados = false;
                jrbFrenoEmergenciaS.requestFocus();
            }else if((jrbEspejosS.isSelected() == false) && (jrbEspejosN.isSelected() == false)){
                imprimirCampoVacio("Espejos");
                camposValidados = false;
                jrbEspejosS.requestFocus();
            }else if((jrbCarcasaLucesS.isSelected() == false) && (jrbCarcasaLucesN.isSelected() == false)){
                imprimirCampoVacio("Carcasa de luces");
                camposValidados = false;
                jrbCarcasaLucesS.requestFocus();
            }else if((jrbLimpiaParabrisasS.isSelected() == false) && (jrbLimpiaParabrisasN.isSelected() == false)){
                imprimirCampoVacio("Limpia parabrisas");
                camposValidados = false;
                jrbLimpiaParabrisasS.requestFocus();
            }else if((jrbTapizadoS.isSelected() == false) && (jrbTapizadoN.isSelected() == false)){
                imprimirCampoVacio("Tapizados");
                camposValidados = false;
                jrbTapizadoS.requestFocus();
            }else if((jrbPanoramicoS.isSelected() == false) && (jrbPanoramicoN.isSelected() == false)){
                imprimirCampoVacio("Panoramico");
                camposValidados = false;
                jrbPanoramicoS.requestFocus();
            }else if(jtxtDescripcion.getText().equals("")){
                imprimirCampoVacio("Descripcion");
                camposValidados = false;
                jtxtDescripcion.requestFocus();
            }else  {
                javax.swing.JOptionPane.showMessageDialog(this, "Registro Exitoso \n", "Error!", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } 
        return camposValidados;
  }
            public void imprimirCampoVacio(String campo){
                JOptionPane.showMessageDialog(null, "El campo "+campo+ " se encuentra vacío. Por favor, validar campo.", "Campo vacío", JOptionPane.ERROR_MESSAGE);
            }
        
        public String convertirBooleanString(boolean valorBooleano) {
        String valorString = null;
        try {
            if (valorBooleano == true) {
                valorString = "Buen estado";
            } else {
                valorString = "Mal estado";
            }
        } catch (Exception e) {
        }
        return valorString;
    }

        public boolean convertirStringBoolean(String valorString) {
        boolean valorBoolean = false;
        try {
            if (valorString == "Si") {
                valorBoolean = true;
            } else {
                valorBoolean = false;
            }
        } catch (Exception e) {
        }
        return valorBoolean;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaDiganostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaDiganostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaDiganostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaDiganostico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaDiganostico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.ButtonGroup baAceiteMotor;
    private javax.swing.ButtonGroup baAcelerador;
    private javax.swing.ButtonGroup baAguaVidrios;
    private javax.swing.ButtonGroup baBateria;
    private javax.swing.ButtonGroup baBotiquin;
    private javax.swing.ButtonGroup baCajaHerramientas;
    private javax.swing.ButtonGroup baCarcasaLuces;
    private javax.swing.ButtonGroup baCinturonSeguridad;
    private javax.swing.ButtonGroup baClutch;
    private javax.swing.ButtonGroup baCruceta;
    private javax.swing.ButtonGroup baEquipoCarretera;
    private javax.swing.ButtonGroup baEspejos;
    private javax.swing.ButtonGroup baExtintor;
    private javax.swing.ButtonGroup baFechaVenExtintor;
    private javax.swing.ButtonGroup baFreno;
    private javax.swing.ButtonGroup baFrenoEmergencia;
    private javax.swing.ButtonGroup baGato;
    private javax.swing.ButtonGroup baLimpiaParabrisas;
    private javax.swing.ButtonGroup baLinterna;
    private javax.swing.ButtonGroup baLiquidoFrenos;
    private javax.swing.ButtonGroup baLiquidoHidraulico;
    private javax.swing.ButtonGroup baLiquidoRefrigerante;
    private javax.swing.ButtonGroup baLlantas;
    private javax.swing.ButtonGroup baLlantasRepuesto;
    private javax.swing.ButtonGroup baLuces;
    private javax.swing.ButtonGroup baLucesDireccionales;
    private javax.swing.ButtonGroup baLucesEstacionarias;
    private javax.swing.ButtonGroup baLucesInternas;
    private javax.swing.ButtonGroup baLucesReversa;
    private javax.swing.ButtonGroup baPanoramico;
    private javax.swing.ButtonGroup baPito;
    private javax.swing.ButtonGroup baPitoReversa;
    private javax.swing.ButtonGroup baRines;
    private javax.swing.ButtonGroup baSenalesReflectivas;
    private javax.swing.ButtonGroup baStop;
    private javax.swing.ButtonGroup baTapizado;
    private javax.swing.ButtonGroup baTestigoTablero;
    private javax.swing.JComboBox<String> cmbTipoVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton jrbAceiteMotorN;
    private javax.swing.JRadioButton jrbAceiteMotorS;
    private javax.swing.JRadioButton jrbAceleradorN;
    private javax.swing.JRadioButton jrbAceleradorS;
    private javax.swing.JRadioButton jrbAguaVidriosN;
    private javax.swing.JRadioButton jrbAguaVidriosS;
    private javax.swing.JRadioButton jrbBateriaN;
    private javax.swing.JRadioButton jrbBateriaS;
    private javax.swing.JRadioButton jrbBotiquinN;
    private javax.swing.JRadioButton jrbBotiquinS;
    private javax.swing.JRadioButton jrbCajaHerramientasN;
    private javax.swing.JRadioButton jrbCajaHerramientasS;
    private javax.swing.JRadioButton jrbCarcasaLucesN;
    private javax.swing.JRadioButton jrbCarcasaLucesS;
    private javax.swing.JRadioButton jrbCinturonSeguridadN;
    private javax.swing.JRadioButton jrbCinturonSeguridadS;
    private javax.swing.JRadioButton jrbClutchN;
    private javax.swing.JRadioButton jrbClutchS;
    private javax.swing.JRadioButton jrbCrucetaN;
    private javax.swing.JRadioButton jrbCrucetaS;
    private javax.swing.JRadioButton jrbEquipoCarreteraN;
    private javax.swing.JRadioButton jrbEquipoCarreteraS;
    private javax.swing.JRadioButton jrbEspejosN;
    private javax.swing.JRadioButton jrbEspejosS;
    private javax.swing.JRadioButton jrbExtintorN;
    private javax.swing.JRadioButton jrbExtintorS;
    private javax.swing.JRadioButton jrbFechaVenExtintorN;
    private javax.swing.JRadioButton jrbFechaVenExtintorS;
    private javax.swing.JRadioButton jrbFrenoEmergenciaN;
    private javax.swing.JRadioButton jrbFrenoEmergenciaS;
    private javax.swing.JRadioButton jrbFrenoN;
    private javax.swing.JRadioButton jrbFrenoS;
    private javax.swing.JRadioButton jrbGatoN;
    private javax.swing.JRadioButton jrbGatoS;
    private javax.swing.JRadioButton jrbLimpiaParabrisasN;
    private javax.swing.JRadioButton jrbLimpiaParabrisasS;
    private javax.swing.JRadioButton jrbLinternaN;
    private javax.swing.JRadioButton jrbLinternaS;
    private javax.swing.JRadioButton jrbLiquidoFrenosN;
    private javax.swing.JRadioButton jrbLiquidoFrenosS;
    private javax.swing.JRadioButton jrbLiquidoHidraulicoN;
    private javax.swing.JRadioButton jrbLiquidoHidraulicoS;
    private javax.swing.JRadioButton jrbLiquidoRefriN;
    private javax.swing.JRadioButton jrbLiquidoRefriS;
    private javax.swing.JRadioButton jrbLlantasN;
    private javax.swing.JRadioButton jrbLlantasRepuestoN;
    private javax.swing.JRadioButton jrbLlantasRepuestoS;
    private javax.swing.JRadioButton jrbLlantasS;
    private javax.swing.JRadioButton jrbLucesDireccionalesN;
    private javax.swing.JRadioButton jrbLucesDireccionalesS;
    private javax.swing.JRadioButton jrbLucesEstacionariasN;
    private javax.swing.JRadioButton jrbLucesEstacionariasS;
    private javax.swing.JRadioButton jrbLucesInternasN;
    private javax.swing.JRadioButton jrbLucesInternasS;
    private javax.swing.JRadioButton jrbLucesN;
    private javax.swing.JRadioButton jrbLucesReversaN;
    private javax.swing.JRadioButton jrbLucesReversaS;
    private javax.swing.JRadioButton jrbLucesS;
    private javax.swing.JRadioButton jrbPanoramicoN;
    private javax.swing.JRadioButton jrbPanoramicoS;
    private javax.swing.JRadioButton jrbPitoN;
    private javax.swing.JRadioButton jrbPitoReversaN;
    private javax.swing.JRadioButton jrbPitoReversaS;
    private javax.swing.JRadioButton jrbPitoS;
    private javax.swing.JRadioButton jrbRinesN;
    private javax.swing.JRadioButton jrbRinesS;
    private javax.swing.JRadioButton jrbSenalesReflectivasN;
    private javax.swing.JRadioButton jrbSenalesReflectivasS;
    private javax.swing.JRadioButton jrbStopN;
    private javax.swing.JRadioButton jrbStopS;
    private javax.swing.JRadioButton jrbTapizadoN;
    private javax.swing.JRadioButton jrbTapizadoS;
    private javax.swing.JRadioButton jrbTestigoTableroN;
    private javax.swing.JRadioButton jrbTestigoTableroS;
    private javax.swing.JTextArea jtxtDescripcion;
    private javax.swing.JTextField txtFechaInspeccion;
    private javax.swing.JTextField txtFechaManPreventivo;
    private javax.swing.JTextField txtFechaUltimoCambioAce;
    private javax.swing.JTextField txtFechaVenSOAT;
    private javax.swing.JTextField txtKilometrajeActual;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
