package CineUncuyo.Adquirible;
import CineUncuyo.Funcion;
import java.time.LocalDateTime;

public class Entrada implements Adquirible {
    private LocalDateTime fechaDeCompra;
    private Funcion funcion;
    private String asiento;

    //region Getters y Setters
    public LocalDateTime getFechaDeCompra() {
        return fechaDeCompra;
    }

    public void setFechaDeCompra(LocalDateTime fechaDeCompra) {
        this.fechaDeCompra = fechaDeCompra;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }
    //endregion

    @Override
    public void comprar() {

    }
}
