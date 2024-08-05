package com.CP03.ArrayProblems;

import java.util.Arrays;

public class SelectionSort {
    public static void Selection(int[] arr){
        for (int i=0; i<arr.length; i++){
            // find the max element from the remaining array and swap with its correct index
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }
    // swap

    private static void swap(int[] arr, int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i=start; i<=end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
