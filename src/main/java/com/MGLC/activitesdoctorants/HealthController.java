package com.MGLC.activitesdoctorants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HealthController {

    @GetMapping("/")
    public String redirectToForm() {
        return "redirect:/addetat/1";
    }
}