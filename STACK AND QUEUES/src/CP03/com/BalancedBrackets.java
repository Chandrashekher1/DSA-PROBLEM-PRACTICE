package CP03.com;

import java.util.Stack;

public class BalancedBrackets {

    public static boolean Balanced(String S) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);

            // Check for alphanumeric characters
            if (Character.isLetterOrDigit(current)) {
                continue;  // Ignore alphanumeric characters
            }

            // Push opening brackets onto stack
            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else {
                // If closing bracket, check if it matches the top of stack
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                // Check matching brackets
                if (current == ')' && top != '(') {
                    return false;
                }
                if (current == ']' && top != '[') {
                    return false;
                }
                if (current == '}' && top != '{') {
                    return false;
                }
            }
        }

        // Stack should be empty at the end if all brackets are balanced
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expr = "[()]{}{[()()]()}" ;

        if (Balanced(expr)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
