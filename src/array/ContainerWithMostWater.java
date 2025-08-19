package array;

public class ContainerWithMostWater {
    public static void main(String[] args) {

/*        int[][] arr = new int[3][3];

        int counter = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = counter;
                counter++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();*/

        int[] height = {1,8,6,2,5,4,8,3,7};

/*         array of lines has line that has coordinates like (i, 0) and (i, height[i])
         I created Class Line for keeping info about each line
         so it has to be arr of class Line that keeps each coordinate for each Line
         completed*/


        int left = 0, right = height.length - 1, maxWater = 0;

        while (left < right) {
            int min = Math.min(height[left], height[right]);
            maxWater = Math.max(maxWater, min*(right-left));
            if (height[left] < height[right]) left++;
            else right--;
        }

//        System.out.println(maxWater);
//        printLines(lines);



    }
}
