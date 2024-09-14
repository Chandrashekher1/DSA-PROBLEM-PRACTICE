package com.CP03;

//https://leetcode.com/problems/set-mismatch/description/

public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i =0;
        while (i < nums.length){
            int current = nums[i];

            if (nums[i] != nums[current]){
                swap(nums,i,current);

            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++){
            if (nums[index] != index){
                arr[0] = index;
                arr[1] = arr[index];
            }
        }
        return arr;
    }

    private void swap(int[] nums, int i, int current) {

        int temp = nums[i];
        nums[i] = nums[current];
        nums[current] = temp;
    }
}
