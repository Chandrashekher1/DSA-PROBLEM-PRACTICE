package com.CP03;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        int start = 0;
        int end = nums.length-1;

        if (nums.length == 0){
            arr[0] = -1;
            arr[1] = -1;
        }
        while (start<=end){
            int mid = start + (end -start)/2;

            if (nums[mid] == target){
                arr[0] = mid;
                arr[1] = mid+1;
            }

            else{
                arr[0] = -1;
                arr[1] = -1;
            }
            if (nums[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid-1;
            }
        }
        return arr;
    }
}
