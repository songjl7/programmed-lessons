public class Date{
    private int year;
    private int month;
    private int day;

    public Date(){
        this.year = 1999;
        this.month = 1;
        this.day = 1;
    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String toString(){
        return month + "/" + day + "/" + year;
    }

}