package com.example.webmodule.errorhandling;

import org.openapitools.model.ApiResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
class GlobalErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ResponseStatusException.class)
    private ResponseEntity<ApiResponseDto> handleResourceNotFoundException(ResponseStatusException e) {
        final HttpStatus status = e.getStatus();
        final ApiResponseDto apiResponseDto = new ApiResponseDto();

        apiResponseDto.code(status.value());
        apiResponseDto.message(e.getReason());

        return new ResponseEntity<>(apiResponseDto, status);
    }

    @ExceptionHandler(Exception.class)
    private ResponseEntity<ApiResponseDto> handleUnknownException(Exception e) {
        final HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        final String message = "There has been an error! Pleas contact me!";
        final ApiResponseDto apiResponseDto = new ApiResponseDto();

        apiResponseDto.code(status.value());
        apiResponseDto.message(message);

        return new ResponseEntity<>(apiResponseDto, status);
    }
}
