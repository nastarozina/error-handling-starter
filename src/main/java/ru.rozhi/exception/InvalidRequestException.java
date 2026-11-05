package ru.rozhi.exception;

public class InvalidRequestException extends BadRequestException {

    public InvalidRequestException(String message) {
        super("INVALID_REQUEST", message);
    }
}
