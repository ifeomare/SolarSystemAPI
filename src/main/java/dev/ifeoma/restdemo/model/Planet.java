package dev.ifeoma.restdemo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Planet {
    private final String id;
    private final String name;
    private final String nickname;
    private final int moons;
    private final int rings;
    private final int year;
    private final ArrayList<Double> distance_from_the_sun;
    private final ArrayList<Double> radius;
    private final String type;
    private final String img;
    private final String fact;


    public Planet(String id, String planet, String nickname, int moons, int rings, int year, double mdist, double kdist, double mrad, double krad, String type, String img, String fact) {
        this.id = id;
        this.name = planet;
        this.nickname = nickname;
        this.moons = moons;
        this.rings = rings;
        this.year = year;
        this.distance_from_the_sun = new ArrayList();
        this.radius = new ArrayList();
        this.distance_from_the_sun.add(mdist);
        this.distance_from_the_sun.add(kdist);
        this.radius.add(mrad);
        this.radius.add(krad);
        this.type = type;
        this.img = img;
        this.fact = fact;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getMoons() {
        return this.moons;
    }

    public int getRings() {
        return this.rings;
    }

    public int getYear() {
        return this.year;
    }

    public Map<String, String> getRadius() {
        Map<String, String> radiusMap = new HashMap();
        radiusMap.put("miles", String.valueOf(this.radius.get(0)) + " miles");
        radiusMap.put("km", String.valueOf(this.radius.get(1)) + " km");
        return radiusMap;
    }

    public Map<String, String> getDistance_from_the_sun() {
        Map<String, String> distMap = new HashMap();
        distMap.put("miles", String.valueOf(this.distance_from_the_sun.get(0)) + " miles");
        distMap.put("km", String.valueOf(this.distance_from_the_sun.get(1)) + " km");
        return distMap;
    }

    public String getType() {
        return this.type;
    }

    public String getImg() {
        return img;
    }

    public String getFact() {
        return fact;
    }
}
