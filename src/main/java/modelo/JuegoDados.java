package modelo;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public int jugar() {
        dado1.lanzar();
        dado2.lanzar();
        return dado1.getCara() + dado2.getCara();
    }

    public int getDado1() {
        return dado1.getCara();
    }

    public int getDado2() {
        return dado2.getCara();
    }

    public boolean esGanador() {
        return getDado1() + getDado2() == 7;
    }
}
