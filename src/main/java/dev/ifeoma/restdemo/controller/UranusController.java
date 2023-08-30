package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class UranusController {

    @GetMapping("/Uranus")
    public Planet getDetails(String planet){
        return new Planet("Seventh from the Sun","Uranus", "Ice Giant", 27, 13, 30657, 1783744300, 2870658186., 15759.2, 25362, "Ice Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/uranus.png", "Like Venus, Uranus rotates east to west. But Uranus is unique in that it rotates on its side.");

    }
}
