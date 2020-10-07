import java.lang.Math;

public class SheepHerd{
    public static void main(String[] args){
        double size = 0;
        double year = 0;
        for (int i = 0; i < 25; i++){
            String status;
            size = 220 / (1 + 10 * Math.pow(0.83, year));

            if (size <= 80){
                status = "Needs supervision";
            } else {
                status = "Does not need supervision";
            }

            System.out.println("Years: " + year + "\tSize: " + size + "    " + status);
            year += 1;
        }
    }
}