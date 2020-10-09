import java.util.Scanner;

public class BirthdayParadox{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter # of guests");
        int n = scanner.nextInt();
        double probability = 1.0;
        int guests = 0;

        for(int i = 1; i < n; i++){
            probability = probability * ((365.0 - i)/365.0);
        }

        System.out.println("Probability no one shares a birthday: " + probability  * 100 + "%" + "\n# guests needed to reach ~50% chance is 21");
    }
}