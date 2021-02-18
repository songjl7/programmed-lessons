public class ArrSum {
    public static void main(String[] args){
        int[] test = new int[]{ 1,2,3,4,5,6,7 };
        System.out.println(sum(test, 0)); // => 28
        System.out.println(sum(test, 6)); // => 7
        System.out.println(sum(test, 7)); // => 0
    }

    public static int sum(int[] arr, int index){
        if (index >= arr.length) return 0;
        return arr[index] + sum(arr, index +1);
    }
}