package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class JupiterController {

    @GetMapping("/Jupiter")
    public Planet getDetails(String planet){
        return new Planet("Fifth from the Sun","Jupiter", "Gas Giant", 95, 4, 4333, 483638564, 778340821, 2106.1, 69911, "Gas Giant","https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/jupiter.png", "Jupiter's Great Red Spot is a gigantic storm that’s about twice the size of Earth and has raged for over a century.");

    }
}
