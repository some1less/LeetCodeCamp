package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = 0;

        for (int c : candies){
            if (c > max){
                max = c;
            }
        }

        for (int candy : candies){
            res.add(candy + extraCandies > max);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {12,1,12};
        System.out.println(kidsWithCandies(arr, 10));
     }
}
