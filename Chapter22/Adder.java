import java.util.Scanner;

public class Adder{
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);
        int data;
        int inSum = 0;
        int outSum = 0;

        System.out.println("Enter low end of range");
        int low = scanner.nextInt();
        System.out.println("Enter high end of range");
        int high = scanner.nextInt();
        System.out.println("Enter data point (enter 0 to end)");
        data = scanner.nextInt();
        if (data < high && data > low) {
            inSum = inSum + data;
        } else {
            outSum = outSum + data;
        }

        while (data != 0){
            System.out.println("Enter data point");
            data = scanner.nextInt();
            if (data < high && data > low) {
                inSum = inSum + data;
            } else {
                outSum = outSum + data;
            }
        }

        System.out.println("Sum of in range values: " + inSum + "\nSum of out of range values: " + outSum);
    }
}