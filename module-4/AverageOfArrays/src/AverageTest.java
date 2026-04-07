// Suresh Shrestha
// 4/7/2026
// Module-4.2 assignment
// Description: This program calculates averages of different arrays using method overloading and displays the results.

public class AverageTest {

    // Method for short array
    public static short average(short[] array) {
        short sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method for int array
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;

    }
    // Method for long array
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for double array
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to display array elements
     public static void displayArray(String label, Object array) {
        System.out.print(label + ": ");

        if (array instanceof short[]) {
            for (short num : (short[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof int[]) {
            for (int num : (int[]) array) {
                System.out.print(num + " ");
            }
        } else if (array instanceof long[]) {
            for (long num : (long[]) array) {
                System.out.print(num + " ");

            }
        } else if (array instanceof double[]) {
            for (double num : (double[]) array) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
       }

    // Test program
    public static void main(String[] args) {

    // Different size arrays
        short[] shortArray = {2, 4, 6};
        int[] intArray = {10, 20, 30, 40};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        // Display arrays and averages
            displayArray("Short Array", shortArray);
            System.out.println("Average: " + average(shortArray));
            System.out.println();

            displayArray("Int Array", intArray);
            System.out.println("Average: " + average(intArray));
            System.out.println();

            displayArray("Long Array", longArray);
            System.out.println("Average: " + average(longArray));
            System.out.println();

            displayArray("Double Array", doubleArray);
            System.out.println("Average: " + average(doubleArray));
        }

    }