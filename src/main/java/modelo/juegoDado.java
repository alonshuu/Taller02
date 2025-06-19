package modelo;

public class juegoDado {
    private Dado dado1;
    private Dado dado2;
    private Calculadora calculadora;

    public juegoDado() {
        dado1 = new Dado();
        dado2 = new Dado();
        calculadora = new Calculadora();
    }

    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();
    }

    public boolean esGanador() {
        int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
        return suma == 7;
    }

    public int getSuma() {
        return calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
    }

    public int getValorDado1() {
        return dado1.getCaraSuperior();
    }

    public int getValorDado2() {
        return dado2.getCaraSuperior();
    }
}
