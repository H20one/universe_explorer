package com.h20one.universe_explorer.model;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {
    private final String name;
    private final List<Planet> planets;

    public StarSystem(String name) {
        this.name = name;
        planets = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            planets.add(new Planet("Planet " + (i + 1)));
        }
    }

    public String getName() {
        return name;
    }

    public Planet getPlanet(int index) {
        if (index >= 0 && index < planets.size()) {
            return planets.get(index);
        }
        return null;
    }

    public List<Planet> getPlanets() {
        return planets;
    }
}
