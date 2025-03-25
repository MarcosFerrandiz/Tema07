package com.marcosferrandiz.EjercicioMatriculas;

import com.marcosferrandiz.exceptions.InvalidPlateLengthException;
import com.marcosferrandiz.exceptions.InvalidPlateLettersException;
import com.marcosferrandiz.exceptions.InvalidPlateNumberException;
import com.marcosferrandiz.exceptions.MatriculaInvalidaException;

import java.util.Scanner;

public class PrimerEjercicioMatriculas {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        String matricula = leerString("Introduzca la matricula con un espacio entre los numeros y las letras",8,8);
        try {
            validarMatricula(matricula);
        }catch (MatriculaInvalidaException mie){
            System.out.println(mie);
        } catch (InvalidPlateLengthException e) {
            System.out.println(e);
        } catch (InvalidPlateLettersException e) {
            System.out.println(e);
        } catch (InvalidPlateNumberException e) {
            System.out.println(e);
        }
    }

    /**
     * Solicita la matricula al usuario, en el caso de que lo haya escrito mal saldrá una excepcion
     * @return Devuelve la matricula, de forma valida
     * @throws MatriculaInvalidaException Excepción en el caso de que ponga mal la matricula
     */
    public static String solicitarMatricula() throws MatriculaInvalidaException, InvalidPlateLettersException, InvalidPlateNumberException, InvalidPlateLengthException {
        String matricula = leerString("Introduzca la matricula con un espacio entre los numeros y las letras",8,8);
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
    public static boolean validarMatricula(String matricula) throws InvalidPlateLengthException, InvalidPlateNumberException, InvalidPlateLettersException, MatriculaInvalidaException {
        int i;
        if (matricula.length() != 8) {
            throw new InvalidPlateLengthException("La matricula debe teer 8 caracteres");
        }
        for (i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) {
                throw new InvalidPlateNumberException("La matricula debe de tener 4 numeros");
            }
        }
        if (!Character.isWhitespace(matricula.charAt(i++))) {
            throw new MatriculaInvalidaException("La matricula debe de tener 1 espacio entre los numeros y caracter");
        }
        for (int j = i; j < matricula.length(); j++) {
            if (!Character.isLetter(matricula.charAt(j))) {
                throw new InvalidPlateLettersException("La matricula debe de tener 3 letras");
            }
        }
        return true;
    }

    public static void parsearMatricula(String matricula) throws MatriculaInvalidaException, InvalidPlateLettersException, InvalidPlateNumberException, InvalidPlateLengthException {
        if (!validarMatricula(matricula)){
            throw new MatriculaInvalidaException("La matricula no es valida");
        }
    }
}
