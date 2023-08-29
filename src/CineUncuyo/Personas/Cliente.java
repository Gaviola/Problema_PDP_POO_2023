package CineUncuyo.Personas;
import CineUncuyo.*;
import CineUncuyo.Adquirible.Adquirible;
import CineUncuyo.Adquirible.Entrada;
import CineUncuyo.Adquirible.Producto;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente extends Persona{
    private int id;
    private ArrayList<Adquirible> reservas;

    //region Constructores
    public Cliente() {
        super();
        this.id = -1;
    }

    public Cliente(int id, String nombre, String apellido, LocalDate fechaDeNacimiento) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
    }
    //endregion

    //region Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Adquirible> getReservas(){
        return reservas;
    }
    //endregion

    @Override
    public String toString() {
        return "ID: " + id + "\n" + super.toString();
    }

    public void reservar(Adquirible adquirible){
        reservas.add(adquirible);
    }

    public Funcion[] buscarFuncionPorHorario() {
        //Logica de la funcion
        return new Funcion[]{};
    }

    public Funcion[] buscarFuncionPorPelicula() {
        //Logica de la funcion
        return new Funcion[]{};
    }

    public Funcion[] buscarFuncionPorGenero() {
        //Logica de la funcion
        return new Funcion[]{};
    }
}
