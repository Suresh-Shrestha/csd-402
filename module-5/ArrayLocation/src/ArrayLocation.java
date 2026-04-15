// Suresh Shrestha
// 4/15/2026
// Module 5.2 Assignment
// Description: This program finds the location of the largest and smallest elements in two-dimensional int and double arrays.

public class ArrayLocation {

    // Method for largest in double array
    public static int[] locateLargest(double[][] arrayParam) {
        int row = 0, col = 0;
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Method for largest in int array
    public static int[] locateLargest(int[][] arrayParam) {
        int row = 0, col = 0;
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Method for smallest in double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int row = 0, col = 0;
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Method for smallest in int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int row = 0, col = 0;
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row, col};
    }

    // Main method to test
    public static void main(String[] args) {

        int[][] intArray = {
                {3, 5, 9},
                {1, 7, 2},
                {8, 6, 4}
        };

        double[][] doubleArray = {
                {2.5, 3.1, 1.8},
                {9.4, 0.5, 7.2},
                {6.6, 8.8, 4.3}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Largest int at: [" + largestInt[0] + "," + largestInt[1] + "]");
        System.out.println("Smallest int at: [" + smallestInt[0] + "," + smallestInt[1] + "]");

        System.out.println("Largest double at: [" + largestDouble[0] + "," + largestDouble[1] + "]");
        System.out.println("Smallest double at: [" + smallestDouble[0] + "," + smallestDouble[1] + "]");
    }
}
