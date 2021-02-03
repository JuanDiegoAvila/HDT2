import java.io.File;
import java.util.Scanner;
/*
    Juan Diego Avila Sastume     20090
    Hoja de trabajo 02, Calculadora.

    mainJD,

 */
/**
 * clase encargada de leer el archivo y de separarlo para enviarlo a la calculadora.
 * **/
public class mainJD{
    /**
     * Metodo main, que lee el archivo de texto y trabaja junto a la clase Calculadora y StackVector para encontrar el resultado.
     * **/
    public static void main(String[]args){

        /*
            Codigo extraido de  https://decodigo.com/java-leer-un-archivo-de-texto
            Almacena lo que contiene datos.txt en variable string datos.
        */

        String datos = "";

        try{

            Scanner archivo = new Scanner(new File("datos.txt"));

            //revisa si existen mas lineas dentro del texto.
            while (archivo.hasNextLine()){
                datos += archivo.nextLine();
            }

            archivo.close();

        }catch (Exception ex){
            ex.printStackTrace();

        }

        //crea un array de todos los datos que se leyeron en el documento
        String [] operacion = datos.split(" ");
        String calc = "";
        int resultado = 0;
        StackVector<Integer> calculo = new StackVector<Integer>();
        Calculadora calculadora = new Calculadora();

        //por cada elemento que se obtuvo del documento se revisa si es entero o no.
        for (String op : operacion) {

            if(Character.isDigit(op.charAt(0))){
                calculo.Push(Integer.parseInt(op)); // se inserta hasta el final del StackVector

            }

            else{ //si no es numero automaticamente lo considera como un operador


                int var1 = calculo.Pop();
                int var2 = calculo.Pop();

                calc = var1+","+op+","+var2; //arma una cadena de texto con las variables y el operador en orden que fueron extraidos.

                System.out.println("\nEstado : ");
                System.out.println("\t"+var1+" "+op+" "+var2);

                resultado = Integer.parseInt(calculadora.Calculo(calc)); //llama a clase calculadora y recibe un string, que luego convierte a entero.
                calculo.Push(resultado); //inserta el resultado hasta el final del StackVector.
            }

            if(calculo.Empty()){
                break;
            }
        }

        System.out.println("\nResultado : "+calculo.Peek()); //Regresa al ultimo valor, que deberia ser el resultado

    }


}


