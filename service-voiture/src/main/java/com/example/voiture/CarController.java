package com.example.voiture;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("/byClient/{clientId}")
    public Car getCarByClient(@PathVariable Long clientId) {
        // Simulate database lookup
        try {
            // Optional delay simulation
           Thread.sleep(30); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        return new Car(10L, "Toyota", "Yaris", clientId);
    }
}
