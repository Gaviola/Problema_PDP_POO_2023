package CineUncuyo.Personas;
import CineUncuyo.Peliculas.Pelicula;
import java.util.ArrayList;

public class Actor extends Persona {
    private ArrayList<Pelicula> peliculas;

    public ArrayList<Pelicula> getPeliculas(){
        return peliculas;
    }

    private void addPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
}
