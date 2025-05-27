import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        
        System.out.println("Guess a number between 1 and 100:");
        
        while (guess != numberToGuess) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                
                if (guess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (guess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number.");
                }
            } else {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // discard invalid input
            }
        }
        
        scanner.close();
    }
}
