import java.util.ArrayList;
import java.util.Arrays;

public class PointTester {
    public static void main(String args[]){
        ArrayList<Double> nums = new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0));

        ArrayList<Point> points = toPointList(nums);

        System.out.println("\nArrayList of points from ArrayList of doubles:\n" + points.toString());

        // inserting midpoints
        int size = (points.size() - 1) * 2;

        for (int i = 0; i < size; i+= 2){
            Point middle = Point.midPoint(points.get(i), points.get(i+1));
            points.add(i+1, middle);
        }

        System.out.println("\nAfter adding midpoints between each adjacent set of points:\n" + points.toString());

        // sorting by proximity to origin
        ArrayList<Double> moreNums = new ArrayList<Double>(Arrays.asList(8.0, 0.0, 2.0, 9.0, 1.0, 6.0, 3.0, 3.0));
        ArrayList<Point> morePoints = toPointList(moreNums);

        System.out.println("\nBefore sorting by proximity to origin:\n" + morePoints.toString());

        Point temp;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < morePoints.size() - 1; i++){
                if ((morePoints.get(i)).proximityOrigin() > (morePoints.get(i + 1)).proximityOrigin()){
                    temp = morePoints.get(i);
                    morePoints.set(i, morePoints.get(i+1));
                    morePoints.set(i+1, temp);
                    sorted = false;
                }
            }
        }

        System.out.println("After sorting by proximity to origin:\n" + morePoints.toString());
    }

    public static ArrayList<Point> toPointList(ArrayList<Double> al){
        ArrayList<Point> result = new ArrayList<Point>();

        for (int i = 0; i < al.size() - 1; i++){
            result.add(new Point(al.get(i), al.get(i+1)));
        }

        return result;
    }
}