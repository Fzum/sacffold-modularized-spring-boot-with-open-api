package com.example.webmodule.errorhandling;

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

    @ExceptionHandler(Exception.class)
    private ResponseEntity<ModelApiResponse> handleUnknownException(Exception e) {
        final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        final String message = "There has been an error! Pleas contact me!";
        final ModelApiResponse modelApiResponse = new ModelApiResponse();

        modelApiResponse.code(status.value());
        modelApiResponse.message(message);

        return new ResponseEntity<>(modelApiResponse, status);
    }
}
