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

            while (scan.hasNext()){ // checks if there is more int
                String letter = scan.next();
                System.out.println("The next letter is " + letter);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0); // quits the program
        } finally {
            System.out.println("Done");
        }
    }
}