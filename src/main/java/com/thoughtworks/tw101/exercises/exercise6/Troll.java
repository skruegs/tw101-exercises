package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name;
    private int hitpoints;

    public Troll(String name, int hitpoints) {
        this.name = name;
        this.hitpoints = 40;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= (amount / 2);
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hitpoints);
    }

}