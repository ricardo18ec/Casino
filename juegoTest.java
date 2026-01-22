import static org.junit.Assert.assertEquals;

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
    public boolean validarApuesta(){
        controller controller = new controller();
        boolean resultado = controller.validarApuesta(60);
        assertEquals(false, resultado);
        return true;
    }

    


}

}
