import java.text.*;

public class Sines{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#0.0#####");
        System.out.println("Angle\tSine");
        double angle = -90.0;
        double rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = -75.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = -60.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = -45.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = -30.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = -15.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 0.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 15.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 30.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 45.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 60.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 75.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
        angle = 90.0;
        rad = Math.toRadians(angle);
        System.out.println(angle + "\t" + df.format(Math.sin(rad)));
    }
}