package uniquindio.edu.co;

import java.time.LocalDate;

public class Ventas {
    private int codigoVenta;
    private LocalDate fecha;
    private Vendedores vendedores;

    public Ventas(int codigoVenta, LocalDate fecha, Vendedores vendedores) {
        this.codigoVenta = codigoVenta;
        this.fecha = fecha;
        this.vendedores = vendedores;
    }
}
