import java.util.Scanner;
import java.io.*;

public class EmailExtractor {
    public static void main(String[] args){
        File file;
        Scanner scan;

        PrintWriter output;

        try {
            file = new File("e6in.csv");
            scan = new Scanner(file);
            output = new PrintWriter("e6out.txt");

            while (scan.hasNext()){
                String email = scan.next();

                if (email.indexOf("@") > 0 && email.substring(email.indexOf("@")).contains(".")){
                    output.println(email);
                } else {
                    output.print("");
                }
            }

            output.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}