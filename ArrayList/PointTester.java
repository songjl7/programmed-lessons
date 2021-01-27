import java.util.ArrayList;
import java.util.Arrays;

public class PointTester {
    public static void main(String args[]){
        ArrayList<Double> nums = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0));

        ArrayList<Point> points = new ArrayList<Point>();

        for (int i = 0; i < nums.size() - 1; i++){
            points.add(new Point(nums.get(i), nums.get(i+1)));
        }

        
    }
}