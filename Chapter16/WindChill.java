import java.util.Scanner;

public class WindChill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wind speed");
        double v = scanner.nextDouble();
        System.out.println("Enter temperature");
        double temp = scanner.nextDouble();
        double chill;
        if ((v < 3) || (temp > 50)) {
            chill = temp;
        } else {
            chill = 35.74 + 0.6215*temp - 35.75 * Math.pow(v, 0.16) + 0.4275*temp*Math.pow(v, 0.16);
        }
        System.out.println("Wind chill: " + chill);
    }
}