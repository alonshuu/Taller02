package app;

import vista.ConsolaDados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsolaDados consola = new ConsolaDados(scanner);
        consola.menu();
    }
}