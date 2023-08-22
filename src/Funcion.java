import java.time.LocalDateTime;

public class Funcion {
    private LocalDateTime horario;
    private String idioma;
    private boolean esDoblada;
    private Sala sala;
    private Pelicula pelicula;

    public Funcion comprar(){

    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
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
}
