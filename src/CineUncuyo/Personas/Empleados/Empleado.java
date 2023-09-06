package CineUncuyo.Personas.Empleados;

import CineUncuyo.Personas.Persona;

import java.time.LocalDate;

public abstract class Empleado extends Persona {
    private String cuit;
    private float salario;

    public Empleado() {
        super();
    }

    public Empleado(String nombre, String apellido, LocalDate fechaDeNacimiento, String cuit, float salario) {
        super(nombre, apellido, fechaDeNacimiento);
        this.cuit = cuit;
        this.salario = salario;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
