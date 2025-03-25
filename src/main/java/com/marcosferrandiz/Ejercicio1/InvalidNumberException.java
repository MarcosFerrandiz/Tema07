package com.marcosferrandiz.Ejercicio1;

public class InvalidNumberException extends NumberFormatException {
    public InvalidNumberException(String s) {
        super(s);
    }
}
