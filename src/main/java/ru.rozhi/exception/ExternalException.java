package ru.rozhi.exception;

import org.springframework.http.HttpStatus;

public class ExternalException extends ApiException {

    public ExternalException(String code, String message) {
        super(HttpStatus.INTERNAL_SERVER_ERROR,
                (code == null || code.isBlank()) ? "INTERNAL_SERVER_ERROR" : code, message);
    }
}
