// Suresh Shrestha
// 3/30/2026
// Module 2.2 Assignment

// Program description: This program generates a random choice for the computer and compares
// it with the user's input to determine the result.

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Create Random object for computer choice
        Random random = new Random();

        // Generate random number (1-3)
        int computerChoice = random.nextInt(3) + 1;

        // Prompt user for input
        System.out.println("Choose your option: ");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");

        int userChoice = input.nextInt();

        // Variables to store choices as text
        String userMove = "";
        String computerMove = "";

        // Convert user choice to text
        if (userChoice == 1) {
            userMove = "Rock";
        } else if (userChoice == 2) {
            userMove = "Paper";
        } else if (userChoice == 3) {
            userMove = "Scissors";
        } else {
          System.out.println("Invalid input! Please run again.");
          input.close();
          return;
        }

        // Convert computer choice to text
        if (computerChoice == 1) {
            computerMove = "Rock";
        } else if (computerChoice == 2) {
            computerMove = "Paper";
        } else {
            computerMove = "Scissors";
        }

        // Display both choices
        System.out.println("\nYou chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);

        // Determine winner
        if (userChoice == computerChoice) {
            System.out.println("Result: It's a tie!");
        }
        else if ((userChoice == 1 && computerChoice == 3) ||
                 (userChoice == 2 && computerChoice == 1) ||
                 (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        }
        else {
            System.out.println("Result: Computer wins!");
        }
        // Close scanner
        input.close();

    }
}