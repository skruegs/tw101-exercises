package com.thoughtworks.tw101.exercises.exercise7;

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
        processInput();
    }

    public void processInput() {
        int guess = in.nextInt(); // exceptions not handled

        if (guess == model.getNumber()) {
            view.displayCorrectGuess();
            System.exit(0);
        }
        else if (guess < model.getNumber()){
            view.displayGuessTooLow();
            prompt();
        }
        else {
            view.displayGuessTooHigh();
            prompt();
        }
    }
}
