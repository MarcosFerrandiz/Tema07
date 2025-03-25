package com.marcosferrandiz.Ejercicio3;

import com.marcosferrandiz.Ejercicio1.Ejercicio1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        solicitarNumero();
    }

    public static void solicitarNumero() {
        try {
            double num;
            boolean salir = false;
            ArrayList<Double> numeros = new ArrayList<>();
            do {
                try {
                    num = Double.parseDouble(scanner.nextLine());
                    numeros.add(num);
                } catch (NumberFormatException nfe) {
                    if (nfe.getMessage().equals("empty String")) {
                        System.err.println("Introduce un número por favor!");
                    } else {
                        salir = true;
                    }
                }
            } while (!salir);
            double numMasAlto = numeros.get(0);
            for (int i = 0; i < numeros.size(); i++) {
                if (numeros.get(i) > numMasAlto) {
                    numMasAlto = numeros.get(i);
                }
            }
            System.out.println("El número introducido más alto es " + numMasAlto);
        }catch (IndexOutOfBoundsException ioobe){
            System.err.println("No se han introducido números");
        }
    }

}
