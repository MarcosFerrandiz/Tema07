package com.marcosferrandiz.EjercicioMatriculas;

import java.util.Scanner;

public class PrimerEjercicioMatriculas {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String matricula = solicitarMatricula();
        System.out.println(matricula);
    }

    /**
     * Solicita la matricula al usuario, en el caso de que lo haya escrito mal saldrá una excepcion
     * @return Devuelve la matricula, de forma valida
     * @throws MatriculaInvalidaException Excepción en el caso de que ponga mal la matricula
     */
    public static String solicitarMatricula() throws MatriculaInvalidaException{
        String matricula = leerString("Introduzca la matricula con un espacio entre los numeros y las letras",0,8);
        if (validarMatricula(matricula)){
            return matricula;
        }
        throw new MatriculaInvalidaException(matricula + " no es una matricula valida, debe de ser [NNNN LLL], donde N es numero y L es letra");
    }


    /**
     * Metodo para leer un String con un máximo y con un minimo, poniendo el mensaje que queremos sacar por pantalla
     * @param mensaje El mensaje que queremos sacar por pantalla
     * @param minLength El maximo del String
     * @param maxLength El minimo del String
     * @return Devuelve el String que haya introducido el usuario
     */
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

    /**
     * Metodo que valida que una matricula se ha introducido de forma correcta en formato [NNNN LLL] donde las N son numeros y las L son letras
     * @param matricula La matricula que queremos validar
     * @return Devuelve true si cumple todos los requisitos y false si no los cumple
     */
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
