package com.thoughtworks.tw101.exercises.exercise8;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class GameController {
    private GameView view;
    private GameModel model;
    private Scanner in;

    public GameController(GameView view, GameModel model) {
        this.view = view;
        this.model = model;
        in = new Scanner(System.in);
    }

    public void start() {
        view.displayWelcome();
        prompt();
    }

    public void prompt() {
        view.displayPrompt();
        readInput();
    }

    public void readInput() {
        String input = null;
        try {
            input = in.nextLine();
        } catch (NoSuchElementException | IllegalStateException e) {
            System.out.println("Error reading input.");
            System.exit(1);
        }
        try {
            int guess = Integer.parseInt(input);
            processInput(guess);
        } catch (NumberFormatException e) {
            System.out.println("Only integers please.");
            prompt();
        }
    }

    public void processInput(int guess) {
        if (guess == model.getNumber()) {
            view.displayCorrectGuess();
            view.displayPreviousGuesses(model.getGuesses());
            System.exit(0);
        }
        else {
            model.addGuess(guess);
            if (guess < model.getNumber()) {
                view.displayGuessTooLow();
            }
            else {
                view.displayGuessTooHigh();
            }
            prompt();
        }
    }
}
