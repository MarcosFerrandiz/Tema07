package com.marcosferrandiz.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateLettersException extends InvalidPropertiesFormatException {
    public InvalidPlateLettersException(String message) {
        super(message);
    }
}
