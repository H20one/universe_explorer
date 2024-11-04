package com.h20one.universe_explorer.model;

import java.util.ArrayList;
import java.util.List;

public class Universe {
    private final List<Galaxy> galaxies;

    public Universe() {
        galaxies = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            galaxies.add(new Galaxy("Galaxy " + (i + 1)));
        }
    }

    public Galaxy getGalaxy(int index) {
        if (index >= 0 && index < galaxies.size()) {
            return galaxies.get(index);
        }
        return null;
    }

    public List<Galaxy> getGalaxies() {
        return galaxies;
    }
}