import java.util.Random;
import java.text.DecimalFormat;

public class LunchAccount {
    Random rand = new Random();
    DecimalFormat df = new DecimalFormat("#,##0.00");

    private static int idNum = 999;
    private double balance;
    private double total = 0.00;
    
    private static int lunchesBought = 0;
    private static int lunchAccountCount = 98;

    public LunchAccount(){
        lunchAccountCount ++;
        idNum ++;
        this.balance = 0.0;
    }

    public LunchAccount(double balance){
        lunchAccountCount ++;
        idNum ++;
        if (lunchAccountCount <= 100){
            this.balance += 20.00;
        } else {
            this.balance = balance;
        }
    }

    public void addMoney(double amount){
        lunchAccountCount ++;
        if (lunchAccountCount <= 100 && amount > 0.0){
            this.balance += 20 + amount;
        } else {
            this.balance += amount;
        }
    }

    public String buyLunch(String menuItem){
        lunchesBought++;
        if(menuItem.toLowerCase().equals("pizza")){ this.total += 2.50; }
        if(menuItem.toLowerCase().equals("sandwich")){ this.total += 3.00; }
        if(menuItem.toLowerCase().equals("fruit")){ this.total += 0.50; }
        if(menuItem.toLowerCase().equals("drink")){ this.total += 1.00; }
        if(menuItem.toLowerCase().equals("caviar")){ this.total += 999.00; }


        this.balance -= this.total;
  
        return (balance > 0) ? "Purchase successful! Your new balance is $" + df.format(balance) : "You do not have enough money." ;
    }

    public double getTotal(){ return this.total; }
    public double getBalance(){ return this.balance; }

    public String toString(){
        return "\nStudent ID: " + idNum + "\nBalance: $" + df.format(balance);
     }
}