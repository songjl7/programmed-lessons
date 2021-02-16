import java.util.Scanner;
public class TriangleTester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter n (number of layers of triangle)");
        int n = scan.nextInt();

        if (n <= 0){
            System.out.println("n must be >= 0. Please try again.");
        } else {
            System.out.println(Triangle(n)); // => 21
        }
    }

    public static int Triangle(int n){
        if (n == 1) return 1;
        return n + Triangle(n - 1);
    }
}