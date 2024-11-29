package org.example.exceptions;

public class
InvalidArgumentException extends Exception {
    @Override
    public String getMessage() {
        return "Неправильное значение, Введите значение из диапазона";
    }

}
