package com.Game;

import java.util.Random;
import java.util.Scanner;

    public class GuessTheNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create scanner for input
            Random rand = new Random();  // Create random object to generate number

            int numberToGuess = rand.nextInt(100) + 1;  // Random number between 1 and 100
            int numberOfTries = 0;
            int userGuess = 0;

            System.out.println("Welcome to Guess the Number Game!");
            System.out.println("I have selected a number between 1 and 100. Try to guess it!");

            // Loop until the user guesses correctly
            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();  // Get user's guess
                numberOfTries++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                }
            }

            sc.close();  // Close scanner
        }
    }
}
