import java.util.Scanner;

public class DiscountPrices{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price of purchase in cents");
        double amt = scanner.nextDouble();
        double discounted = amt * 0.9;
        System.out.println("Discounted price in cents: " + discounted);
    }
}