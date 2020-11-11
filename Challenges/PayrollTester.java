import java.text.DecimalFormat;

public class PayrollTester {
    public static void main(String[] args){
        // initializaiton of employeet
        Employee sally = new Employee("Sally", "CEO", 1.00);
        System.out.println(sally.toString());

        Employee joe = new Employee("Joe", "henchman", 0.01);
        System.out.println(joe.toString());

        sally.setHours(5);
        System.out.println(sally.toString());

        sally.setAmt(15000.00);

        Paycheck firstCheck = sally.requestPaycheck();
        System.out.println(sally.toString());
        System.out.println(firstCheck.toString());

    }
}