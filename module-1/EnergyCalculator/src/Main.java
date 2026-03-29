// Suresh Shrestha
// 3/28/2026
// Module 1.3 Assignment

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter water mass (kg): ");
        double waterMass = input.nextDouble();

        System.out.print("Enter initial temperature (°C): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter final temperature (°C): ");
        double finalTemp = input.nextDouble();

        // Calculate energy
        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        // Display result
        System.out.println("Energy needed: " + Q + " Joules");

        input.close();
    }
}