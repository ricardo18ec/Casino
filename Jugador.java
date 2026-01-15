public class Jugador {
    
    public String Nombre;
    public int Saldo;
    public int Edad;

    // metodos
    public void mostrarNombre(){
        System.out.println("El nombre del jugador es: " + Nombre);
    }
    public void recibirCartas(){
        System.out.println("El jugador " + Nombre + " ha recibido sus cartas.");
    }
    public void apostar(){
        System.out.println("El jugador " + Nombre + " ha realizado una apuesta.");
    }
    public void jugarCartas(){
        System.out.println("El jugador " + Nombre + " está jugando sus cartas.");
    }
    public void actualizarSaldo(){
        System.out.println("El saldo del jugador " + Nombre + " ha sido actualizado.");
    }
    public void verSaldoActual(){
        System.out.println("El saldo actual del jugador " + Nombre + " es: " + Saldo);
    }

}