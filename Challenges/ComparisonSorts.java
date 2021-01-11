public class ComparisonSorts{
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

    public static void main(String[] args){
        int[] list1 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
        System.out.println("\nBefore selection sort: ");
        printArray(list1);
        selectionSort(list1);
        System.out.println("After selection sort:");
        printArray(list1);

        int[] list2 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
        System.out.println("\nBefore insertion sort: ");
        printArray(list2);
        insertionSort(list2);
        System.out.println("After insertion sort:");
        printArray(list2);

        int[] list3 = {30, 15, 14, 6, 25, 2, 11, 48, 32, 17};
        System.out.println("\nBefore bubble sort: ");
        printArray(list3);
        bubbleSort(list3);
        System.out.println("After bubble sort:");
        printArray(list3);
    }

}