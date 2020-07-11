package com.example.webmodule.controller;

import com.example.datamodule.service.CarMockService;
import org.openapitools.api.CarApi;
import org.openapitools.model.Car;
import org.openapitools.model.ModelApiResponse;
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
    public ResponseEntity<ModelApiResponse> addCar(@Valid Car car) {
        return null;
    }

    @Override
    public ResponseEntity<List<Car>> findAllCars() {
        return null;
    }

    @Override
    public ResponseEntity<Car> getCarById(Long carId) {
        return ResponseEntity.ok(service.gerCarById(carId));
    }
}
