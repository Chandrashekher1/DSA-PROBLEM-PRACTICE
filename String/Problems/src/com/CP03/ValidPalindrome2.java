package com.CP03;

//https://leetcode.com/problems/valid-palindrome-ii/description/?

public class ValidPalindrome2 {
    public static boolean validPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        // removing special character

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }


        // check palindrome
        int len = sb.length()-1;

        for (int i =0; i < sb.length(); i++){
            if (sb.charAt(i) != sb.charAt(len)) {
                len--;

            }else {
                len--;
            }
            if (sb.charAt(i) != sb.charAt(len)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abca";

        System.out.println(validPalindrome(s));
    }
}
