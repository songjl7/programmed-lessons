import java.util.Scanner;

public class OhmsLaw{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the voltage");
        int voltage = scanner.nextInt();
        System.out.println("Enter the resistance");
        int resistance = scanner.nextInt();
        double current = (voltage + 0.0) / resistance;
        System.out.println("The current is " + current);

    }
}