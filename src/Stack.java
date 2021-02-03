/*
    Juan Diego Avila Sastume     20090
    Hoja de trabajo 02, Calculadora.

    Stack<T>,

 */

/**
 * clase generica que contiene todas las operaciones necesarias para manejar luego el StackVector.
 * **/
public interface Stack<T> {

    /**
     * Metodo de tipo boolean que regresa true si esta vacio y false si tiene algun valor.
     * **/
    public boolean empty();

    /**
     * Metodo que regresa el tamaño del Stack Vector.
     * **/
    public int size();

    /**
     * Metodo que elimina el ultimo valor que se encuentra en el Stack y regresa dicho valor.
     * **/
    public T pop();

    /**
     * Metodo que agrega un elemento en la ultima posicion del Stack.
     * **/
    public void push(T num);

    /**
     * Metodo que regresa el valor del primer elemento del Stack.
     * **/
    public T peek();

}
