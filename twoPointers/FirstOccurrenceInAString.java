package twoPointers;

public class FirstOccurrenceInAString {

    /*
    Given two strings needle and haystack, return the index of the first occurrence of needle in
    haystack, or -1 if needle is not part of haystack.
    */

    public static void main(String[] args) {

       String haystack = "leetcode", needle = "leeto";
        System.out.println(strStr(haystack, needle));

    }

    public static int strStr(String haystack, String needle) {

//        return haystack.indexOf(needle);


        // solution from internet
        // time complexity: O(n*m)
        // space: O(m)
        for (int i = 0, j = needle.length(); j <= haystack.length(); i++, j++) {
            if (haystack.substring(i, j).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

}
