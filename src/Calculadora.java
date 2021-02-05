/*
    Juan Diego Avila Saga+stume     20090
    Hoja de trabajo 02, Calculadora.

    Calculadora,

 */

/**
 * clase que simula una calculadora con la cadena de texto que recibe, implementa CalculadoraGeneral.
 * **/
public class Calculadora implements CalculadoraGeneral{

    //revisa el tipo de operador y realiza la operacion indicada, regresando como string el resultado

    public String Calculo(String expresion){

        //crea un array de todos los datos que se leyeron en el documento
        String [] operacion = expresion.split(" ");
        int resultado = 0;
        StackVector<Integer> calculo = new StackVector<Integer>();
        

        //por cada elemento que se obtuvo del documento se revisa si es entero o no.
        for (String op : operacion) {

            if(Character.isDigit(op.charAt(0))){
                calculo.push(Integer.parseInt(op)); // se inserta hasta el final del StackVector

            }

            else{ //si no es numero automaticamente lo considera como un operador


                int var1 = calculo.pop();
                int var2 = calculo.pop();

                switch(op){
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

                
                calculo.push(resultado); //inserta el resultado hasta el final del StackVector.
            }

            if(calculo.empty()){
                break;
            }
        }
        //en la posicion 1 se encuentre el operador por lo que se define la operacion segun su valor.
        
        return ""+resultado;
    }



}
