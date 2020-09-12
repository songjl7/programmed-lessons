import java.text.*;
import java.util.Scanner;

public class DepositValue{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Enter initial deposit");
        double P = scanner.nextDouble();
        System.out.println("Enter interest rate as a decimal");
        double r = scanner.nextDouble();
        System.out.println("Enter number of times per year interest is calculated");
        double n = scanner.nextDouble();
        System.out.println("Enter number of years");
        double t = scanner.nextDouble();
        double V = (P * Math.pow((1 + (r / n)), (n * t)));
        System.out.println("Value: $" + df.format(V));
    }
}