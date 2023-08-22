public class Pelicula {
    private String nombre;
    private String autor;
    private String[] elenco;
    private String genero;
    private int restriccionDeEdad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getRestriccionDeEdad() {
        return restriccionDeEdad;
    }

    public void setRestriccionDeEdad(int restriccionDeEdad) {
        this.restriccionDeEdad = restriccionDeEdad;
    }
}
