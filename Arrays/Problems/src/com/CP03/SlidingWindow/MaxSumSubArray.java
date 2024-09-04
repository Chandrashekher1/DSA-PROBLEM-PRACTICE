package com.CP03.SlidingWindow;

// Maximum Sum Subarray of size k


public class MaxSumSubArray {
    public static int MaxSum(int[] arr, int k){
        int i =0;
        int j = 0;

        int MaxSum = 0;
        int Sum = 0;  // Sum of all the window

        while (j<arr.length){
            Sum = Sum + arr[j];

            if (j-i+1 == k){
                MaxSum = Math.max(MaxSum,Sum);

                Sum = Sum - arr[i];
                i++;
            }
            j++;
        }
        return MaxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        System.out.println(MaxSum(arr,3));
    }

}
