package com.CP03.ArrayProblems;

public class MaxMinElements {
   public static int MaxMin(int[] arr, int len){
       if (len == 1){
           return arr[0];
       }
       return Math.max(arr[len-1], MaxMin(arr,len-1)) ;

   }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(MaxMin(arr,arr.length));
    }

}
