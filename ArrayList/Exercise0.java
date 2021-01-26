import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise0{
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<String>(Arrays.asList("apple","blueberry","pear","peach","orange","lemon","cherry","banana","watermelon","dragonfruit"));
        ArrayList<String> veggies = new ArrayList<String>(Arrays.asList("celery","cucumber","pepper","onion","lettuce","cabbage","carrot","potato","rice","potato"));

        ArrayList<String> both = new ArrayList<String>();
        for (int i = 0; i < 10; i++){
            both.add(fruits.get(i));
            both.add(veggies.get(i));
        }
        
        System.out.println("Before sorting: ");
        for (String n : both){
            System.out.print(n + " ");
        }

        Collections.sort(both);

        System.out.println("\nAfter sorting: ");
        for (String n : both){
            System.out.print(n + " ");
        }
    }
}