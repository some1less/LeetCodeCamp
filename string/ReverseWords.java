package string;

import java.util.Arrays;

public class ReverseWords {

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(' ');
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String sentence = "Hello mum I will be home   tommorow     ypoooooy";

        System.out.println(reverseWords(sentence));
    }
}
