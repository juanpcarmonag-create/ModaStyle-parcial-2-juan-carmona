package uniquindio.edu.co;

public class Cliente extends Personas{

    private int codigoAfiliacion;
    private CategoriaCliente categoriaCliente;

    public Cliente(int documento, String nombre, String correo, int telefono, int codigoAfiliacion, CategoriaCliente categoriaCliente) {
        super(documento, nombre, correo, telefono);
        this.codigoAfiliacion = codigoAfiliacion;
        this.categoriaCliente = categoriaCliente;
    }

    public int getCodigoAfiliacion() {
        return codigoAfiliacion;
    }

    public void setCodigoAfiliacion(int codigoAfiliacion) {
        this.codigoAfiliacion = codigoAfiliacion;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CategoriaCliente categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }
}
