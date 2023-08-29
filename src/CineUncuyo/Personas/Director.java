package CineUncuyo.Personas;
import CineUncuyo.Peliculas.Pelicula;
import java.util.ArrayList;

public class Director extends Persona {
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Actor> actoresPreferidos;

    //region Getters y Setters
    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }

    public void addPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }

    public ArrayList<Actor> getActoresPreferidos(){
        return actoresPreferidos;
    }

    public void addActorPreferido(Actor actor){
        actoresPreferidos.add(actor);
    }
    //endregion
}
