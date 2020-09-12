import java.util.Scanner;

public class FurtherSubstring {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("Enter starting index");
        int start = scanner.nextInt();
        System.out.println("Enter ending index");
        int end = scanner.nextInt();
        
        System.out.println("Original String: " + str);
        System.out.println("New substring: " + str.substring(start, end));
    }
}