import java.util.Scanner;

public class OrderChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of bolts");
        int bolts = scanner.nextInt();
        System.out.println("Enter number of nuts");
        int nuts = scanner.nextInt();
        System.out.println("Enter number of washers");
        int washers = scanner.nextInt();

        if ((nuts >= bolts) && (washers >= (2 * bolts))){
            System.out.println("Order is OK.");
        } else if (nuts < bolts) {
            System.out.println("Check the Order: too few nuts");
        } else if (washers < (2 * bolts)){
            System.out.println("Check the Order: too few washers");
        }

        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washerPrice = 1;
        int cost = (bolts * boltPrice) + (nuts * nutPrice) + (washers * washerPrice) ;
        System.out.println("Total cost (in cents): " + cost);
    }
}