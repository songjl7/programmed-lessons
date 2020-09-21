import java.util.Scanner;
public class SumSeqInt{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter N");
        int n = scanner.nextInt();
        
        int formsum = (n * (n + 1)) / 2;
        int loopsum = 0;
        
        while (n>0){
            loopsum = loopsum + n;
            n --;
        }
        
        System.out.println("Loop sum: " + loopsum + "\nFormula sum: " + formsum);
    }
}