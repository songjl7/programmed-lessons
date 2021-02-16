public class Pentagonal {
    public static void main(String[] args){
        System.out.println(PN(1)); // => 1
        System.out.println(PN(2)); // => 5
        System.out.println(PN(3)); // => 12
        System.out.println(PN(4)); // => 22
        System.out.println(PN(5)); // => 35
    }
    
    public static int PN(int n){
        return (3 * n * (n-1)) / 2 + n;
    }
}