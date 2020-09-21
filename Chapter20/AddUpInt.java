import java.util.Scanner;

public class AddUpInt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many integers will be added?");
        int intamt = scanner.nextInt();
        int sum = 0;

        while (intamt > 0){
            System.out.println("Enter an integer");
            sum = sum + scanner.nextInt();
            intamt --;
        }

        System.out.println("\nThe sum is " + sum);
    }
}