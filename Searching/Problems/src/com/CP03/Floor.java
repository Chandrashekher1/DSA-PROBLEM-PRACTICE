package com.CP03;
// Greatest number in the smallest array if target is not found
public class Floor {
    public static int floor(int[] arr, int target){

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
        return end;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr,15));
    }
}
