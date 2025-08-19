package twoPointers;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,2};

        System.out.println(removeDuplicates(nums));
        }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 1; // pointer for the last unique element

        // j just a pointer for comparison
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i-1]) {
                nums[i++] = nums[j];
            }
        }

        return i;

    }
}