package CineUncuyo;
import CineUncuyo.Salas.Sala;

import java.util.ArrayList;

public class Cine {
    private String direccion;
    private ArrayList<Funcion> funciones;
    private Sala[] salas;

    //region Getters y Setters
    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public ArrayList<Funcion> getFunciones(){
        return funciones;
    }

    public void addFuncion(Funcion funcion){
        funciones.add(funcion);
    }

    public Sala[] getSalas() {
        return salas;
    }

    public void setDirectores(Sala[] salas) {
        this.salas = salas;
    }
    //endregion
}
