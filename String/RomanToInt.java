package String.day2;

public class RomanToInt {
    public static void main(String[] args) {

        String romanNum = "M";
        System.out.println(romanToInt(romanNum));
    }

    // Symbol       Value
    //I             1
    //V             5
    //X             10
    //L             50
    //C             100
    //D             500
    //M             1000

    // 4 = IV, 9 = IX
    // 40 = XL, 90 = XC
    // 400 = CD, 900 = CM


    // Let's start from XV


    public static int romanToInt(String s) {


        // we get 'M CM XC IV' or 1994

        int res = 0;
        for (int i = 0; i < s.length(); i++) {

            int curr = valueOf(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = valueOf(s.charAt(i + 1));
                if (curr < next) {
                    res -= curr;
                } else {
                    res += curr;
                }
            } else {
                res += curr;
            }

        }

        return res;
    }

    public static int valueOf(char c){
        return switch (c) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }

}
