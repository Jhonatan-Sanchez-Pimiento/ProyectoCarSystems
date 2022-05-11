/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author nicol
 */
public class Diagnostico {
    private String fechaInspeccion;
    private String fechaRevision;
    private String fechaVenSoat;
    private String fechaManPreventivo;
    private String tipoVehiculo;
    private String placaVehiculo;
    private String modeloVehiculo;
    private String numeroLicConduccion;
    private String fechaUltCamAceite;
    private String kilometrajeActual;
/*
    Niveles
    */    
    private boolean liquidoRefrigerante;
    private boolean liquidoFrenos;
    private boolean aceiteMotor;
    private boolean liquidoHidraulico;
    private boolean aguaLimpiavidrios;
    /*
    Pedales
    */
    private boolean acelerador;
    private boolean clutsh;
    private boolean freno;
    /*
    Luces
    */
    private boolean luces;
    private boolean direccionales;
    private boolean estacionarias;
    private boolean stops;
    private boolean testigosTablero;
    private boolean luzReversa;
    private boolean lucesInternas;
    /*
    Equipo de carretera y botiquin
    */
    private boolean extintor;
    private boolean fechaVenExtintor;
    private boolean llantasRepuesto;
    private boolean cruceta;
    private boolean señalesReflectivas;
    private boolean cajaHerramientas;
    private boolean linterna;
    private boolean gato;
    private boolean botiquin;
    /*
    Varios
    */
    private boolean llantas;
    private boolean bateria;
    private boolean rines;
    private boolean cinturonSeguridad;
    private boolean pitoReversa;
    private boolean pito;
    private boolean frenoEmergencia;
    private boolean espejos;
    private boolean carcasaLuces;
    private boolean limpiaparabrisas;
    private boolean tapizado;
    private boolean panoramico;

    public Diagnostico() {
    }

    public Diagnostico(String fechaInspeccion, String fechaRevision, String fechaVenSoat, String fechaManPreventivo, String tipoVehiculo, String placaVehiculo, String modeloVehiculo, String numeroLicConduccion, String fechaUltCamAceite, String kilometrajeActual, boolean liquidoRefrigerante, boolean liquidoFrenos, boolean aceiteMotor, boolean liquidoHidraulico, boolean aguaLimpiavidrios, boolean acelerador, boolean clutsh, boolean freno, boolean luces, boolean direccionales, boolean estacionarias, boolean stops, boolean testigosTablero, boolean luzReversa, boolean lucesInternas, boolean extintor, boolean fechaVenExtintor, boolean llantasRepuesto, boolean cruceta, boolean señalesReflectivas, boolean cajaHerramientas, boolean linterna, boolean gato, boolean botiquin, boolean llantas, boolean bateria, boolean rines, boolean cinturonSeguridad, boolean pitoReversa, boolean pito, boolean frenoEmergencia, boolean espejos, boolean carcasaLuces, boolean limpiaparabrisas, boolean tapizado, boolean panoramico) {
        this.fechaInspeccion = fechaInspeccion;
        this.fechaRevision = fechaRevision;
        this.fechaVenSoat = fechaVenSoat;
        this.fechaManPreventivo = fechaManPreventivo;
        this.tipoVehiculo = tipoVehiculo;
        this.placaVehiculo = placaVehiculo;
        this.modeloVehiculo = modeloVehiculo;
        this.numeroLicConduccion = numeroLicConduccion;
        this.fechaUltCamAceite = fechaUltCamAceite;
        this.kilometrajeActual = kilometrajeActual;
        this.liquidoRefrigerante = liquidoRefrigerante;
        this.liquidoFrenos = liquidoFrenos;
        this.aceiteMotor = aceiteMotor;
        this.liquidoHidraulico = liquidoHidraulico;
        this.aguaLimpiavidrios = aguaLimpiavidrios;
        this.acelerador = acelerador;
        this.clutsh = clutsh;
        this.freno = freno;
        this.luces = luces;
        this.direccionales = direccionales;
        this.estacionarias = estacionarias;
        this.stops = stops;
        this.testigosTablero = testigosTablero;
        this.luzReversa = luzReversa;
        this.lucesInternas = lucesInternas;
        this.extintor = extintor;
        this.fechaVenExtintor = fechaVenExtintor;
        this.llantasRepuesto = llantasRepuesto;
        this.cruceta = cruceta;
        this.señalesReflectivas = señalesReflectivas;
        this.cajaHerramientas = cajaHerramientas;
        this.linterna = linterna;
        this.gato = gato;
        this.botiquin = botiquin;
        this.llantas = llantas;
        this.bateria = bateria;
        this.rines = rines;
        this.cinturonSeguridad = cinturonSeguridad;
        this.pitoReversa = pitoReversa;
        this.pito = pito;
        this.frenoEmergencia = frenoEmergencia;
        this.espejos = espejos;
        this.carcasaLuces = carcasaLuces;
        this.limpiaparabrisas = limpiaparabrisas;
        this.tapizado = tapizado;
        this.panoramico = panoramico;
    }

    public String getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
    }

    public String getFechaRevision() {
        return fechaRevision;
    }

    public void setFechaRevision(String fechaRevision) {
        this.fechaRevision = fechaRevision;
    }

    public String getFechaVenSoat() {
        return fechaVenSoat;
    }

    public void setFechaVenSoat(String fechaVenSoat) {
        this.fechaVenSoat = fechaVenSoat;
    }

    public String getFechaManPreventivo() {
        return fechaManPreventivo;
    }

    public void setFechaManPreventivo(String fechaManPreventivo) {
        this.fechaManPreventivo = fechaManPreventivo;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public String getModeloVehiculo() {
        return modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getNumeroLicConduccion() {
        return numeroLicConduccion;
    }

    public void setNumeroLicConduccion(String numeroLicConduccion) {
        this.numeroLicConduccion = numeroLicConduccion;
    }

    public String getFechaUltCamAceite() {
        return fechaUltCamAceite;
    }

    public void setFechaUltCamAceite(String fechaUltCamAceite) {
        this.fechaUltCamAceite = fechaUltCamAceite;
    }

    public String getKilometrajeActual() {
        return kilometrajeActual;
    }

    public void setKilometrajeActual(String kilometrajeActual) {
        this.kilometrajeActual = kilometrajeActual;
    }

    public boolean isLiquidoRefrigerante() {
        return liquidoRefrigerante;
    }

    public void setLiquidoRefrigerante(boolean liquidoRefrigerante) {
        this.liquidoRefrigerante = liquidoRefrigerante;
    }

    public boolean isLiquidoFrenos() {
        return liquidoFrenos;
    }

    public void setLiquidoFrenos(boolean liquidoFrenos) {
        this.liquidoFrenos = liquidoFrenos;
    }

    public boolean isAceiteMotor() {
        return aceiteMotor;
    }

    public void setAceiteMotor(boolean aceiteMotor) {
        this.aceiteMotor = aceiteMotor;
    }

    public boolean isLiquidoHidraulico() {
        return liquidoHidraulico;
    }

    public void setLiquidoHidraulico(boolean liquidoHidraulico) {
        this.liquidoHidraulico = liquidoHidraulico;
    }

    public boolean isAguaLimpiavidrios() {
        return aguaLimpiavidrios;
    }

    public void setAguaLimpiavidrios(boolean aguaLimpiavidrios) {
        this.aguaLimpiavidrios = aguaLimpiavidrios;
    }

    public boolean isAcelerador() {
        return acelerador;
    }

    public void setAcelerador(boolean acelerador) {
        this.acelerador = acelerador;
    }

    public boolean isClutsh() {
        return clutsh;
    }

    public void setClutsh(boolean clutsh) {
        this.clutsh = clutsh;
    }

    public boolean isFreno() {
        return freno;
    }

    public void setFreno(boolean freno) {
        this.freno = freno;
    }

    public boolean isLuces() {
        return luces;
    }

    public void setLuces(boolean luces) {
        this.luces = luces;
    }

    public boolean isDireccionales() {
        return direccionales;
    }

    public void setDireccionales(boolean direccionales) {
        this.direccionales = direccionales;
    }

    public boolean isEstacionarias() {
        return estacionarias;
    }

    public void setEstacionarias(boolean estacionarias) {
        this.estacionarias = estacionarias;
    }

    public boolean isStops() {
        return stops;
    }

    public void setStops(boolean stops) {
        this.stops = stops;
    }

    public boolean isTestigosTablero() {
        return testigosTablero;
    }

    public void setTestigosTablero(boolean testigosTablero) {
        this.testigosTablero = testigosTablero;
    }

    public boolean isLuzReversa() {
        return luzReversa;
    }

    public void setLuzReversa(boolean luzReversa) {
        this.luzReversa = luzReversa;
    }

    public boolean isLucesInternas() {
        return lucesInternas;
    }

    public void setLucesInternas(boolean lucesInternas) {
        this.lucesInternas = lucesInternas;
    }

    public boolean isExtintor() {
        return extintor;
    }

    public void setExtintor(boolean extintor) {
        this.extintor = extintor;
    }

    public boolean isFechaVenExtintor() {
        return fechaVenExtintor;
    }

    public void setFechaVenExtintor(boolean fechaVenExtintor) {
        this.fechaVenExtintor = fechaVenExtintor;
    }

    public boolean isLlantasRepuesto() {
        return llantasRepuesto;
    }

    public void setLlantasRepuesto(boolean llantasRepuesto) {
        this.llantasRepuesto = llantasRepuesto;
    }

    public boolean isCruceta() {
        return cruceta;
    }

    public void setCruceta(boolean cruceta) {
        this.cruceta = cruceta;
    }

    public boolean isSeñalesReflectivas() {
        return señalesReflectivas;
    }

    public void setSeñalesReflectivas(boolean señalesReflectivas) {
        this.señalesReflectivas = señalesReflectivas;
    }

    public boolean isCajaHerramientas() {
        return cajaHerramientas;
    }

    public void setCajaHerramientas(boolean cajaHerramientas) {
        this.cajaHerramientas = cajaHerramientas;
    }

    public boolean isLinterna() {
        return linterna;
    }

    public void setLinterna(boolean linterna) {
        this.linterna = linterna;
    }

    public boolean isGato() {
        return gato;
    }

    public void setGato(boolean gato) {
        this.gato = gato;
    }

    public boolean isBotiquin() {
        return botiquin;
    }

    public void setBotiquin(boolean botiquin) {
        this.botiquin = botiquin;
    }

    public boolean isLlantas() {
        return llantas;
    }

    public void setLlantas(boolean llantas) {
        this.llantas = llantas;
    }

    public boolean isBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public boolean isRines() {
        return rines;
    }

    public void setRines(boolean rines) {
        this.rines = rines;
    }

    public boolean isCinturonSeguridad() {
        return cinturonSeguridad;
    }

    public void setCinturonSeguridad(boolean cinturonSeguridad) {
        this.cinturonSeguridad = cinturonSeguridad;
    }

    public boolean isPitoReversa() {
        return pitoReversa;
    }

    public void setPitoReversa(boolean pitoReversa) {
        this.pitoReversa = pitoReversa;
    }

    public boolean isPito() {
        return pito;
    }

    public void setPito(boolean pito) {
        this.pito = pito;
    }

    public boolean isFrenoEmergencia() {
        return frenoEmergencia;
    }

    public void setFrenoEmergencia(boolean frenoEmergencia) {
        this.frenoEmergencia = frenoEmergencia;
    }

    public boolean isEspejos() {
        return espejos;
    }

    public void setEspejos(boolean espejos) {
        this.espejos = espejos;
    }

    public boolean isCarcasaLuces() {
        return carcasaLuces;
    }

    public void setCarcasaLuces(boolean carcasaLuces) {
        this.carcasaLuces = carcasaLuces;
    }

    public boolean isLimpiaparabrisas() {
        return limpiaparabrisas;
    }

    public void setLimpiaparabrisas(boolean limpiaparabrisas) {
        this.limpiaparabrisas = limpiaparabrisas;
    }

    public boolean isTapizado() {
        return tapizado;
    }

    public void setTapizado(boolean tapizado) {
        this.tapizado = tapizado;
    }

    public boolean isPanoramico() {
        return panoramico;
    }

    public void setPanoramico(boolean panoramico) {
        this.panoramico = panoramico;
    }


    
}

    