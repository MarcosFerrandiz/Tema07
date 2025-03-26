package com.marcosferrandiz.Ejercicio9;

import com.marcosferrandiz.lib.SolicitarCosas;

public class Ejercicio9 {
    public static void main(String[] args) {
        int[] array3 = new int[3];
        int[] arrayNull = null;
        int num = 2;
        detonadorDeExcepciones(array3,2);
        //detonadorDeExcepciones(arrayNull,2);
    }

    /**
     * Metodo que parece un detonador, que hagas lo que hagas va a acabar en excepcion y fallo
     * @param array Es el array para hacer pruebas
     * @param num Es el numero para hacer pruebas
     */
    public static void detonadorDeExcepciones(int[] array, int num) throws InvalidFueraDeRangoException, InvalidNumber0Exception, InvalidNullArrayException {
        int resultadoDivi;
        int contador = 0;
        boolean valido = false;
        try{
            if (array.equals(null)) {
                System.out.println("Son iguales");
            }else {
                while (!valido){
                    try{
                        array[contador] = SolicitarCosas.solicitarEnteroNoLimit("Escriba el numero a ingresar [1 - 50]");
                        resultadoDivi = num / array[contador];
                        System.out.println("Llevas puestos " + contador + " numeros puestos, el divisor es: "+array[contador]);
                        contador++;
                    }catch (ArithmeticException ae){
                        throw new InvalidNumber0Exception("El divisor no puede ser 0");
                    }catch (IndexOutOfBoundsException ioob){
                        throw new InvalidFueraDeRangoException("Te has pasado del limite del array");
                    }
                }
            }
        }catch (NullPointerException npe){
            throw new InvalidNullArrayException("El array esta vacio");
        }

    }
}
