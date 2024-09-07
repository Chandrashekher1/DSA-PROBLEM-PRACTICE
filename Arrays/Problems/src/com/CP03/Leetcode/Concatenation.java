package com.CP03.Leetcode;

//https://leetcode.com/problems/concatenation-of-array/

public class Concatenation {
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];

        for (int i =0; i< n ;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(getConcatenation(nums));
    }
}
