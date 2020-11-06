import java.util.Scanner;

public class Odious{
    public static boolean testNum(long n){
        int total = 1;
        long num = n;

        while (num / 2 != 0){
            total += num % 2;
            num = num / 2;
        }

        return n % 2 == 1;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = scan.nextLong();

        while (num > 0){
            if (testNum(num)){
                System.out.println(num + " is odious");
            } else {
                System.out.println(num + " is evil");
            }

            System.out.println("\nEnter a number");
            num = scan.nextLong();
        }
    }
}