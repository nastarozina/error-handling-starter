package ru.rozhi.exception;

import org.springframework.http.HttpStatus;

public abstract class ForbiddenException extends ApiException {
    protected ForbiddenException(String code, String message) {
        super(HttpStatus.FORBIDDEN, code, message);
    }
}