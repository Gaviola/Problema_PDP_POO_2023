public class Sala {
    private int[][] asientos;
    private boolean es3D;
    private boolean sonidoEnvolvente;
    private boolean butacasEspaciosas;

    public int[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[][] asientos) {
        this.asientos = asientos;
    }

    public boolean isEs3D() {
        return es3D;
    }

    public void setEs3D(boolean es3D) {
        this.es3D = es3D;
    }

    public boolean isSonidoEnvolvente() {
        return sonidoEnvolvente;
    }

    public void setSonidoEnvolvente(boolean sonidoEnvolvente) {
        this.sonidoEnvolvente = sonidoEnvolvente;
    }

    public boolean isButacasEspaciosas() {
        return butacasEspaciosas;
    }

    public void setButacasEspaciosas(boolean butacasEspaciosas) {
        this.butacasEspaciosas = butacasEspaciosas;
    }
}
