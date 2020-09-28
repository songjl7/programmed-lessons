import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double initialmi;
        double finalmi;
        double gal;
        double mpg;

        System.out.println("Enter initial miles. Enter negative number to quit.");
        initialmi = scanner.nextDouble();
        while (initialmi == Math.abs(initialmi)){
            System.out.println("Enter final miles");
            finalmi = scanner.nextDouble();
            System.out.println("Enter gallons");
            gal = scanner.nextDouble();

            mpg = (finalmi - initialmi) / gal;
            System.out.println("Miles per gallon: " + mpg);
            
            System.out.println("Enter initial miles. Enter negative number to quit.");
            initialmi = scanner.nextDouble();
        }

        System.out.println("bye");
    }
}