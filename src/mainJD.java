import java.io.File;
import java.util.Scanner;
/*
    Juan Diego Avila Sagastume     20090
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
        Calculadora calculadora = new Calculadora();

        try{

            Scanner archivo = new Scanner(new File("datos.txt"));

            //revisa si existen mas lineas dentro del texto.
            while (archivo.hasNextLine()){
                datos = archivo.nextLine();
                String result = calculadora.Calculo(datos);

                System.out.println("\n Resultado de  "+datos+" = "+Integer.parseInt(result));
            }

            archivo.close();

        }catch (Exception ex){
            ex.printStackTrace();

        }


        
        

    }


}


