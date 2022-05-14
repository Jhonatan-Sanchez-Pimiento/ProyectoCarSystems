package dominio;


/**
 * @author IntegraSoft
 */
public class Diagnostico {
    private long idInspeccion;
    private String idVehiculo;
    private String fechaInspeccion;
    private String fechaVenSoat;
    private String fechaManPreventivo;
    private String fechaUltCamAceite;
    private int kmActual;
    private boolean liquidoRefrigerante;
    private boolean liquidoFreno;
    private boolean aceiteMotor;
    private boolean liquidoHidraulico;
    private boolean aguaLimpiavidrios;
    private boolean acelerador;
    private boolean clutsh;
    private boolean freno;
    private boolean luces;
    private boolean direccionales;
    private boolean estacionarias;
    private boolean stops;
    private boolean testigoTablero;
    private boolean luzReversa;
    private boolean lucesInternas;
    private boolean equipoCarretera;
    private boolean extintor;
    private String fechaVenExtintor;
    private boolean llantaRepuesto;
    private boolean cruceta;
    private boolean senalesReflectivas;
    private boolean cajaHerramientas;
    private boolean linterna;
    private boolean gato;
    private boolean botiquin;
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
    private String observacion;
    
    public Diagnostico() {
    }

    public Diagnostico(String idVehiculo, String fechaInspeccion, String fechaVenSoat, String fechaManPreventivo, String fechaUltCamAceite, int kmActual, boolean liquidoRefrigerante, boolean liquidoFreno, boolean aceiteMotor, boolean liquidoHidraulico, boolean aguaLimpiavidrios, boolean acelerador, boolean clutsh, boolean freno, boolean luces, boolean direccionales, boolean estacionarias, boolean stops, boolean testigoTablero, boolean luzReversa, boolean lucesInternas, boolean equipoCarretera, boolean extintor, String fechaVenExtintor, boolean llantaRepuesto, boolean cruceta, boolean senalesReflectivas, boolean cajaHerramientas, boolean linterna, boolean gato, boolean botiquin, boolean llantas, boolean bateria, boolean rines, boolean cinturonSeguridad, boolean pitoReversa, boolean pito, boolean frenoEmergencia, boolean espejos, boolean carcasaLuces, boolean limpiaparabrisas, boolean tapizado, boolean panoramico, String observacion) {
        this.idVehiculo = idVehiculo;
        this.fechaInspeccion = fechaInspeccion;
        this.fechaVenSoat = fechaVenSoat;
        this.fechaManPreventivo = fechaManPreventivo;
        this.fechaUltCamAceite = fechaUltCamAceite;
        this.kmActual = kmActual;
        this.liquidoRefrigerante = liquidoRefrigerante;
        this.liquidoFreno = liquidoFreno;
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
        this.testigoTablero = testigoTablero;
        this.luzReversa = luzReversa;
        this.lucesInternas = lucesInternas;
        this.equipoCarretera = equipoCarretera;
        this.extintor = extintor;
        this.fechaVenExtintor = fechaVenExtintor;
        this.llantaRepuesto = llantaRepuesto;
        this.cruceta = cruceta;
        this.senalesReflectivas = senalesReflectivas;
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
        this.observacion = observacion;
    }

    public Diagnostico(long idInspeccion, String idVehiculo, String fechaInspeccion, String fechaVenSoat, String fechaManPreventivo, String fechaUltCamAceite, int kmActual, boolean liquidoRefrigerante, boolean liquidoFreno, boolean aceiteMotor, boolean liquidoHidraulico, boolean aguaLimpiavidrios, boolean acelerador, boolean clutsh, boolean freno, boolean luces, boolean direccionales, boolean estacionarias, boolean stops, boolean testigoTablero, boolean luzReversa, boolean lucesInternas, boolean equipoCarretera, boolean extintor, String fechaVenExtintor, boolean llantaRepuesto, boolean cruceta, boolean senalesReflectivas, boolean cajaHerramientas, boolean linterna, boolean gato, boolean botiquin, boolean llantas, boolean bateria, boolean rines, boolean cinturonSeguridad, boolean pitoReversa, boolean pito, boolean frenoEmergencia, boolean espejos, boolean carcasaLuces, boolean limpiaparabrisas, boolean tapizado, boolean panoramico, String observacion) {
        this.idInspeccion = idInspeccion;
        this.idVehiculo = idVehiculo;
        this.fechaInspeccion = fechaInspeccion;
        this.fechaVenSoat = fechaVenSoat;
        this.fechaManPreventivo = fechaManPreventivo;
        this.fechaUltCamAceite = fechaUltCamAceite;
        this.kmActual = kmActual;
        this.liquidoRefrigerante = liquidoRefrigerante;
        this.liquidoFreno = liquidoFreno;
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
        this.testigoTablero = testigoTablero;
        this.luzReversa = luzReversa;
        this.lucesInternas = lucesInternas;
        this.equipoCarretera = equipoCarretera;
        this.extintor = extintor;
        this.fechaVenExtintor = fechaVenExtintor;
        this.llantaRepuesto = llantaRepuesto;
        this.cruceta = cruceta;
        this.senalesReflectivas = senalesReflectivas;
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
        this.observacion = observacion;
    }

    public long getIdInspeccion() {
        return idInspeccion;
    }

    public void setIdInspeccion(long idInspeccion) {
        this.idInspeccion = idInspeccion;
    }

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public String getFechaInspeccion() {
        return fechaInspeccion;
    }

    public void setFechaInspeccion(String fechaInspeccion) {
        this.fechaInspeccion = fechaInspeccion;
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

    public String getFechaUltCamAceite() {
        return fechaUltCamAceite;
    }

    public void setFechaUltCamAceite(String fechaUltCamAceite) {
        this.fechaUltCamAceite = fechaUltCamAceite;
    }

    public int getKmActual() {
        return kmActual;
    }

    public void setKmActual(int kmActual) {
        this.kmActual = kmActual;
    }

    public boolean isLiquidoRefrigerante() {
        return liquidoRefrigerante;
    }

    public void setLiquidoRefrigerante(boolean liquidoRefrigerante) {
        this.liquidoRefrigerante = liquidoRefrigerante;
    }

    public boolean isLiquidoFreno() {
        return liquidoFreno;
    }

    public void setLiquidoFreno(boolean liquidoFreno) {
        this.liquidoFreno = liquidoFreno;
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

    public boolean isTestigoTablero() {
        return testigoTablero;
    }

    public void setTestigoTablero(boolean testigoTablero) {
        this.testigoTablero = testigoTablero;
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

    public boolean isEquipoCarretera() {
        return equipoCarretera;
    }

    public void setEquipoCarretera(boolean equipoCarretera) {
        this.equipoCarretera = equipoCarretera;
    }

    public boolean isExtintor() {
        return extintor;
    }

    public void setExtintor(boolean extintor) {
        this.extintor = extintor;
    }

    public String getFechaVenExtintor() {
        return fechaVenExtintor;
    }

    public void setFechaVenExtintor(String fechaVenExtintor) {
        this.fechaVenExtintor = fechaVenExtintor;
    }

    public boolean isLlantaRepuesto() {
        return llantaRepuesto;
    }

    public void setLlantaRepuesto(boolean llantaRepuesto) {
        this.llantaRepuesto = llantaRepuesto;
    }

    public boolean isCruceta() {
        return cruceta;
    }

    public void setCruceta(boolean cruceta) {
        this.cruceta = cruceta;
    }

    public boolean isSenalesReflectivas() {
        return senalesReflectivas;
    }

    public void setSenalesReflectivas(boolean senalesReflectivas) {
        this.senalesReflectivas = senalesReflectivas;
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

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "Diagnostico{" + "idInspeccion=" + idInspeccion + ", idVehiculo=" + idVehiculo + ", fechaInspeccion=" + fechaInspeccion + ", fechaVenSoat=" + fechaVenSoat + ", fechaManPreventivo=" + fechaManPreventivo + ", fechaUltCamAceite=" + fechaUltCamAceite + ", kmActual=" + kmActual + ", liquidoRefrigerante=" + liquidoRefrigerante + ", liquidoFreno=" + liquidoFreno + ", aceiteMotor=" + aceiteMotor + ", liquidoHidraulico=" + liquidoHidraulico + ", aguaLimpiavidrios=" + aguaLimpiavidrios + ", acelerador=" + acelerador + ", clutsh=" + clutsh + ", freno=" + freno + ", luces=" + luces + ", direccionales=" + direccionales + ", estacionarias=" + estacionarias + ", stops=" + stops + ", testigoTablero=" + testigoTablero + ", luzReversa=" + luzReversa + ", lucesInternas=" + lucesInternas + ", equipoCarretera=" + equipoCarretera + ", extintor=" + extintor + ", fechaVenExtintor=" + fechaVenExtintor + ", llantaRepuesto=" + llantaRepuesto + ", cruceta=" + cruceta + ", senalesReflectivas=" + senalesReflectivas + ", cajaHerramientas=" + cajaHerramientas + ", linterna=" + linterna + ", gato=" + gato + ", botiquin=" + botiquin + ", llantas=" + llantas + ", bateria=" + bateria + ", rines=" + rines + ", cinturonSeguridad=" + cinturonSeguridad + ", pitoReversa=" + pitoReversa + ", pito=" + pito + ", frenoEmergencia=" + frenoEmergencia + ", espejos=" + espejos + ", carcasaLuces=" + carcasaLuces + ", limpiaparabrisas=" + limpiaparabrisas + ", tapizado=" + tapizado + ", panoramico=" + panoramico + ", observacion=" + observacion + '}';
    }
    
}