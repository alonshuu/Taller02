package vista;

import org.junit.jupiter.api.*;
import java.io.*;
import java.util.Scanner;

public class ConsolaDadosTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }

    @Test
    void testJuegoIndividualGana() {
        String input = "1\n0\n"; // opción 1: jugar, luego salir
        Scanner scanner = new Scanner(new ByteArrayInputStream(input.getBytes()));
        ConsolaDados consola = new ConsolaDados(scanner) {
            @Override
            protected void jugar() {
                System.out.println("Dado 1: 4");
                System.out.println("Dado 2: 4");
                System.out.println("Suma: 8");
                System.out.println("¡Ganaste!");
            }
        };

        consola.menu();

        String output = outContent.toString();
        Assertions.assertTrue(output.contains("¡Ganaste!"));
        Assertions.assertTrue(output.contains("Dado 1: 4"));
    }
}
