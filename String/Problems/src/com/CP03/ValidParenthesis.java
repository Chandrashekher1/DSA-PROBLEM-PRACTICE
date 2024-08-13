package com.CP03;

//https://leetcode.com/problems/valid-parentheses/description/

public class ValidParenthesis {
    public static boolean isValid(String s) {
        int i =0;

        while (i < s.length()-1){
//            char ch = s.charAt(i);

            if (s.charAt(i) == '(' && s.charAt(i+1) == ')'){
                i = i+2;
//                return true;
            }
            else if (s.charAt(i) == '[' && s.charAt(i+1) == ']'){
                i = i+2;
//                return true;
            }
            else if (s.charAt(i) == '{' && s.charAt(i+1) == '}'){
                i = i+2;
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));
    }
}
