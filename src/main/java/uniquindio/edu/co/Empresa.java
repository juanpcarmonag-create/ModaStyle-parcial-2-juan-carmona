package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private int nit;
    private String direccion;
    private List<Sucursal> listaSucursales;
    private List<Vendedores> listaVendedores;

    public Empresa(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;

        listaSucursales=new ArrayList<>();
        listaVendedores=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean verificarListaSucursales(int codigo) {
        boolean existe = false;
        for (Sucursal sucursal1 : listaSucursales) {
            if (sucursal1.getCodigo() == codigo) {
                existe = true;
                break;
            }
        }return existe;
    }
    public Sucursal agregarSucursal(int codigo) {
        Sucursal sucursal = null;
        //if (verificarListaPrendas(codigo)==true){
        for (Sucursal sucursal1 : listaSucursales) {
            if (sucursal1.getCodigo() == codigo) {
                sucursal= sucursal1;
            }
            //}
        }
        return sucursal;
    }
    public boolean verificarListaVendedores(int codigo) {
        boolean existe = false;
        for (Vendedores vendedor : listaVendedores) {
            if (vendedor.getCodigoEmpleado() == codigo) {
                existe = true;
                break;
            }
        }return existe;
    }
    public Vendedores agregarVendedor(int codigo) {
        Vendedores vendedor1 = null;
        for (Vendedores vendedor : listaVendedores) {
            if (vendedor.getCodigoEmpleado() == codigo) {
                vendedor1=vendedor;
                break;
            }
        }
        return vendedor1;
    }
    public int codigoSucursal(int codigo){
    int codigoSuc = ;
    //if (verificarListaPrendas(codigo)==true){
        for (Sucursal sucursal1 : listaSucursales) {
        if (sucursal1.getCodigo() == codigo) {
            sucursal= sucursal1;
        }
        //}
    }
        return sucursal;
}
