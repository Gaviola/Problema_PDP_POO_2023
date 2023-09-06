package CineUncuyo.Salas;

public class Sala {
    private int id;
    private int[][] asientos;

    //region Constructores
    public Sala(){
        asientos = new int[10][10];
    }
    public Sala(int id, int[][] asientos) {
        this.id = id;
        this.asientos = asientos;
    }
    //endregion

    //region Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }
    //endregion

    public boolean comparar(Sala sala) {
        return this.id == sala.id;
    }

    public void limpiarAsientos(){
        asientos = new int[10][10];
    }

}
