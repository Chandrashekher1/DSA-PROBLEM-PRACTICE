package com.CP03.Sorting;

import java.util.*;

public class BubbleSort {

    public static void bubble(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for (int j=i; j< arr.length-1; j++){
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // bubble sort using recursion

    public static void bubbleSort(int[] arr, int c, int r){
        if (r==0){
            return;
        }
        if (c < r){
            if (arr[c] > arr[c+1]){
                // swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleSort(arr,c+1,r);
        }
        else {
            bubbleSort(arr,0,r-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(arr.length);
//        bubble(arr);
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}
