package com.CP03;

public class ConsecutiveChar {
    public static String removeConsecutiveCharacter(String S) {
        StringBuilder str = new StringBuilder();

        // Iterate through the string
        for (int i = 0; i < S.length(); i++) {
            // Append the current character if it is not the same as the previous one
            if (i == 0 || S.charAt(i) != S.charAt(i - 1)) {
                str.append(S.charAt(i));
            }
        }

        return str.toString();  // Convert StringBuilder to String and return
    }

    public static void main(String[] args) {
        String S = "aabaa";
        System.out.println(removeConsecutiveCharacter(S));  // Output should be "aba"
    }
}
