public class TriangleSpots {
    public static void main(String[] args){
        System.out.println(T(8)); // => 6
        System.out.println(T(9)); // => 15
        System.out.println(T(0)); // => 0
        System.out.println(T(13)); // => 28
    }

    public static int t(int n){
        if (n == 1) return 1;

        return n + t(n - 1);
    }

    public static int T(int n){
        if (n == 0) return 0;
        return n % 2 == 0 ? t(n / 2 - 1) : t(n / 2 + 1);
    }
}