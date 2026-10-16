package uniquindio.edu.co;

public enum CategoriaCliente {
    BRONCE(5),
    PLATA(10),
    ORO(15);

    private double porcentaje;

    CategoriaCliente(double porcentaje) {
        this.porcentaje= porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
}
