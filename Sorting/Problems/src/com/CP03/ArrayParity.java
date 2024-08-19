package com.CP03;

//https://leetcode.com/problems/sort-array-by-parity/description/

import java.util.Arrays;

public class ArrayParity {
    public static int[] sortArrayByParity(int[] nums) {
//        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;

        while (i < j){
            if (nums[i] % 2 ==0){
                i++;
            } else if (nums[j] % 2!=0) {
                j--;
            }
            else {
                swap(nums,i,j);
                i++;
                j--;
            }
        }
        sort(nums);
        return nums;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] ;
            if (nums[i] != nums[correct]) {
                swap2(nums, i , correct);
            } else {
                i++;
            }
        }
    }

    static void swap2(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {4,2,5,7};
        int[] ans = sortArrayByParity(nums);
        System.out.println(Arrays.toString(ans));
//        sortArrayByParity(nums);
//        System.out.println(Arrays.toString(nums));
    }

}
