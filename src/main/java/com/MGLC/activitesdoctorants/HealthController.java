package com.MGLC.activitesdoctorants;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "redirect:/addetat/1";
    }
}