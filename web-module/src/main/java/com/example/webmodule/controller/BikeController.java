package com.example.webmodule.controller;

import com.example.datamodule.exception.BikeNotFoundException;
import org.openapitools.api.BikeApi;
import org.openapitools.model.Bike;
import org.openapitools.model.ModelApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.nio.channels.UnresolvedAddressException;
import java.util.List;

@RestController
public class BikeController implements BikeApi {
    @Override
    public ResponseEntity<ModelApiResponse> addBike(@Valid Bike bike) {
        // unknown exception => general error
        throw new UnresolvedAddressException();
    }

    @Override
    public ResponseEntity<List<Bike>> findAllBikes() {
        // unknown exception => general error
        throw new RuntimeException();
    }

    @Override
    public ResponseEntity<Bike> getBikeById(Long bikeId) {
        throw new BikeNotFoundException();
    }
}

