public class controller {
    
    // metodos

    public boolean juegoNuevo(String nombreJuego, int cantidadApostar){
        
        Juego juegoNuevo;

        juegoNuevo = new poker("poker", 50, null, null, null, cantidadApostar);  

        if (juegoNuevo != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarApuesta(int cantidadApostar){
        
        if (cantidadApostar >= 50) {
            System.out.println("Apuesta válida, puedes continuar con tu juego.");
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarDeposito(int cantidadDepositar){
        if (cantidadDepositar > 0) {
            System.out.println("Deposito válido, puedes comenzar a jugar");
            return true;
        } else {
            return false;
        }
    }
}
