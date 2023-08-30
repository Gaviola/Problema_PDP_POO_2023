package CineUncuyo.Salas;

public class Sala {
    private int[][] asientos;

    public Sala(){
        asientos = new int[10][10];
        this.asientos = asientos;
    }
    public Sala(int[][] asientos) {
        this.asientos = asientos;
    }
    //region Getters y Setters
    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

}
