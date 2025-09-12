package string;

import java.util.Arrays;

public class ReverseVowels {


    public static String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int left = 0, right = s.length()-1;

        while (left < right){

            while(left < right && !isVowel(arr[left])){
                left++;
            }

            while (left < right && !isVowel(arr[right])){
                right--;
            }

            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;

            left++;
            right--;
        }

        return new String(arr);

    }

    private static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        String word = "IceCreAm";

        System.out.println(reverseVowels(word));
    }
}
