import java.util.Scanner;

public class CylinderTester {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double radius, height;
        
        System.out.println("Enter cylinder radius");
        radius = scanner.nextDouble();
        System.out.println("Enter cylinder height");
        height = scanner.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Volume: " + cylinder.volume() + "\nSurface area:" + cylinder.surface());
    }
}