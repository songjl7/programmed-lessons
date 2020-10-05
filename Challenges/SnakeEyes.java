import java.util.*;

public class SnakeEyes {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of trials");
        double trials = scanner.nextDouble();

        int a = rand.nextInt(6) + 1;
        int b = rand.nextInt(6) + 1;
        int count = 0;
        double rolls = 0;
        double totalscore = 0;
        double totalrolls = 0;
        double fourplus = 0;
        
        while (count < trials ){
            rolls = 0;

            do {
                rolls += 1;
                totalrolls += 1;
                totalscore += (a + b);
                a = rand.nextInt(6) + 1;
                b = rand.nextInt(6) + 1;
            } while (a != 1 || b != 1);

            if (rolls > 4) {
                fourplus += 1;
            }
            count++;
        }

        System.out.println("Average # of rolls: " + (totalrolls / trials));
        System.out.println("Average score: " + (totalscore / trials));
        System.out.println("% players who rolled 4+ times: " + (fourplus / trials) * 100);
    }
}