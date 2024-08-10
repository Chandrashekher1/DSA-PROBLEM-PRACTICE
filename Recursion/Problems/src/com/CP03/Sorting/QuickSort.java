package com.CP03.Sorting;

import java.util.Arrays;

public class QuickSort {
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
        int[] arr = {5,4,3,2,1};
        Sort(arr,0, arr.length-1
        );
        System.out.println(Arrays.toString(arr));
    }
}
