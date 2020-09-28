import java.util.Scanner;

public class JetLag {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter all values on a 24 hour clock (e.g. 6PM is 18).");
        System.out.println("Enter # of hours of travel");
        double travel = scanner.nextInt();
        System.out.println("Enter # of time zones crossed");
        double zones = scanner.nextInt();
        System.out.println("Enter departure time");
        double userDepart = scanner.nextInt();
        System.out.println("Enter arrival time");
        double userArrive = scanner.nextInt();
        
        double depart = 0;
        double arrive = 0;
        if (8 <= userDepart && userDepart < 12){
            depart = 0;
        } else if (12 <= userDepart && userDepart < 18){
            depart = 1;
        } else if (18 <= userDepart && userDepart < 22){
            depart = 3;
        } else if (22 <= userDepart && userDepart < 1){
            depart = 4;
        } else if (1<= userDepart && userDepart < 8) {
            depart = 5;
        }

        if (8 <= userArrive && userArrive < 12){
            arrive = 4;
        } else if (12 <= userArrive && userArrive < 18){
            depart = 2;
        } else if (18 <= userArrive && userArrive < 22){
            depart = 0;
        } else if (22 <= userArrive && userArrive < 1){
            depart = 1;
        } else if (1<= userArrive && userArrive < 8) {
            depart = 3;
        }

        double recovery = ((travel / 2) + (zones - 3) + depart + arrive) / 10;

        System.out.println("You will need " + recovery + " days to recover from jet lag.");
    }
}