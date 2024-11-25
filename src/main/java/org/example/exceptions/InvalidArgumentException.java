package org.example.exceptions;

public class InvalidArgumentException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid argument";
    }

}
