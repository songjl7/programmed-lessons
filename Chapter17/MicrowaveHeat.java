import java.util.Scanner;

public class MicrowaveHeat{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter # items to be heated");
        int items = scanner.nextInt();
        System.out.println("Enter time for 1 item");
        int time = scanner.nextInt();
        int singlesec = time % 100 + (((time - (time % 100)) / 100) * 60);
        int minutes;
        int seconds;
        int totaltime = 0;

        if (items == 1){
            minutes = (time - (time % 100)) / 60;
            seconds = time % 100;
            System.out.println("Heat for "+ minutes + " minutes " + seconds + " seconds");
        } else if (items == 2){
            minutes = (totaltime - (totaltime % 100)) / 60;
            seconds = totaltime % 100;
            if (seconds == 60){
                minutes = minutes + 1;
                seconds = 0;
            }
            System.out.println("Heat for "+ minutes + " minutes " + seconds + " seconds");
        } else if (items == 3){
            totaltime = singlesec * 2;
            minutes = (totaltime - (totaltime % 100)) / 60;
            seconds = totaltime % 100;
            if (seconds == 60){
                minutes = minutes + 1;
                seconds = 0;
            }
            System.out.println("Heat for "+ minutes + " minutes " + seconds + " seconds");
        } else {
            System.out.println("Heating more than 3 items is not recommended.");
        }
    }
}