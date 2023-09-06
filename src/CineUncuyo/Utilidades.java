package CineUncuyo;
import CineUncuyo.Salas.Sala;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Utilidades<T> {

    public static <T extends Funcion> boolean Comparar(T objeto1, T objeto2){
        return objeto1.comparar(objeto2);
    }

    public static <T extends Cine> boolean Comparar(T objeto1, T objeto2){
        return objeto1.comparar(objeto2);
    }

    public static <T extends Sala> boolean Comparar(T objeto1, T objeto2){
        return objeto1.comparar(objeto2);
    }

    static <T> LinkedList<T> fromArrayToList(T[] a) {
        LinkedList<T> list = new LinkedList<T>();
        for (T o : a) {
            list.add(o);
        }
        return list;
    }

}
