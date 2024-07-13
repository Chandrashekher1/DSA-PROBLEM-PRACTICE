package CP03.com;
//https://www.geeksforgeeks.org/modify-a-numeric-string-to-a-balanced-parentheses-by-replacements/?ref=lbp


import java.util.Stack;

public class NumericStringToBalancedP {

    public static boolean NumericToBalance(String S){

        Stack<Character> stack = new Stack<>();

        for (int i =0; i < S.length(); i++){
            char ch = S.charAt(i);

            if (ch == '1'){
                ch = '(';
            }
            else if (ch == '2'){
                ch = ')';
            }
            else {
                ch = ')';
            }
            // balanced


            if (ch == '('){
                stack.push(ch);
            }
            else if (ch ==')'){
                if (!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
            }
        }return stack.isEmpty();
    }

    public static void main(String[] args) {
        if (NumericToBalance("123122")){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
