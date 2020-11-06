import java.util.Scanner;

public class Unlucky{

    public static boolean testNum(long num) {
        long remainder = num / 10;
        return remainder == 13;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = scan.nextLong();

        String status = "safe";

        if (testNum(num)){
            status = "unlucky";
        } 

        System.out.println(num + " is " + status);
    }
}