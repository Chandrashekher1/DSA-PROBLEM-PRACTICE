package CP03.com;

import java.util.Stack;

public class ReverseWords {
    public static void reverse(String S){
        Stack<Character> stack = new Stack<>();

        for (int i= 0; i < S.length(); ++i){
            char ch = S.charAt(i);

            if(ch == ' '){
                while (!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }

            else {
                stack.push(ch);
            }

        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        String S = "Hello World chandu";
        reverse(S);
    }
}
