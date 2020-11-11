import java.util.Random;
import java.text.DecimalFormat;

public class Employee{
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,##0.00");

    private String name;
    private String position;
    private double wage;
    private int idNum;
    private int hoursWorked = 0;
    private int totalHours = 0;
    private double amt;

    public Employee(String name, String position, double wage){
        this.name = name;
        this.position = position;
        this.wage = wage;
        this.idNum = rand.nextInt(101);
    }

    public void setHours(int hours){
        this.totalHours += hours;
        this.hoursWorked += hours;
    }

    public void setAmt(double amt){
        this.amt = amt;
    }

    public Paycheck requestPaycheck(){
        Paycheck paycheck = new Paycheck(this, this.amt);
        this.hoursWorked = 0;
        return paycheck;
    }

    public String getName(){ return this.name; }
    public double getWage(){ return this.wage; }
    public int getHoursWorked(){ return this.hoursWorked; }
    public int getTotalHours(){ return this.totalHours; }
    public double getAmt(){ return this.amt; }

    public String toString(){
        return "\nEmployee name: " + name + "\nPosition: " + position + "\nWage: $" + df.format(wage) + "\nID #: " + idNum + "\nHours worked in current period: " + hoursWorked + "\nTotal hours worked: " + totalHours;
    }
}