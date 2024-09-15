package com.CP03.EasyProblem;

import java.sql.Array;
import java.util.Arrays;

public class SumTriangle {
    public static void triangle(int[] arr){
        if (arr.length == 1){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] arr1 = new int[arr.length-1];

        for (int i=0; i< arr.length-1; i++){
            arr1[i] = arr[i] + arr[i+1];
        }
        triangle(arr1);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        triangle(arr);
    }
}
