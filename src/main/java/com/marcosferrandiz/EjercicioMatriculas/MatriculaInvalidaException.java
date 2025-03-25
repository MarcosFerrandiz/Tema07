package com.marcosferrandiz.EjercicioMatriculas;

import java.util.InputMismatchException;

public class MatriculaInvalidaException extends InputMismatchException {
    public MatriculaInvalidaException(String msg) {
        super(msg);
    }
}
