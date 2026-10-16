package uniquindio.edu.co;

public enum CategoriaPrendas {
    CAMISETA(0),
    PANTALON(0),
    VESTIDO(10),
    CHAQUETA(15),
    CALZADO(5);

    private double porcentaje;

    CategoriaPrendas(double porcentaje) {
        this.porcentaje= porcentaje;
    }
    public double getPorcentaje() {
        return porcentaje;
    }
}
