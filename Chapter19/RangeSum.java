import java.util.Scanner;

public class RangeSum{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter low");
        int low = scanner.nextInt();
        System.out.println("Enter high");
        int high = scanner.nextInt();

        int lowsum = (((low - 1) * ((low - 1) + 1)) / 2);
        int highsum = (high * (high + 1)) / 2;

        System.out.println("Sum: " + (highsum - lowsum));
    }
}