import java.util.Scanner;

public class Combinations{

    public static long factorial(int num){
        long fct = 1;
        for (int j = 1; j <= num; j++){
            fct *= j;
        }
        return fct;
    }

    public static long nChooseR(int n, int r){
        return (factorial(n) / (factorial(r)*factorial(n - r)));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N");
        int n = scan.nextInt();
        System.out.println("Enter R");
        int r = scan.nextInt();

        System.out.println("N choose R: " + nChooseR(n, r));
    }
}