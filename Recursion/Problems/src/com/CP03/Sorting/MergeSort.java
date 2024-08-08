package com.CP03.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        // merge left and right
        // create another function

        return merge(left,right);
    }
    private static int[] merge(int[] left, int[] right){
        // create a mix array and the size will be equal to length of both array

        int[] mix = new int[left.length + right.length];

        int i = 0; // index for left array
        int j =0; // index for right array
        int k = 0; // index for mix array

        // check
        while (i < left.length && j < right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the array is not completed
        // copy  the remaining element

        while (i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);  // for modify the original array
        System.out.println(Arrays.toString(arr));
    }

}
