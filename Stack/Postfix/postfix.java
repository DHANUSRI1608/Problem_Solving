package Stack.Postfix;

import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();   
                int a = stack.pop();   
                int ans = 0;

                if (token.equals("+")) {
                    ans = a + b;
                } else if (token.equals("-")) {
                    ans = a - b;
                } else if (token.equals("*")) {
                    ans = a * b;
                } else {
                    ans = a / b;
                }

                stack.push(ans);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
       return stack.pop();
    }
}