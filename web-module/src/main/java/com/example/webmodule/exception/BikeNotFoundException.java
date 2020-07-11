package com.example.webmodule.exception;

public class BikeNotFoundException extends ResourceNotFoundException {
    public BikeNotFoundException() {
        super("The bike was not found!");
    }
}
