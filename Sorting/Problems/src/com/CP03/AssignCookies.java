package com.CP03;

//https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        while(i < g.length && j < s.length){
            if (s[j] >= g[i]){
                i++;
            }
            j++;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

//        findContentChildren(g,s);
        System.out.println(findContentChildren(g,s));
    }
}
