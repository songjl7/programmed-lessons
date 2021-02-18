public class ArrSum2 {
    public static void main(String[] args){
        int[] test = new int[]{ 1,2,3,4,5,6,7 };
        System.out.println(sum(test)); // => 28
    }

    public static int sum(int[] arr){
        return sum(arr, 0);
    }

    public static int sum(int[] arr, int index){
        if (index >= arr.length) return 0;
        return arr[index] + sum(arr, index +1);
    }
}