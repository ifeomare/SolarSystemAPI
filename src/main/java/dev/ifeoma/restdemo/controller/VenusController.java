package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class VenusController {

    @GetMapping("/Venus")
    public Planet getDetails(String planet){
        return new Planet("Second from the Sun","Venus", "Morning Star and Evening Star", 0, 0, 225, 67238251, 108000000, 3760.4, 6051.8, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/venus.png", "Venus is permanently shrouded in thick, toxic clouds of sulfuric acid that start at an altitude of 28 to 43 miles (45 to 70 kilometers). The clouds smell like rotten eggs!");

    }
}