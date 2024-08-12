package com.CP03;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

import java.util.Arrays;

public class ArraysStringEqual {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

       for (int i =0; i<word1.length;i++){
           if (word1[i] != ","){
               str1.append(word1[i]);
           }if (word2[i] != ",") {
               str2.append(word2[i]);
           }
       }

       if (str1.toString().equals(str2.toString())){
           return true;
       }
       else {
           return false;
       }
    }

    public static void main(String[] args) {

        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};

        System.out.println( arrayStringsAreEqual(word1,word2));
    }
}
