package com.CP03;


//https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.Arrays;

public class interSectionOfArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Sort both arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        // Create a result array with the size of the smaller input array
        int[] result = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                if (k ==0 || result[k] != nums1[i]){
                    result[k] = nums1[i];
                    k++;
                }
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        return Arrays.copyOfRange(result,0,k);
    }

    // intersection of two array II

//    https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

    public static ArrayList<Integer> intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(intersect(nums1,nums2));

        int[] intersection = intersection(nums1,nums2);
        System.out.println(Arrays.toString(intersection));
    }
}
