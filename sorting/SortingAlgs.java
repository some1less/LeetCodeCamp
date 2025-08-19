package day5;

public class SortingAlgs {
    public static void main(String[] args) {

        int[] entry = {12,52,52,52,12,75,266,2225,33,553,553,3224};

        printArray(entry);
//        bubbleSort(entry);
        selectSort(entry);
        printArray(entry);

    }

    public static void bubbleSort(int[] arr) {
        int i, j, tmp;
        int n = arr.length;
        boolean swapped;

        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

        }
    }

    public static void selectSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }



    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
