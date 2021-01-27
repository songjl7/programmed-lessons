import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise3 {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(15, 34, 42, 46, 47, 56, 75, 90, 96));

        System.out.println("Before adding and sorting");

        for (int n : nums){
            System.out.print(n + " ");
        }

        addNum(26, nums);

        System.out.println("\nAfter adding and sorting");

        for (int n : nums){
            System.out.print(n + " ");
        }
        
    }

    public static void addNum(int n, ArrayList<Integer> arr){
        arr.add(n);
        Collections.sort(arr);
    }
}