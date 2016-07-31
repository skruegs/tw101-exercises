package com.thoughtworks.tw101.exercises.exercise8;

import java.io.PrintStream;
import java.util.ArrayList;

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

    public void displayPreviousGuesses(ArrayList<Integer> guesses) {
        out.print("Previous guesses:");
        for (Integer guess : guesses) {
            out.print(" " + guess);
        }
    }
}