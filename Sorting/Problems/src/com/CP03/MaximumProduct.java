package com.CP03;

import java.util.Arrays;

public class MaximumProduct {
    public static int maximumProduct(int[] nums){
        Arrays.sort(nums);

        int i = nums.length-1;
        int j = nums.length-2;

        int prod = nums[i] * nums[j] * nums[j-1];
        return prod;
    }

    public static int maximumProduct2(int[] nums){
        Arrays.sort(nums);

        int n = nums.length;
        // Consider the maximum product of three elements:
        // Either the product of the three largest elements
        // or the product of the two smallest (negative) elements and the largest element.
        int product1 = nums[n-1] * nums[n-2] * nums[n-3];
        int product2 = nums[0] * nums[1] * nums[n-1];

        // Return the maximum of the two products.
        return Math.max(product1, product2);

    }



    public static void main(String[] args) {
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct2(nums));
    }
}
