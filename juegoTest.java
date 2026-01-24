import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ControllerTest {

    @Test
    void juegoNuevoTest() {
        Controller controller = new Controller();

        boolean resultado = controller.juegoNuevo("poker", 100);

        assertTrue(resultado);
    }

    @Test
    void validarApuestaTest() {
        Controller controller = new Controller();

        boolean resultado = controller.validarApuesta(50);

        assertTrue(resultado);
    }

    @Test
    void validarCantidadApuestaTest() {
        Controller controller = new Controller();

        int resultado = controller.validarCantidadApuesta(100);

        assertEquals(100, resultado);
    }
} 