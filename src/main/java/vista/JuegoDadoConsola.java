package vista;

import modelo.juegoDado;

import java.util.Scanner;

public class JuegoDadoConsola {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            menuRonda();
            int opcion = validarEntero("\n por favor elige una opcion ");
            switch (opcion) {
                case 1 -> jugarRonda();
                case 2 -> continuar = !confirmarSalida(); //
                default -> System.out.println("opcion no válida, ingresa una correcta por favor");
            }
            System.out.println();
        }
        System.out.println("..............");
        System.out.println("...........");
        System.out.println("....");
        System.out.println("...");
        scanner.close();
    }
    private static void menuRonda() {
        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("[1] jugar una ronda (lanzar los dados)");
        System.out.println("[2] salir de la app");
    }

    private static void jugarRonda() {
        juegoDado partida = new juegoDado();
        partida.jugar();

        int dado1 = partida.getValorDado1();
        int dado2 = partida.getValorDado2();
        int suma  = partida.getSuma();

        System.out.println("resultados:");
        System.out.println("");
        System.out.println("valor dado 1 : " + dado1);
        System.out.println("valor dado 2 : " + dado2);
        System.out.println("suma de ambos dados: " + suma);

        if (partida.esGanador()) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdedor...");
        }
    }

    private static boolean confirmarSalida() {
        String resp = leerCadena("¿Está seguro que desea salir? (S/N): ").trim().toLowerCase();
        return resp.equals("s");
    }

    private static int validarEntero(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                scanner.nextLine(); //
                return num;
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.nextLine();
            }
        }
    }

    private static String leerCadena(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}
