package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class SaturnController {

    @GetMapping("/Saturn")
    public Planet getDetails(String planet){
        return new Planet("Sixth from the Sun","Saturn", "Ringed Planet", 84, 7, 10579, 886489415, 1426666422, 36183.7, 58232, "Gas Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/saturn.png", "Saturn is a gas-giant planet and therefore does not have a solid surface like Earth’s. But it might have a solid core somewhere in there.");

    }
}