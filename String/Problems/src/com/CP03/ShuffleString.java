package com.CP03;

//https://leetcode.com/problems/shuffle-string/description/

public class ShuffleString {
    public static String restoreString(String s, int[] indices) {

        char[] ch = new char[s.length()];

        for (int i=0; i<s.length();i++){
            ch[indices[i]]  =s.charAt(i);
        }
        return new String(ch);


    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println(restoreString(s,indices));
    }
}
