import java.util.Scanner;
public class CentToDollar {
    public static void main(String[] args){
        System.out.println("Enter the cents:");
        Scanner scanner = new Scanner(System.in);
        int cents = scanner.nextInt();
        int dollars = cents / 100;
        int remainder = cents % 100;
        System.out.println("That is " + dollars + " dollars and " + remainder + " cents.");
    }
}