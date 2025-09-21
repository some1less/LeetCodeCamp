package array;

public class TheHighestAltitude {

    public static int largestAltitude(int[] gain) {

        if (gain == null || gain.length == 0) return 0;

        int sum = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {

            sum+=gain[i];
            if (sum>max) max = sum;

        }
        return max;

    }

    public static void main(String[] args) {
        int[] num = {-5,1,5,0,-7};

        System.out.println(largestAltitude(num));
    }

}
