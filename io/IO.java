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

            // reads data from data.csv to create dog objects
            while (scan.hasNext()){
                String[] parameters = scan.nextLine().split(", ");
                Dog dog = new Dog(parameters[0], parameters[1], Integer.parseInt(parameters[2]));
                System.out.println(dog);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0); // quits the program
        } finally {
            System.out.println("Done");
        }
    }
}