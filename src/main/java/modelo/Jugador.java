package modelo;

public class Jugador {
    private final String nombre;
    private final juegoDado juego;



    public Jugador(String nombre, juegoDado juego) {
        this.nombre = nombre;
        this.juego = juego;
    }

    public void lanzarDados(){
        juego.jugar();
    }

    /// getters

    public String getnombre(){
        return nombre;
    }
    public int getDado1(){
        return juego.getValorDado1();
    }
    public int getDado2(){
        return juego.getValorDado2();
    }

    public int getSuma(){
        return juego.getSuma();
    }
    public boolean gano(){
        return juego.esGanador();
    }





}