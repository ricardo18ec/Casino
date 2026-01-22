public class poker {
    
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

    //metodos
    public void repartirCartas(){
        // Metodo para repartir cartas a los jugadores
    }
    public String determinarGanador(){
        // Metodo para determinar el ganador del juego
        return "Ganador";
    }
    public void comenzarJuego(){
        // Metodo para comenzar el juego
    }
    public void terminarJuego(){
        // Metodo para terminar el juego
    }
    public void pausarJuego(){
        // Metodo para pausar el juego
    }
    public void entregarPremio(){
        // Metodo para entregar premios al ganador
    }
    public void pedirApuestas(){
        // Metodo para pedir apuestas a los jugadores
    }
}
