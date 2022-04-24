package dominio;

/**
 * @author IntegraSoft
 */
public class InicioSesion {
    private int idLogin;
    private String emailUsuario;
    private String fecha;
    private int estado;

    public InicioSesion() {
    }

    public InicioSesion(int idLogin, String emailUsuario, String fecha, int estado) {
        this.idLogin = idLogin;
        this.emailUsuario = emailUsuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public InicioSesion(String emailUsuario, int estado) {
        this.emailUsuario = emailUsuario;
        this.estado = estado;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
}