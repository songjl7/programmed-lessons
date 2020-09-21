import java.util.Scanner;

public class WordDots{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word");
        String first = scanner.next();
        System.out.println("Enter second word");
        String second = scanner.next();

        int count = first.length() + second.length();
        System.out.print(first);
        while (count < 30){
            System.out.print(".");
            count++;
        }
        System.out.print(second);
    }
}