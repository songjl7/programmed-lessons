import java.util.Scanner;
import java.io.*;

public class AvgStdDev {
    public static void main(String[] args){
        File file;
        Scanner scan;

        try {
            file = new File("doubles.csv");
            scan = new Scanner(file);

            double sum = 0;
            double count = 0;
            double sumSQ = 0;
    
            while (scan.hasNextDouble()){
                double nextDouble = scan.nextDouble();
                count++;
                sum += nextDouble;
                sumSQ += nextDouble* nextDouble;
            }

            double avg = sum / count;
            double avgSQ = sumSQ / count;
            double var = avgSQ - (avg*avg);
            double stdDev = Math.sqrt(var);

            System.out.println("The average is: " + avg);
            System.out.println("The standard deviation is: " + stdDev);


            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}