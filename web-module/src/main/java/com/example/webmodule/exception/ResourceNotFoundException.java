package com.example.webmodule.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class ResourceNotFoundException extends ResponseStatusException {
    private final static HttpStatus status = HttpStatus.NOT_FOUND;

    public ResourceNotFoundException(String reason) {
        super(status, reason);
    }
}
