//Class Employee: subclass of Person
public class Employee extends Person {

    private double payRate; 
    private double hoursWorked;
    private String department;

    public final int HOURS = 40;
    public final double OVERTIME = 1.5;

     //default constructor
     public Employee() {
        super();
        this.payRate = 0.00;
        this.hoursWorked = 0;
        this.department = "";
     }

     //add an alternate constructor with parameters
     public Employee(String first, String last, String dept, double pay, double hours){
        super(first, last);
        department = dept;
        payRate = pay;
        hoursWorked = hours;
     }

     public String toString() {
         //should return a String like this
         //The wages for xxxx from the xxxx department are: $xxxxx.xx"
        return "The wages for " + super.toString() + " from the " + department + " department are: $" + calculatePay();
     }

     public void print() {
       //Should print output like this (same line):
       //The employee xxxx from the xxxx department worked xx hours
       //with a pay rate of $xxx.xx. The wages for this employee are $xxxxx.xx
        System.out.println("The employee " + super.getFirstName() + " " + super.getLastName() + " from the " + department + " department worked " + hoursWorked + 
        " hours with a pay rate of $" + payRate + ". " + this.toString());
     }

     public double calculatePay() {
        //Method to calculate and return the wage
        //handle both regular and overtime pay
        if (hoursWorked <= HOURS){
           return (double) payRate * hoursWorked;
        } 

        return (double) HOURS * payRate + ((double) (hoursWorked - HOURS) * payRate * OVERTIME);
     }

     public void setAll(String first, String last, double rate, double hours, String dep){
         super.setName(first, last);
         this.payRate = rate;
         this.hoursWorked = hours;
         this.department = dep;
     }

     // getters
     public double getPayRate() { return this.payRate; }
     public double getHoursWorked() { return this.hoursWorked; }
     public String getDepartment() { return this.department; }

    // other methods
     public boolean equals(Object obj) { 
        if (obj instanceof Employee){
           Employee e = (Employee) obj;
           return ((super.equals(obj)) && (e.getPayRate() == this.getPayRate()) && (e.getHoursWorked() == this.getHoursWorked()) && (e.getDepartment() == this.getDepartment()));
        }
        
        return false;
      }

     public Employee getCopy() {
       return new Employee(getFirstName(), getLastName(), department, payRate, hoursWorked);
     }

     public void copy(Employee e) {
        super.copy(e);
        department = e.getDepartment();
        hoursWorked = e.getHoursWorked();
        payRate = e.getPayRate();
     }
}