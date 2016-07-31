package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;

public class GameModel {
    private int number;

    public GameModel() {
        number = new Random().nextInt(100) + 1;
    }

    public int getNumber() {
        return number;
    }
}