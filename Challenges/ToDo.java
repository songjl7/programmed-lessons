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
            output = new PrintWriter(new FileWriter("tasks.txt", true));
            file = new File("tasks.txt");
            scan = new Scanner(file);
            userScan = new Scanner(System.in);

            Task newTask;

            if (scan.hasNextLine()) {
                while (scan.hasNextLine()){
                    System.out.println(scan.nextLine());
                }

                System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                char option = userScan.nextLine().charAt(0);

                while (option != 'x'){
                    ArrayList<String> taskInfo = new ArrayList<String>();

                    if (option == 'a') {
                        System.out.println("Enter task description");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter due date");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter done status (t/f)");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter priority (1-5, with 1 = critical)");
                        taskInfo.add(userScan.nextLine());
                    }

                    if (option == 'u'){
                        
                    }

                    if (option == 'x'){
                        scan.close();
                        userScan.close();
                        output.close();
                        System.exit(0);
                    }

                    newTask = new Task(taskInfo.get(0), taskInfo.get(1), (taskInfo.get(2)).toLowerCase().equals("t"), Integer.parseInt(taskInfo.get(3)));

                    output.println(newTask);

                    System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                    option = userScan.nextLine().charAt(0);

                }

            } else {
                System.out.println("Menu: Add new task (a), Quit (x)");
                char option = userScan.nextLine().charAt(0);

                while (option != 'x'){
                    ArrayList<String> taskInfo = new ArrayList<String>();

                    if (option == 'a') {
                        System.out.println("Enter task description");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter due date");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter done status (t/f)");
                        taskInfo.add(userScan.nextLine());
                        System.out.println("Enter priority (1-5, with 1 = critical)");
                        taskInfo.add(userScan.nextLine());
                    }

                    if (option == 'u'){
                        
                    }

                    if (option == 'x'){
                        scan.close();
                        userScan.close();
                        output.close();
                        System.exit(0);
                    }

                    newTask = new Task(taskInfo.get(0), taskInfo.get(1), (taskInfo.get(2)).toLowerCase().equals("t"), Integer.parseInt(taskInfo.get(3)));

                    output.println(newTask);

                    System.out.println("Menu: Add new task (a), Update existing task (u), Clear all tasks (c), Quit (x)");
                    option = userScan.nextLine().charAt(0);

                }
            }

            scan.close();
            userScan.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
            System.exit(0);
        }
    }
}