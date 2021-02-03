import org.junit.Test;

import static org.junit.Assert.*;

public class StackVectorTest {

    @Test
    public void pop() {
        StackVector<Integer> prueba = new StackVector<Integer>();
        prueba.push(1);
        prueba.push(2);

        int resultado = prueba.pop();

        assertEquals(2, resultado);
    }
}