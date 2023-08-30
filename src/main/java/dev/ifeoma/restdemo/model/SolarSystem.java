package dev.ifeoma.restdemo.model;

public class SolarSystem {
    private String name;
    private Galaxy galaxy;

    public SolarSystem(String solarSystem, String galaxy) {
        this.name = solarSystem;
        this.galaxy = new Galaxy(galaxy);
    }

    public String getName() {
        return this.name;
    }

    public Galaxy getGalaxy() {
        return this.galaxy;
    }
}