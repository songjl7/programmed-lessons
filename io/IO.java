import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args) {
        System.out.println("Input/Output Example");

        File file;
        Scanner scan;

        // Exception -> IOException

        // 2 ways to handle exceptions (errors)
        // throws -> some other code handles the exception, not my problem
        // put it up next to (string[] args), can separate several with commas

        // try/catch -> we manage the exception ourselves
        try {
            file = new File("data.csv");
            scan = new Scanner(file);

            int num = scan.nextInt();
            System.out.println("The first number is " + num);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0); // quits the program
        } finally {
            System.out.println("Done");
        }
    }
}