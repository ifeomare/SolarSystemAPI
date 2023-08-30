package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class MercuryController {

    @GetMapping("/Mercury")
    public Planet getDetails(String planet){
        return new Planet("Closest to the Sun","Mercury", "Swift Planet", 0, 0, 88, 35983125, 57909227, 1516.7, 2439.7, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mercury.png", "Standing on Mercury's surface at its closest approach to the\nSun, our star would appear more than three times larger than it\ndoes on Earth.");

    }
}