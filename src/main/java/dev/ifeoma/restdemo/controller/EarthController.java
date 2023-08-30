package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class EarthController {

    @GetMapping("/Earth")
    public Planet getDetails(String planet){
        return new Planet("Third from the Sun","Earth", "Blue Planet", 1, 0, 365, 92956050, 149598262, 3958.8, 6371, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/earth.png", "\n Earth's atmosphere protects us from incoming meteoroids, most of which break up in our atmosphere before they can strike the surface.");

    }
}
