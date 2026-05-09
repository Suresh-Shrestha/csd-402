// Suresh Shrestha
// 5/6/2026
// Module-9.2 Assignment
 import java.io.File;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.util.Random;
 import java.util.Scanner;

 public class SureshFileData {
     public static void main(String[] args) {

         File file = new File("data.file");
         Random random = new Random();

         try {
             FileWriter writer = new FileWriter(file, true);

            for (int i = 0; i < 10; i++) {
                int number = random.nextInt(100);
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Data written to file successfully.");

            Scanner reader = new Scanner(file);

            System.out.println("\nData inside data.file:");

            while (reader.hasNext()) {
                System.out.print(reader.next() + " ");
            }

            reader.close();
         } catch (IOException e) {
             System.out.println("An error occurred while working with the file.");
         }
     }
 }


