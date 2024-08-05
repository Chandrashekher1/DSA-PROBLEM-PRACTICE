package com.CP03.ArrayProblems;

//https://www.geeksforgeeks.org/problems/sum-triangle-for-given-array1159/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

import java.util.Arrays;

public class SumOfTriangle {

    public static void STriangle(int[] arr){
        if (arr.length < 1){
            return;
        }

        // Create a temporary array with one less element than arr
        int[] temp = new int[arr.length-1];

        // Calculate values for temp based on arr
        for (int i = 0; i < arr.length - 1; i++){
            temp[i] = arr[i] + arr[i+1];
        }

        // Recursively call STriangle with temp
        STriangle(temp);

        System.out.println(Arrays.toString(temp));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        STriangle(arr);
    }
}
