package modelo;

public class JuegoVersus {
    private Jugador jugador1;
    private Jugador jugador2;
    private int rondas;
    private int actual;

    public JuegoVersus(Jugador j1, Jugador j2, int rondas) {
        this.jugador1 = j1;
        this.jugador2 = j2;
        this.rondas = rondas;
        this.actual = 1;
    }

    public void jugarRonda() {
        JuegoDados juego1 = new JuegoDados();
        int suma1 = juego1.jugar();

        JuegoDados juego2 = new JuegoDados();
        int suma2 = juego2.jugar();

        System.out.println("\nRonda " + actual);
        System.out.println(jugador1.getNombre() + " sacó: " + suma1);
        System.out.println(jugador2.getNombre() + " sacó: " + suma2);

        if (suma1 > suma2) {
            jugador1.sumarPunto();
            System.out.println("Gana " + jugador1.getNombre());
        } else if (suma2 > suma1) {
            jugador2.sumarPunto();
            System.out.println("Gana " + jugador2.getNombre());
        } else {
            System.out.println("Empate.");
        }
        actual++;
    }

    public boolean terminado() {
        return actual > rondas;
    }

    public String ganadorFinal() {
        if (jugador1.getPuntos() > jugador2.getPuntos()) return jugador1.getNombre();
        else if (jugador2.getPuntos() > jugador1.getPuntos()) return jugador2.getNombre();
        else return "Empate";
    }
}
