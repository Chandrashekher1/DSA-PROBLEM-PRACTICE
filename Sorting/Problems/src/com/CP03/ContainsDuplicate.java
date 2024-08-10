package com.CP03;

//https://leetcode.com/problems/contains-duplicate/description/

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Sort(nums,0,nums.length-1);

        for (int i=0; i< nums.length; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void Sort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }

            // swap
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        Sort(arr, low, e);
        Sort(arr,s ,high);

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
