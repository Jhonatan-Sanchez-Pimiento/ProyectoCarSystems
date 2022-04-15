package dominio;

/**
 * @author IntegraSoft
 */
public class Usuario {
    private String tipoId;
    private int idUsuario;
    private String nombreUsuario;
    private String apellidoUsuario;
    private String direccion;
    private String telefono;
    private String emailUsuario;
    private String contrasena;
    private int idRol;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String apellidoUsuario, String direccion, String telefono, String emailUsuario, String contrasena, int idRol) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.emailUsuario = emailUsuario;
        this.contrasena = contrasena;
        this.idRol = idRol;
    }

    public Usuario(String tipoId, int idUsuario, String nombreUsuario, String apellidoUsuario, String direccion, String telefono, String emailUsuario, String contrasena, int idRol) {
        this.tipoId = tipoId;
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.direccion = direccion;
        this.telefono = telefono;
        this.emailUsuario = emailUsuario;
        this.contrasena = contrasena;
        this.idRol = idRol;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        this.emailUsuario = emailUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
    
}
