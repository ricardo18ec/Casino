import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class juegoTest {


public class JuegoTest {

    @Test
    void apostar_debeFallar_siEsMenorAlMinimo() {
        Juego juego = new Juego();

        assertThrows(IllegalArgumentException.class, () -> {
            juego.apostar(30.0);
        });
    }

    @Test
    void apostar_debePermitir_siEsIgualAlMinimo() {
        Juego juego = new Juego();

        assertDoesNotThrow(() -> {
            juego.apostar(50.0);
        });
    }

    @Test
    void apostar_debePermitir_siEsMayorAlMinimo() {
        Juego juego = new Juego();

        assertDoesNotThrow(() -> {
            juego.apostar(100.0);
        });
    }
}

}
