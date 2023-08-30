package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Planet;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/{galaxy}")
public class NeptuneController {

    @GetMapping("/Neptune")
    public Planet getDetails(String planet){
        return new Planet("Farthest from the Sun","Neptune", "Big Blue Planet", 14, 5, 60190, 2795173960., 4498396441., 15299.4, 24622, "Ice Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/neptune.png", "Neptune is an ice giant. Most of its mass is a hot, dense fluid of \"icy\" materials – water, methane and ammonia – above a small rocky core.");

    }
}