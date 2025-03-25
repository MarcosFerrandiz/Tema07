package com.marcosferrandiz.EjercicioMatriculas;

import java.util.Scanner;

public class PrimerEjercicioMatriculas {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String matricula = solicitarMatricula();
        System.out.println(matricula);
    }

    public static String solicitarMatricula() throws MatriculaInvalidaException{
        String matricula = leerString("Introduzca la matricula con un espacio entre los numeros y las letras",0,8);
        if (validarMatricula(matricula)){
            return matricula;
        }
        throw new MatriculaInvalidaException(matricula + " no es una matricula valida, debe de ser [NNNN LLL], donde N es numero y L es letra");
    }


    public static String leerString(String mensaje, int minLength, int maxLength) {
        boolean valido;
        String valor;
        do {
            System.out.println(mensaje);
            valor = scanner.nextLine();
            int length = valor.length();
            valido = length >= minLength && length <= maxLength;
            if (!valido) {
                System.out.printf("La longitud debe de estar entre %d y %d\n", minLength, maxLength);
            }
        } while (!valido);
        return valor;
    }

    public static boolean validarMatricula(String matricula) {
        int i;
        if (matricula.length() != 8) {
            return false;
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                return false;
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            return false;
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                return false;
            }
        }
        return true;
    }
}
