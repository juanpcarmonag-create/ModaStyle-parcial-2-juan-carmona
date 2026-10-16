package uniquindio.edu.co;

import java.time.LocalDate;

public class Ventas {
    private int codigoVenta;
    private LocalDate fecha;
    private Vendedores vendedores;
    private Sucursal sucursal;
    private Cliente cliente;
    private double valorTotal;

    public Ventas(int codigoVenta, LocalDate fecha, Vendedores vendedores, Sucursal sucursal, Cliente cliente, double valorTotal) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.vendedores = vendedores;
        this.sucursal = sucursal;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Vendedores getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedores vendedores) {
        this.vendedores = vendedores;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "------------COMPRA-----------" +
                "codigoVenta=" + codigoVenta +"\n"+
                ", fecha=" + fecha +"\n"+
                ", vendedores=" + vendedores+ "\n"+
                ", sucursal=" + sucursal +"\n"+
                ", cliente=" + cliente +"\n"+
                ", valorTotal=" + valorTotal;
    }
}
