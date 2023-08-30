package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.SolarSystem;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem")
public class SolarSystemAPIService {
    SolarSystem solarSystem;

    @GetMapping("/")
    public SolarSystem getSolarSystemDetails(){

        return new SolarSystem("The Solar System", "Milky Way");
    }

}