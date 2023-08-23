public class Cliente {
    private String nombre;
    private String apellido;
    private int id;

    //region Constructores
    public Cliente() {
       this.id = -1;
       this.nombre = "";
       this.apellido = "";
    }

    public Cliente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //endregion

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //endregion

    @Override
    public String toString() {
        return "ID: " + id + ", \nNombre: " + nombre + ", \nApellido: " + apellido;
    }

    public Funcion reservar() {
        //Logica de la funcion
        return new Funcion();
    }

    public Producto reservarProducto() {
        //Logica de la funcion
        return new Producto();
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
