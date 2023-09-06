package CineUncuyo.Adquirible;

public class Producto implements Adquirible {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //region Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    //endregion

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", \nPrecio: " + precio;
    }

    @Override
    public void comprar(){

    }
}
