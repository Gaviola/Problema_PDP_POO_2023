package CineUncuyo.Personas;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;

    //region Constructores
    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.fechaDeNacimiento = LocalDate.MAX;
    }

    public Persona(String nombre, String apellido, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    //endregion

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fecha) {
        this.fechaDeNacimiento = fecha;
    }
    //endregion

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", \nApellido: " + apellido;
    }

}
