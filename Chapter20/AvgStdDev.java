import java.util.Scanner;

public class AvgStdDev{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scanner.nextInt();
        double sum = 0;
        double squaresum = 0;
        double next = 0;

        int count = n;
        while (count > 0){
            System.out.println("Enter a float");
             next = scanner.nextDouble();
            sum = sum + next;
            squaresum = squaresum + (next * next);
            count--;
        }

        double average = sum / n;
        double avgsquare = squaresum / n;
        double stddev = Math.sqrt(avgsquare - (average * average));
        System.out.println("Average: " + average + "\nStandard deviation: " + stddev);
    }
}