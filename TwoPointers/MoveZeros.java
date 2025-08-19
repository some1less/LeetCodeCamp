package TwoP.day3;

public class MoveZeros {
    public static void main(String[] args) {

       /* Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]*/

        int[] nums = {0,1,0,3,123};
        System.out.print("[");
        for (int i : nums) {

            System.out.print(i + " ");

        }
        System.out.println("]");

        moveZeroes(nums);

        System.out.print("[");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }

    public static void moveZeroes(int[] nums) {

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int tmp = nums[j];
                nums[j] = nums[i];
                nums[i] = tmp;
                j++;
            }
        }

    }
}
