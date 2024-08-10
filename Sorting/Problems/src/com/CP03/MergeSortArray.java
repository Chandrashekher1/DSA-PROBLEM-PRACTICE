package com.CP03;

import java.util.Arrays;

public class MergeSortArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for the last element in nums1's valid part
        int j = n - 1; // Pointer for the last element in nums2
        int k = m + n - 1; // Pointer for the last position in nums1

        // Start merging from the end
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // If there are remaining elements in nums2, copy them
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }

        // No need to copy the remaining elements of nums1, because they are already in place
    }

    public static void main(String[] args) {
        int[] nums1 = {0}; // nums1 has only one placeholder
        int[] nums2 = {1}; // nums2 has one element to merge
        merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1)); // Output should be [1]
    }

}
