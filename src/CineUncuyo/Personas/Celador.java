package CineUncuyo.Personas;

import CineUncuyo.Cine;
import CineUncuyo.Salas.Sala;

public class Celador<T extends Sala> extends Persona {
    private Cine cine;

    private void Limpiar(){

    }

    private void CerrarSala(){
        cine.CerrarSala(T);
    }
}
