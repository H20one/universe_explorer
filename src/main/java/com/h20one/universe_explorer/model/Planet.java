package com.h20one.universe_explorer.model;

import java.util.Random;

public class Planet {
    private final String name;
    private final String resource;
    private final String description;

    public Planet(String name) {
        this.name = name;
        String[] resources = {"Iron", "Gold", "Water", "Alien Artifacts"};
        String[] descriptions = {"lush", "barren", "icy", "volcanic"};

        Random random = new Random();
        this.resource = resources[random.nextInt(resources.length)];
        this.description = descriptions[random.nextInt(descriptions.length)];
    }

    public String getName() {
        return name;
    }

    public String explore() {
        return "You explore " + name + ". It's a " + description + " planet rich in " + resource + ".";
    }
}
