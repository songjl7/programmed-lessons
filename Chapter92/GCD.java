public class GCD {
    public static void main(String[] args){
        System.out.println(gcd(3,6));
        System.out.println(gcd(6,9));
        System.out.println(gcd(0,3));
        System.out.println(gcd(7,13));
    }

    public static int gcd(int a, int b){
        if (b == 0) return a;
        if (a == 0) return b;
        return gcd(b, a % b);
    }
}