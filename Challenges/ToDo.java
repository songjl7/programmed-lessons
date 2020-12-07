import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class ToDo {
    public static void main(String[] args) throws IOException{
        System.out.println("To Do List");

        File file;
        Scanner scan;
        Scanner userScan;
        PrintWriter output;

        try {
            output = new PrintWriter("tasks.txt");
            file = new File("tasks.txt");
            scan = new Scanner(file);
            userScan = new Scanner(System.in);

            Task myTask = new Task("Clean the kitchen", "12/5/20", false, 5);
            output.println(myTask);

            System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
            char option = userScan.next().charAt(0);

            ArrayList<String> taskInfo = new ArrayList<String>();

            if (option == 'a'){
                System.out.println("Enter task description");
                taskInfo.add(userScan.nextLine());
                System.out.println("Enter due date");
                taskInfo.add(userScan.nextLine());
                System.out.println("Enter done status (true/false)");
                taskInfo.add(userScan.nextLine());
                System.out.println("Enter priority (1-5)");
                taskInfo.add(userScan.nextLine());
            }

            System.out.println(taskInfo);

            if (scan.hasNextLine()) {

            }

            output.close();
            scan.close();
            userScan.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}