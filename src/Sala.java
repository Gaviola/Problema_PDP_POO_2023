public class Sala {
    private int[][] asientos;
    private boolean es3D;
    private boolean sonidoEnvolvente;
    private boolean butacasEspaciosas;

    //region Getters y Setters
    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

    public boolean getEs3D() {
        return es3D;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public boolean tieneSonidoEnvolvente() {
        return sonidoEnvolvente;
    }

    public void setSonidoEnvolvente(boolean sonidoEnvolvente) {
        this.sonidoEnvolvente = sonidoEnvolvente;
    }

    public boolean tieneButacasEspaciosas() {
        return butacasEspaciosas;
    }

    public void setButacasEspaciosas(boolean butacasEspaciosas) {
        this.butacasEspaciosas = butacasEspaciosas;
    }
    //endregion
}
