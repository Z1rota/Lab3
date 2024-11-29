package org.example.exceptions;

public class InvalidTypeOfArgumentException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Неправильный тип данных, нужно ввести целое число!";
    }
}
