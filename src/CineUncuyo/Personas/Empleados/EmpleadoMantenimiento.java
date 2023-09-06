package CineUncuyo.Personas.Empleados;

import CineUncuyo.Salas.Sala;

import java.time.LocalDate;

public class EmpleadoMantenimiento<T extends Sala> extends Empleado{
    private T salaActual;

    public EmpleadoMantenimiento(String nombre, String apellido, LocalDate fechaDeNacimiento, String cuit, float salario) {
        super(nombre, apellido, fechaDeNacimiento, cuit, salario);
    }

    public void setSalaActual(T sala){
        salaActual = sala;
    }

    public void trabajar(){
        limpiar(salaActual);
    }

    private void limpiar(T sala){
        sala.limpiarAsientos();
    }
}
