package string;

public class GreatestCommonPrefix {


    /*
    *
    * For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
    * (i.e., t is concatenated with itself one or more times).
    *
    * Given two strings str1 and str2, return the largest string x such that x divides both
    * str1 and str2.
    *
    *
    * */

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)){
            return "";
        }

        int GCDLength = findGCD(str1.length(), str2.length());
        return str1.substring(0, GCDLength);
    }

    public static int findGCD(int a, int b){
        if (a == 0){
            return b;
        }
        return findGCD(b % a, a);
    }

    public static void main(String[] args) {

       String str1 = "LEET", str2 = "CODE";
       System.out.println(gcdOfStrings(str1, str2));

    }

}
