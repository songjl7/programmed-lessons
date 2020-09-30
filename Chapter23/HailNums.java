import java.util.*;

public class HailNums{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter N");
        long n = scanner.nextInt();
        long max = 0;
        int length = 0;

        while (n != 1){
            long m = 0;
            if (n % 2 == 0){
                m = n / 2;
                if (m > n){
                    max = m;
                }
                System.out.println(m);
                length += 1;
                n = m;
            } else {
                m = 3 * n + 1;
                if (m > n){
                    max = m;
                }
                System.out.println(m);
                length += 1;
                n = m;
            }
        }

        System.out.println("Maximum #: " + max + "\nSequence length: " + (length + 1));
    }
}