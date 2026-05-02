// Suresh Shrestha
// 5/1/2026
// Module-8.2 Assignment

import java.util.ArrayList;
import java.util.Scanner;

public class SureshArrayListTest {

    // Method to find largest number
    public static Integer max(ArrayList<Integer> list) {

        // If list is empty return 0
        if (list.isEmpty()) {
            return 0;
        }

        int largest = list.get(0);

        for (Integer num : list) {
            if (num > largest) {
                largest = num;
            }
        }
        return largest;

    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int value;

        System.out.println("Enter integers (0 to stop):");

        do{
            System.out.print("Enter number: ");
            value = input.nextInt();
            numbers.add(value); // add to ArrayList including 0

            } while (value != 0);

        // call method
            Integer result = max(numbers);

            // Display result
            System.out.println("Largest value: " + result);

            input.close();
        }
    }
