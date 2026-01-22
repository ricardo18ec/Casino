import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class juegoTest {


public class JuegoTest {

    @Test
    boolean juegoNuevoTest() {
        controller controller = new controller();
        boolean resultado = controller.juegoNuevo("poker", 100);
        assertEquals(false, resultado);
        return true;
    }

    @Test
    boolean validarCantidadApuestaTest(){
        controller controller = new controller();
        
    }
}

}
