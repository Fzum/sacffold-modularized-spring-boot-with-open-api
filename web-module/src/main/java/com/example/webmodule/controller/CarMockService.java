package com.example.webmodule.controller;

import com.example.webmodule.exception.CarNotFoundException;
import org.openapitools.model.Car;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarMockService {
    public Car gerCarById(final Long carId) {
        return Optional
                .ofNullable(getCar(carId))
                .orElseThrow(CarNotFoundException::new);
    }

    private Car getCar(Long carId) {
        return null;
    }
}