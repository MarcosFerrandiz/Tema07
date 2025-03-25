package com.marcosferrandiz.Ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double numeroGrande = solicitarNumeros("Introduzca 10 numeros");
        System.out.println("El numero mas grande es "+ numeroGrande);
    }
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
