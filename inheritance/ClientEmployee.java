//Client program for Person/Employee
import java.util.Scanner;

public class ClientEmployee {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        String last, first, dept;
        double pay_rate;
        int hours;
        
        Employee prof = new Employee("John", "Doe", "COSC", 25.50, 50); //subclass alternate constructor invoked
        Employee newEmp = new Employee(); //subclass default constructor invoked
    
        System.out.println("Enter employee last name");
        last = input.nextLine();
        System.out.println("Enter employee first name");
        first = input.nextLine();
        System.out.println("Enter employee department");
        dept = input.nextLine();
        System.out.println("Enter employee pay rate");
        pay_rate = input.nextDouble();
        System.out.println("Enter employee hours");
        hours = input.nextInt();
        
        Employee userEmp  = new Employee(first, last, dept, pay_rate, hours);
        newEmp.setAll("Richard", "Richardson", 12.00, 9, "IDK");

        // printing all the employees
        prof.printFirstLast();
        prof.print();

        System.out.println();

        newEmp.printFirstLast();
        newEmp.print();

        System.out.println();

        userEmp.printFirstLast();
        userEmp.print();

        // checking equals() methods
        System.out.println(prof.equals(newEmp));
        System.out.println(prof.equals(userEmp));

        // copying userEmp to blankEmp
        Employee blankEmp = new Employee();
        blankEmp.copy(userEmp);

        System.out.println(blankEmp.equals(userEmp));

    }

}