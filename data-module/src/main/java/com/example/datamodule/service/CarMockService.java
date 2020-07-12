package com.example.datamodule.service;

import com.example.datamodule.exception.CarNotFoundException;
import org.openapitools.model.CarDto;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarMockService {
    public CarDto gerCarById(final Long carId) {
        return Optional
                .ofNullable(getCar(carId))
                .orElseThrow(CarNotFoundException::new);
    }

    private CarDto getCar(Long carId) {
        return null;
    }
}
