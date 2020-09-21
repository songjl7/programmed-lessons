import java.util.Scanner;

public class OneLetterALine{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.next();

        int index = 0;

        while(index < word.length()){
            System.out.println(word.charAt(index));
            index++;
        }
    }
}