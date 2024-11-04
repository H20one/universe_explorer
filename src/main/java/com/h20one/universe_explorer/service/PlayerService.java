package com.h20one.universe_explorer.service;

import com.h20one.universe_explorer.model.Galaxy;
import com.h20one.universe_explorer.model.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {

    private final UniverseService universeService;
    private final Player player;

    @Autowired
    public PlayerService(UniverseService universeService) {
        this.universeService = universeService;
        this.player = new Player();
    }

    public String travelToGalaxy(int index) {
        Galaxy galaxy = universeService.getUniverse().getGalaxy(index);
        if (galaxy == null) {
            return "Galaxy not found.";
        }
        return player.travelToGalaxy(galaxy);
    }

    public String travelToSystem(int index) {
        return player.travelToSystem(index);
    }

    public String travelToPlanet(int index) {
        return player.travelToPlanet(index);
    }

    public String explorePlanet() {
        return player.explorePlanet();
    }
}
