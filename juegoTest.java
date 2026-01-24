import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    void juegoNuevoTest() {
        controller controller = new controller();

        boolean resultado = controller.juegoNuevo("poker", 100);

        assertTrue(resultado);
    }

    @Test
    void validarApuestaTest() {
        controller controller = new controller();

        boolean resultado = controller.validarApuesta(50);

        assertTrue(resultado);
    }

    @Test
    void verificarDepositoTest() {
        controller controller = new controller();

        boolean resultado = controller.verificarDeposito(200);

        assertTrue(resultado);
    }
}
