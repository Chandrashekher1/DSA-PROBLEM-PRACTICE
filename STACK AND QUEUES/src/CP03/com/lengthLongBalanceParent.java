package CP03.com;

import java.util.Stack;

public class lengthLongBalanceParent {

    public static int longestBalance(String S) {
        Stack<Character> stack = new Stack<>();
        int len = 0;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    len += 2; // Each pair of balanced parentheses adds 2 to the length
                } else {
                    break; // If we encounter an unmatched closing parenthesis, break
                }
            }
        }

        return len;
    }

    public static void main(String[] args) {
        System.out.println(longestBalance("((()())())(("));

    }
}
