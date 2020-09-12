import java.text.*;
import java.util.Scanner;

public class InterestYears{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("##0.0");
        System.out.println("Enter interest rate in percent");
        double rate = scanner.nextDouble();
        double years = 72.0 / rate;
        System.out.println("It will take " + df.format(years) + " years to double your money.");
    }
}