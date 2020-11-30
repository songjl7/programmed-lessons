import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args) {
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;

        // try/catch -> we manage the exception ourselves
        try {
            file = new File("data.csv");
            scan = new Scanner(file);

            while (scan.hasNextInt()){ // checks if there is more int
                int num = scan.nextInt();
                System.out.println("The next number is " + num);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0); // quits the program
        } finally {
            System.out.println("Done");
        }
    }
}