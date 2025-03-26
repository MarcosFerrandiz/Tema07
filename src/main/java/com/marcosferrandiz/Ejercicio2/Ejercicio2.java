package com.marcosferrandiz.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double numeroGrande = solicitarNumeros("Introduzca 10 números");
        System.out.println("El numero mas grande es "+ numeroGrande);
    }

    /**
     * Solicita 10 numeros, en el acaso de que pongas letra se te volverá a solicitar un número, al final del metodo mostrar la cantidad de veces que salio la excepción, y en el
     * @param mensaje Es el mensaje de las cosas que quieres solicitar, en este caso indicar al usuario que debe de introducir 10 números
     * @return Devuelve el número double mas grande introducido
     */
    public static double solicitarNumeros(String mensaje){
        double[] numeroIntroducidos = new double[10];
        double num = 0;
        int cantExcepciones = 0;
        boolean valido = true;
        for (int i = 0; i < 10 ; i++) {
            do {
                try{
                    num = Double.parseDouble(scanner.nextLine());
                    numeroIntroducidos[i] = num;
                    valido = true;
                }catch (NumberFormatException nfe){
                    System.err.println("No se puede introducir letras");
                    cantExcepciones++;
                    valido = false;
                }
            }while (!valido);
        }
        double aux = numeroIntroducidos[0];
        for (int i = 0; i < numeroIntroducidos.length ; i++) {
            if (aux <= numeroIntroducidos[i]){
                aux = numeroIntroducidos[i];
            }
        }
        System.out.println(" Has hecho "+ cantExcepciones+ " errores");
        return aux;
    }
}
