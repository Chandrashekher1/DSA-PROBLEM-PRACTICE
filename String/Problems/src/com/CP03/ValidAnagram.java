package com.CP03;

import java.util.Arrays;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {

        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }
}
