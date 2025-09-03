package string;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "(){}}{";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }


            }

        }

        return stack.isEmpty();


        /* 0ms solution

        int top= -1;
        char stack[] = new char[s.length()];
        for(char c : s.toCharArray()){
           if(c =='{') stack[++top] = ('}');
           else if(c =='(') stack[++top] = (')');
           else if(c =='[') stack[++top] = (']');
           else if(top == -1 || stack[top--] != c) return false;
        }



        return top==-1;
        * */
    }
}
