package com.CP03;

import java.util.Arrays;

public class DuplicateChar {
    public static void duplicate(String str){
        int count = 0;
        char[] s = str.toCharArray();
        Arrays.sort(s);

        int i = 0;
        int j = 1;

        while (i<s.length && j<s.length){
            if (s[i] == s[j]){
                count = count+1;
                i++;
                j++;
            }
            else {
                i++;
                j++;
            }
        }
        System.out.println(s);
        System.out.println(count);

    }

    public static void main(String[] args) {
        String str =  "geeksforgeeks";
        duplicate(str);
    }

}
