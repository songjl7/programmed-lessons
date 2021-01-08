// search (int[] haystack, int needle)
    // returns the index of any needle found in the haystack, -1 if nothing found

// sort(int[] data)
    // design an algorithm that uses swaps to rearrange the data to be in ascending order

public class ArrayAlgorithms {
    public static void main(String[] args){
        int[] list1 = {28, 36, 42, 44, 1, 49, 77, 1, 89, 98};
        int[] list2 = {22, 33, 45, 46, 48, 60, 69, 80, 91, 98};

        System.out.println(search(list1, 1)); // => 4
        System.out.println(search(list2, 1)); // => -1

        sort(list1);
    }

    public static int search(int[] haystack, int needle){
        for (int i = 0; i < haystack.length; i++){
            if (haystack[i] == needle){
                return i;
            }
        }
        return -1;
    }

    public static void sort(int[] data){
        int[] result = new int[data.length];
        int temp;

        for (int i = 0; i < data.length; i++){
            for (int j = i + 1; j < data.length; j++){
                if (data[i] > data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for (int i = 0; i < data.length - 1; i++){
            System.out.print(data[i] + ", ");
        }
        System.out.print(data[data.length - 1]);
    }
}