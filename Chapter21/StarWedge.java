import java.util.Scanner;

public class StarWedge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial # of stars");
        int initial = scanner.nextInt();
        int count = 0;

        String stars = new String(new char[initial]).replace('\0','*');
        while(count < initial){
            System.out.println(stars.substring(0, stars.length() - count));
            count++;
        }
    }
}