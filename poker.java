public class poker implements Juego {
    
    // atributos

    private String Nombre;
    private int numeroJugadores;
    private Dealer dealer;
    private Jugador[] jugadores;
    private Cartas[] cartas;
    private int cantidadMinimaApostar;

    //Constructores
    public poker(String Nombre, int numeroJugadores, Dealer dealer, Jugador[] jugadores, Cartas[] cartas, int cantidadMinimaApostar) {
        this.Nombre = Nombre;
        this.numeroJugadores = numeroJugadores;
        this.dealer = dealer;
        this.jugadores = jugadores;
        this.cartas = cartas;
        this.cantidadMinimaApostar = cantidadMinimaApostar;
    }


    public boolean repartirCartas() {



        
       return true;
    }

}
