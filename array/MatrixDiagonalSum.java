package array;

public class MatrixDiagonalSum {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(arr));

        int[][] arr2 = {
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1},
                {1,1,1,1}
        };
        System.out.println(diagonalSum(arr2));

        int[][] arr3 = {
                {7,3,1,9},
                {3,4,6,9},
                {6,9,6,6},
                {9,5,8,5}
        };
        System.out.println(diagonalSum(arr3));
    }

    public static int diagonalSum(int[][] arr) {
        int sum = 0;
        System.out.println("Length of array: " + arr.length);
/*        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i == j || i + j == arr.length-1) {
                    sum += arr[i][j];
                }
            }
        }*/

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i];
            sum += arr[arr.length - 1 - i][i];
        }
        if (arr.length % 2 != 0) {
            sum -= arr[arr.length / 2][arr.length / 2];
        }

        return sum;
    }
}
