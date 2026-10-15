package uniquindio.edu.co;

public abstract class Personas {
    private int Documento;
    private String nombre;
    private String correo;
    private int telefono;

    public Personas(int documento, String nombre, String correo, int telefono) {
        Documento = documento;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int documento) {
        Documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
