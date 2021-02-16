public class Power {
    public static void main(String[] args){
        System.out.println(pow(5)); // => 32
        System.out.println(pow(log(35))); // => 32
        System.out.println(pow(log(48))); // => 32
    }

    public static int pow(int n){
        if (n == 0) return 1;
        return 2*pow(n - 1);
    }
    
    // copied over from exercise 4
    public static int log(int n){
        if (n == 1) return 0;
        return 1 + log(n / 2);
    }
}