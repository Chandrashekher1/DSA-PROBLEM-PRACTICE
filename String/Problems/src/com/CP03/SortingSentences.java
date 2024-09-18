package com.CP03;

//https://leetcode.com/problems/sorting-the-sentence/description/

import java.util.ArrayList;

public class SortingSentences {
    public static String sortSentence(String s) {

        String a[] = s.split(" ");
        String res[] = new String[a.length];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length; i++) {
            int k = Character.getNumericValue(a[i].charAt(a[i].length() - 1));
            res[k - 1] = a[i].substring(0, a[i].length() - 1);

        }
        for (int i = 0; i < res.length; i++) {
            sb.append(res[i]).append(" ");
        }

        return sb.toString().trim();


    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }

}
