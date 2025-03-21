package ex11_while;

import java.util.Random;
import java.util.Scanner;

public class Lab122_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        Random number = new Random();
        int numberGuess = number.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int guess;
        int attempts = 0;
        while (true) {
            guess = scanner.nextInt();
            attempts++;
            if (guess < numberGuess) {
                System.out.println("Too low, try again");
            }
            if (guess > numberGuess) {
                System.out.println("Too high, try again");
            } else {
                System.out.println("Correct! You guessed the number in" + " " + attempts + " "+  "attempts");
            }
        }
    }
}