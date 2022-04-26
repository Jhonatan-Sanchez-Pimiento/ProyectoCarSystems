package dominio;

/**
 * @author IntegraSoft
 */
public class Usuario {
    
    private Long idUsuario;
    private String tipoId;
    private String apellido1;
    private String apellido2;
    private String nombreUsuario;
    private String departamento;
    private String municipio;
    private String direccion;
    private String telefono;
    private String emailUsuario;
    private String rol;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String apellido1, String apellido2, String nombreUsuario, String departamento, String municipio, String direccion, String telefono, String emailUsuario, String rol, String contrasena) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombreUsuario = nombreUsuario;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.emailUsuario = emailUsuario;
        this.rol = rol;
        this.contrasena = contrasena;
    }

    public Usuario(long idUsuario, String tipoId, String apellido1, String apellido2, String nombreUsuario, String departamento, String municipio, String direccion, String telefono, String emailUsuario, String rol, String contrasena) {
        this.idUsuario = idUsuario;
        this.tipoId = tipoId;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombreUsuario = nombreUsuario;
        this.departamento = departamento;
        this.municipio = municipio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.emailUsuario = emailUsuario;
        this.rol = rol;
        this.contrasena = contrasena;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipoId() {
        return tipoId;
    }

    public void setTipoId(String tipoId) {
        this.tipoId = tipoId;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    @Override
       public String toString(){
           return departamento;      
    }
}
