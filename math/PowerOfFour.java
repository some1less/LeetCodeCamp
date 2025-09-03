package math;

public class PowerOfFour {

    public static void main(String[] args) {

        int x = 16;
        System.out.println(isPowerOfFour(x));

        x = 15;
        System.out.println(isPowerOfFour(x));

        x = 4;
        System.out.println(isPowerOfFour(x));
    }

    public static boolean isPowerOfFour(int num) {

        return (num & (num - 1)) == 0;

    }

}
