import java.util.Scanner;

public class HarmonicMean{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scanner.nextDouble();
        System.out.println("Enter y");
        double y = scanner.nextDouble();
        double arith = (x + y) / 2;
        double harm = 2 / ((1/x) + (1/y));
        System.out.println("Arithmetic mean: " + arith + "\nHarmonic mean: " + harm);
    }
}