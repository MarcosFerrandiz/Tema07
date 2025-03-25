package com.marcosferrandiz.exceptions;

import java.util.InvalidPropertiesFormatException;

public class InvalidPlateNumberException extends InvalidPropertiesFormatException {
    public InvalidPlateNumberException(String message) {
        super(message);
    }
}
