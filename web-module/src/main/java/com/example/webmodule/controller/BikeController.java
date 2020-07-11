package com.example.webmodule.controller;

import com.example.webmodule.exception.BikeNotFoundException;
import org.openapitools.api.BikeApi;
import org.openapitools.model.Bike;
import org.openapitools.model.ModelApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BikeController implements BikeApi {
    @Override
    public ResponseEntity<ModelApiResponse> addBike(@Valid Bike bike) {
        return null;
    }

    @Override
    public ResponseEntity<List<Bike>> findAllBikes() {
        return null;
    }

    @Override
    public ResponseEntity<Bike> getBikeById(Long bikeId) {
        throw new BikeNotFoundException();
    }
}

