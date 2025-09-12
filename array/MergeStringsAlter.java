package array;

public class MergeStringsAlter {

    /*
    *
    * You are given two strings word1 and word2.
    * Merge the strings by adding letters in alternating order, starting with word1.
    * If a string is longer than the other, append the additional letters onto
    * the end of the merged string.

    Return the merged string.
    *
    * */

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int j = 0, i = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) sb.append(word1.charAt(i++));
            if (j < word2.length()) sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String word1 = "ab", word2 = "pqrs";
        System.out.println(mergeAlternately(word1, word2));
    }
}
