// JavaScript source code
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1; // Number between 1 and 10
        int userGuess = 0;
        int attempts = 0;
        boolean correct = false;
        System.out.println("Hello, this is for my CS 2400 Project 0 Git Ready!")

        System.out.println("Welcome to the Number Guessing Game!");       //Introduction to Game
        System.out.println("Guess a number between 1 and 10:");

        while (!correct) {                                      //While loop to keep user guessing
            System.out.print("Your guess: ");
            userGuess = scanner.nextInt();
            ;

            if (userGuess == numberToGuess) {
                correct = true;
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            } else if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();
    }
}
 