package modelo;
import java.util.Random;

public class Dado {
    private int cara;

    public void lanzar() {
        this.cara = new Random().nextInt(6) + 1;
    }

    public int getCara() {
        return cara;
    }
}
