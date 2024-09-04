package com.CP03.SlidingWindow;

// First Negative number in every window of Size K

import java.util.ArrayList;

public class FirstNegativeNum {
    public static void firstNegativeNumber(int[] arr, int k){

        for (int i =0; i< arr.length ; i++){
            for (int j =i; j<= i+k; j++){
                if (j-i+1==k){
                    System.out.println(arr[j] + " ");
                }
            }
        }

//        int i =0;
//        int j =0;
//
//        while (j < arr.length){
//            if (j-i+1 == k){
//                System.out.println(arr[i] + " ");
//                i++;
//            }
//            j++;
//        }

    }

    public static void main(String[] args) {
        int[] arr= {1,2,4,5,6};
        firstNegativeNumber(arr,3);
    }
}
