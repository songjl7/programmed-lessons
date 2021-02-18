public class LPR {
    public static void main(String[] args){
        System.out.println(leastRes(18, 14)); // => 4
        System.out.println(leastRes(45, 14)); // => 3
        System.out.println(leastRes(30, 10)); // => 0
    }

    public static int leastRes(int a, int m){
        if (a < m && a >= 0) return a;
        if (a >= m) return leastRes(a - m, m);
        if (a < 0) return leastRes(a + m, m);
        return 0;
    }
}