package com.h20one.universe_explorer.command;

import com.h20one.universe_explorer.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandProcessor {

    private final PlayerService playerService;

    @Autowired
    public CommandProcessor(PlayerService playerService) {
        this.playerService = playerService;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Universe Explorer! Type 'help' for commands.");

        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("exit")) {
                System.out.println("Exiting Universe Explorer. Goodbye!");
                break;
            }
            processCommand(input);
        }
        scanner.close();
    }

    private void processCommand(String input) {
        String[] parts = input.split(" ");
        String command = parts[0];

        try {
            switch (command) {
                case "help":
                    System.out.println("Available commands: travel galaxy <index>, travel system <index>, travel planet <index>, explore, exit");
                    break;
                case "travel":
                    if (parts.length < 3) {
                        System.out.println("Usage: travel <galaxy/system/planet> <index>");
                    } else {
                        String target = parts[1];
                        int index = Integer.parseInt(parts[2]);
                        switch (target) {
                            case "galaxy":
                                System.out.println(playerService.travelToGalaxy(index));
                                break;
                            case "system":
                                System.out.println(playerService.travelToSystem(index));
                                break;
                            case "planet":
                                System.out.println(playerService.travelToPlanet(index));
                                break;
                            default:
                                System.out.println("Invalid travel target. Use galaxy, system, or planet.");
                        }
                    }
                    break;
                case "explore":
                    System.out.println(playerService.explorePlanet());
                    break;
                default:
                    System.out.println("Unknown command. Type 'help' for a list of commands.");
            }
        } catch (Exception e) {
            System.out.println("Error processing command: " + e.getMessage());
        }
    }
}

