public class DateTester{
    public static void main(String[] args){
        Date aDate = new Date();
        System.out.println(aDate.toString());

        Date birthday = new Date(2005, 7, 26);
        System.out.println(birthday.toString());
    }
}