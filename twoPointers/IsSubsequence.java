package twoPointers;

import java.util.Arrays;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {

        int sp = 0;
        int tp = 0;

        while (sp < s.length() && tp < t.length()) {
            if (s.charAt(sp) == t.charAt(tp)) {
                sp++;
            }
            tp++;
        }

        return sp == s.length();
    }

    public static void main(String[] args) {

        String n1 = "hello";
        String n2 = "llo";

        System.out.println(isSubsequence(n2, n1));

    }
}
