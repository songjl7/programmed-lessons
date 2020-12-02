import java.util.Scanner;
import java.io.*;

public class IntSum {
    public static void main(String[] args){
        File file;
        Scanner scan;

        try {
            file = new File("nums.csv");
            scan = new Scanner(file);

            // reads data from data.csv to create dog objects
            int sum = 0;

            while (scan.hasNextInt()){
                sum += scan.nextInt();
            }

            System.out.println("The sum is: " + sum);

            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0); // quits the program
        } finally {
            System.out.println("Done");
        }
    }
}