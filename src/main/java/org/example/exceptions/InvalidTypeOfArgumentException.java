package org.example.exceptions;

public class InvalidTypeOfArgumentException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Invalid type of argument";
    }
}
