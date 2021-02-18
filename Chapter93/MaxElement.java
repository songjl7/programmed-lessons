public class MaxElement {
    public static void main(String[] args){
        int[] arr1 = new int[]{4, 13, 20, 11, 14, 12, 1, 20, 9, 15};
        int[] arr2 = new int[]{15, 12, 4, 8, 0, 10, 2, 13, 18, 9}; 

        System.out.println(max(arr1)); // => 20
        System.out.println(max(arr2)); // => 18
    }

    public static int max(int[] arr) {
       return max(arr, arr.length - 1);
    }

    public static int max(int[] arr, int index){
        if (index > 0) return Math.max(arr[index], max(arr, index - 1));
        return arr[0];
    }
}