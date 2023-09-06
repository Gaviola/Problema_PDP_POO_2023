package CineUncuyo;

import CineUncuyo.*;
import CineUncuyo.Adquirible.Entrada;
import CineUncuyo.Peliculas.Pelicula;
import CineUncuyo.Personas.Cliente;
import CineUncuyo.Personas.Empleados.EmpleadoVentas;
import CineUncuyo.Salas.Sala;
import CineUncuyo.Salas.SalaPremium;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Facu", "Gaviola",
                LocalDate.of(2001, 8, 5));
        Cliente cliente2 = new Cliente();

        Cliente[] clientes = new Cliente[]{ cliente, cliente2 };

        System.out.println(cliente);
        System.out.println();
        System.out.println(cliente2);

        var pelicula = new Pelicula();
        Sala sala1 = new Sala(1, new int[6][6]);
        SalaPremium sala2 = new SalaPremium(2, new int[7][7]);
        var funcion = new Funcion(LocalDateTime.now(), "Español", false, sala1, pelicula);

        System.out.println(Utilidades.Comparar(sala1, sala2));

        Cliente cliente3 = new Cliente();
        var clientesList = Utilidades.fromArrayToList(clientes);
        clientesList.add(cliente3);

        var empVentasEntradas = new EmpleadoVentas<Entrada>("Pablo", "Vidal",  LocalDate.of(2001, 8, 5),
                "25216545441", 2.0f);
        var entrada = new Entrada(LocalDateTime.now(), funcion, "A1");

        empVentasEntradas.vender(entrada);
    }
}