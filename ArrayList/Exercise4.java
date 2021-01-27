import java.util.ArrayList;
import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        
        System.out.println("Before reversing:");

        for (int n : nums){
            System.out.print(n + " ");
        }

        reverse(nums);

        System.out.println("\nAfter reversing:");

        for (int n : nums){
            System.out.print(n + " ");
        }
    
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> al){
        for (int i = 0; i < al.size() / 2; i++){
            Integer temp = al.get(i);
            al.set(i, al.get(al.size() - i - 1));
            al.set(al.size() - i - 1, temp);
        }

        return al;
    }
}