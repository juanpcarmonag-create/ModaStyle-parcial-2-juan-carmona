package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int codigo;
    private String nombre;
    private String direccion;
    private String ciudad;
    private List<Prendas> listaPrendas;

    //private List<Inventario> inventario;

    public Sucursal(int codigo, String nombre, String direccion, String ciudad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        //this.inventario = inventario;

        listaPrendas = new ArrayList<>();
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

    public boolean verificarListaPrendas(int codigo) {
        boolean existe = false;
        for (Prendas prenda : listaPrendas) {
            if (prenda.getCodigoPrenda() == codigo) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    public Prendas agregarPrendaInventario(int codigo) {
        Prendas prenda = null;
        //if (verificarListaPrendas(codigo)==true){
        for (Prendas prenda1 : listaPrendas) {
            if (prenda1.getCodigoPrenda() == codigo) {
                prenda = prenda1;
            }
            //}
        }
        return prenda;
    }
}