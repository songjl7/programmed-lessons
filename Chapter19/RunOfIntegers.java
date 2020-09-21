import java.util.Scanner;

public class RunOfIntegers{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start");
        int start = scanner.nextInt();
        System.out.println("Enter end");
        int end = scanner.nextInt();

        while(start <= end){
            System.out.println(start);
            start = start + 1;
        }
    }
}