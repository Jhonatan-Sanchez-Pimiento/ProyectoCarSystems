
package presentacion;

import dominio.Diagnostico;
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
        this.setResizable(false);
        this.setLocationRelativeTo(null);
//        ValidarCamposSeleccionados();
        
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtKilometrajeActual = new javax.swing.JTextField();
        txtPlacaVehiculo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
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
        jButton1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
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
        jrbClutchS = new javax.swing.JRadioButton();
        jrbClutchN = new javax.swing.JRadioButton();
        jrbFrenoS = new javax.swing.JRadioButton();
        jrbFrenoN = new javax.swing.JRadioButton();
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
        jLabel67 = new javax.swing.JLabel();
        jrbEquipoCarreteraS = new javax.swing.JRadioButton();
        jrbEquipoCarreteraN = new javax.swing.JRadioButton();
        jrbExtintorS = new javax.swing.JRadioButton();
        jrbExtintorN = new javax.swing.JRadioButton();
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
        jtaDescripcion = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCalenderFechaInspeccion = new com.toedter.calendar.JDateChooser();
        jCalenderFechaVenExtintor = new com.toedter.calendar.JDateChooser();
        jCalenderFechaVenSOAT = new com.toedter.calendar.JDateChooser();
        jCalenderFechaManPreventivo = new com.toedter.calendar.JDateChooser();
        jCalenderFechaUltimoCambioAce = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(30, 41, 57));

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(37, 196, 164), 2, true));

        jPanel2.setBackground(new java.awt.Color(30, 41, 57));
        jPanel2.setPreferredSize(new java.awt.Dimension(785, 1680));

        jLabel4.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Placa del vehiculo :");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Vencimiento de SOAT:");

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Último mantenimiento :");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha de inspección :");

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Último cambio de aceite :");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Kilometraje actual :");

        jLabel9.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Formato de diagnóstico del vehiculo");

        jLabel17.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Estado");

        jLabel18.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Liquido hidráulico :");

        jLabel22.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Liquido frenos :");

        jLabel23.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(240, 240, 240));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Aceite del motor :");

        jLabel24.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(240, 240, 240));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Agua limpia vidrios :");

        jLabel25.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(240, 240, 240));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Pedales");

        jLabel27.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(240, 240, 240));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Niveles");

        jLabel28.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Acelerador :");

        jLabel29.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Clutch :");

        jLabel30.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(240, 240, 240));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Freno :");

        jLabel31.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(240, 240, 240));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Luces");

        jLabel32.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(240, 240, 240));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Stop :");

        jLabel33.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(240, 240, 240));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Luces direccionales :");

        jLabel34.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(240, 240, 240));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Luces estacionarias :");

        jLabel35.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(240, 240, 240));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Luces:");

        jLabel36.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(240, 240, 240));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Testigos tablero :");

        jLabel37.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(240, 240, 240));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Luces de reversa :");

        jLabel38.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(240, 240, 240));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Luces internas :");

        jLabel39.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(240, 240, 240));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("Equipo de carretera y botiquín");

        jLabel40.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(240, 240, 240));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
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
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Extintor:");

        jLabel54.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(240, 240, 240));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Fecha ven extintor:");

        jLabel55.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(240, 240, 240));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Llantas repuesto:");

        jLabel56.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(240, 240, 240));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Cruceta:");

        jLabel57.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(240, 240, 240));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel57.setText("señales reflectivas:");

        jLabel58.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(240, 240, 240));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel58.setText("Linterna:");

        jLabel59.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(240, 240, 240));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Caja herramientas:");

        jLabel60.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(240, 240, 240));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel60.setText("Gato:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton1KeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Liquido refrigerante :");

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

        jrbClutchS.setBackground(new java.awt.Color(0, 51, 51));
        baClutch.add(jrbClutchS);

        jrbClutchN.setBackground(new java.awt.Color(0, 51, 51));
        baClutch.add(jrbClutchN);

        jrbFrenoS.setBackground(new java.awt.Color(0, 51, 51));
        baFreno.add(jrbFrenoS);

        jrbFrenoN.setBackground(new java.awt.Color(0, 51, 51));
        baFreno.add(jrbFrenoN);

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

        jLabel67.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(240, 240, 240));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Equipo Carretera:");

        jrbEquipoCarreteraS.setBackground(new java.awt.Color(0, 51, 51));
        baEquipoCarretera.add(jrbEquipoCarreteraS);

        jrbEquipoCarreteraN.setBackground(new java.awt.Color(0, 51, 51));
        baEquipoCarretera.add(jrbEquipoCarreteraN);

        jrbExtintorS.setBackground(new java.awt.Color(0, 51, 51));
        baExtintor.add(jrbExtintorS);

        jrbExtintorN.setBackground(new java.awt.Color(0, 51, 51));
        baExtintor.add(jrbExtintorN);

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
        jrbLinternaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbLinternaNActionPerformed(evt);
            }
        });

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
        jrbRinesN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbRinesNActionPerformed(evt);
            }
        });

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

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtaDescripcion);

        jButton2.setText("Limpiar");

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCalenderFechaInspeccion.setDateFormatString("yyyy-MMM-dd");

        jCalenderFechaVenExtintor.setDateFormatString("yyyy-MMM-dd");

        jCalenderFechaVenSOAT.setDateFormatString("yyyy-MMM-dd");

        jCalenderFechaManPreventivo.setDateFormatString("yyyy-MMM-dd");

        jCalenderFechaUltimoCambioAce.setDateFormatString("yyyy-MMM-dd");

        jLabel26.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel52.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(240, 240, 240));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Bueno");

        jLabel70.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(240, 240, 240));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Malo");

        jLabel71.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(240, 240, 240));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel72.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(240, 240, 240));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Bueno");

        jLabel73.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(240, 240, 240));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Malo");

        jLabel74.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(240, 240, 240));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Estado");

        jLabel75.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(240, 240, 240));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel76.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(240, 240, 240));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Estado");

        jLabel77.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(240, 240, 240));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("Bueno");

        jLabel78.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(240, 240, 240));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("Malo");

        jLabel79.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(240, 240, 240));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel80.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(240, 240, 240));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("Estado");

        jLabel81.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(240, 240, 240));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Bueno");

        jLabel82.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(240, 240, 240));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Malo");

        jLabel83.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(240, 240, 240));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("Estado");

        jLabel84.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(240, 240, 240));
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel85.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(240, 240, 240));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Bueno");

        jLabel86.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(240, 240, 240));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("Malo");

        jLabel87.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(240, 240, 240));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel88.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(240, 240, 240));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Estado");

        jLabel89.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(240, 240, 240));
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setText("Bueno");

        jLabel90.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(240, 240, 240));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("Malo");

        jLabel91.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(240, 240, 240));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel92.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(240, 240, 240));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Estado");

        jLabel93.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(240, 240, 240));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Bueno");

        jLabel94.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(240, 240, 240));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("Malo");

        jLabel95.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(240, 240, 240));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel96.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(240, 240, 240));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Estado");

        jLabel97.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(240, 240, 240));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Bueno");

        jLabel98.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(240, 240, 240));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("Malo");

        jLabel61.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(240, 240, 240));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Botiquín:");

        jLabel62.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(240, 240, 240));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Observaciones:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jrbStopS))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jrbLiquidoRefriS)
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbAceiteMotorN)
                                .addGap(296, 296, 296))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbLiquidoFrenosN)
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbLiquidoRefriN)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbLiquidoHidraulicoS)
                            .addComponent(jrbAguaVidriosS))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbAguaVidriosN)
                            .addComponent(jrbLiquidoHidraulicoN)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbLiquidoFrenosS)
                            .addComponent(jrbAceiteMotorS)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCalenderFechaManPreventivo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCalenderFechaVenSOAT, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(jCalenderFechaInspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jCalenderFechaUltimoCambioAce, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKilometrajeActual)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbLucesS)
                                    .addComponent(jrbLucesDireccionalesS))
                                .addGap(68, 68, 68)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbLucesDireccionalesN)
                                    .addComponent(jrbLucesEstacionariasN)
                                    .addComponent(jrbStopN)
                                    .addComponent(jrbLucesN)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jrbLucesEstacionariasS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(36, 36, 36)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbTestigoTableroS)
                                            .addComponent(jrbLucesReversaS)
                                            .addComponent(jrbLucesInternasS))
                                        .addGap(64, 64, 64)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbLucesReversaN)
                                            .addComponent(jrbTestigoTableroN)
                                            .addComponent(jrbLucesInternasN)))))
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jrbLlantasS))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(167, 167, 167)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                    .addGap(26, 26, 26)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbAceleradorS)
                                        .addComponent(jrbClutchS))
                                    .addGap(65, 65, 65)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbClutchN)
                                        .addComponent(jrbAceleradorN))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addComponent(jrbFrenoS)
                                    .addGap(66, 66, 66)
                                    .addComponent(jrbFrenoN)))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbEquipoCarreteraS)
                                                .addComponent(jrbExtintorS))
                                            .addGap(71, 71, 71)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbExtintorN)
                                                .addComponent(jrbEquipoCarreteraN)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbLlantasRepuestoS)
                                                .addComponent(jrbCrucetaS)
                                                .addComponent(jrbSenalesReflectivasS, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbCajaHerramientasS))
                                            .addGap(73, 73, 73)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbCajaHerramientasN)
                                                .addComponent(jrbSenalesReflectivasN)
                                                .addComponent(jrbCrucetaN)
                                                .addComponent(jrbLlantasRepuestoN)))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbLinternaS)
                                                .addComponent(jrbGatoS, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(73, 73, 73)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbGatoN)
                                                .addComponent(jrbLinternaN)
                                                .addComponent(jrbBotiquinN)
                                                .addComponent(jrbLlantasN)))
                                        .addComponent(jCalenderFechaVenExtintor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbBotiquinS)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbBateriaS)
                                        .addComponent(jrbRinesS)
                                        .addComponent(jrbCinturonSeguridadS)
                                        .addComponent(jrbPitoReversaS)
                                        .addComponent(jrbPitoS)
                                        .addComponent(jrbFrenoEmergenciaS)
                                        .addComponent(jrbEspejosS)
                                        .addComponent(jrbCarcasaLucesS)
                                        .addComponent(jrbLimpiaParabrisasS)
                                        .addComponent(jrbTapizadoS)
                                        .addComponent(jrbPanoramicoS))
                                    .addGap(68, 68, 68)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jrbPanoramicoN)
                                        .addComponent(jrbTapizadoN)
                                        .addComponent(jrbLimpiaParabrisasN)
                                        .addComponent(jrbCarcasaLucesN)
                                        .addComponent(jrbEspejosN)
                                        .addComponent(jrbFrenoEmergenciaN)
                                        .addComponent(jrbPitoN)
                                        .addComponent(jrbPitoReversaN)
                                        .addComponent(jrbCinturonSeguridadN)
                                        .addComponent(jrbRinesN)
                                        .addComponent(jrbBateriaN)))))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCalenderFechaInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jCalenderFechaVenSOAT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCalenderFechaManPreventivo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jCalenderFechaUltimoCambioAce, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKilometrajeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel74))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel70)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel73)))
                            .addComponent(jLabel71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jrbLiquidoRefriS)
                                    .addComponent(jrbLiquidoRefriN)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbLiquidoHidraulicoN)
                                    .addComponent(jrbLiquidoHidraulicoS)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(jrbLiquidoFrenosS)
                    .addComponent(jrbLiquidoFrenosN)
                    .addComponent(jLabel24)
                    .addComponent(jrbAguaVidriosS)
                    .addComponent(jrbAguaVidriosN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jrbAceiteMotorS)
                    .addComponent(jrbAceiteMotorN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel76)
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82)))
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jrbAceleradorS)
                            .addComponent(jrbAceleradorN)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jrbClutchS)
                            .addComponent(jrbClutchN)))
                    .addComponent(jrbFrenoS)
                    .addComponent(jrbFrenoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel83)
                            .addComponent(jLabel88))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jLabel86)
                            .addComponent(jLabel89)
                            .addComponent(jLabel90)))
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addComponent(jrbLucesS)
                    .addComponent(jrbLucesN)
                    .addComponent(jLabel36)
                    .addComponent(jrbTestigoTableroS)
                    .addComponent(jrbTestigoTableroN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jrbLucesDireccionalesN)
                    .addComponent(jrbLucesDireccionalesS)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbLucesReversaS)
                    .addComponent(jrbLucesReversaN)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jrbLucesEstacionariasS)
                    .addComponent(jrbLucesEstacionariasN)
                    .addComponent(jLabel38)
                    .addComponent(jrbLucesInternasS)
                    .addComponent(jrbLucesInternasN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32)
                    .addComponent(jrbStopS)
                    .addComponent(jrbStopN))
                .addGap(6, 6, 6)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel96))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel93)
                            .addComponent(jLabel94)
                            .addComponent(jLabel97)
                            .addComponent(jLabel98)))
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel67)
                                    .addComponent(jrbEquipoCarreteraS)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jrbEquipoCarreteraN))
                                    .addComponent(jLabel41)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jrbBateriaN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addComponent(jrbExtintorS)
                            .addComponent(jrbExtintorN)
                            .addComponent(jLabel42)
                            .addComponent(jrbRinesS)
                            .addComponent(jrbRinesN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addComponent(jCalenderFechaVenExtintor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45)
                            .addComponent(jrbCinturonSeguridadN)
                            .addComponent(jrbCinturonSeguridadS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbLlantasRepuestoS)
                                    .addComponent(jrbLlantasRepuestoN)
                                    .addComponent(jLabel46))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel56)
                                    .addComponent(jrbCrucetaS)
                                    .addComponent(jrbCrucetaN)
                                    .addComponent(jLabel43)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbPitoReversaS)
                                    .addComponent(jrbPitoReversaN))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbPitoN)
                                    .addComponent(jrbPitoS))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbSenalesReflectivasS)
                            .addComponent(jrbSenalesReflectivasN)
                            .addComponent(jLabel44)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jrbFrenoEmergenciaS)
                                .addComponent(jrbFrenoEmergenciaN)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel59)
                            .addComponent(jrbCajaHerramientasS)
                            .addComponent(jrbCajaHerramientasN)
                            .addComponent(jLabel47)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jrbEspejosN)
                                .addComponent(jrbEspejosS)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jrbLinternaS)
                            .addComponent(jrbLinternaN)
                            .addComponent(jLabel48)
                            .addComponent(jrbCarcasaLucesS)
                            .addComponent(jrbCarcasaLucesN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbLimpiaParabrisasS)
                            .addComponent(jrbLimpiaParabrisasN)
                            .addComponent(jLabel60)
                            .addComponent(jrbGatoS)
                            .addComponent(jrbGatoN)
                            .addComponent(jLabel50)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jrbBateriaS)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jrbBotiquinS)
                    .addComponent(jrbBotiquinN)
                    .addComponent(jLabel49)
                    .addComponent(jrbTapizadoN)
                    .addComponent(jrbTapizadoS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40)
                    .addComponent(jrbLlantasN)
                    .addComponent(jrbLlantasS)
                    .addComponent(jLabel51)
                    .addComponent(jrbPanoramicoS)
                    .addComponent(jrbPanoramicoN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton1))
                    .addComponent(jButton3))
                .addGap(10, 10, 10))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        registrarDiagnostico();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyTyped
        //registrarDiagnostico();
    }//GEN-LAST:event_jButton1KeyTyped

    private void jrbLinternaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbLinternaNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbLinternaNActionPerformed

    private void jrbRinesNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbRinesNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbRinesNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

//        public void ValidarCamposSeleccionados() {
//            
//            baLiquidoRefrigerante.add(jrbLiquidoRefriS);
//            baLiquidoRefrigerante.add(jrbLiquidoRefriN);
//            
//            baLiquidoFrenos.add(jrbLiquidoFrenosS);
//            baLiquidoFrenos.add(jrbLiquidoFrenosN);
//            
//            baAceiteMotor.add(jrbAceiteMotorS);
//            baAceiteMotor.add(jrbAceiteMotorN);
//            
//            baLiquidoHidraulico.add(jrbLiquidoHidraulicoS);
//            baLiquidoHidraulico.add(jrbLiquidoHidraulicoN);
//            
//            baAguaVidrios.add(jrbAguaVidriosS);
//            baAguaVidrios.add(jrbAguaVidriosN);
//            
//            baAcelerador.add(jrbAceleradorS);
//            baAcelerador.add(jrbAceleradorN);
//            
//            baClutch.add(jrbClutchS);
//            baClutch.add(jrbClutchN);
//            
//            baFreno.add(jrbFrenoS);
//            baFreno.add(jrbFrenoN);
//            
//            baLuces.add(jrbLucesS);
//            baLuces.add(jrbLucesN);
//            
//            baLucesDireccionales.add(jrbLucesDireccionalesS);
//            baLucesDireccionales.add(jrbLucesDireccionalesN);
//            
//            baLucesEstacionarias.add(jrbLucesEstacionariasS);
//            baLucesEstacionarias.add(jrbLucesEstacionariasN);
//            
//            baStop.add(jrbStopS);
//            baStop.add(jrbStopN);
//            
//            baTestigoTablero.add(jrbTestigoTableroS);
//            baTestigoTablero.add(jrbTestigoTableroN);
//            
//            baLucesReversa.add(jrbLucesReversaS);
//            baLucesReversa.add(jrbLucesReversaN);
//            
//            baLucesInternas.add(jrbLucesInternasS);
//            baLucesInternas.add(jrbLucesInternasN);
//            
//            baEquipoCarretera.add(jrbEquipoCarreteraS);
//            baEquipoCarretera.add(jrbEquipoCarreteraN);
//            
//            baExtintor.add(jrbExtintorS);
//            baExtintor.add(jrbExtintorN);
//            
//            baFechaVenExtintor.add(jrbFechaVenExtintorS);
//            baFechaVenExtintor.add(jrbFechaVenExtintorN);
//            
//            baLlantasRepuesto.add(jrbLlantasRepuestoS);
//            baLlantasRepuesto.add(jrbLlantasRepuestoN);
//            
//            baCruceta.add(jrbCrucetaS);
//            baCruceta.add(jrbCrucetaN);
//            
//            baSenalesReflectivas.add(jrbSenalesReflectivasS);
//            baSenalesReflectivas.add(jrbSenalesReflectivasN);
//            
//            baCajaHerramientas.add(jrbCajaHerramientasS);
//            baCajaHerramientas.add(jrbCajaHerramientasN);
//            
//            baLinterna.add(jrbLinternaS);
//            baLinterna.add(jrbLinternaN);
//            
//            baGato.add(jrbGatoS);
//            baGato.add(jrbGatoN);
//            
//            baBotiquin.add(jrbBotiquinS);
//            baBotiquin.add(jrbBotiquinN);
//            
//            baLlantas.add(jrbLlantasS);
//            baLlantas.add(jrbLlantasN);
//            
//            baBateria.add(jrbBateriaS);
//            baBateria.add(jrbBateriaN);
//            
//            baRines.add(jrbRinesS);
//            baRines.add(jrbRinesN);
//            
//            baCinturonSeguridad.add(jrbCinturonSeguridadS);
//            baCinturonSeguridad.add(jrbCinturonSeguridadN);
//            
//            baPitoReversa.add(jrbPitoReversaS);
//            baPitoReversa.add(jrbPitoReversaN);
//            
//            baPito.add(jrbPitoS);
//            baPito.add(jrbPitoN);
//            
//            baFrenoEmergencia.add(jrbFrenoEmergenciaS);
//            baFrenoEmergencia.add(jrbFrenoEmergenciaN);
//            
//            baEspejos.add(jrbEspejosS);
//            baEspejos.add(jrbEspejosN);
//            
//            baCarcasaLuces.add(jrbCarcasaLucesS);
//            baCarcasaLuces.add(jrbCarcasaLucesN);
//            
//            baLimpiaParabrisas.add(jrbLimpiaParabrisasS);
//            baLimpiaParabrisas.add(jrbLimpiaParabrisasN);
//            
//            baTapizado.add(jrbTapizadoS);
//            baTapizado.add(jrbTapizadoN);
//            
//            baPanoramico.add(jrbPanoramicoS);
//            baPanoramico.add(jrbPanoramicoN);
//            
//        }  
//        
//        public boolean validarCampos() {
//            boolean camposValidados = true;
//            if (txtPlacaVehiculo.getText().equals("")){
//                imprimirCampoVacio("Placa vehiculo");
//                camposValidados = false;
//                txtPlacaVehiculo.requestFocus();
//            }else if(jCalenderFechaInspeccion.getDateFormatString().equals("")){
//                imprimirCampoVacio("Fecha de Inspeccion");
//                camposValidados = false;
//                jCalenderFechaInspeccion.requestFocus();
//            }else if(jCalenderFechaVenSOAT.getDateFormatString().equals("")){
//                imprimirCampoVacio("Fecha vencimiento SOAT");
//                camposValidados = false;
//                jCalenderFechaVenSOAT.requestFocus();
//            }else if(jCalenderFechaManPreventivo.getDateFormatString().equals("")){
//                imprimirCampoVacio("Fecha del ultimo Mntenimiento");
//                camposValidados = false;
//                jCalenderFechaManPreventivo.requestFocus();
//            }else if(jCalenderFechaUltimoCambioAce.getDateFormatString().equals("")){
//                imprimirCampoVacio("Fecha ultimo cambio de aceite");
//                camposValidados = false;
//                jCalenderFechaUltimoCambioAce.requestFocus();
//            }else if(txtKilometrajeActual.getText().equals("")){
//                imprimirCampoVacio("Kilometraje actual");
//                camposValidados = false;
//                txtKilometrajeActual.requestFocus();
//            }else if((jrbLiquidoRefriS.isSelected() == false) && (jrbLiquidoRefriN.isSelected() == false)){
//                imprimirCampoVacio("Liquido refrigerante");
//                camposValidados = false;
//                jrbLiquidoRefriS.requestFocus();
//            }else if((jrbLiquidoFrenosS.isSelected() == false) && (jrbLiquidoFrenosN.isSelected() == false)){
//                imprimirCampoVacio("Liquido de frenos");
//                camposValidados = false;
//                jrbLiquidoFrenosS.requestFocus();
//            }else if((jrbAceiteMotorS.isSelected() == false) && (jrbAceiteMotorN.isSelected() == false)){
//                imprimirCampoVacio("Aceite de motor");
//                camposValidados = false;
//                jrbAceiteMotorS.requestFocus();
//            }else if((jrbLiquidoHidraulicoS.isSelected() == false) && (jrbLiquidoHidraulicoN.isSelected() == false)){
//                imprimirCampoVacio("Liquido hidraulico");
//                camposValidados = false;
//                jrbLiquidoHidraulicoS.requestFocus();
//            }else if((jrbAguaVidriosS.isSelected() == false) && (jrbAguaVidriosN.isSelected() == false)){
//                imprimirCampoVacio("Agua limpia vidrios");
//                camposValidados = false;
//                jrbAguaVidriosS.requestFocus();
//            }else if((jrbAceleradorS.isSelected() == false) && (jrbAceleradorN.isSelected() == false)){
//                imprimirCampoVacio("Acelerador");
//                camposValidados = false;
//                jrbAceleradorS.requestFocus();
//            }else if((jrbClutchS.isSelected() == false) && (jrbClutchN.isSelected() == false)){
//                imprimirCampoVacio("Clutch");
//                camposValidados = false;
//                jrbClutchS.requestFocus();
//            }else if((jrbFrenoS.isSelected() == false) && (jrbFrenoN.isSelected() == false)){
//                imprimirCampoVacio("Frenos");
//                camposValidados = false;
//                jrbFrenoS.requestFocus();
//            }else if((jrbLucesS.isSelected() == false) && (jrbLucesN.isSelected() == false)){
//                imprimirCampoVacio("Luces");
//                camposValidados = false;
//                jrbLucesS.requestFocus();
//            }else if((jrbLucesDireccionalesS.isSelected() == false) && (jrbLucesDireccionalesN.isSelected() == false)){
//                imprimirCampoVacio("Luces direccionales");
//                camposValidados = false;
//                jrbLucesDireccionalesS.requestFocus();
//            }else if((jrbLucesEstacionariasS.isSelected() == false) && (jrbLucesEstacionariasN.isSelected() == false)){
//                imprimirCampoVacio("Luces estacionarias");
//                camposValidados = false;
//                jrbLucesEstacionariasS.requestFocus();
//            }else if((jrbStopS.isSelected() == false) && (jrbStopN.isSelected() == false)){
//                imprimirCampoVacio("stop");
//                camposValidados = false;
//                jrbStopS.requestFocus();
//            }else if((jrbTestigoTableroS.isSelected() == false) && (jrbTestigoTableroN.isSelected() == false)){
//                imprimirCampoVacio("Testigos tablero");
//                camposValidados = false;
//                jrbTestigoTableroS.requestFocus();
//            }else if((jrbLucesReversaS.isSelected() == false) && (jrbLucesReversaN.isSelected() == false)){
//                imprimirCampoVacio("Luces de reversa");
//                camposValidados = false;
//                jrbLucesReversaS.requestFocus();
//            }else if((jrbLucesInternasS.isSelected() == false) && (jrbLucesInternasN.isSelected() == false)){
//                imprimirCampoVacio("Luces internas");
//                camposValidados = false;
//                jrbLucesInternasS.requestFocus();
//            }else if((jrbEquipoCarreteraS.isSelected() == false) && (jrbEquipoCarreteraN.isSelected() == false)){
//                imprimirCampoVacio("Equipo carretera");
//                camposValidados = false;
//                jrbEquipoCarreteraS.requestFocus();
//            }else if((jrbExtintorS.isSelected() == false) && (jrbExtintorN.isSelected() == false)){
//                imprimirCampoVacio("Extintor");
//                camposValidados = false;
//                jrbExtintorS.requestFocus();
//            }else if((jrbFechaVenExtintorS.isSelected() == false) && (jrbFechaVenExtintorN.isSelected() == false)){
//                imprimirCampoVacio("Fecha vencimiento extintor");
//                camposValidados = false;
//                jrbFechaVenExtintorS.requestFocus();
//            }else if((jrbLlantasRepuestoS.isSelected() == false) && (jrbLlantasRepuestoN.isSelected() == false)){
//                imprimirCampoVacio("Llantas de repuesto");
//                camposValidados = false;
//                jrbLlantasRepuestoS.requestFocus();
//            }else if((jrbCrucetaS.isSelected() == false) && (jrbCrucetaN.isSelected() == false)){
//                imprimirCampoVacio("Cruceta");
//                camposValidados = false;
//                jrbCrucetaS.requestFocus();
//            }else if((jrbSenalesReflectivasS.isSelected() == false) && (jrbSenalesReflectivasN.isSelected() == false)){
//                imprimirCampoVacio("Señales reflectivas");
//                camposValidados = false;
//                jrbSenalesReflectivasS.requestFocus();
//            }else if((jrbCajaHerramientasS.isSelected() == false) && (jrbCajaHerramientasN.isSelected() == false)){
//                imprimirCampoVacio("Caja de herramientas");
//                camposValidados = false;
//                jrbCajaHerramientasS.requestFocus();
//            }else if((jrbLinternaS.isSelected() == false) && (jrbLinternaN.isSelected() == false)){
//                imprimirCampoVacio("Linterna");
//                camposValidados = false;
//                jrbLinternaS.requestFocus();
//            }else if((jrbGatoS.isSelected() == false) && (jrbGatoN.isSelected() == false)){
//                imprimirCampoVacio("Gato");
//                camposValidados = false;
//                jrbGatoS.requestFocus();
//            }else if((jrbBotiquinS.isSelected() == false) && (jrbBotiquinN.isSelected() == false)){
//                imprimirCampoVacio("Botiquin");
//                camposValidados = false;
//                jrbBotiquinS.requestFocus();
//            }else if((jrbLlantasS.isSelected() == false) && (jrbLlantasN.isSelected() == false)){
//                imprimirCampoVacio("Llantas");
//                camposValidados = false;
//                jrbLlantasS.requestFocus();
//            }else if((jrbBateriaS.isSelected() == false) && (jrbBateriaN.isSelected() == false)){
//                imprimirCampoVacio("Bateria");
//                camposValidados = false;
//                jrbBateriaS.requestFocus();
//            }else if((jrbRinesS.isSelected() == false) && (jrbRinesN.isSelected() == false)){
//                imprimirCampoVacio("Rines");
//                camposValidados = false;
//                jrbRinesS.requestFocus();
//            }else if((jrbCinturonSeguridadS.isSelected() == false) && (jrbCinturonSeguridadN.isSelected() == false)){
//                imprimirCampoVacio("Cinturon de seguridad");
//                camposValidados = false;
//                jrbCinturonSeguridadS.requestFocus();
//            }else if((jrbPitoReversaS.isSelected() == false) && (jrbPitoReversaN.isSelected() == false)){
//                imprimirCampoVacio("Pito reversa");
//                camposValidados = false;
//                jrbPitoReversaS.requestFocus();
//            }else if((jrbPitoS.isSelected() == false) && (jrbPitoN.isSelected() == false)){
//                imprimirCampoVacio("Pito");
//                camposValidados = false;
//                jrbPitoS.requestFocus();
//            }else if((jrbFrenoEmergenciaS.isSelected() == false) && (jrbFrenoEmergenciaN.isSelected() == false)){
//                imprimirCampoVacio("Frenos de emergencia");
//                camposValidados = false;
//                jrbFrenoEmergenciaS.requestFocus();
//            }else if((jrbEspejosS.isSelected() == false) && (jrbEspejosN.isSelected() == false)){
//                imprimirCampoVacio("Espejos");
//                camposValidados = false;
//                jrbEspejosS.requestFocus();
//            }else if((jrbCarcasaLucesS.isSelected() == false) && (jrbCarcasaLucesN.isSelected() == false)){
//                imprimirCampoVacio("Carcasa de luces");
//                camposValidados = false;
//                jrbCarcasaLucesS.requestFocus();
//            }else if((jrbLimpiaParabrisasS.isSelected() == false) && (jrbLimpiaParabrisasN.isSelected() == false)){
//                imprimirCampoVacio("Limpia parabrisas");
//                camposValidados = false;
//                jrbLimpiaParabrisasS.requestFocus();
//            }else if((jrbTapizadoS.isSelected() == false) && (jrbTapizadoN.isSelected() == false)){
//                imprimirCampoVacio("Tapizados");
//                camposValidados = false;
//                jrbTapizadoS.requestFocus();
//            }else if((jrbPanoramicoS.isSelected() == false) && (jrbPanoramicoN.isSelected() == false)){
//                imprimirCampoVacio("Panoramico");
//                camposValidados = false;
//                jrbPanoramicoS.requestFocus();
//        } 
//        return camposValidados;
//        }
//        public void imprimirCampoVacio(String campo){
//            JOptionPane.showMessageDialog(null, "El campo "+campo+ " se encuentra vacío. Por favor, validar campo.", "Campo vacío", JOptionPane.ERROR_MESSAGE);
//            }
//        
//        public String convertirBooleanString(boolean valorBooleano) {
//        String valorString = null;
//        try {
//            if (valorBooleano == true) {
//                valorString = "verdadero";
//            } else {
//                valorString = "falso";
//            }
//        } catch (Exception e) {
//        }
//        return valorString;
//    }
//
//        public boolean convertirStringBoolean(String valorString) {
//        boolean valorBoolean = false;
//        try {
//            if (valorString == "verdadero") {
//                valorBoolean = true;
//            } else {
//                valorBoolean = false;
//            }
//        } catch (Exception e) {
//        }
//        return valorBoolean;
//    }
//        
//
//        
//        public void registrarDiagnostico(){
//            
//        DiagnosticoServiceImpl diagnosticoServicio = new DiagnosticoServiceImpl();
//        
//                
//        boolean botonGrupLiquidoRef = true;
//            if(jrbLiquidoRefriS.isSelected())
//            {
//                botonGrupLiquidoRef  = (true);
//            }else if(jrbLiquidoRefriN.isSelected()){
//                botonGrupLiquidoRef  = (false);
//            }
//        boolean botonGrupLiquidoFrenos = true;
//            if(jrbLiquidoFrenosS.isSelected())
//            {
//                botonGrupLiquidoFrenos  = (true);
//            }else if(jrbLiquidoFrenosN.isSelected()){
//                botonGrupLiquidoFrenos  = (false);
//            }
//        boolean botonGrupAceiteMotor = true;
//            if(jrbAceiteMotorS.isSelected())
//            {
//                botonGrupAceiteMotor  = (true);
//            }else if(jrbAceiteMotorN.isSelected()){
//                botonGrupAceiteMotor  = (false);
//            }
//         boolean botonGrupLiquidoHidraulico = true;
//            if(jrbLiquidoHidraulicoS.isSelected())
//            {
//                botonGrupLiquidoHidraulico  = (true);
//            }else if(jrbLiquidoHidraulicoN.isSelected()){
//                botonGrupLiquidoHidraulico  = (false);
//            }
//        boolean botonGrupAguaVidrios = true;
//            if(jrbAguaVidriosS.isSelected())
//            {
//                botonGrupAguaVidrios  = (true);
//            }else if(jrbAguaVidriosN.isSelected()){
//                botonGrupAguaVidrios  = (false);
//            }  
//        boolean botonGrupAcelerador = true;
//            if(jrbAceleradorS.isSelected())
//            {
//                botonGrupAcelerador  = (true);
//            }else if(jrbAceleradorN.isSelected()){
//                botonGrupAcelerador  = (false);
//            }
//        boolean botonGrupClutch = true;
//            if(jrbClutchS.isSelected())
//            {
//                botonGrupClutch  = (true);
//            }else if(jrbClutchN.isSelected()){
//                botonGrupClutch  = (false);
//            }
//        boolean botonGrupFreno = true;
//            if(jrbFrenoS.isSelected())
//            {
//                botonGrupFreno  = (true);
//            }else if(jrbFrenoN.isSelected()){
//                botonGrupFreno  = (false);
//            }
//        boolean botonGrupLuces = true;
//            if(jrbLucesS.isSelected())
//            {
//                botonGrupLuces  = (true);
//            }else if(jrbLucesN.isSelected()){
//                botonGrupLuces  = (false);
//            }
//        boolean botonGrupLucesDireccionales = true;
//            if(jrbLucesDireccionalesS.isSelected())
//            {
//                botonGrupLucesDireccionales  = (true);
//            }else if(jrbLucesDireccionalesN.isSelected()){
//                botonGrupLucesDireccionales  = (false);
//            }
//        boolean botonGrupLucesEstacionarias = true;
//            if(jrbLucesEstacionariasS.isSelected())
//            {
//                botonGrupLucesEstacionarias  = (true);
//            }else if(jrbLucesEstacionariasN.isSelected()){
//                botonGrupLucesEstacionarias = (false);
//            }
//        boolean botonGrupStop = true;
//            if(jrbStopS.isSelected())
//            {
//                botonGrupStop  = (true);
//            }else if(jrbStopN.isSelected()){
//                botonGrupStop = (false);
//            }
//        boolean botonGrupTestigoTablero = true;
//            if(jrbTestigoTableroS.isSelected())
//            {
//                botonGrupTestigoTablero  = (true);
//            }else if(jrbTestigoTableroN.isSelected()){
//                botonGrupTestigoTablero = (false);
//            }
//        boolean botonGrupLucesReversa = true;
//            if(jrbLucesReversaS.isSelected())
//            {
//                botonGrupLucesReversa  = (true);
//            }else if(jrbLucesReversaN.isSelected()){
//                botonGrupLucesReversa = (false);
//            }
//        boolean botonGrupLucesInternas = true;
//            if(jrbLucesInternasS.isSelected())
//            {
//                botonGrupLucesInternas  = (true);
//            }else if(jrbLucesInternasN.isSelected()){
//                botonGrupLucesInternas = (false);
//            }
//        boolean botonGrupEquipoCarretera = true;
//            if(jrbEquipoCarreteraS.isSelected())
//            {
//                botonGrupEquipoCarretera  = (true);
//            }else if(jrbEquipoCarreteraN.isSelected()){
//                botonGrupEquipoCarretera = (false);
//            }
//        boolean botonGrupExtintor = true;
//            if(jrbExtintorS.isSelected())
//            {
//                botonGrupExtintor  = (true);
//            }else if(jrbExtintorN.isSelected()){
//                botonGrupExtintor = (false);
//            }
//        boolean botonGrupFechaVenExtintor = true;
//            if(jrbFechaVenExtintorS.isSelected())
//            {
//                botonGrupFechaVenExtintor  = (true);
//            }else if(jrbFechaVenExtintorN.isSelected()){
//                botonGrupFechaVenExtintor = (false);
//            } 
//          
//        boolean botonGrupLlantasRepuesto = true;
//            if(jrbLlantasRepuestoS.isSelected())
//            {
//                botonGrupLlantasRepuesto = (true);
//            }else if(jrbLlantasRepuestoN.isSelected()){
//                botonGrupLlantasRepuesto = (false);
//            }
//        boolean botonGrupCruceta = true;
//            if(jrbCrucetaS.isSelected())
//            {
//                botonGrupCruceta = (true);
//            }else if(jrbCrucetaN.isSelected()){
//                botonGrupCruceta = (false);
//            }
//        boolean botonGrupSenalesReflectivas = true;
//            if(jrbSenalesReflectivasS.isSelected())
//            {
//                botonGrupSenalesReflectivas = (true);
//            }else if(jrbSenalesReflectivasN.isSelected()){
//                botonGrupSenalesReflectivas = (false);
//            }
//        boolean botonGrupCajaHerramientas = true;
//            if(jrbCajaHerramientasS.isSelected())
//            {
//                botonGrupCajaHerramientas = (true);
//            }else if(jrbCajaHerramientasN.isSelected()){
//                botonGrupCajaHerramientas = (false);
//            }
//        boolean botonGrupLinterna = true;
//            if(jrbLinternaS.isSelected())
//            {
//                botonGrupLinterna = (true);
//            }else if(jrbLinternaN.isSelected()){
//                botonGrupLinterna = (false);
//            }
//        boolean botonGrupGato = true;
//            if(jrbGatoS.isSelected())
//            {
//                botonGrupGato = (true);
//            }else if(jrbGatoN.isSelected()){
//                botonGrupGato = (false);
//            }
//        boolean botonGrupBotiquin = true;
//            if(jrbBotiquinS.isSelected())
//            {
//                botonGrupBotiquin = (true);
//            }else if(jrbBotiquinN.isSelected()){
//                botonGrupBotiquin = (false);
//            }
//        boolean botonGrupLlantas = true;
//            if(jrbLlantasS.isSelected())
//            {
//                botonGrupLlantas = (true);
//            }else if(jrbLlantasN.isSelected()){
//                botonGrupLlantas = (false);
//            }
//        boolean botonGrupBateria = true;
//            if(jrbBateriaS.isSelected())
//            {
//                botonGrupBateria = (true);
//            }else if(jrbBateriaN.isSelected()){
//                botonGrupBateria = (false);
//            }
//        boolean botonGrupRines = true;
//            if(jrbRinesS.isSelected())
//            {
//                botonGrupRines = (true);
//            }else if(jrbRinesN.isSelected()){
//                botonGrupRines = (false);
//            }
//        boolean botonGrupCinturonSeguridad = true;
//            if(jrbCinturonSeguridadS.isSelected())
//            {
//                botonGrupCinturonSeguridad = (true);
//            }else if(jrbCinturonSeguridadN.isSelected()){
//                botonGrupCinturonSeguridad = (false);
//            }
//        boolean botonGrupPitoReversa = true;
//            if(jrbPitoReversaS.isSelected())
//            {
//                botonGrupPitoReversa = (true);
//            }else if(jrbPitoReversaN.isSelected()){
//                botonGrupPitoReversa= (false);
//            }
//        boolean botonGrupPito = true;
//            if(jrbPitoS.isSelected())
//            {
//                botonGrupPito = (true);
//            }else if(jrbPitoN.isSelected()){
//                botonGrupPito= (false);
//            }
//        boolean botonGrupFrenoEmergencia = true;
//            if(jrbFrenoEmergenciaS.isSelected())
//            {
//                botonGrupFrenoEmergencia = (true);
//            }else if(jrbFrenoEmergenciaN.isSelected()){
//                botonGrupFrenoEmergencia= (false);
//            }
//        boolean botonGrupEspejos = true;
//            if(jrbEspejosS.isSelected())
//            {
//                botonGrupEspejos = (true);
//            }else if(jrbEspejosN.isSelected()){
//                botonGrupEspejos = (false);
//            }
//        boolean botonGrupCarcasaLuces = true;
//            if(jrbCarcasaLucesS.isSelected())
//            {
//                botonGrupCarcasaLuces = (true);
//            }else if(jrbCarcasaLucesN.isSelected()){
//                botonGrupCarcasaLuces = (false);
//            }
//        boolean botonGrupLimpiaParabrisas = true;
//            if(jrbLimpiaParabrisasS.isSelected())
//            {
//                botonGrupLimpiaParabrisas = (true);
//            }else if(jrbLimpiaParabrisasN.isSelected()){
//                botonGrupLimpiaParabrisas = (false);
//            }
//        boolean botonGrupTapizado = true;
//            if(jrbTapizadoS.isSelected())
//            {
//                botonGrupTapizado = (true);
//            }else if(jrbTapizadoN.isSelected()){
//                botonGrupTapizado = (false);
//            }
//        boolean botonGrupPanoramico = true;
//            if(jrbPanoramicoS.isSelected())
//            {
//                botonGrupPanoramico = (true);
//            }else if(jrbPanoramicoN.isSelected()){
//                botonGrupPanoramico = (false);
//            }
           
//        Diagnostico diagnostico = new Diagnostico(txtPlacaVehiculo.getText(),
//                jCalenderFechaInspeccion.getDateFormatString(),
//                jCalenderFechaVenSOAT.getDateFormatString(), 
//                jCalenderFechaManPreventivo.getDateFormatString(),
//                jCalenderFechaUltimoCambioAce.getDateFormatString(),
//                Integer.parseInt(txtKilometrajeActual.getText().toString()),
//                botonGrupLiquidoRef,
//                botonGrupLiquidoFrenos,
//                botonGrupAceiteMotor,
//                botonGrupLiquidoHidraulico,
//                botonGrupAguaVidrios,
//                botonGrupAcelerador,
//                botonGrupClutch,
//                botonGrupFreno,
//                botonGrupLuces,
//                botonGrupLucesDireccionales,
//                botonGrupLucesEstacionarias,
//                botonGrupStop,
//                botonGrupTestigoTablero,
//                botonGrupLucesReversa,
//                botonGrupLucesInternas,
//                botonGrupEquipoCarretera,
//                botonGrupExtintor,
//                //botonGrupFechaVenExtintor,
//                botonGrupLlantasRepuesto,
//                botonGrupCruceta,
//                botonGrupSenalesReflectivas,
//                botonGrupCajaHerramientas,
//                botonGrupLinterna,
//                botonGrupGato,
//                botonGrupBotiquin,
//                botonGrupLlantas,
//                botonGrupBateria,
//                botonGrupRines,
//                botonGrupCinturonSeguridad,
//                botonGrupPitoReversa,
//                botonGrupPito,
//                botonGrupFrenoEmergencia,
//                botonGrupEspejos,
//                botonGrupCarcasaLuces,
//                botonGrupLimpiaParabrisas,
//                botonGrupTapizado,
//                botonGrupPanoramico,
//                jtaDescripcion.getText());
//        diagnosticoServicio.guardar(diagnostico);
//        
//        diagnosticoServicio.encontrarDiagnostico(5);
//    }

        
                
//                txtPlacaAutomovil.getText(), usuario.getTipoId(), usuario.getIdUsuario(), cmbTipoServicio.getSelectedItem().toString(),
//                txtMarca.getText(), txtLinea.getText(), txtColor.getText(), Integer.parseInt(txtModelo.getText()),
//                Integer.parseInt(txtCupoPersonas.getText()), convertirStringBoolean(cmbUtilitario.getSelectedItem().toString()), convertirStringBoolean(cmbBlindado.getSelectedItem().toString()),
//                Double.parseDouble(txtPrecio.getText()), manejoImagen.guardarImagenVehiculo(rutaImagen), manejoImagen.convertirImagenaByte(rutaImagen), txtDescripcion.getText(), manejoPDF.convertirPDFaByte(rutaPDF));
//        vehiculoServicio.guardar(automovil);
//    }
    
    
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private com.toedter.calendar.JDateChooser jCalenderFechaInspeccion;
    private com.toedter.calendar.JDateChooser jCalenderFechaManPreventivo;
    private com.toedter.calendar.JDateChooser jCalenderFechaUltimoCambioAce;
    private com.toedter.calendar.JDateChooser jCalenderFechaVenExtintor;
    private com.toedter.calendar.JDateChooser jCalenderFechaVenSOAT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JLabel jLabel52;
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
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
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
    private javax.swing.JTextArea jtaDescripcion;
    private javax.swing.JTextField txtKilometrajeActual;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
