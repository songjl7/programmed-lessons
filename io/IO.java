import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException {
        System.out.println("Input/Output Example");

        // overwrites old data!!!
        PrintWriter output = new PrintWriter("output.md");

        // see this file  by doing $ cat output.md in Git Bash
        output.println("My new data");

        Dog dog = new Dog("Dot", "Terrier", 10);
        output.println(dog);

        output.close();

        // File file;
        // Scanner scan;

        // // try/catch -> we manage the exception ourselves
        // try {
        //     file = new File("data.csv");
        //     scan = new Scanner(file);

        //     // reads data from data.csv to create dog objects
        //     while (scan.hasNext()){
        //         String[] parameters = scan.nextLine().split(", ");
        //         Dog dog = new Dog(parameters[0], parameters[1], Integer.parseInt(parameters[2]));
        //         System.out.println(dog);
        //     }

        // } catch (FileNotFoundException e) {
        //     System.out.println("File does not exist");
        //     System.exit(0); // quits the program
        // } finally {
        //     System.out.println("Done");
        // }
        // scan.close();
    }
}