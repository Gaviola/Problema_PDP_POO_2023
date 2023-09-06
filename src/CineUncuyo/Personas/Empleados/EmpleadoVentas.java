package CineUncuyo.Personas.Empleados;

import CineUncuyo.Adquirible.Adquirible;

import java.time.LocalDate;
import java.util.LinkedList;

public class EmpleadoVentas<T extends Adquirible> extends Empleado {
    private LinkedList<T> ventas;

    public EmpleadoVentas(String nombre, String apellido, LocalDate fechaDeNacimiento, String cuit, float salario) {
        super(nombre, apellido, fechaDeNacimiento, cuit, salario);
    }

    public void vender(T adquirible){
        ventas.add(adquirible);
    }
}
