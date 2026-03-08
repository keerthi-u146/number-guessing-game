import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1-100
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter your guess: ");
            if (!input.hasNextInt()) {
                System.out.println("Please enter a valid number");
                input.next(); // clear invalid input
                continue;
            }
            guess = input.nextInt();

            if (guess < number) {
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct guess! Number was " + number);
            }
        }

        input.close();
    }
}