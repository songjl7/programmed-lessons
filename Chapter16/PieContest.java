import java.util.Scanner;

public class PieContest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight (in pounds)");
        double weight = scanner.nextDouble();
        if ((weight <= 220) || (weight >= 280)){
            System.out.println("You may not enter the State Fair Pie Eating Contest.");
        } else {
            System.out.println("You may enter the State Fair Pie Eating Contest.");
        }
    }
}