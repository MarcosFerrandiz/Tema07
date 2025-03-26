package com.marcosferrandiz.Ejercicio7;

import com.marcosferrandiz.Ejercicio6.Ejercicio6;
import com.marcosferrandiz.lib.SolicitarCosas;

public class Ejercicio7 {
    public static void main(String[] args) {
        //int cantidad = SolicitarCosas.solicitarEntero("Introduzca el tamanyo del array [max 50]",1,50);
        //String[] array = new String[cantidad];
        String[] array = null;
        //rellenarArrayEntero(array);
        mostrarCadenasArray(array);
    }

    /**
     * Metodo para rellenar manualmente un array de Strings
     * @param array
     */
    public static void rellenarArrayString(String[] array){
        String texto ="";
        for (int i = 0; i < array.length ; i++) {
            texto = SolicitarCosas.solicitarStringSinLimite("Introduzca el texto que desea introducir en el array");
            array[i] = texto;
        }
    }

    /**
     * Metodo que muestra el primer caracter sin espacio de una palabra en un array de strings
     * @param array Es el array de strings que queremos ver el primer caracter de cada plabra
     */
    public static void mostrarCadenasArray(String[] array){
        try {
            for (int i = 0; i < array.length ; i++) {
                array[i].replaceAll("\\s","");
                System.out.println(array[i].charAt(0));
            }
        }catch (NullPointerException npe){
            System.err.println("El array esta null, no puedes");
        }
    }
}