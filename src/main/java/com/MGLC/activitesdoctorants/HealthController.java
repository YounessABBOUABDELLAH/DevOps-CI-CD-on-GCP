package com.MGLC.activitesdoctorants;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "Application Java deployee sur Cloud Run - Version 1.0";
    }
}