package linkedList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceTwoArrays {

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> res = new ArrayList<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        for (int num: set1) {
            if (!set2.contains(num)) {
                res.get(0).add(num);
            }
        }
        for (int num: set2) {
            if (!set1.contains(num)) {
                res.get(1).add(num);
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {4, 5, 6, 7};

        System.out.println(findDifference(nums1, nums2));
    }
}
