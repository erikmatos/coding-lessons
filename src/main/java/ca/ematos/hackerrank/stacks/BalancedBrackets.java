package ca.ematos.hackerrank.stacks;

import java.util.Stack;

public class BalancedBrackets {

    public BalancedBrackets(){

    }

    public static void main(String[] arguments){
        System.out.println(isBalanced("{{[[(())]]}}"));
    }

    static String isBalanced(String s) {

        String result = "NO";

        if (s == null || s.isEmpty()) {
            return result;
        }

        char[] characters = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char ch : characters) {

            if ( ch == '{' || ch == '(' || ch == '[' ) {
                stack.add(ch);
            } else {

                if (stack.isEmpty()) {
                    return result;
                }

                if ( ch == '}' && stack.pop() != '{') {
                    return result;
                }

                if ( ch == ']' && stack.pop() != '[') {
                    return result;
                }

                if ( ch == ')' && stack.pop() != '(') {
                    return result;
                }
            }
        }

        if (stack.isEmpty()) {
            result = "YES";
        }

        return result;

    }
}
