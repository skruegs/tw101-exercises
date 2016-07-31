package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;
import java.util.Random;

public class GameModel {
    private int number;
    private ArrayList<Integer> guesses;

    public GameModel() {
        number = new Random().nextInt(100) + 1;
        guesses = new ArrayList<Integer>();
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<Integer> getGuesses() {
        return guesses;
    }

    public void addGuess(int guess) {
        guesses.add(new Integer(guess));
    }
}