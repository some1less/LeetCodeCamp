package array;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {5,8,3,8,2,9,11,63,24,11};
        reverseArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void reverseArray(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }

    }

    // I wrote it with IDEA help xdd for literally 5 sec xd
}
