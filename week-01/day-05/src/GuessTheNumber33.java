import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber33 {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8
    int random, guess, attempts;
    Scanner userInput = new Scanner(System.in);
    Random generator = new Random();
    random = generator.nextInt(100);
    attempts = 1;

    System.out.println("I am thinking of a number between 0 and 100, what do you think it is? You have 10 attempts.");

    guess = userInput.nextInt();
    while (guess != random && attempts < 10) {
      if (guess > random) {
        System.out.println("lower");
        attempts++;
      } else {
        System.out.println("higher");
        attempts++;
      }guess = userInput.nextInt();
    }
    System.out.println("You found the number: " + random + ". Congrats!");
  }
}
