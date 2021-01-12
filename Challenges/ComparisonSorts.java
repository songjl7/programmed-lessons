import java.util.Random;

public class ComparisonSorts{

    public static Random random = new Random();
    public static final int NUM_TESTS = 10000;
    public static final int TEST_DATA_SIZE = 10;
    public static final int RANDOM_RANGE = 100;

    public static void main(String[] args){
        testSort("selection", NUM_TESTS);
        testSort("insertion", NUM_TESTS);
        testSort("bubble", NUM_TESTS);
    }

    public static void testSort(String method, int times){
        for (int test = 0; test < times; test++){
            int[] data = createTestData(TEST_DATA_SIZE);
            int[] orig = duplicate(data);

            sortUsing(data, method);

            if (!isSortedAsc(data)){
                printSortErrorMMessage(method, data, orig);
                return;
            }
        }
        System.out.println("All tests sorted correctly for " + method + "\n");
    }

    public static void sortUsing(int[] data, String method) {
        if (method.toLowerCase().equals("selection")){
            selectionSort(data);
        } else if (method.toLowerCase().equals("insertion")){
            insertionSort(data);
        } else if (method.toLowerCase().equals("bubble")) {
            bubbleSort(data);
        }
    }

    public static void printSortErrorMMessage(String method, int[] data, int[] orig) {
        System.out.println("Error, during " + method);
        System.out.println("Original data: ");
        printArray(orig);
        System.out.println("After sorting: ");
        printArray(data);
        System.out.println();
    }

    public static int[] createTestData(int amount){
        int[] data = new int[amount];
        for (int i = 0; i < data.length; i++){
            data[i] = random.nextInt(RANDOM_RANGE);
        }
        return data;
    }

    public static int[] duplicate(int[] data){
        int[] dup = new int[data.length];
        for(int i = 0; i < data.length; i++){
            dup[i] = data[i];
        }
        return dup;
    }

    public static boolean isSortedAsc(int[] data){
        for(int i = 0; i < data.length - 1; i++){
            if (data[i + 1] < data[i]){
                return false;
            }
        }

        return true;
    }

    public static void selectionSort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < data.length; j++){
                if (data[j] < data[minIndex]){
                    minIndex = j;
                }
            }

            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
    }

    public static void insertionSort(int[] data){
        for (int i = 1; i < data.length; i++) {
            int num = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > num) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = num;
        }
    }

    public static void bubbleSort(int[] data){
        for (int i = 0; i < data.length - 1; i++){
            for (int j = 0; j < data.length - 1 - i; j++){
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int data[]){
        for (int i = 0; i < data.length - 1; i++){
            System.out.print(data[i] + ", ");
        }
        System.out.print(data[data.length - 1] + "\n");
    }

    // public static void main(String[] args){
    //     int[] list1 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
    //     System.out.println("\nBefore selection sort: ");
    //     printArray(list1);
    //     selectionSort(list1);
    //     System.out.println("After selection sort:");
    //     printArray(list1);

    //     int[] list2 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
    //     System.out.println("\nBefore insertion sort: ");
    //     printArray(list2);
    //     insertionSort(list2);
    //     System.out.println("After insertion sort:");
    //     printArray(list2);

    //     int[] list3 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
    //     System.out.println("\nBefore bubble sort: ");
    //     printArray(list3);
    //     bubbleSort(list3);
    //     System.out.println("After bubble sort:");
    //     printArray(list3);
    // }

}