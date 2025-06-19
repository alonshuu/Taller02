package vista;

import modelo.JuegoDados;
import java.util.Scanner;

public class ConsolaDados {
    Scanner scanner = new Scanner(System.in);

    /**
     * Controla el ciclo principal del menú del sistema.
     */
    public void menu() {
        int opcion;
        do {
            mostrarOpciones();
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
                ejecutarOpcion(opcion);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor ingrese un número.");
                opcion = -1;
            }
        } while (opcion != 0);
    }

    private void mostrarOpciones() {
        System.out.println("---- BIENVENIDO ----");
        System.out.println("[1] Juego Individual");
        System.out.println("[2] Juego Versus");
        System.out.println("[3] Salir");
    }

    private void ejecutarOpcion(int opcion) {
        try {
            switch (opcion) {
                case 1 -> jugar();
                case 2 -> new ConsolaJuegoVersus().jugar();
                case 3 -> {
                    System.out.print("¿Seguro que quiere salir del programa? (S/N): ");
                    String salir = scanner.nextLine().trim();
                    if (salir.equalsIgnoreCase("S")) {
                        System.out.println("Adiós...");
                        System.exit(0); // Termina el programa
                    } else if (salir.equalsIgnoreCase("N")) {
                        System.out.println("Regresando al menú...");
                    } else {
                        System.out.println("Opción inválida. Regresando al menú...");
                    }
                }
                default -> System.out.println("Opción inválida");
            }
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }
    }
    private void jugar() {
        JuegoDados juego = new JuegoDados();
        int suma = juego.jugar();
        System.out.println("Dado 1: " + juego.getDado1());
        System.out.println("Dado 2: " + juego.getDado2());
        System.out.println("Suma: " + suma);
        if (suma >= 7) {
            System.out.println("¡Ganaste!");
        } else {
            System.out.println("Perdiste.");
        }
    }
}