package dev.ifeoma.restdemo.model;

import java.util.ArrayList;

public class MilkyWay {
    private final Star star;
    private final ArrayList<Planet> starsystem;

    public MilkyWay(String name, String nickname, int moons, String rings, String year, int mrad, int krad, String type, String img) {
        this.star = new Star(name, nickname, moons, rings, year, mrad, krad, type, img);
        this.starsystem = new ArrayList();
    }

    public void addPlanet(String id, String planet, String nickname, int moons, int rings, int year, double mdist, double kdist, double mrad, double krad, String type, String img, String fact) {
        this.starsystem.add(new Planet(id, planet, nickname, moons, rings, year, mdist, kdist, mrad, krad, type, img, fact));
    }

    public Star getStar() {
        return this.star;
    }

    public ArrayList<Planet> getStarsystem() {
        return this.starsystem;
    }
}

