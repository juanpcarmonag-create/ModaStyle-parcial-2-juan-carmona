package uniquindio.edu.co;

import java.time.LocalDate;

public class Vendedores extends Personas{
    private int codigoEmpleado;
    private LocalDate fechaContratacion;
    private double salario;
    private Sucursal sucursal;

    public Vendedores(int documento, String nombre, String correo, int telefono, int codigoEmpleado, LocalDate fechaContratacion, double salario,Sucursal sucursal) {
        super(documento, nombre, correo, telefono);
        this.codigoEmpleado = codigoEmpleado;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
        this.sucursal  = sucursal;
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

}
