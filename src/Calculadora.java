/*
    Juan Diego Avila Sastume     20090
    Hoja de trabajo 02, Calculadora.

    Calculadora,

 */

/**
 * clase que simula una calculadora con la cadena de texto que recibe, implementa CalculadoraGeneral.
 * **/
public class Calculadora implements CalculadoraGeneral{

    //revisa el tipo de operador y realiza la operacion indicada, regresando como string el resultado

    public String Calculo(String texto){

        int resultado = 0;

        //separa el String recibido para poder utilizar las dos variables y el operador.
        String[] op = texto.split(",");
        int var1 = Integer.parseInt(op[0]);
        int var2 = Integer.parseInt(op[2]);

        //en la posicion 1 se encuentre el operador por lo que se define la operacion segun su valor.
        switch(op[1]){
            case "+":
                resultado = var1 + var2;
                break;

            case "-":
                resultado = var1 - var2;
                break;

            case "*":
                resultado = var1 * var2;
                break;

            case "/":
                resultado = var1 / var2;
                break;
        }
        return ""+resultado;
    }



}
