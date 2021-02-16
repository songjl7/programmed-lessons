import java.util.Scanner;
public class SquareTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n");
        int n = scan.nextInt();

        if (n <= 0){
            System.out.println("n must be >= 0. Please try again.");
        } else {
            System.out.println(Square(n)); 
        }
    }

    public static int Square(int n){
        if (n == 1) return 1;
        return (Square(n - 1) + (2*n)-1);
    }
}