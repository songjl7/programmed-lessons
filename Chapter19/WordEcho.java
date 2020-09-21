import java.util.Scanner;

public class WordEcho{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a string");
        String word = scanner.next();

        int count = 0;
        while(count < word.length()){
            System.out.println(word);
            count ++;
        }
    }
}