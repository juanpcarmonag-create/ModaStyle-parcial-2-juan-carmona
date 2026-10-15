package uniquindio.edu.co;

import javax.swing.*;
import java.util.List;

public class Inventario {
    private int registro;
    private List<Sucursal> sucursal;
    private Talla talla;
    private String color;
    private int cantidad;

    public Inventario(int registro, List<Sucursal> sucursal, Talla talla, String color, int cantidad) {
        this.registro = registro;
        this.sucursal = sucursal;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public List<Sucursal> getSucursal() {
        return sucursal;
    }

    public void setSucursal(List<Sucursal> sucursal) {
        this.sucursal = sucursal;
    }

    public Talla getTalla() {
        return talla;
    }

    public void setTalla(Talla talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
