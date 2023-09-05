import CineUncuyo.Funcion;

public class Utilidades<T> {

    public static <T extends Funcion,Cine,Sala> boolean Comprarar(T objeto1, T objeto2){
        return objeto1.comparar(objeto2);
    }


}
