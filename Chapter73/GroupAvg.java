import java.util.Scanner;
import java.io.*;

public class GroupAvg{
    public static void main(String[] args){
        File file;
        Scanner scan;

        Scanner userScan = new Scanner(System.in);

        System.out.println("Enter file name (enter \"quit\" to end)");
        String fileName = userScan.nextLine();

        int totsum = 0;
        
        while (!fileName.toLowerCase().equals("quit")){
            try {
                file = new File(fileName);
                scan = new Scanner(file);

                int sum = 0;
                int count = 0;

                while (scan.hasNextInt()){
                    int nextInt = scan.nextInt();
                    count++;
                    sum += nextInt;
                    totsum += nextInt;
                }

                double avg = sum / count;
                System.out.println("Average: " + avg);

                System.out.println("Enter file name (enter \"quit\" to end)");
                fileName = userScan.nextLine();
            } catch (FileNotFoundException e){
                System.out.println("File not found");
                System.exit(0);
            }
        }

        userScan.close();
        System.out.println("Total sum: " + totsum);
    }
}