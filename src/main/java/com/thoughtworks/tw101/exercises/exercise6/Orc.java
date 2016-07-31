package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name;
    private int hitpoints;

    public Orc(String name, int hitpoints) {
        this.name = name;
        this.hitpoints = hitpoints;
    }

    @Override
    public void takeDamage(int amount) {
        hitpoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ": " + hitpoints);
    }

}
