import java.util.Scanner;
import java.io.*;

public class StopWordRemover {
    public static void main(String[] args){
        File file;
        Scanner scan;

        PrintWriter output;

        try {
            file = new File("e5in.txt");
            scan = new Scanner(file);
            output = new PrintWriter("e5out.txt");

            while (scan.hasNext()){
                String word = scan.next();
                if (word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("the") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("of") || word.replaceAll("[^a-zA-Z]" , "is").toLowerCase().equals("a") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("to") || word.replaceAll("[^a-zA-Z]" , "").toLowerCase().equals("is")){
                    output.print("");
                } else {
                    output.print(word + " ");
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