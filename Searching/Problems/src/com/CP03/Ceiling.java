package com.CP03;
// Next big number if the target element is not present in the sorted array

public class Ceiling {

    public static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end-start)/2;

            if (arr[mid] == target){
                return mid;
            }
            if (target > arr[mid]){
                start = mid +1;
            }
            else {
                end = mid-1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr,15));
    }

}
