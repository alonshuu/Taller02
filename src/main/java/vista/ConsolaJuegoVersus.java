package vista;

import modelo.*;
import java.util.Scanner;

public class ConsolaJuegoVersus {
    private Scanner scanner = new Scanner(System.in);

    public void jugar() {
        System.out.print("Nombre Jugador 1: ");
        Jugador j1 = new Jugador(scanner.nextLine());

        System.out.print("Nombre Jugador 2: ");
        Jugador j2 = new Jugador(scanner.nextLine());

        System.out.print("Número de rondas (1, 3 o 5): ");
        int rondas = Integer.parseInt(scanner.nextLine());

        JuegoVersus juego = new JuegoVersus(j1, j2, rondas);

        while (!juego.terminado()) {
            juego.jugarRonda();
        }

        System.out.println("\n--- Resultado Final ---");
        System.out.println(j1.getNombre() + ": " + j1.getPuntos() + " puntos");
        System.out.println(j2.getNombre() + ": " + j2.getPuntos() + " puntos");
        System.out.println("Ganador: " + juego.ganadorFinal());
    }
}
