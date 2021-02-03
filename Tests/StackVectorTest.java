import org.junit.Test;

import static org.junit.Assert.*;

public class StackVectorTest {

    @Test
    public void pop() {
        StackVector<Integer> prueba = new StackVector<Integer>();
        prueba.Push(1);
        prueba.Push(2);

        int resultado = prueba.Pop();

        assertEquals(2, resultado);
    }
}