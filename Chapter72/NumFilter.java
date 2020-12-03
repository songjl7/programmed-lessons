import java.util.Scanner;
import java.io.*;

public class NumFilter {
    public static void main(String[] args){
        File file;
        Scanner scan;
        Scanner userScan = new Scanner(System.in);

        PrintWriter neg;
        PrintWriter pos;

        System.out.println("Enter input file");
        String inputs = userScan.nextLine();
        
        System.out.println("Enter negative file");
        String negFile = userScan.nextLine();
        System.out.println("Enter positive file");
        String posFile = userScan.nextLine();

        userScan.close();

        try {
            file = new File(inputs);
            scan = new Scanner(file);

            neg = new PrintWriter(negFile);
            pos = new PrintWriter(posFile);

            while (scan.hasNextInt()){
                int nextInt = scan.nextInt();

                if (nextInt < 0){
                    neg.println(nextInt);
                } else {
                    pos.println(nextInt);
                }
            }

            neg.close();
            pos.close();
            scan.close();

        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}