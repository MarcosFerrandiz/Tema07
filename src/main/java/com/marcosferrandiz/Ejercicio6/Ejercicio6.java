package com.marcosferrandiz.Ejercicio6;

import com.marcosferrandiz.lib.SolicitarCosas;

public class Ejercicio6 {
    public static void main(String[] args) {
        //int tamanyoArray = SolicitarCosas.solicitarEntero("Introduzca el tamanyo del array [max 50]",0,50);
        //int[] array = new int[tamanyoArray];
        //int numDivi = SolicitarCosas.solicitarEnteroNoLimit("Introduzca un número para ser dividido por el array");
        //rellenarArrayEntero(array);
        //dividirCadaUno(array,numDivi);

        int[] array = {-2,-1,0,1,2};
        int num = 2;
        dividirCadaUno(array,num);
    }

    /**
     * Metodo que rellena arays de forma manual
     * @param array Es el aray que queremos rellenar
     */
    public static void rellenarArrayEntero(int[] array){
        int num=0;
        for (int i = 0; i < array.length ; i++) {
            num = SolicitarCosas.solicitarEnteroNoLimit("Introduzca un numero entero para dividir con el otro numero");
            array[i] = num;
        }
    }
/*
    public static void dividirCadaUno(int[] array, int numDividir){
        int num = 0;
        for (int i = 0; i < array.length ; i++) {
            try{
                num = numDividir / array[i];
                System.out.println(num);
            }catch (ArithmeticException ae){
                System.out.println("No se puede dividir entre 0");
            }
        }
    }
 */

    /**
     * Metodo que divide un numero por cada uno de los numeros de un Array(Ambos son enteros)
     * @param array El array que queremos usar para dividir el numero
     * @param numDividir Es el numero que queremos dividir
     */
    public static void dividirCadaUno(int[] array, int numDividir){
        int num = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i] == 0){
                System.out.println("Tiene que ser distinto de 0");
            }else {
                num = numDividir / array[i];
                System.out.println(num);
            }
        }
    }
}
