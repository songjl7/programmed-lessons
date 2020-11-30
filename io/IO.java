import java.util.Scanner;
import java.io.*;

public class IO {
    public static void main(String[] args) throws IOException, FileNotFoundException  {
        System.out.println("Input/Output Example");

        File file = new File("wrong.csv");
        Scanner scan = new Scanner(file);

        // Exception -> IOException

        // 2 ways to handle exceptions (errors)
        // throws -> some other code handles the exception, not my problem
        // try/catch -> we manage the exception ourselves

        int num = scan.nextInt();
        System.out.println("The first number is " + num);
    }
}