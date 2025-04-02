# SolarSystemAPI
This API is used for [solarsystem](https://github.com/ifeomare/solarsystem). The information used has been gathered from
Nasa and other trusted resources on the internet.
<br />

## Description
This project serves as a basic RESTful API used for a larger Solar System application. It contains detailed information
about the Solar System, including the planets, the Sun, and their properties. This API is read-only as users cannot
modify any data stored in the API.

### About the API
- Retrieve details about the Solar System
- Fetch data about the planets and the Sun
- Read-only API

## Tech Stack
- Java/Springboot

## Endpoints
| Method | Endpoint              | Description                                             |
|--------|-----------------------|---------------------------------------------------------|
| GET    | /solarsystem/         | Gets the Solar System's name and the name of the galaxy |
| GET    | /solarsystem/{galaxy} | Gets the Sun and the planets                            |
| GET    | /solarsystem/{Planet} | Gets planet information                                 |

## Responses
#### Solar System( /solarsystem/ )

```yaml
{
  "name": "The Solar System",
  "galaxy": {
    "galaxy":"Milky Way"
  }
}
```
#### Galaxy ( /solarsystem/milkyway )
To see all the planets listed under a galaxy(like the Milky Way), call the endpoint http://localhost:8080/solarsystem/milkyway:
```yaml
{
  "star": {
    "name": "The Sun",
    "nickname": "Sol",
    "moons": 0,
    "rings": "They trace the orbits of planets, whose gravity tugs dust into place around the Sun.",
    "year": "The Sun doesn't have a \"year\", per se. But the Sun orbits the center of the Milky Way about every 230 million Earth years, bringing the planets, asteroids, comets, and other objects with it.",
    "radius": {
      "km": "700000 km",
      "miles": "435000 miles"
    },
    "type": "Yellow Dwarf",
    "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/sun.png"
  },
  "starsystem": [
    {
      "id": "Closest to the Sun",
      "name": "Mercury",
      "nickname": "Swift Planet",
      "moons": 0,
      "rings": 0,
      "year": 88,
      "distance_from_the_sun": {
        "km": "5.7909227E7 km",
        "miles": "3.5983125E7 miles"
      },
      "radius": {
        "km": "2439.7 km",
        "miles": "1516.7 miles"
      },
      "type": "Terrestrial",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mercury.png",
      "fact": "Standing on Mercury's surface at its closest approach to the\nSun, our star would appear more than three times larger than it\ndoes on Earth."
    },
    {
      "id": "Second from the Sun",
      "name": "Venus",
      "nickname": "Morning Star and Evening Star",
      "moons": 0,
      "rings": 0,
      "year": 225,
      "distance_from_the_sun": {
        "km": "1.08E8 km",
        "miles": "6.7238251E7 miles"
      },
      "radius": {
        "km": "6051.8 km",
        "miles": "3760.4 miles"
      },
      "type": "Terrestrial",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/venus.png",
      "fact": "Venus is permanently shrouded in thick, toxic clouds of sulfuric acid that start at an altitude of 28 to 43 miles (45 to 70 kilometers). The clouds smell like rotten eggs!"
    },
    {
      "id": "Third from the Sun",
      "name": "Earth",
      "nickname": "Blue Planet",
      "moons": 1,
      "rings": 0,
      "year": 365,
      "distance_from_the_sun": {
        "km": "1.49598262E8 km",
        "miles": "9.295605E7 miles"
      },
      "radius": {
        "km": "6371.0 km",
        "miles": "3958.8 miles"
      },
      "type": "Terrestrial",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/earth.png",
      "fact": "\n Earth's atmosphere atmosphere protects us from incoming meteoroids, most of which break up in our atmosphere before they can strike the surface."
    },
    {
      "id": "Fourth from the Sun",
      "name": "Mars",
      "nickname": "Red Planet",
      "moons": 2,
      "rings": 0,
      "year": 687,
      "distance_from_the_sun": {
        "km": "2.27943824E8 km",
        "miles": "1.41637725E8 miles"
      },
      "radius": {
        "km": "3389.5 km",
        "miles": "2106.1 miles"
      },
      "type": "Terrestrial",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mars.png",
      "fact": "Mars is a rocky planet. Its solid surface has been altered by volcanoes, impacts, winds, crustal movement and chemical reactions."
    },
    {
      "id": "Fifth from the Sun",
      "name": "Jupiter",
      "nickname": "Gas Giant",
      "moons": 95,
      "rings": 4,
      "year": 4333,
      "distance_from_the_sun": {
        "km": "7.78340821E8 km",
        "miles": "4.83638564E8 miles"
      },
      "radius": {
        "km": "69911.0 km",
        "miles": "2106.1 miles"
      },
      "type": "Gas Giant",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/jupiter.png",
      "fact": "Jupiter's Great Red Spot is a gigantic storm that’s about twice the size of Earth and has raged for over a century."
    },
    {
      "id": "Sixth from the Sun",
      "name": "Saturn",
      "nickname": "Ringed Planet",
      "moons": 84,
      "rings": 7,
      "year": 10579,
      "distance_from_the_sun": {
        "km": "1.426666422E9 km",
        "miles": "8.86489415E8 miles"
      },
      "radius": {
        "km": "58232.0 km",
        "miles": "36183.7 miles"
      },
      "type": "Gas Giant",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/saturn.png",
      "fact": "Saturn is a gas-giant planet and therefore does not have a solid surface like Earth’s. But it might have a solid core somewhere in there."
    },
    {
      "id": "Seventh from the Sun",
      "name": "Uranus",
      "nickname": "Ice Giant",
      "moons": 27,
      "rings": 13,
      "year": 30657,
      "distance_from_the_sun": {
        "km": "2.870658186E9 km",
        "miles": "1.7837443E9 miles"
      },
      "radius": {
        "km": "25362.0 km",
        "miles": "15759.2 miles"
      },
      "type": "Ice Giant",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/uranus.png",
      "fact": "Like Venus, Uranus rotates east to west. But Uranus is unique in that it rotates on its side."
    },
    {
      "id": "Farthest from the Sun",
      "name": "Neptune",
      "nickname": "Big Blue Planet",
      "moons": 14,
      "rings": 5,
      "year": 60190,
      "distance_from_the_sun": {
        "km": "4.498396441E9 km",
        "miles": "2.79517396E9 miles"
      },
      "radius": {
        "km": "24622.0 km",
        "miles": "15299.4 miles"
      },
      "type": "Ice Giant",
      "img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/neptune.png",
      "fact": "Neptune is an ice giant. Most of its mass is a hot, dense fluid of \"icy\" materials – water, methane and ammonia – above a small rocky core."
    }
  ]
}
```


#### Planets ( /solarsystem/Mercury)
Each call to a planet will return the name and nickname of the planet, it's relation to the sun compared to the other planets, it's radius and distance from the sun, the type of planet it is, a fact about the planet, and a picture of the planet.

For example, to find information about the planet Mercury, calling the endpoint http://localhost:8080/solarsystem/Mercury, returns:
```yaml
{
"id": "Closest to the Sun",
"name": "Mercury",
"nickname": "Swift Planet",
"moons": 0,
"rings": 0,
"year": 88,
"distance_from_the_sun": {
"km": "5.7909227E7 km",
"miles": "3.5983125E7 miles"
},
"radius": {
"km": "2439.7 km",
"miles": "1516.7 miles"
},
"type": "Terrestrial",
"img": "https://raw.githubusercontent.com/ifeomare/solarsystem/main/src/images/mercury.png",
"fact": "Standing on Mercury's surface at its closest approach to the\nSun, our star would appear more than three times larger than it\ndoes on Earth."
}
```

## Next Steps
- Adjusting the endpoints for the planets
- Including dwarf planets to the Solar System
- Including the planet's moons