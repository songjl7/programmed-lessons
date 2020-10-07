import java.util.Scanner;

public class OddSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scanner.nextInt();
        int sum = 0;
        int squared = n * n;

        for (int i = 0; i < n; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }

        System.out.println("Sum of all odd integers up to n: " + sum + "\nn squared: " + squared);
    }
}