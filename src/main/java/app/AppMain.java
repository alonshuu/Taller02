package app;

import controlador.JuegoDadoConsola;

import java.util.Scanner;

public class AppMain {
    private static final Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {
        boolean seguir = true;

        while (seguir) {
            mostrarMenuPrincipal();
            int op = leerEntero("Elige una opción: ");

            switch (op) {
                case 1 -> new JuegoDadoConsola().ejecutar();   // 1 jugador
                case 2 -> System.out.println("------------no valido-----------");
                case 3 -> seguir = false;
                default -> System.out.println("Opción no válida.");
            }
            System.out.println();
        }
        System.out.println("Programa finalizado. ¡Hasta luego!");
        SCAN.close();
    }

    private static void mostrarMenuPrincipal() {
        System.out.println("===== MENÚ DEL JUEGO DE DADOS =====");
        System.out.println("[1] Partida individual");
        System.out.println("---- no valido todavia---");
        System.out.println("[3] Salir");
    }

    private static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            if (SCAN.hasNextInt()) {
                int n = SCAN.nextInt();
                SCAN.nextLine();
                return n;
            }
            System.out.println("Ingresa un número válido.");
            SCAN.nextLine();
        }
    }
}

