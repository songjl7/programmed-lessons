import java.util.Scanner;
// Sample data: {0, 1, 2, 3, 4, 5, 96}
public class WeekTemp {
    public static void main(String[] args){
        System.out.println("The program will ask you to enter temperatures. Please round to the nearest degree Fahrenheit.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Monday temperature");
        String tempm = scan.next();
        System.out.println("Enter Tuesday temperature");
        String tempt = scan.next();
        System.out.println("Enter Wednesday temperature");
        String tempw = scan.next();
        System.out.println("Enter Thursday temperature");
        String tempth = scan.next();
        System.out.println("Enter Friday temperature");
        String tempf = scan.next();
        System.out.println("Enter Saturday temperature");
        String tempsa = scan.next();
        System.out.println("Enter Sunday temperature");
        String tempsu = scan.next();
        System.out.println("Monday:\t\t" + tempm + "\nTuesday:\t" + tempt + "\nWednesday:\t" + tempw + "\nThursday:\t" + tempth + "\nFriday:\t\t" + tempf + "\nSaturday:\t" + tempsa + "\nSunday:\t\t" + tempsu);
        double avg = (Integer.parseInt(tempm) + Integer.parseInt(tempt) + Integer.parseInt(tempw) + Integer.parseInt(tempth) + Integer.parseInt(tempf) + Integer.parseInt(tempsa) + Integer.parseInt(tempsu)) / 7.0;
        System.out.println("Average temperature of the week: " + avg);
    }
}