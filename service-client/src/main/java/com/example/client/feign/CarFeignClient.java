package com.example.client.feign;

import com.example.client.CarResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-voiture")
public interface CarFeignClient {

    @GetMapping("/api/cars/byClient/{clientId}")
    CarResponse getCarByClient(@PathVariable("clientId") Long clientId);
}
