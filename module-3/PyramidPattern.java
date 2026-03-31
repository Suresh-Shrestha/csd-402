// Suresh Shrestha
// 3/31/2026
// Module-3.2 Assignment

public class PyramidPattern {
    public static void main(String[] args) {

        int totalRows = 7;
        int atColumn = 31;

        for (int row = 0; row < totalRows; row++) {
            String line = "";

            // Print spaces to center pyramid
            for (int space = 0; space < totalRows - row - 1; space++) {
                line += "  ";
            }

            // Print increasing values
            int value = 1;
            for (int col = 0; col <= row; col++) {
                line += value + " ";
                value *= 2;
            }

            // Print decreasing values
            value /= 4;
            for (int col = 0; col < row; col++) {
                line += value + " ";
                value /= 2;
            }

            // Add spaces so @ stays in one vertical line
            while (line.length() < atColumn) {
                line += " ";
            }

            // Print final line with @
            System.out.println(line + "@");
        }
    }
}