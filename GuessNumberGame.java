import java.util.Scanner;
import java.util.Random;

public class GuessNumberGame {

    public static void main(String[] args) {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Initialize Random to generate random numbers
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Guess a Number Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        // Game loop
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100) {
                System.out.println("Please enter a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        // Close the scanner
        sc.close();
    }
}
