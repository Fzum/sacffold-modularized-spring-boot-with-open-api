package com.example.webmodule.config;


import com.example.datamodule.service.CarMockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public CarMockService carMockService() {
        return new CarMockService();
    }
}
