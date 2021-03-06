/*
    Juan Diego Avila Sagastume     20090
    Hoja de trabajo 02, Calculadora.

 */



import java.util.*;

/**
 * StackVector<T>, clase generica que implementa la clase Stack<T> y que utiliza las operaciones del tipo vector para almacenar los datos.
 * **/
public class StackVector<T> implements Stack<T>{

    public Vector<T> vector;

    public StackVector(){
        vector = new Vector<T>();
    }

    //regresa true si esta vacio y false si esta lleno
    public boolean empty(){
        return vector.isEmpty();
    }

    //regresa la cantidad de elementos en el vector. 
    public int size(){
        return vector.size();
    }

    //regresa el ultimo valor del stack.
    public T pop(){
        //busca el ultimo elemento del vector.
        T valor = vector.get(vector.indexOf(vector.lastElement()));
        vector.remove(valor);
        return valor;
    }

    //agrega el num al final del stack
    public void push(T num){
        vector.addElement(num);
    }

    //regresa el valor que esta al inicio del stack.
    public T peek(){

        return vector.get(vector.indexOf(vector.firstElement()));
    }


}