package easyPractice.Day2;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()) {
            if(c=='('){
                stack.push(')');
            } else if(c=='{'){
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else if(stack.empty() || stack.pop()!= c){
                return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }
}
