package day4;

public class Palindrome {
    public static void main(String[] args) {

        int num = 123454321;
        System.out.println(isPalindrome(num));

    }

    public static boolean isPalindrome(int x) {
/*        String str = String.valueOf(x);
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;*/

        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int rev = 0;
        while (x > rev) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }

        return rev == x || x == rev / 10;

    }
}
