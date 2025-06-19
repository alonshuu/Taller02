package controlador;

import java.util.Scanner;
import modelo.juegoDado;

public class JuegoDadoConsola {
    private final Scanner scan = new Scanner(System.in);

    public void ejecutar() {
        boolean continuar = true;

        while (continuar) {
            mostrarMenuRonda();
            int op = leerEntero("Opción: ");

            switch (op) {
                case 1 -> jugarRonda();
                case 2 -> continuar = !confirmarSalida();
                default -> System.out.println("Opción no válida.");
            }
            System.out.println();
        }
    }

    // logica anterior
    private void mostrarMenuRonda() {
        System.out.println("\nronda en solitario!!!");
        System.out.println("[1] Lanzar los dados");
        System.out.println("[2] Salir de la partida");
    }

    private void jugarRonda() {
        juegoDado partida = new juegoDado();
        partida.jugar();

        System.out.println("Valor del dado 1 : " + partida.getValorDado1());
        System.out.println("valor del dado 2: " + partida.getValorDado2());
        System.out.println("suma  : " + partida.getSuma());

        System.out.println(partida.esGanador()
                ? "Ganaste" : "Perdiste");
    }

    private boolean confirmarSalida() {
        System.out.print("¿Seguro que deseas salir? (S/N): ");
        return scan.nextLine().trim().equalsIgnoreCase("S");
    }




    private int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            if (scan.hasNextInt()) {
                int n = scan.nextInt();
                scan.nextLine();
                return n;
            }
            System.out.println("Número inválido, inténtalo de nuevo.");
            scan.nextLine();
        }
    }
}

