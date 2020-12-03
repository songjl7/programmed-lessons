import java.util.Scanner;
import java.io.*;

public class SepNum {
    public static void main(String[] args){
        File file;
        Scanner scan;

        try {
            file = new File("e4in.csv");
            scan = new Scanner(file);

            int xSum = 0;
            int ySum = 0;

            while (scan.hasNext()){
                String nextString = scan.nextLine();
                if (nextString.substring(0,3).equals("x= ")){
                    xSum += Integer.parseInt(nextString.substring(3));
                } else if (nextString.substring(0,3).equals("y= ")) {
                    ySum += Integer.parseInt(nextString.substring(3));
                }
            }

            scan.close();

            System.out.println("x sum: " + xSum);
            System.out.println("y sum: " + ySum);

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}