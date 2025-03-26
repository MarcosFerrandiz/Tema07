package com.marcosferrandiz.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            solicitarNumero();
        }catch (NumberFormatException ine){
            System.out.println(ine);
        }
    }


    /**
     * Solicita un numero y los va metiendo hasta que ponga una letra, cuando ponga una letra dejará de meter numeros y mostrará el resultado como un array
     */
    public static void solicitarNumero(){
        StringBuilder sb = new StringBuilder();
        double num = 0;
        boolean valido;
        int contador = 0;
        do {
            try {
                num = Double.parseDouble(scanner.nextLine());
                valido = false;
                if (num < 0){
                    break;
                }
                sb.append(num+ " ");
            }catch (NumberFormatException ine){
                throw new NumberFormatException("No puede ser una letra, solo se permiten numeros");
            }
            contador++;
        } while (num >= 0);
        String stringBase = sb + " ";
        String arrayStrings[] = stringBase.split(" ");
        double arrNum[] = new double[contador];
        for (int i = 0; i < arrayStrings.length ; i++) {
            arrNum[i] = Double.parseDouble(arrayStrings[i]);
        }
        System.out.println(Arrays.toString(arrNum));
    }

}
