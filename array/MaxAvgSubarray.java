package array;

public class MaxAvgSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        if (k == 0 || nums.length == 0) return 0.0;

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 2, 4, 5, 6, 7};
        System.out.println(findMaxAverage(nums, 3));
    }
}
