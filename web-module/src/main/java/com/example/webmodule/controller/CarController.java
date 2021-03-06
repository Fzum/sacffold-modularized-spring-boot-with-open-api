package com.example.webmodule.controller;

import com.example.datamodule.service.CarMockService;
import org.openapitools.api.CarApi;
import org.openapitools.model.ApiResponseDto;
import org.openapitools.model.CarDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CarController implements CarApi {

    private final CarMockService service;

    public CarController(CarMockService service) {
        this.service = service;
    }

    @Override
    public ResponseEntity<ApiResponseDto> addCar(@Valid CarDto car) {
        return null;
    }

    @Override
    public ResponseEntity<List<CarDto>> findAllCars() {
        return null;
    }

    @Override
    public ResponseEntity<CarDto> getCarById(Long carId) {
        return ResponseEntity.ok(service.gerCarById(carId));
    }
}
