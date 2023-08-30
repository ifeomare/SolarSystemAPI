package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class MarsController {

    @GetMapping("/Mars")
    public Planet getDetails(String planet){
        return new Planet("Fourth from the Sun","Mars", "Red Planet", 2, 0, 687, 141637725, 227943824, 2106.1, 3389.5, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mars.png", "Mars is a rocky planet. Its solid surface has been altered by volcanoes, impacts, winds, crustal movement and chemical reactions.");

    }
}
