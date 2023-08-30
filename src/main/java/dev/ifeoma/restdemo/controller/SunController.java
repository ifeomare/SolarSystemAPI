package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Star;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class SunController {

    @GetMapping("/Sun")
    public Star getDetails(String star){
        return new Star("The Sun", "Sol", 0, "They trace the orbits of planets, whose gravity tugs dust into place around the Sun.", "The Sun doesn't have a \"year\", per se. But the Sun orbits the center of the Milky Way about every 230 million Earth years, bringing the planets, asteroids, comets, and other objects with it.", 435000, 700000, "Yellow Dwarf", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/sun.png");

    }
}