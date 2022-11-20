package ru.netology.tournament.domain;

public class Player {
    private final String id;
    private final String name;
    private final int strength;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStrength() {
        return strength;
    }

    public Player(String id, String name, int strength) {
        this.id = id;
        this.name = name;
        this.strength = strength;
    }
}
