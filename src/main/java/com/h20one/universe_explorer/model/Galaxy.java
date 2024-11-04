package com.h20one.universe_explorer.model;

import java.util.ArrayList;
import java.util.List;

public class Galaxy {
    private final String name;
    private final List<StarSystem> starSystems;

    public Galaxy(String name) {
        this.name = name;
        this.starSystems = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            starSystems.add(new StarSystem("Star System " + (i + 1)));
        }
    }

    public String getName() {
        return name;
    }

    public StarSystem getSystem(int index) {
        if (index >= 0 && index < starSystems.size()) {
            return starSystems.get(index);
        }
        return null;
    }

    public List<StarSystem> getStarSystems() {
        return starSystems;
    }
}
