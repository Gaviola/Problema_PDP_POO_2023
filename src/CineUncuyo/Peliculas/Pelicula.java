package CineUncuyo.Peliculas;

import CineUncuyo.Personas.Actor;
import CineUncuyo.Personas.Director;

public class Pelicula {
    private String nombre;
    private Director[] directores;
    private Actor[] elenco;
    private Genero[] generos;
    private int restriccionDeEdad;

    //region Constructor
    public Pelicula(){
        nombre = "";
    }

    public Pelicula(String nombre, Director[] directores, Actor[] elenco,
                    Genero[] generos, int restriccionDeEdad) {
        this.nombre = nombre;
        this.directores = directores;
        this.elenco = elenco;
        this.generos = generos;
        this.restriccionDeEdad = restriccionDeEdad;
    }
    //endregion

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director[] getDirectores() {
        return directores;
    }

    public void setDirectores(Director[] directores) {
        this.directores = directores;
    }

    public Actor[] getElenco() {
        return elenco;
    }

    public void setElenco(Actor[] elenco) {
        this.elenco = elenco;
    }

    public Genero[] getGeneros() {
        return generos;
    }

    public void setGeneros(Genero[] generos) {
        this.generos = generos;
    }

    public int getRestriccionDeEdad() {
        return restriccionDeEdad;
    }

    public void setRestriccionDeEdad(int restriccionDeEdad) {
        this.restriccionDeEdad = restriccionDeEdad;
    }

    //endregion

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", \nGénero: " + generos + ", \nRestricción de edad: "
                + restriccionDeEdad + ", \nAutor: " + directores;
    }
}
