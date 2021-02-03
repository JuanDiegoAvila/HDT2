import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {


    @Test
    public void calculo() {
        Calculadora prueba = new Calculadora();

        String operacion = "12,+,3"; //todas las operaciones se separan con , para ver operandos y operacion
        int resultado = Integer.parseInt(prueba.Calculo(operacion));

        assertEquals(15,resultado);
    }
}