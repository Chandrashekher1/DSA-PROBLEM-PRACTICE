package com.CP03.Leetcode;

//https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.sql.Array;
import java.util.Arrays;

public class Sum1DArray {
    public static int[] runningSum(int[] nums) {

        for (int i=1; i< nums.length; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(runningSum(nums));
    }
}
