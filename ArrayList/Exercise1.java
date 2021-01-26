import java.util.ArrayList;
import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args){
        ArrayList<String> fruits1 = new ArrayList<String>(Arrays.asList("apple","blueberry","pear","peach","orange","lemon","cherry","banana","watermelon","dragonfruit"));
        ArrayList<String> fruits2 = new ArrayList<String>(Arrays.asList("pineapple","blueberry","coconut","passionfruit","orange","lime","cherry","canteloupe","watermelon","raspberry"));

        ArrayList<String> both = new ArrayList<String>();
        both.addAll(fruits1);

        for (String n : fruits2){
            if (!both.contains(n)){
                both.add(n);
            }
        }

        for(String i : both){
            System.out.print(i + " ");
        }
        
    } 
}