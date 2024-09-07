package com.CP03.Leetcode;

//https://leetcode.com/problems/shuffle-the-array/description/

public class Shuffle {
    public static int[] shuffle(int[] nums, int n) {
        int i = 0;
//        int j = n + 1;
        int[] arr = new int[2 * n];

        while (i < n) {
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[n+i];
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println(shuffle(nums,3));
    }
}
