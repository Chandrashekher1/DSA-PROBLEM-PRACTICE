package com.CP03;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

//        String ch = s.toLowerCase();
//        for (int i = 0; i < ch.length(); i++) {
//            char c = ch.charAt(i);
//
//
//            if (c >= 'a' && c <= 'z' && c != ' ' && c >= '0' && c <= '9') {
//                str.append(c);
//            }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str.append(Character.toLowerCase(c));
            }
        }


        // check palindrome
        int len = str.length()-1;
        for (int i =0; i < str.length(); i++){
            if (str.charAt(i)  != str.charAt(len)){
                return false;
            }else {
                len--;
            }

        }
        return true;

    }
    public static void main(String[] args) {
        String  s = "0P";
        System.out.println(isPalindrome(s));
    }
}
