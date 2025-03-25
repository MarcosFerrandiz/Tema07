package com.marcosferrandiz.exceptions;

import java.util.InvalidPropertiesFormatException;

public class MatriculaInvalidaException extends InvalidPropertiesFormatException {
    public MatriculaInvalidaException(String msg) {
        super(msg);
    }
}
