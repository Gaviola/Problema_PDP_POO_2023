package CineUncuyo;

import CineUncuyo.*;
import CineUncuyo.Personas.Cliente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Facu", "Gaviola",
                LocalDate.of(2001, 8, 5));
        Cliente cliente2 = new Cliente();

        System.out.println(cliente);
        System.out.println();
        System.out.println(cliente2);
    }
}