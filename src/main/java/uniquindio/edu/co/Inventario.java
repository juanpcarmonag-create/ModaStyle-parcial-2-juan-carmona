package uniquindio.edu.co;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private Sucursal sucursal;
    private int registro;
    private Talla talla;
    private String color;
    private int cantidad;
    private Prendas prenda;


    public Inventario(Sucursal sucursal, int registro, Prendas prenda, Talla talla, String color, int cantidad) {
        this.sucursal = sucursal;
        this.registro = registro;
        this.talla = talla;
        this.color = color;
        this.cantidad = cantidad;
        this.prenda = prenda;


    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
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
