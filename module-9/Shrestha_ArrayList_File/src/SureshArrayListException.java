// Suresh Shrestha
// 5/6/2026
// Module-9.2 Assignment

import java.util.ArrayList;
import java.util.Scanner;

public class SureshArrayListException {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Orange");
        items.add("Mango");
        items.add("Grape");
        items.add("Peach");
        items.add("Cherry");
        items.add("Lemon");
        items.add("Watermelon");
        items.add("Pineapple");

        System.out.println("ArrayList items:");

        int index = 0;
        for (String item : items) {
            System.out.println(index + ": " + item);
            index++;
        }

        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter the index number of the item you want to see again: ");

        String userInput = input.nextLine();

        try {
            // Auto-unboxing happens when Integer is used as int
            Integer selectedIndex = Integer.parseInt(userInput);


            String selectedItem = items.get(selectedIndex);

            System.out.println("You selected: " + selectedItem);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception has been thrown: out of Buounds");

        } catch (NumberFormatException e) {
            System.out.println("Exception has been thrown: Out of Bounds");
        }

        input.close();
    }
}

