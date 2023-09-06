package CineUncuyo.Salas;

public class SalaPremium extends Sala{
    private boolean butacasEspaciosas;
    private boolean sonidoEnvolvente;
    private boolean pantallaAgrandada;

    public SalaPremium(){
        super();
    }

    public SalaPremium(int id, int[][] asientos){
        super(id, asientos);
    }

    @Override
    public boolean comparar(Sala sala) {
        return super.comparar(sala);
    }
}

