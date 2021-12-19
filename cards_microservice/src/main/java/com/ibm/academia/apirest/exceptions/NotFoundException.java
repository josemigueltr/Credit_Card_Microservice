package com.ibm.academia.apirest.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;


public class NotFoundException extends ExceptionType {


    public NotFoundException(HttpStatus status, String message) {
        super(status,message);
    }
}
