package com.h20one.universe_explorer.model;

public class Player {
    private Galaxy currentGalaxy;
    private StarSystem currentSystem;
    private Planet currentPlanet;

    public String travelToGalaxy(Galaxy galaxy) {
        if (galaxy != null) {
            this.currentGalaxy = galaxy;
            this.currentSystem = null;
            this.currentPlanet = null;
            return "Traveled to " + galaxy.getName() + ".";
        }
        return "Galaxy not found.";
    }

    public String travelToSystem(int index) {
        if (currentGalaxy != null) {
            currentSystem = currentGalaxy.getSystem(index);
            currentPlanet = null;
            if (currentSystem != null) {
                return "Entered " + currentSystem.getName() + ".";
            } else {
                return "Star system not found.";
            }
        }
        return "You need to be in a galaxy to travel to a star system.";
    }

    public String travelToPlanet(int index) {
        if (currentSystem != null) {
            currentPlanet = currentSystem.getPlanet(index);
            if (currentPlanet != null) {
                return "Landed on " + currentPlanet.getName() + ".";
            } else {
                return "Planet not found.";
            }
        }
        return "You need to be in a star system to travel to a planet.";
    }

    public String explorePlanet() {
        if (currentPlanet != null) {
            return currentPlanet.explore();
        }
        return "You need to be on a planet to explore.";
    }
}
