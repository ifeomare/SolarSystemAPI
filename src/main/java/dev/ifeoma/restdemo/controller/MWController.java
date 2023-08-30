package dev.ifeoma.restdemo.controller;

import dev.ifeoma.restdemo.model.Galaxy;
import dev.ifeoma.restdemo.model.MilkyWay;

import dev.ifeoma.restdemo.model.Star;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/solarsystem/")
public class MWController {

    @GetMapping("{galaxy}")
    public MilkyWay getDetails(Galaxy galaxy){
        MilkyWay mw = new MilkyWay("The Sun", "Sol", 0, "They trace the orbits of planets, whose gravity tugs dust into place around the Sun.", "The Sun doesn't have a \"year\", per se. But the Sun orbits the center of the Milky Way about every 230 million Earth years, bringing the planets, asteroids, comets, and other objects with it.", 435000, 700000, "Yellow Dwarf", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/sun.png");
        mw.addPlanet("Closest to the Sun", "Mercury", "Swift Planet", 0, 0, 88, 35983125, 57909227, 1516.7, 2439.7, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mercury.png", "Standing on Mercury's surface at its closest approach to the\nSun, our star would appear more than three times larger than it\ndoes on Earth.");
        mw.addPlanet("Second from the Sun","Venus", "Morning Star and Evening Star", 0, 0, 225, 67238251, 108000000, 3760.4, 6051.8, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/venus.png", "Venus is permanently shrouded in thick, toxic clouds of sulfuric acid that start at an altitude of 28 to 43 miles (45 to 70 kilometers). The clouds smell like rotten eggs!");
        mw.addPlanet("Third from the Sun","Earth", "Blue Planet", 1, 0, 365, 92956050, 149598262, 3958.8, 6371, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/earth.png", "\n Earth's atmosphere atmosphere protects us from incoming meteoroids, most of which break up in our atmosphere before they can strike the surface.");
        mw.addPlanet("Fourth from the Sun","Mars", "Red Planet", 2, 0, 687, 141637725, 227943824, 2106.1, 3389.5, "Terrestrial", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mars.png", "Mars is a rocky planet. Its solid surface has been altered by volcanoes, impacts, winds, crustal movement and chemical reactions.");
        mw.addPlanet("Fifth from the Sun","Jupiter", "Gas Giant", 95, 4, 4333, 483638564, 778340821, 2106.1, 69911, "Gas Giant","https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/jupiter.png", "Jupiter's Great Red Spot is a gigantic storm that’s about twice the size of Earth and has raged for over a century.");
        mw.addPlanet("Sixth from the Sun","Saturn", "Ringed Planet", 84, 7, 10579, 886489415, 1426666422, 36183.7, 58232, "Gas Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/saturn.png", "Saturn is a gas-giant planet and therefore does not have a solid surface like Earth’s. But it might have a solid core somewhere in there.");
        mw.addPlanet("Seventh from the Sun","Uranus", "Ice Giant", 27, 13, 30657, 1783744300, 2870658186., 15759.2, 25362, "Ice Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/uranus.png", "Like Venus, Uranus rotates east to west. But Uranus is unique in that it rotates on its side.");
        mw.addPlanet("Farthest from the Sun","Neptune", "Big Blue Planet", 14, 5, 60190, 2795173960., 4498396441., 15299.4, 24622, "Ice Giant", "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/neptune.png", "Neptune is an ice giant. Most of its mass is a hot, dense fluid of \"icy\" materials – water, methane and ammonia – above a small rocky core.");
        return mw;
    }
}