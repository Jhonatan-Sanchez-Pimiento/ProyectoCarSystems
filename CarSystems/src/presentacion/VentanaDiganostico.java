
package presentacion;

import dominio.Diagnostico;
import java.awt.HeadlessException;
import java.awt.Toolkit;
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
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        btnLimpiar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        txtFechaInspeccion = new javax.swing.JTextField();
        txtFechaVenSOAT = new javax.swing.JTextField();
        txtFechaUltimoMantenimiento = new javax.swing.JTextField();
        txtFechaUltimoCambioAce = new javax.swing.JTextField();
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
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Placa del vehiculo:");

        jLabel6.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Fecha de vencimiento del SOAT:");

        jLabel7.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Fecha del último mantenimiento:");

        jLabel10.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Fecha de inspección :");

        jLabel13.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Fecha del último cambio de aceite:");

        jLabel14.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Kilometraje actual :");

        txtPlacaVehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlacaVehiculoKeyTyped(evt);
            }
        });

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
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel28.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(240, 240, 240));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Acelerador :");

        jLabel29.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(240, 240, 240));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Clutch :");
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
        jLabel35.setText("Luces :");

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
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("Bateria :");

        jLabel42.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(240, 240, 240));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("Rines :");

        jLabel43.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(240, 240, 240));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Pito:");

        jLabel44.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(240, 240, 240));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel44.setText("Freno de emergencia:");

        jLabel45.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(240, 240, 240));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel45.setText("Cinturón de seguridad:");

        jLabel46.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(240, 240, 240));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Pito de reversa:");

        jLabel47.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(240, 240, 240));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Espejos :");

        jLabel48.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(240, 240, 240));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel48.setText("Carcasa de luces :");

        jLabel49.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(240, 240, 240));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel49.setText("Tapizado:");

        jLabel50.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(240, 240, 240));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel50.setText("Limpia parabrisas :");

        jLabel51.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(240, 240, 240));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Panorámica:");

        jLabel53.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(240, 240, 240));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Extintor:");

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

        jLabel61.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(240, 240, 240));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel61.setText("Botiquin:");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Liquido refrigerante :");

        jLabel20.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Mal estado");

        jrbLiquidoRefriS.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoRefrigerante.add(jrbLiquidoRefriS);
        jrbLiquidoRefriS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jrbLiquidoRefriS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoRefriS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriS.setRequestFocusEnabled(false);
        jrbLiquidoRefriS.setRolloverEnabled(false);
        jrbLiquidoRefriS.setVerifyInputWhenFocusTarget(false);

        jrbLiquidoRefriN.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoRefrigerante.add(jrbLiquidoRefriN);
        jrbLiquidoRefriN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoRefriN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoRefriN.setRequestFocusEnabled(false);
        jrbLiquidoRefriN.setRolloverEnabled(false);
        jrbLiquidoRefriN.setVerifyInputWhenFocusTarget(false);

        jrbAceiteMotorS.setBackground(new java.awt.Color(30, 41, 57));
        baAceiteMotor.add(jrbAceiteMotorS);
        jrbAceiteMotorS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAceiteMotorS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorS.setRequestFocusEnabled(false);
        jrbAceiteMotorS.setRolloverEnabled(false);
        jrbAceiteMotorS.setVerifyInputWhenFocusTarget(false);

        jrbAceiteMotorN.setBackground(new java.awt.Color(30, 41, 57));
        baAceiteMotor.add(jrbAceiteMotorN);
        jrbAceiteMotorN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAceiteMotorN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAceiteMotorN.setRequestFocusEnabled(false);
        jrbAceiteMotorN.setRolloverEnabled(false);
        jrbAceiteMotorN.setVerifyInputWhenFocusTarget(false);

        jrbLiquidoFrenosS.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoFrenos.add(jrbLiquidoFrenosS);
        jrbLiquidoFrenosS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoFrenosS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosS.setRequestFocusEnabled(false);
        jrbLiquidoFrenosS.setRolloverEnabled(false);
        jrbLiquidoFrenosS.setVerifyInputWhenFocusTarget(false);

        jrbLiquidoFrenosN.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoFrenos.add(jrbLiquidoFrenosN);
        jrbLiquidoFrenosN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoFrenosN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoFrenosN.setRequestFocusEnabled(false);
        jrbLiquidoFrenosN.setRolloverEnabled(false);
        jrbLiquidoFrenosN.setVerifyInputWhenFocusTarget(false);

        jrbLiquidoHidraulicoN.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoHidraulico.add(jrbLiquidoHidraulicoN);
        jrbLiquidoHidraulicoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoHidraulicoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoN.setRequestFocusEnabled(false);
        jrbLiquidoHidraulicoN.setRolloverEnabled(false);

        jrbLiquidoHidraulicoS.setBackground(new java.awt.Color(30, 41, 57));
        baLiquidoHidraulico.add(jrbLiquidoHidraulicoS);
        jrbLiquidoHidraulicoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLiquidoHidraulicoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLiquidoHidraulicoS.setRequestFocusEnabled(false);
        jrbLiquidoHidraulicoS.setRolloverEnabled(false);

        jrbAguaVidriosS.setBackground(new java.awt.Color(30, 41, 57));
        baAguaVidrios.add(jrbAguaVidriosS);
        jrbAguaVidriosS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAguaVidriosS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosS.setRequestFocusEnabled(false);
        jrbAguaVidriosS.setRolloverEnabled(false);

        jrbAguaVidriosN.setBackground(new java.awt.Color(30, 41, 57));
        baAguaVidrios.add(jrbAguaVidriosN);
        jrbAguaVidriosN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAguaVidriosN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAguaVidriosN.setRequestFocusEnabled(false);
        jrbAguaVidriosN.setRolloverEnabled(false);

        jrbAceleradorS.setBackground(new java.awt.Color(30, 41, 57));
        baAcelerador.add(jrbAceleradorS);
        jrbAceleradorS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAceleradorS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAceleradorS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAceleradorS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAceleradorS.setRequestFocusEnabled(false);
        jrbAceleradorS.setRolloverEnabled(false);
        jrbAceleradorS.setVerifyInputWhenFocusTarget(false);

        jrbAceleradorN.setBackground(new java.awt.Color(30, 41, 57));
        baAcelerador.add(jrbAceleradorN);
        jrbAceleradorN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbAceleradorN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbAceleradorN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbAceleradorN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbAceleradorN.setRequestFocusEnabled(false);
        jrbAceleradorN.setRolloverEnabled(false);
        jrbAceleradorN.setVerifyInputWhenFocusTarget(false);

        jLabel21.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Buen estado");

        jLabel62.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(240, 240, 240));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Mal estado");

        jrbClutchS.setBackground(new java.awt.Color(30, 41, 57));
        baClutch.add(jrbClutchS);
        jrbClutchS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbClutchS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbClutchS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbClutchS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbClutchS.setRequestFocusEnabled(false);
        jrbClutchS.setRolloverEnabled(false);
        jrbClutchS.setVerifyInputWhenFocusTarget(false);

        jrbClutchN.setBackground(new java.awt.Color(30, 41, 57));
        baClutch.add(jrbClutchN);
        jrbClutchN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbClutchN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbClutchN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbClutchN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbClutchN.setRequestFocusEnabled(false);
        jrbClutchN.setRolloverEnabled(false);
        jrbClutchN.setVerifyInputWhenFocusTarget(false);

        jrbFrenoS.setBackground(new java.awt.Color(30, 41, 57));
        baFreno.add(jrbFrenoS);
        jrbFrenoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbFrenoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbFrenoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbFrenoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbFrenoS.setRequestFocusEnabled(false);
        jrbFrenoS.setRolloverEnabled(false);
        jrbFrenoS.setVerifyInputWhenFocusTarget(false);

        jrbFrenoN.setBackground(new java.awt.Color(30, 41, 57));
        baFreno.add(jrbFrenoN);
        jrbFrenoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbFrenoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbFrenoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbFrenoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbFrenoN.setRequestFocusEnabled(false);
        jrbFrenoN.setRolloverEnabled(false);
        jrbFrenoN.setVerifyInputWhenFocusTarget(false);

        jLabel63.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(240, 240, 240));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Buen estado");

        jLabel64.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(240, 240, 240));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Mal estado");

        jrbLucesS.setBackground(new java.awt.Color(30, 41, 57));
        baLuces.add(jrbLucesS);
        jrbLucesS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesS.setRequestFocusEnabled(false);
        jrbLucesS.setRolloverEnabled(false);
        jrbLucesS.setVerifyInputWhenFocusTarget(false);

        jrbLucesN.setBackground(new java.awt.Color(30, 41, 57));
        baLuces.add(jrbLucesN);
        jrbLucesN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesN.setRequestFocusEnabled(false);
        jrbLucesN.setRolloverEnabled(false);
        jrbLucesN.setVerifyInputWhenFocusTarget(false);

        jrbLucesDireccionalesS.setBackground(new java.awt.Color(30, 41, 57));
        baLucesDireccionales.add(jrbLucesDireccionalesS);
        jrbLucesDireccionalesS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesDireccionalesS.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jrbLucesDireccionalesS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesS.setRequestFocusEnabled(false);
        jrbLucesDireccionalesS.setRolloverEnabled(false);
        jrbLucesDireccionalesS.setVerifyInputWhenFocusTarget(false);

        jrbLucesDireccionalesN.setBackground(new java.awt.Color(30, 41, 57));
        baLucesDireccionales.add(jrbLucesDireccionalesN);
        jrbLucesDireccionalesN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesDireccionalesN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesDireccionalesN.setRequestFocusEnabled(false);
        jrbLucesDireccionalesN.setRolloverEnabled(false);
        jrbLucesDireccionalesN.setVerifyInputWhenFocusTarget(false);

        jrbLucesEstacionariasS.setBackground(new java.awt.Color(30, 41, 57));
        baLucesEstacionarias.add(jrbLucesEstacionariasS);
        jrbLucesEstacionariasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesEstacionariasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasS.setRequestFocusEnabled(false);
        jrbLucesEstacionariasS.setRolloverEnabled(false);
        jrbLucesEstacionariasS.setVerifyInputWhenFocusTarget(false);

        jrbLucesEstacionariasN.setBackground(new java.awt.Color(30, 41, 57));
        baLucesEstacionarias.add(jrbLucesEstacionariasN);
        jrbLucesEstacionariasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesEstacionariasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesEstacionariasN.setRequestFocusEnabled(false);
        jrbLucesEstacionariasN.setRolloverEnabled(false);
        jrbLucesEstacionariasN.setVerifyInputWhenFocusTarget(false);

        jrbStopS.setBackground(new java.awt.Color(30, 41, 57));
        baStop.add(jrbStopS);
        jrbStopS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbStopS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbStopS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbStopS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbStopS.setRequestFocusEnabled(false);
        jrbStopS.setRolloverEnabled(false);
        jrbStopS.setVerifyInputWhenFocusTarget(false);

        jrbStopN.setBackground(new java.awt.Color(30, 41, 57));
        baStop.add(jrbStopN);
        jrbStopN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbStopN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbStopN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbStopN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbStopN.setRequestFocusEnabled(false);
        jrbStopN.setRolloverEnabled(false);
        jrbStopN.setVerifyInputWhenFocusTarget(false);

        jrbTestigoTableroS.setBackground(new java.awt.Color(30, 41, 57));
        baTestigoTablero.add(jrbTestigoTableroS);
        jrbTestigoTableroS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbTestigoTableroS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroS.setRequestFocusEnabled(false);
        jrbTestigoTableroS.setRolloverEnabled(false);
        jrbTestigoTableroS.setVerifyInputWhenFocusTarget(false);

        jrbTestigoTableroN.setBackground(new java.awt.Color(30, 41, 57));
        baTestigoTablero.add(jrbTestigoTableroN);
        jrbTestigoTableroN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbTestigoTableroN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbTestigoTableroN.setRequestFocusEnabled(false);
        jrbTestigoTableroN.setRolloverEnabled(false);
        jrbTestigoTableroN.setVerifyInputWhenFocusTarget(false);

        jrbLucesReversaS.setBackground(new java.awt.Color(30, 41, 57));
        baLucesReversa.add(jrbLucesReversaS);
        jrbLucesReversaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesReversaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaS.setRequestFocusEnabled(false);
        jrbLucesReversaS.setRolloverEnabled(false);
        jrbLucesReversaS.setVerifyInputWhenFocusTarget(false);

        jrbLucesReversaN.setBackground(new java.awt.Color(30, 41, 57));
        baLucesReversa.add(jrbLucesReversaN);
        jrbLucesReversaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesReversaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesReversaN.setRequestFocusEnabled(false);
        jrbLucesReversaN.setRolloverEnabled(false);
        jrbLucesReversaN.setVerifyInputWhenFocusTarget(false);

        jrbLucesInternasS.setBackground(new java.awt.Color(30, 41, 57));
        baLucesInternas.add(jrbLucesInternasS);
        jrbLucesInternasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesInternasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasS.setRequestFocusEnabled(false);
        jrbLucesInternasS.setRolloverEnabled(false);
        jrbLucesInternasS.setVerifyInputWhenFocusTarget(false);

        jrbLucesInternasN.setBackground(new java.awt.Color(30, 41, 57));
        baLucesInternas.add(jrbLucesInternasN);
        jrbLucesInternasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLucesInternasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLucesInternasN.setRequestFocusEnabled(false);
        jrbLucesInternasN.setRolloverEnabled(false);
        jrbLucesInternasN.setVerifyInputWhenFocusTarget(false);

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
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel67.setText("Equipo Carretera:");

        jLabel68.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(240, 240, 240));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Buen estado");

        jLabel69.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(240, 240, 240));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Mal estado");

        jrbEquipoCarreteraS.setBackground(new java.awt.Color(30, 41, 57));
        baEquipoCarretera.add(jrbEquipoCarreteraS);
        jrbEquipoCarreteraS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbEquipoCarreteraS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraS.setRequestFocusEnabled(false);
        jrbEquipoCarreteraS.setRolloverEnabled(false);
        jrbEquipoCarreteraS.setVerifyInputWhenFocusTarget(false);

        jrbEquipoCarreteraN.setBackground(new java.awt.Color(30, 41, 57));
        baEquipoCarretera.add(jrbEquipoCarreteraN);
        jrbEquipoCarreteraN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbEquipoCarreteraN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbEquipoCarreteraN.setRequestFocusEnabled(false);
        jrbEquipoCarreteraN.setRolloverEnabled(false);
        jrbEquipoCarreteraN.setVerifyInputWhenFocusTarget(false);

        jrbExtintorS.setBackground(new java.awt.Color(30, 41, 57));
        baExtintor.add(jrbExtintorS);
        jrbExtintorS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbExtintorS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbExtintorS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbExtintorS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbExtintorS.setRequestFocusEnabled(false);
        jrbExtintorS.setRolloverEnabled(false);
        jrbExtintorS.setVerifyInputWhenFocusTarget(false);

        jrbExtintorN.setBackground(new java.awt.Color(30, 41, 57));
        baExtintor.add(jrbExtintorN);
        jrbExtintorN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbExtintorN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbExtintorN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbExtintorN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbExtintorN.setRequestFocusEnabled(false);
        jrbExtintorN.setRolloverEnabled(false);
        jrbExtintorN.setVerifyInputWhenFocusTarget(false);

        jrbLlantasRepuestoS.setBackground(new java.awt.Color(30, 41, 57));
        baLlantasRepuesto.add(jrbLlantasRepuestoS);
        jrbLlantasRepuestoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLlantasRepuestoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoS.setRequestFocusEnabled(false);
        jrbLlantasRepuestoS.setRolloverEnabled(false);
        jrbLlantasRepuestoS.setVerifyInputWhenFocusTarget(false);

        jrbLlantasRepuestoN.setBackground(new java.awt.Color(30, 41, 57));
        baLlantasRepuesto.add(jrbLlantasRepuestoN);
        jrbLlantasRepuestoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLlantasRepuestoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLlantasRepuestoN.setRequestFocusEnabled(false);
        jrbLlantasRepuestoN.setRolloverEnabled(false);
        jrbLlantasRepuestoN.setVerifyInputWhenFocusTarget(false);

        jrbCrucetaS.setBackground(new java.awt.Color(30, 41, 57));
        baCruceta.add(jrbCrucetaS);
        jrbCrucetaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCrucetaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCrucetaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCrucetaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCrucetaS.setRequestFocusEnabled(false);
        jrbCrucetaS.setRolloverEnabled(false);
        jrbCrucetaS.setVerifyInputWhenFocusTarget(false);

        jrbCrucetaN.setBackground(new java.awt.Color(30, 41, 57));
        baCruceta.add(jrbCrucetaN);
        jrbCrucetaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCrucetaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCrucetaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCrucetaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCrucetaN.setRequestFocusEnabled(false);
        jrbCrucetaN.setRolloverEnabled(false);
        jrbCrucetaN.setVerifyInputWhenFocusTarget(false);

        jrbSenalesReflectivasS.setBackground(new java.awt.Color(30, 41, 57));
        baSenalesReflectivas.add(jrbSenalesReflectivasS);
        jrbSenalesReflectivasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbSenalesReflectivasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasS.setRequestFocusEnabled(false);
        jrbSenalesReflectivasS.setRolloverEnabled(false);
        jrbSenalesReflectivasS.setVerifyInputWhenFocusTarget(false);

        jrbSenalesReflectivasN.setBackground(new java.awt.Color(30, 41, 57));
        baSenalesReflectivas.add(jrbSenalesReflectivasN);
        jrbSenalesReflectivasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbSenalesReflectivasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbSenalesReflectivasN.setRequestFocusEnabled(false);
        jrbSenalesReflectivasN.setRolloverEnabled(false);
        jrbSenalesReflectivasN.setVerifyInputWhenFocusTarget(false);

        jrbCajaHerramientasN.setBackground(new java.awt.Color(30, 41, 57));
        baCajaHerramientas.add(jrbCajaHerramientasN);
        jrbCajaHerramientasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCajaHerramientasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasN.setRequestFocusEnabled(false);
        jrbCajaHerramientasN.setRolloverEnabled(false);
        jrbCajaHerramientasN.setVerifyInputWhenFocusTarget(false);

        jrbCajaHerramientasS.setBackground(new java.awt.Color(30, 41, 57));
        baCajaHerramientas.add(jrbCajaHerramientasS);
        jrbCajaHerramientasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCajaHerramientasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCajaHerramientasS.setRequestFocusEnabled(false);
        jrbCajaHerramientasS.setRolloverEnabled(false);
        jrbCajaHerramientasS.setVerifyInputWhenFocusTarget(false);

        jrbLinternaS.setBackground(new java.awt.Color(30, 41, 57));
        baLinterna.add(jrbLinternaS);
        jrbLinternaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLinternaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLinternaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLinternaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLinternaS.setRequestFocusEnabled(false);
        jrbLinternaS.setRolloverEnabled(false);
        jrbLinternaS.setVerifyInputWhenFocusTarget(false);

        jrbLinternaN.setBackground(new java.awt.Color(30, 41, 57));
        baLinterna.add(jrbLinternaN);
        jrbLinternaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLinternaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLinternaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLinternaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLinternaN.setRequestFocusEnabled(false);
        jrbLinternaN.setRolloverEnabled(false);
        jrbLinternaN.setVerifyInputWhenFocusTarget(false);

        jrbGatoS.setBackground(new java.awt.Color(30, 41, 57));
        baGato.add(jrbGatoS);
        jrbGatoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbGatoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbGatoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbGatoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbGatoS.setRequestFocusEnabled(false);
        jrbGatoS.setRolloverEnabled(false);
        jrbGatoS.setVerifyInputWhenFocusTarget(false);

        jrbGatoN.setBackground(new java.awt.Color(30, 41, 57));
        baGato.add(jrbGatoN);
        jrbGatoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbGatoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbGatoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbGatoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbGatoN.setRequestFocusEnabled(false);
        jrbGatoN.setRolloverEnabled(false);
        jrbGatoN.setVerifyInputWhenFocusTarget(false);

        jrbBotiquinS.setBackground(new java.awt.Color(30, 41, 57));
        baBotiquin.add(jrbBotiquinS);
        jrbBotiquinS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbBotiquinS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbBotiquinS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbBotiquinS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbBotiquinS.setRequestFocusEnabled(false);
        jrbBotiquinS.setRolloverEnabled(false);
        jrbBotiquinS.setVerifyInputWhenFocusTarget(false);

        jrbLlantasS.setBackground(new java.awt.Color(30, 41, 57));
        baLlantas.add(jrbLlantasS);
        jrbLlantasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLlantasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLlantasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLlantasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLlantasS.setRequestFocusEnabled(false);
        jrbLlantasS.setRolloverEnabled(false);
        jrbLlantasS.setVerifyInputWhenFocusTarget(false);

        jrbBotiquinN.setBackground(new java.awt.Color(30, 41, 57));
        baBotiquin.add(jrbBotiquinN);
        jrbBotiquinN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbBotiquinN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbBotiquinN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbBotiquinN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbBotiquinN.setRequestFocusEnabled(false);
        jrbBotiquinN.setRolloverEnabled(false);
        jrbBotiquinN.setVerifyInputWhenFocusTarget(false);

        jrbLlantasN.setBackground(new java.awt.Color(30, 41, 57));
        baLlantas.add(jrbLlantasN);
        jrbLlantasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLlantasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLlantasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLlantasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLlantasN.setRequestFocusEnabled(false);
        jrbLlantasN.setRolloverEnabled(false);
        jrbLlantasN.setVerifyInputWhenFocusTarget(false);

        jrbBateriaS.setBackground(new java.awt.Color(30, 41, 57));
        baBateria.add(jrbBateriaS);
        jrbBateriaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbBateriaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbBateriaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbBateriaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbBateriaS.setRequestFocusEnabled(false);
        jrbBateriaS.setRolloverEnabled(false);
        jrbBateriaS.setVerifyInputWhenFocusTarget(false);

        jrbBateriaN.setBackground(new java.awt.Color(30, 41, 57));
        baBateria.add(jrbBateriaN);
        jrbBateriaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbBateriaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbBateriaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbBateriaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbBateriaN.setRequestFocusEnabled(false);
        jrbBateriaN.setRolloverEnabled(false);
        jrbBateriaN.setVerifyInputWhenFocusTarget(false);

        jrbRinesS.setBackground(new java.awt.Color(30, 41, 57));
        baRines.add(jrbRinesS);
        jrbRinesS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbRinesS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbRinesS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbRinesS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbRinesS.setRequestFocusEnabled(false);
        jrbRinesS.setRolloverEnabled(false);
        jrbRinesS.setVerifyInputWhenFocusTarget(false);

        jrbRinesN.setBackground(new java.awt.Color(30, 41, 57));
        baRines.add(jrbRinesN);
        jrbRinesN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbRinesN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbRinesN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbRinesN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbRinesN.setRequestFocusEnabled(false);
        jrbRinesN.setRolloverEnabled(false);
        jrbRinesN.setVerifyInputWhenFocusTarget(false);

        jrbCinturonSeguridadS.setBackground(new java.awt.Color(30, 41, 57));
        baCinturonSeguridad.add(jrbCinturonSeguridadS);
        jrbCinturonSeguridadS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCinturonSeguridadS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadS.setRequestFocusEnabled(false);
        jrbCinturonSeguridadS.setRolloverEnabled(false);
        jrbCinturonSeguridadS.setVerifyInputWhenFocusTarget(false);

        jrbCinturonSeguridadN.setBackground(new java.awt.Color(30, 41, 57));
        baCinturonSeguridad.add(jrbCinturonSeguridadN);
        jrbCinturonSeguridadN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCinturonSeguridadN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCinturonSeguridadN.setRequestFocusEnabled(false);
        jrbCinturonSeguridadN.setRolloverEnabled(false);
        jrbCinturonSeguridadN.setVerifyInputWhenFocusTarget(false);

        jrbPitoReversaS.setBackground(new java.awt.Color(30, 41, 57));
        baPitoReversa.add(jrbPitoReversaS);
        jrbPitoReversaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPitoReversaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaS.setRequestFocusEnabled(false);
        jrbPitoReversaS.setRolloverEnabled(false);
        jrbPitoReversaS.setVerifyInputWhenFocusTarget(false);

        jrbPitoReversaN.setBackground(new java.awt.Color(30, 41, 57));
        baPitoReversa.add(jrbPitoReversaN);
        jrbPitoReversaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPitoReversaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPitoReversaN.setRequestFocusEnabled(false);
        jrbPitoReversaN.setRolloverEnabled(false);
        jrbPitoReversaN.setVerifyInputWhenFocusTarget(false);

        jrbPitoS.setBackground(new java.awt.Color(30, 41, 57));
        baPito.add(jrbPitoS);
        jrbPitoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPitoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPitoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPitoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPitoS.setRequestFocusEnabled(false);
        jrbPitoS.setRolloverEnabled(false);
        jrbPitoS.setVerifyInputWhenFocusTarget(false);

        jrbPitoN.setBackground(new java.awt.Color(30, 41, 57));
        baPito.add(jrbPitoN);
        jrbPitoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPitoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPitoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPitoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPitoN.setRequestFocusEnabled(false);
        jrbPitoN.setRolloverEnabled(false);
        jrbPitoN.setVerifyInputWhenFocusTarget(false);

        jrbFrenoEmergenciaS.setBackground(new java.awt.Color(30, 41, 57));
        baFrenoEmergencia.add(jrbFrenoEmergenciaS);
        jrbFrenoEmergenciaS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbFrenoEmergenciaS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaS.setRequestFocusEnabled(false);
        jrbFrenoEmergenciaS.setRolloverEnabled(false);
        jrbFrenoEmergenciaS.setVerifyInputWhenFocusTarget(false);

        jrbFrenoEmergenciaN.setBackground(new java.awt.Color(30, 41, 57));
        baFrenoEmergencia.add(jrbFrenoEmergenciaN);
        jrbFrenoEmergenciaN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbFrenoEmergenciaN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbFrenoEmergenciaN.setRequestFocusEnabled(false);
        jrbFrenoEmergenciaN.setRolloverEnabled(false);
        jrbFrenoEmergenciaN.setVerifyInputWhenFocusTarget(false);

        jrbEspejosS.setBackground(new java.awt.Color(30, 41, 57));
        baEspejos.add(jrbEspejosS);
        jrbEspejosS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbEspejosS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbEspejosS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbEspejosS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbEspejosS.setRequestFocusEnabled(false);
        jrbEspejosS.setRolloverEnabled(false);
        jrbEspejosS.setVerifyInputWhenFocusTarget(false);

        jrbEspejosN.setBackground(new java.awt.Color(30, 41, 57));
        baEspejos.add(jrbEspejosN);
        jrbEspejosN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbEspejosN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbEspejosN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbEspejosN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbEspejosN.setRequestFocusEnabled(false);
        jrbEspejosN.setRolloverEnabled(false);
        jrbEspejosN.setVerifyInputWhenFocusTarget(false);

        jrbCarcasaLucesS.setBackground(new java.awt.Color(30, 41, 57));
        baCarcasaLuces.add(jrbCarcasaLucesS);
        jrbCarcasaLucesS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCarcasaLucesS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesS.setRequestFocusEnabled(false);
        jrbCarcasaLucesS.setRolloverEnabled(false);
        jrbCarcasaLucesS.setVerifyInputWhenFocusTarget(false);

        jrbCarcasaLucesN.setBackground(new java.awt.Color(30, 41, 57));
        baCarcasaLuces.add(jrbCarcasaLucesN);
        jrbCarcasaLucesN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbCarcasaLucesN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbCarcasaLucesN.setRequestFocusEnabled(false);
        jrbCarcasaLucesN.setRolloverEnabled(false);
        jrbCarcasaLucesN.setVerifyInputWhenFocusTarget(false);

        jrbLimpiaParabrisasS.setBackground(new java.awt.Color(30, 41, 57));
        baLimpiaParabrisas.add(jrbLimpiaParabrisasS);
        jrbLimpiaParabrisasS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLimpiaParabrisasS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasS.setRequestFocusEnabled(false);
        jrbLimpiaParabrisasS.setRolloverEnabled(false);
        jrbLimpiaParabrisasS.setVerifyInputWhenFocusTarget(false);

        jrbLimpiaParabrisasN.setBackground(new java.awt.Color(30, 41, 57));
        baLimpiaParabrisas.add(jrbLimpiaParabrisasN);
        jrbLimpiaParabrisasN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbLimpiaParabrisasN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbLimpiaParabrisasN.setRequestFocusEnabled(false);
        jrbLimpiaParabrisasN.setRolloverEnabled(false);
        jrbLimpiaParabrisasN.setVerifyInputWhenFocusTarget(false);

        jrbTapizadoS.setBackground(new java.awt.Color(30, 41, 57));
        baTapizado.add(jrbTapizadoS);
        jrbTapizadoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbTapizadoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbTapizadoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbTapizadoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbTapizadoS.setRequestFocusEnabled(false);
        jrbTapizadoS.setRolloverEnabled(false);
        jrbTapizadoS.setVerifyInputWhenFocusTarget(false);

        jrbTapizadoN.setBackground(new java.awt.Color(30, 41, 57));
        baTapizado.add(jrbTapizadoN);
        jrbTapizadoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbTapizadoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbTapizadoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbTapizadoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbTapizadoN.setRequestFocusEnabled(false);
        jrbTapizadoN.setRolloverEnabled(false);
        jrbTapizadoN.setVerifyInputWhenFocusTarget(false);

        jrbPanoramicoS.setBackground(new java.awt.Color(30, 41, 57));
        baPanoramico.add(jrbPanoramicoS);
        jrbPanoramicoS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPanoramicoS.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoS.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoS.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoS.setRequestFocusEnabled(false);
        jrbPanoramicoS.setRolloverEnabled(false);
        jrbPanoramicoS.setVerifyInputWhenFocusTarget(false);

        jrbPanoramicoN.setBackground(new java.awt.Color(30, 41, 57));
        baPanoramico.add(jrbPanoramicoN);
        jrbPanoramicoN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jrbPanoramicoN.setMaximumSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoN.setMinimumSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoN.setPreferredSize(new java.awt.Dimension(30, 30));
        jrbPanoramicoN.setRequestFocusEnabled(false);
        jrbPanoramicoN.setRolloverEnabled(false);
        jrbPanoramicoN.setVerifyInputWhenFocusTarget(false);

        jtaDescripcion.setColumns(20);
        jtaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jtaDescripcion);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(240, 240, 240));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Buen estado");

        jLabel52.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(240, 240, 240));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("Mal estado");

        jLabel70.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(240, 240, 240));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Buen estado");

        jLabel71.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(240, 240, 240));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("Mal estado");

        jLabel72.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(240, 240, 240));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("Buen estado");

        jLabel73.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(240, 240, 240));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Mal estado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(239, 239, 239)
                .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(231, 231, 231))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(60, 60, 60)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbFrenoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbAceleradorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbAceleradorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbFrenoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(70, 70, 70)
                                        .addComponent(jrbClutchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jrbClutchN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbLiquidoRefriS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoFrenosS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbAceiteMotorS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(81, 81, 81)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbLiquidoRefriN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbAceiteMotorN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbLiquidoFrenosN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbAguaVidriosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrbLiquidoHidraulicoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbLiquidoHidraulicoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jrbAguaVidriosN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(87, 87, 87))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKilometrajeActual)
                                    .addComponent(txtFechaInspeccion, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtFechaVenSOAT))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtFechaUltimoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFechaUltimoCambioAce, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(461, 461, 461)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(188, 188, 188))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(224, 224, 224)
                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(228, 228, 228))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addGap(271, 271, 271)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbEquipoCarreteraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbExtintorS, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(84, 84, 84)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jrbEquipoCarreteraN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jrbExtintorN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jrbLlantasRepuestoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(93, 93, 93)
                                            .addComponent(jrbLlantasRepuestoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jrbRinesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(93, 93, 93)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbBateriaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbRinesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addComponent(jrbPitoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbCrucetaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbFrenoEmergenciaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbEspejosN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbBotiquinN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbLlantasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbGatoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(63, 63, 63)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jrbLucesDireccionalesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jrbTestigoTableroS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jrbLucesInternasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(90, 90, 90))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jrbLucesS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(86, 86, 86)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbLucesN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrbTestigoTableroN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrbLucesDireccionalesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrbLucesInternasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbStopS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbLucesEstacionariasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbLucesReversaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(89, 89, 89)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbStopN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbLucesReversaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbLucesEstacionariasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(675, 675, 675))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(737, 737, 737)
                            .addComponent(jrbBateriaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(5, 5, 5)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(397, 397, 397)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbPitoReversaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbCinturonSeguridadS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbSenalesReflectivasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbCajaHerramientasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbLinternaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbCarcasaLucesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbLimpiaParabrisasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbTapizadoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbPanoramicoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbLinternaN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jrbCajaHerramientasN, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                            .addComponent(jrbSenalesReflectivasN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jrbPitoReversaN, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                            .addComponent(jrbCinturonSeguridadN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(17, 17, 17)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbPitoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbCrucetaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbFrenoEmergenciaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbEspejosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbGatoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbBotiquinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jrbPanoramicoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jrbTapizadoN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbCarcasaLucesN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jrbLimpiaParabrisasN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(56, 56, 56)
                                .addComponent(jrbLlantasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaInspeccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKilometrajeActual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFechaUltimoMantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaVenSOAT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFechaUltimoCambioAce, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbLiquidoRefriS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jrbLiquidoRefriN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jrbLiquidoFrenosS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbLiquidoFrenosN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jrbAceiteMotorN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbAceiteMotorS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jrbLiquidoHidraulicoN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbLiquidoHidraulicoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbAguaVidriosN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbAguaVidriosS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addComponent(jLabel25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel70)
                    .addComponent(jLabel63)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbClutchN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jrbFrenoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbFrenoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jrbClutchS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbAceleradorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbAceleradorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLabel65)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jrbLucesReversaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbLucesS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jrbLucesN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbLucesDireccionalesN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbLucesDireccionalesS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbStopN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbStopS, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbLucesEstacionariasS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbLucesEstacionariasN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbTestigoTableroN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbTestigoTableroS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jrbLucesReversaS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbLucesInternasS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbLucesInternasN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jrbEquipoCarreteraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jrbEquipoCarreteraN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbBateriaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jrbExtintorS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jrbExtintorN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jrbRinesN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrbLlantasRepuestoS, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jrbCinturonSeguridadS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addComponent(jrbCinturonSeguridadN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel46)
                                                .addComponent(jrbPitoReversaS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jrbPitoReversaN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel55)
                                            .addGap(0, 0, 0)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jrbCrucetaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jrbCrucetaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jrbRinesS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jrbLlantasRepuestoN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbSenalesReflectivasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbSenalesReflectivasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57)
                            .addComponent(jLabel43)
                            .addComponent(jrbPitoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbPitoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbFrenoEmergenciaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbCajaHerramientasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbCajaHerramientasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbFrenoEmergenciaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)))
                    .addComponent(jrbBateriaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jrbLinternaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbLinternaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(jrbEspejosN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEspejosS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbCarcasaLucesS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbCarcasaLucesN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jrbGatoN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbGatoS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jrbLimpiaParabrisasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbLimpiaParabrisasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(jrbBotiquinS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbBotiquinN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jrbTapizadoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbTapizadoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel40)
                            .addComponent(jrbLlantasN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jrbPanoramicoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbPanoramicoN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jrbLlantasS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addGap(581, 581, 581))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1015, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        registrarDiagnostico();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPlacaVehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlacaVehiculoKeyTyped
        if (txtPlacaVehiculo.getText().length() >= 6) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        } else {
            char caracter = evt.getKeyChar();
            if (Character.isLowerCase(caracter)) {
                evt.setKeyChar(Character.toUpperCase(caracter));
            }
        }
    }//GEN-LAST:event_txtPlacaVehiculoKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaraCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            int cerrar = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Desea volver","EXIT",cerrar);
            if (result==0) {
                System.exit(0);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
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
            }else if(txtFechaUltimoMantenimiento.getText().equals("")){
                imprimirCampoVacio("Fecha del ultimo Mntenimiento");
                camposValidados = false;
                txtFechaUltimoMantenimiento.requestFocus();
            }else if(txtFechaUltimoCambioAce.getText().equals("")){
                imprimirCampoVacio("Fecha ultimo cambio de aceite");
                camposValidados = false;
                txtFechaUltimoCambioAce.requestFocus();
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
                valorString = "verdadero";
            } else {
                valorString = "falso";
            }
        } catch (Exception e) {
        }
        return valorString;
    }

        public boolean convertirStringBoolean(String valorString) {
        boolean valorBoolean = false;
        try {
            if (valorString == "verdadero") {
                valorBoolean = true;
            } else {
                valorBoolean = false;
            }
        } catch (Exception e) {
        }
        return valorBoolean;
    }
        

        
        public void registrarDiagnostico(){
            
        DiagnosticoServiceImpl diagnosticoServicio = new DiagnosticoServiceImpl();
       
        boolean botonGrupLiquidoRef = true;
            if(jrbLiquidoRefriS.isSelected())
            {
                botonGrupLiquidoRef  = (true);
            }else if(jrbLiquidoRefriN.isSelected()){
                botonGrupLiquidoRef  = (false);
            }
        boolean botonGrupLiquidoFrenos = true;
            if(jrbLiquidoFrenosS.isSelected())
            {
                botonGrupLiquidoFrenos  = (true);
            }else if(jrbLiquidoFrenosN.isSelected()){
                botonGrupLiquidoFrenos  = (false);
            }
        boolean botonGrupAceiteMotor = true;
            if(jrbAceiteMotorS.isSelected())
            {
                botonGrupAceiteMotor  = (true);
            }else if(jrbAceiteMotorN.isSelected()){
                botonGrupAceiteMotor  = (false);
            }
         boolean botonGrupLiquidoHidraulico = true;
            if(jrbLiquidoHidraulicoS.isSelected())
            {
                botonGrupLiquidoHidraulico  = (true);
            }else if(jrbLiquidoHidraulicoN.isSelected()){
                botonGrupLiquidoHidraulico  = (false);
            }
        boolean botonGrupAguaVidrios = true;
            if(jrbAguaVidriosS.isSelected())
            {
                botonGrupAguaVidrios  = (true);
            }else if(jrbAguaVidriosN.isSelected()){
                botonGrupAguaVidrios  = (false);
            }  
        boolean botonGrupAcelerador = true;
            if(jrbAceleradorS.isSelected())
            {
                botonGrupAcelerador  = (true);
            }else if(jrbAceleradorN.isSelected()){
                botonGrupAcelerador  = (false);
            }
        boolean botonGrupClutch = true;
            if(jrbClutchS.isSelected())
            {
                botonGrupClutch  = (true);
            }else if(jrbClutchN.isSelected()){
                botonGrupClutch  = (false);
            }
        boolean botonGrupFreno = true;
            if(jrbFrenoS.isSelected())
            {
                botonGrupFreno  = (true);
            }else if(jrbFrenoN.isSelected()){
                botonGrupFreno  = (false);
            }
        boolean botonGrupLuces = true;
            if(jrbLucesS.isSelected())
            {
                botonGrupLuces  = (true);
            }else if(jrbLucesN.isSelected()){
                botonGrupLuces  = (false);
            }
        boolean botonGrupLucesDireccionales = true;
            if(jrbLucesDireccionalesS.isSelected())
            {
                botonGrupLucesDireccionales  = (true);
            }else if(jrbLucesDireccionalesN.isSelected()){
                botonGrupLucesDireccionales  = (false);
            }
        boolean botonGrupLucesEstacionarias = true;
            if(jrbLucesEstacionariasS.isSelected())
            {
                botonGrupLucesEstacionarias  = (true);
            }else if(jrbLucesEstacionariasN.isSelected()){
                botonGrupLucesEstacionarias = (false);
            }
        boolean botonGrupStop = true;
            if(jrbStopS.isSelected())
            {
                botonGrupStop  = (true);
            }else if(jrbStopN.isSelected()){
                botonGrupStop = (false);
            }
        boolean botonGrupTestigoTablero = true;
            if(jrbTestigoTableroS.isSelected())
            {
                botonGrupTestigoTablero  = (true);
            }else if(jrbTestigoTableroN.isSelected()){
                botonGrupTestigoTablero = (false);
            }
        boolean botonGrupLucesReversa = true;
            if(jrbLucesReversaS.isSelected())
            {
                botonGrupLucesReversa  = (true);
            }else if(jrbLucesReversaN.isSelected()){
                botonGrupLucesReversa = (false);
            }
        boolean botonGrupLucesInternas = true;
            if(jrbLucesInternasS.isSelected())
            {
                botonGrupLucesInternas  = (true);
            }else if(jrbLucesInternasN.isSelected()){
                botonGrupLucesInternas = (false);
            }
        boolean botonGrupEquipoCarretera = true;
            if(jrbEquipoCarreteraS.isSelected())
            {
                botonGrupEquipoCarretera  = (true);
            }else if(jrbEquipoCarreteraN.isSelected()){
                botonGrupEquipoCarretera = (false);
            }
        boolean botonGrupExtintor = true;
            if(jrbExtintorS.isSelected())
            {
                botonGrupExtintor  = (true);
            }else if(jrbExtintorN.isSelected()){
                botonGrupExtintor = (false);
            }
        boolean botonGrupLlantasRepuesto = true;
            if(jrbLlantasRepuestoS.isSelected())
            {
                botonGrupLlantasRepuesto = (true);
            }else if(jrbLlantasRepuestoN.isSelected()){
                botonGrupLlantasRepuesto = (false);
            }
        boolean botonGrupCruceta = true;
            if(jrbCrucetaS.isSelected())
            {
                botonGrupCruceta = (true);
            }else if(jrbCrucetaN.isSelected()){
                botonGrupCruceta = (false);
            }
        boolean botonGrupSenalesReflectivas = true;
            if(jrbSenalesReflectivasS.isSelected())
            {
                botonGrupSenalesReflectivas = (true);
            }else if(jrbSenalesReflectivasN.isSelected()){
                botonGrupSenalesReflectivas = (false);
            }
        boolean botonGrupCajaHerramientas = true;
            if(jrbCajaHerramientasS.isSelected())
            {
                botonGrupCajaHerramientas = (true);
            }else if(jrbCajaHerramientasN.isSelected()){
                botonGrupCajaHerramientas = (false);
            }
        boolean botonGrupLinterna = true;
            if(jrbLinternaS.isSelected())
            {
                botonGrupLinterna = (true);
            }else if(jrbLinternaN.isSelected()){
                botonGrupLinterna = (false);
            }
        boolean botonGrupGato = true;
            if(jrbGatoS.isSelected())
            {
                botonGrupGato = (true);
            }else if(jrbGatoN.isSelected()){
                botonGrupGato = (false);
            }
        boolean botonGrupBotiquin = true;
            if(jrbBotiquinS.isSelected())
            {
                botonGrupBotiquin = (true);
            }else if(jrbBotiquinN.isSelected()){
                botonGrupBotiquin = (false);
            }
        boolean botonGrupLlantas = true;
            if(jrbLlantasS.isSelected())
            {
                botonGrupLlantas = (true);
            }else if(jrbLlantasN.isSelected()){
                botonGrupLlantas = (false);
            }
        boolean botonGrupBateria = true;
            if(jrbBateriaS.isSelected())
            {
                botonGrupBateria = (true);
            }else if(jrbBateriaN.isSelected()){
                botonGrupBateria = (false);
            }
        boolean botonGrupRines = true;
            if(jrbRinesS.isSelected())
            {
                botonGrupRines = (true);
            }else if(jrbRinesN.isSelected()){
                botonGrupRines = (false);
            }
        boolean botonGrupCinturonSeguridad = true;
            if(jrbCinturonSeguridadS.isSelected())
            {
                botonGrupCinturonSeguridad = (true);
            }else if(jrbCinturonSeguridadN.isSelected()){
                botonGrupCinturonSeguridad = (false);
            }
        boolean botonGrupPitoReversa = true;
            if(jrbPitoReversaS.isSelected())
            {
                botonGrupPitoReversa = (true);
            }else if(jrbPitoReversaN.isSelected()){
                botonGrupPitoReversa= (false);
            }
        boolean botonGrupPito = true;
            if(jrbPitoS.isSelected())
            {
                botonGrupPito = (true);
            }else if(jrbPitoN.isSelected()){
                botonGrupPito= (false);
            }
        boolean botonGrupFrenoEmergencia = true;
            if(jrbFrenoEmergenciaS.isSelected())
            {
                botonGrupFrenoEmergencia = (true);
            }else if(jrbFrenoEmergenciaN.isSelected()){
                botonGrupFrenoEmergencia= (false);
            }
        boolean botonGrupEspejos = true;
            if(jrbEspejosS.isSelected())
            {
                botonGrupEspejos = (true);
            }else if(jrbEspejosN.isSelected()){
                botonGrupEspejos = (false);
            }
        boolean botonGrupCarcasaLuces = true;
            if(jrbCarcasaLucesS.isSelected())
            {
                botonGrupCarcasaLuces = (true);
            }else if(jrbCarcasaLucesN.isSelected()){
                botonGrupCarcasaLuces = (false);
            }
        boolean botonGrupLimpiaParabrisas = true;
            if(jrbLimpiaParabrisasS.isSelected())
            {
                botonGrupLimpiaParabrisas = (true);
            }else if(jrbLimpiaParabrisasN.isSelected()){
                botonGrupLimpiaParabrisas = (false);
            }
        boolean botonGrupTapizado = true;
            if(jrbTapizadoS.isSelected())
            {
                botonGrupTapizado = (true);
            }else if(jrbTapizadoN.isSelected()){
                botonGrupTapizado = (false);
            }
        boolean botonGrupPanoramico = true;
            if(jrbPanoramicoS.isSelected())
            {
                botonGrupPanoramico = (true);
            }else if(jrbPanoramicoN.isSelected()){
                botonGrupPanoramico = (false);
            }
           
        Diagnostico diagnostico = new Diagnostico(txtPlacaVehiculo.getText().toString(),
                txtFechaInspeccion.getText().toString(),
                txtFechaVenSOAT.getText().toString(), 
                txtFechaUltimoMantenimiento.getText().toString(),
                txtFechaUltimoCambioAce.getText().toString(),
                Integer.parseInt(txtKilometrajeActual.getText().toString()),
                botonGrupLiquidoRef,
                botonGrupLiquidoFrenos,
                botonGrupAceiteMotor,
                botonGrupLiquidoHidraulico,
                botonGrupAguaVidrios,
                botonGrupAcelerador,
                botonGrupClutch,
                botonGrupFreno,
                botonGrupLuces,
                botonGrupLucesDireccionales,
                botonGrupLucesEstacionarias,
                botonGrupStop,
                botonGrupTestigoTablero,
                botonGrupLucesReversa,
                botonGrupLucesInternas,
                botonGrupEquipoCarretera,
                botonGrupExtintor,
                botonGrupLlantasRepuesto,
                botonGrupCruceta,
                botonGrupSenalesReflectivas,
                botonGrupCajaHerramientas,
                botonGrupLinterna,
                botonGrupGato,
                botonGrupBotiquin,
                botonGrupLlantas,
                botonGrupBateria,
                botonGrupRines,
                botonGrupCinturonSeguridad,
                botonGrupPitoReversa,
                botonGrupPito,
                botonGrupFrenoEmergencia,
                botonGrupEspejos,
                botonGrupCarcasaLuces,
                botonGrupLimpiaParabrisas,
                botonGrupTapizado,
                botonGrupPanoramico,
                jtaDescripcion.getText());
        diagnosticoServicio.guardar(diagnostico);
        
        diagnosticoServicio.encontrarDiagnostico(5);
    }
        
        public void limpiaraCampos(){
            
        this.txtFechaInspeccion.setText("");
        this.txtPlacaVehiculo.setText("");
        this.txtFechaVenSOAT.setText("");
        this.txtFechaUltimoMantenimiento.setText("");
        this.txtFechaUltimoCambioAce.setText("");
        this.txtKilometrajeActual.setText("");
        baLiquidoRefrigerante.clearSelection();
        baLiquidoFrenos.clearSelection();
        baAceiteMotor.clearSelection();
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
        baLimpiaParabrisas.clearSelection();
        baTapizado.clearSelection();
        baPanoramico.clearSelection();
        this.jtaDescripcion.setText("");
    
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
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
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
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
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
    private javax.swing.JTextField txtFechaInspeccion;
    private javax.swing.JTextField txtFechaUltimoCambioAce;
    private javax.swing.JTextField txtFechaUltimoMantenimiento;
    private javax.swing.JTextField txtFechaVenSOAT;
    private javax.swing.JTextField txtKilometrajeActual;
    private javax.swing.JTextField txtPlacaVehiculo;
    // End of variables declaration//GEN-END:variables
}
