public class Pelicula {
    private String nombre;
    private String autor;
    private String[] elenco;
    private Genero genero;
    private int restriccionDeEdad;

    //region Constructor
    public Pelicula(){
        nombre = "";
    }

    public Pelicula(String nombre, String autor, String[] elenco, Genero genero, int restriccionDeEdad) {
        this.nombre = nombre;
        this.autor = autor;
        this.elenco = elenco;
        this.genero = genero;
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

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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
        return "Nombre: " + nombre + ", \nGénero: " + genero + ", \nRestricción de edad: "
                + restriccionDeEdad + ", \nAutor: " + autor;
    }
}
