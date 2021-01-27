import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Exercise2 {
    public static void main(String[] args){
        ArrayList<String> loona = new ArrayList<String>(Arrays.asList("deer", "rabbit","betta","swan","cat", "bat","penguin","owl","frog","butterfly","owl","wolf", "rabbit","penguin","butterfly","dove","swan"));
        
        System.out.println("Before removing duplicates:");
        for (String n : loona){
            System.out.println(n);
        }

        Collections.sort(loona);

        for (int i = 1; i < loona.size() - 1; i++){
            if (loona.get(i).equals(loona.get(i - 1))){
                loona.remove(i - 1);
            }
        }

        System.out.println("\nAfter removing duplicates:");
        for (String n : loona){
            System.out.println(n);
        }
    }
}