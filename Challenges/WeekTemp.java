import java.util.Scanner;
// Sample data: {0, 1, 2, 3, 4, 5, 96}
public class WeekTemp {
    public static void main(String[] args){
        System.out.println("The program will ask you to enter temperatures. Please round to the nearest degree Fahrenheit.");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Monday temperature");
        int tempm = scan.nextInt();
        System.out.println("Enter Tuesday temperature");
        int tempt = scan.nextInt();
        System.out.println("Enter Wednesday temperature");
        int tempw = scan.nextInt();
        System.out.println("Enter Thursday temperature");
        int tempth = scan.nextInt();
        System.out.println("Enter Friday temperature");
        int tempf = scan.nextInt();
        System.out.println("Enter Saturday temperature");
        int tempsa = scan.nextInt();
        System.out.println("Enter Sunday temperature");
        int tempsu = scan.nextInt();
        System.out.println("Monday:\t\t" + tempm + "\nTuesday:\t" + tempt + "\nWednesday:\t" + tempw + "\nThursday:\t" + tempth + "\nFriday:\t\t" + tempf + "\nSaturday:\t" + tempsa + "\nSunday:\t\t" + tempsu);
        double avg = (tempm + tempt + tempw + tempth + tempf + tempsa + tempsu) / 7.0;
        System.out.println("Average temperature of the week: " + avg);
    }
}