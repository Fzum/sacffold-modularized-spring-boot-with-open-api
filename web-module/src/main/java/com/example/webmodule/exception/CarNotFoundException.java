package com.example.webmodule.exception;

public class CarNotFoundException extends ResourceNotFoundException {
    public CarNotFoundException() {
        super("The car was not found!");
    }
}
