import java.util.Scanner;

public class BrickDistance{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        double sec = scanner.nextDouble();
        double distance = 0.5 * (32.174 * (sec * sec));
        System.out.println("Distance: " + distance);
    }
}