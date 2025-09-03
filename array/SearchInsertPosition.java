package array;

public class SearchInsertPosition {

    /*
    *
    Given a sorted array of distinct integers and a target value, return the index if the target is found.
    If not, return the index where it would be if it were inserted in order.

    You must write an algorithm with O(log n) runtime complexity.
    * */

    public static void main(String[] args) {

        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums, 7));
    }

    public static int searchInsert(int[] nums, int target) {

        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return low;
    }

}
