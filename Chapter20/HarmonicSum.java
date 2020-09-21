import java.util.Scanner;

public class HarmonicSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter N");
        double n = scanner.nextDouble();

        double sum = 0;

        while (n > 0){
            sum = sum + (1.0 / n);
            n--;
        }

        System.out.println("The sum is: " + sum);
    }
}