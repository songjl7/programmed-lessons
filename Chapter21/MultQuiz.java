import java.util.*;

public class MultQuiz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int random1 = 1 + random.nextInt(10);
        int random2 = 1 + random.nextInt(10);

        for (int i=0;i<10;i++){
            System.out.println("What is " + random1 + " * " + random2 + "?");
            int answer = scanner.nextInt();
            if (answer == random1*random2){
                score++;
                random1 = 1 + random.nextInt(10);
                random2 = 1 + random.nextInt(10);
            } else {
                random1 = 1 + random.nextInt(10);
                random2 = 1 + random.nextInt(10);
            }
        }

        
        System.out.println("You got " + score + " out of 10 questions correct!");
    }
}