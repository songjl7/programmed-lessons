public class PrimeNum {
    public static void main(String[] args){
        System.out.println(prime(3, 2));
        System.out.println(prime(12, 2));
        System.out.println(prime(27, 2));
        System.out.println(prime(151, 2));
    }

    public static boolean prime(int n, int i){
        if (n <=2) return (n == 2 ? true : false);
        if (n % i == 0) return false;
        if ( i * i > n) return true;

        return prime(n, i+1);
    }
}