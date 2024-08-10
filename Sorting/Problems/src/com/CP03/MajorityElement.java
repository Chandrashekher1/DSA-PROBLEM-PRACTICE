package com.CP03;

//https://leetcode.com/problems/majority-element/description/

import java.util.Arrays;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        Sort(nums,0,nums.length-1);
        int mid= nums.length/2;
        return nums[mid];
    }
    // first sort by any sorting method
    // then find mid element that will the majority element after sorting
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
        int[] arr = {3,2,3};

        System.out.println(majorityElement(arr));

    }
}
