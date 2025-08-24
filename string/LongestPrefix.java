package string;

public class LongestPrefix {
    public static void main(String[] args) {

        String[] strings = {"flower","flow","flight","fly"};
        String limit = strings[0];
        for(String s : strings) {
            if (s.length() < limit.length())
                limit = s;
        }

        System.out.println(limit);

        boolean mismatch = false;
        StringBuilder builder = new StringBuilder();
        for (int j = 0; j < limit.length(); j++) {
            for (String s : strings) {
                if (s.charAt(j) != limit.charAt(j)){
                    mismatch = true;
                    break;
                }
                if (mismatch) break;
            }

            if (!mismatch){
                builder.append(limit.charAt(j));
            }

        }

        System.out.println(builder.toString());


    }
}