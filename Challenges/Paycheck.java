public class Paycheck {
    private String employeeName;
    private int currentHoursWorked;
    private double currentWage;
    private double amt;

    public Paycheck (Employee employee, double amt){
        this.employeeName = employee.getName();
        this.currentHoursWorked = employee.getHoursWorked();
        this.amt = amt;
        this.currentWage = employee.getWage() + amt;
    }

    public String toString(Employee employee){
        if (employee.getAmt() > 1500 || employee.getHoursWorked() > 100){
            return "Erroneous paycheck!";
        }
        return "\nEmployee: " + employeeName + "\nPaycheck amount: " + employee.getAmt();
    }
}