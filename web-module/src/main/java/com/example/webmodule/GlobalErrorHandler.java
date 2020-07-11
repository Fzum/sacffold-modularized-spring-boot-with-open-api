package com.example.webmodule;

import org.openapitools.model.ModelApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    private ResponseEntity<ModelApiResponse> handleBikeNotFoundException(ResponseStatusException e) {
        final HttpStatus status = e.getStatus();
        final ModelApiResponse modelApiResponse = new ModelApiResponse();

        modelApiResponse.code(status.value());
        modelApiResponse.message(e.getReason());

        return new ResponseEntity<>(modelApiResponse, status);
    }
}
