package com.CP03;

public class LargestPerimeter {
    public int largestPerimeter(int[] nums) {

        for (int i= nums.length-1; i>0; i++){
            int para = nums[i] + nums[i-2] + nums[i-3];

            if (nums[i-2] + nums[i-1] > nums[i]){
                return para;
            }
        }
        return 0;
    }
}
