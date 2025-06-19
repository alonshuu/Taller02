package modelo;

import java.util.Random;

public class Dado {
    private int caraSuperior;
    private static final Random random = new Random();


    public void lanzar() {
        caraSuperior = random.nextInt(6) + 1;
    }

    public int getCaraSuperior() {
        return caraSuperior;
    }
}
