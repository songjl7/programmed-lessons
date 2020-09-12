import java.util.Scanner;

public class BaseTwoLog{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a double");
        double num = scanner.nextDouble();
        double log = Math.log(num) / Math.log(2.0);
        System.out.println("Base 2 log of " + num + " is " + log);
    }
}