package org.example.exceptions;

public class InvalidTypeOfArgumentException extends Exception {

    @Override
    public String getMessage() {
        return "Invalid type of argument";
    }
}
