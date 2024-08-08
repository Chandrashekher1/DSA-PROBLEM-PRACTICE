package com.CP03.Sorting;

import java.util.Arrays;

public class insertionSort {
    public static void Sort(int[] arr){
        for (int i= 0; i< arr.length;i++){
            for (int j= i+1; j<arr.length; j++){
                if (arr[j] < arr[i]){
                    // swap

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

//        System.out.println(arr);
    }

    // using recursion

    public static void insertionSort(int[] arr, int start, int last){
        if (start == last){
            return;
        }
        for (int i = start+1; i<last;i++){
            if (arr[i] < arr[start]){
                int temp = arr[i];
                arr[i] = arr[start];
                arr[start] = temp;
            }
        }
        insertionSort(arr,start+1,last);
    }

    public static void main(String[] args) {
        int[] arr = {0,4,3,2,1};
//        Sort(arr);

        insertionSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
