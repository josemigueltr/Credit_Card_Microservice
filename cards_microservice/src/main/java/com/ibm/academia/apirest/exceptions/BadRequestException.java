package com.ibm.academia.apirest.exceptions;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ExceptionType {

    public BadRequestException(HttpStatus status, String message) {
        super(status,message);
    }
}
