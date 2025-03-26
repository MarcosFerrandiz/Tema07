package com.marcosferrandiz.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array5Nums = new int[5];
        rellenarArray(array5Nums);

        int[] arraySinDeclarar = null;
        rellenarArray(arraySinDeclarar);
    }

    /**
     * Metodo para rellenar el array, aparte si el array esta vacio te saodrá que no esta creado y si pones algo que no es un número te avisa
     * @param array Es el array que debemos de rellenar con números enteros
     */
    public static void rellenarArray(int[] array) {
        if (array == null) {
            System.err.println("Error: El array no está creado.");
            return;
        }
        System.out.println("Introduce números enteros:");
        for (int i = 0; i < array.length ; i++) {
            try {
                int numero = scanner.nextInt();
                array[i] = numero;
            } catch (InputMismatchException e) {
                System.err.println("Error: Debes introducir un número entero válido.");
            }
        }
        System.out.println("El array se ha llenado del todo.");
        System.out.print("Contenido del array: " + Arrays.toString(array));
    }

}
