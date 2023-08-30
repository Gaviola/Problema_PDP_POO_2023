package CineUncuyo;

import CineUncuyo.Peliculas.Pelicula;
import CineUncuyo.Salas.Sala;

import java.time.LocalDateTime;

public class Funcion {
    private LocalDateTime horario;
    private String idioma;
    private boolean esDoblada;
    private Sala sala;
    private Pelicula pelicula;

    //region Constructores
    public Funcion(LocalDateTime horario, String idioma, boolean esDoblada, Sala sala, Pelicula pelicula) {
        this.horario = horario;
        this.idioma = idioma;
        this.esDoblada = esDoblada;
        this.sala = sala;
        this.pelicula = pelicula;
    }

    public Funcion() {
        this(LocalDateTime.now(), "", false, new Sala(), new Pelicula());
    }
    //endregion

    //region Getters y Setters
    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isEsDoblada() {
        return esDoblada;
    }

    public void setEsDoblada(boolean esDoblada) {
        this.esDoblada = esDoblada;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
    //endregion

    @Override
    public String toString() {
        return "Horario: " + horario + ", \nPelícula: " + pelicula + ", \nIdioma: "
                + idioma + ", \nCineUncuyo.Salas.Sala: " + sala + ", \nEs doblada: " + esDoblada;
    }
}
