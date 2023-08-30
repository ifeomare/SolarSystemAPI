package dev.ifeoma.restdemo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Star {
    private final String name;
    private final String nickname;
    private final int moons;
    private final String rings;
    private final String year;
    private final ArrayList<Integer> radius;
    private final String type;
    private final String img;
//    private final String fact;

    public Star(String name, String nickname, int moons, String rings, String year, int mrad, int krad, String type, String img) {
        this.name = name;
        this.nickname = nickname;
        this.moons = moons;
        this.rings = rings;
        this.year = year;
        this.radius = new ArrayList();
        this.radius.add(mrad);
        this.radius.add(krad);
        this.type = type;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public int getMoons() {
        return moons;
    }

    public String getRings() {
        return rings;
    }

    public String getYear() {
        return year;
    }

    public Map<String, String> getRadius() {
        Map<String, String> radiusMap = new HashMap();
        radiusMap.put("miles", String.valueOf(this.radius.get(0)) + " miles");
        radiusMap.put("km", String.valueOf(this.radius.get(1)) + " km");
        return radiusMap;
    }

    public String getType() {
        return type;
    }

    public String getImg() {
        return img;
    }
}