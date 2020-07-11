package com.example.datamodule.exception;

public class BikeNotFoundException extends ResourceNotFoundException {
    public BikeNotFoundException() {
        super("The bike was not found!");
    }
}
