package com.h20one.universe_explorer.service;

import com.h20one.universe_explorer.model.Universe;
import org.springframework.stereotype.Service;

@Service
public class UniverseService {
    private final Universe universe;

    public UniverseService() {
        this.universe = new Universe();
    }

    public Universe getUniverse() {
        return universe;
    }
}

