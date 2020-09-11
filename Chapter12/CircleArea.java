import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){
        System.out.println("Enter the radius of the circle.");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double area = (radius * radius) * Math.PI;
        System.out.println("The area of the circle is " + area);
    }
}