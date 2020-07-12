package com.example.webmodule.controller;

import com.example.datamodule.exception.BikeNotFoundException;
import org.openapitools.api.BikeApi;
import org.openapitools.model.ApiResponseDto;
import org.openapitools.model.BikeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.nio.channels.UnresolvedAddressException;
import java.util.List;

@RestController
public class BikeController implements BikeApi {
    @Override
    public ResponseEntity<ApiResponseDto> addBike(@Valid BikeDto bike) {
        // unknown exception => general error
        throw new UnresolvedAddressException();
    }

    @Override
    public ResponseEntity<List<BikeDto>> findAllBikes() {
        // unknown exception => general error
        throw new RuntimeException();
    }

    @Override
    public ResponseEntity<BikeDto> getBikeById(Long bikeId) {
        throw new BikeNotFoundException();
    }
}

