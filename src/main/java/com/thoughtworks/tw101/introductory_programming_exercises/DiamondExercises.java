package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            drawLine(n, i);
        }
    }

    private static void drawLine(int n, int index) {
        int spaces = n - index;
        int stars = 2 * index - 1;
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }
        for (int j = 0; j < spaces; j++) {
            System.out.print(" ");
        }
        System.out.println();
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawDiamondBottom(n);
    }

    private static void drawDiamondBottom(int n) {
        for (int i = n - 1; i > 0; i--) {
            drawLine(n, i);
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i = 1; i < n; i++) {
            drawLine(n, i);
        }
        System.out.println("Sarah");
        drawDiamondBottom(n);
    }
}
