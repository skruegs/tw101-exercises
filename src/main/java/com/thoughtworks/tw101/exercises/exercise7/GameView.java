package com.thoughtworks.tw101.exercises.exercise7;

import java.io.PrintStream;

public class GameView {
    private PrintStream out;

    public GameView() {
        this.out = System.out;
    }

    public void displayWelcome() {
        out.println("I'm thinking of a number from 1 to 100...");
    }

    public void displayPrompt() {
        out.println("Enter your guess:");
    }

    public void displayCorrectGuess() {
        out.println("That's correct, you win!");
    }

    public void displayGuessTooLow() {
        out.println("That's too low, try again.");
    }

    public void displayGuessTooHigh() {
        out.println("That's too high, try again.");
    }
}
