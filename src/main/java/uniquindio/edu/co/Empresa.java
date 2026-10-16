package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private int nit;
    private String direccion;
    private List<Sucursal> listaSucursales;
    private List<Vendedores> listaVendedores;
    private List<Cliente> listaClientes;
    private List<Inventario> listaInventario;
    private List<Ventas> listaVentas;
    private List<Prendas> listaPrendas;

    public Empresa(String nombre, int nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;

        listaSucursales=new ArrayList<>();
        listaVendedores=new ArrayList<>();
        listaClientes=new ArrayList<>();
        listaInventario=new ArrayList<>();
        listaVentas=new ArrayList<>();
        listaPrendas = new ArrayList<>();
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
    public int codigoSucursal(int codigo) {
        int codigoSuc = 0;
        for (Sucursal sucursal1 : listaSucursales) {
            if (sucursal1.getCodigo() == codigo) {
                codigoSuc = sucursal1.getCodigo();
            }
        }
        return codigoSuc;
    }

    public boolean verificarCliente(int codigo){
        boolean existe=false;
        for (Cliente cliente1 : listaClientes) {
            if (cliente1.getCodigoAfiliacion() == codigo) {
                existe = true;
                break;

            }
        }
        return existe;
    }

    public Cliente agregarCliente(int codigo){
        Cliente cliente = null;
        for(Cliente cliente1 : listaClientes) {
            if (cliente1.getCodigoAfiliacion() == codigo) {
                cliente=cliente1;
                break;
            }
        }
        return cliente;
    }
    public String mostrarInventario(int codigoVendedor){
        String mensaje="";
        Vendedores vendedor=agregarVendedor(codigoVendedor);
        Sucursal sucursal=vendedor.getSucursal();
        int codigoSucursal=sucursal.getCodigo();
        for (Inventario inv: listaInventario){
            if(inv.getSucursal()==sucursal){
                mensaje+=inv;
            }
        }
        return mensaje;
    }
    public boolean verificarCantidadProducto(int codigo, int cantidad){
        boolean existe=false;
        for(Inventario inv: listaInventario)
            if (inv.getRegistro()==codigo) {
                if (inv.getCantidad() - cantidad >= 0) {
                    existe=true;
                }
            }
        return existe;
    }
    public Inventario agregarCantidadProducto(int codigo, int cantidad){
        Inventario product=null;
        for(Inventario inv: listaInventario)
            if (inv.getRegistro()==codigo){
                if(inv.getCantidad()-cantidad>=0)
                    inv.setCantidad(inv.getCantidad()-cantidad);
                product=inv;
            }
        return product;
    }
    public CategoriaCliente categoriaCliente(int codigo){
        CategoriaCliente cat=null;
        for (Cliente cliente1 : listaClientes) {
            if (cliente1.getCodigoAfiliacion() == codigo) {
                cat=cliente1.getCategoriaCliente();
            }
        }
        return  cat;
    }
    public String calcularComprasCliente(int codigo){
        String mensaje="";
        int cantidadCompras=0;
        double valor=0;
        Cliente cliente=agregarCliente(codigo);
        for(Ventas venta: listaVentas){
            if(venta.getCliente()==cliente){
                valor+=venta.getValorTotal();
                cantidadCompras++;
            }
        }
        return mensaje+="Este cliente ha hecho "+cantidadCompras+"compra(s) por un valor de "+valor;
    }
    public String calcularVentasVendedor(int codigo){
        String mensaje="";
        int cantidadCompras=0;
        double valor=0;
        Vendedores vendedores=agregarVendedor(codigo);
        for(Ventas venta: listaVentas){
            if(venta.getVendedores()==vendedores){
                valor+=venta.getValorTotal();
                cantidadCompras++;
            }
        }
        return mensaje+="Este vendedor ha hecho "+cantidadCompras+" venta(s) por un valor de "+valor;
    }
    public String calcularVentasSucursal(int codigo){
        String mensaje="";
        int cantidadCompras=0;
        double valor=0;
        Sucursal sucursal=agregarSucursal(codigo);
        for(Ventas venta: listaVentas){
            if(venta.getSucursal()==sucursal){
                valor+=venta.getValorTotal();
                cantidadCompras++;
            }
        }
        mensaje+="Este vendedor ha hecho "+cantidadCompras+" venta(s) por un valor de "+valor+"\n";
        for(Ventas venta: listaVentas){
            if(venta.getSucursal()==sucursal){
                mensaje+=venta+"\n";
            }
        }
        return mensaje;
    }

    public String calcularVentasTotales(String mensaje){
        String mensaje1="";
        int cantidadCompras=0;
        double valor=0;
        for(Ventas venta: listaVentas){
            valor+=venta.getValorTotal();
            cantidadCompras++;
        }
        return mensaje+="La empresa ha hecho "+cantidadCompras+" venta(s)"+"\nel ingreso total de la empresa es de "+valor;
    }
}

