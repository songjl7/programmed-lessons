import java.util.Scanner;

public class AnnAppCost{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cost per kilowatt-hour in cents");
        double cents = scanner.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        int hours = scanner.nextInt();
        double cost = (cents * hours) / 100;
        System.out.println("Annual cost: " + cost);
    }
}