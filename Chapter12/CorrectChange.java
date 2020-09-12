import java.util.Scanner;

public class CorrectChange{
    public static void main(String[] args){
        System.out.println("Enter the amount of cents");
        Scanner scanner = new Scanner(System.in);
        int total = scanner.nextInt();
        int dollars = total / 100;
        total = total - (dollars * 100);
        int quarters = (total % 100) / 25;
        total = total - (quarters * 25);
        int dimes = (total % 25) / 10;
        total = total - (dimes * 10);
        int nickels = (total % 10) / 5;
        total = total - (nickels * 5);
        int pennies = total % 5;
        System.out.println("Your change is " + dollars + " dollar(s), " + quarters + " quarter(s), " + dimes + " dime(s), " + nickels + " nickel(s), and " + pennies + " pennies.");
    }
}