package CP03.com;

//https://www.geeksforgeeks.org/problems/reverse-a-stack/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=bottom_sticky_on_article

import java.util.Stack;

public class ReverseStack {

    // Without recursion

//    static void reverse(String s){
//        Stack<String> stack2 =  new Stack<>();
//
//
//        for (int i =s.length()-1; i >= 0; i--){
//            char ch = s.charAt(i);
//
//            stack2.push(String.valueOf(ch));
//        }
//        System.out.println(stack2);
//
//    }

    // With recursion

    static Stack<Character> stack = new Stack<>();

    static void insert(char x){
        if (stack.isEmpty()){
            stack.push(x);
        }
        else {
            char a = stack.pop();
            insert(x);

            stack.push(a);
        }
    }

    static void reverse(){
        if (stack.size() > 0){
            char x = stack.pop();
            reverse();

            insert(x);
        }
    }

    public static void main(String[] args) {
        stack.push('1');
        stack.push('2');
        stack.push('3');

        System.out.println(stack);

        reverse();
        System.out.println(stack  );
    }

}
