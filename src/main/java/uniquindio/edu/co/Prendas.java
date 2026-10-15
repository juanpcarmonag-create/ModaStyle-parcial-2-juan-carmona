package uniquindio.edu.co;

public class Prendas {
    private int codigoPrenda;
    private String nombre;
    private String marca;
    private double precioUnitario;
    private CategoriaPrendas categoriaPrendas;

    public Prendas(int codigoPrenda, String nombre, String marca, double precioUnitario, CategoriaPrendas categoriaPrendas) {
        this.codigoPrenda = codigoPrenda;
        this.nombre = nombre;
        this.marca = marca;
        this.precioUnitario = precioUnitario;
        this.categoriaPrendas = categoriaPrendas;
    }

    public int getCodigoPrenda() {
        return codigoPrenda;
    }

    public void setCodigoPrenda(int codigoPrenda) {
        this.codigoPrenda = codigoPrenda;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public CategoriaPrendas getCategoriaPrendas(){
        return categoriaPrendas;
    }

    public void setCategoriaPrendas(CategoriaPrendas categoriaPrendas) {
        this.categoriaPrendas = categoriaPrendas;
    }
}
