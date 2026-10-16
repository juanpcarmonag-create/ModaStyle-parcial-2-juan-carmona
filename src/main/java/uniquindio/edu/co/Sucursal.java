package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    //private Vendedores vendedor;


    //private List<Inventario> inventario;

    public Sucursal(int codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        //this.inventario = inventario;


    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // public Inventario getInventario() { return inventario; }

    //public void setInventario(Inventario inventario) { this.inventario = inventario;}



    @Override
    public String toString() {
        return "nombre='" + nombre +
                ", direccion='" + direccion +
                ", ciudad='" + ciudad;
    }
}