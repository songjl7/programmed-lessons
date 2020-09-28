import java.util.Scanner;

public class NumPower{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter X");
        double x = scanner.nextDouble();
        System.out.println("Enter n");
        int n = scanner.nextInt();
        
        double result = x;
        int count = n;

        if (n != Math.abs(n)){
            System.out.println("n must be a positive integer.");
        } else {
            while (count > 1){
                result = result * x;
                count--;
            }
            System.out.println(x + " raised to the " + n +"th power is: " + result); 
        }
    }
}