package com.CP03;

import java.util.ArrayList;
import java.util.List;

public class DisappearNUmber {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> list = new ArrayList<>();
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
            if (nums[index] != index+1){
                list.add(index+1);
            }
        }
        return list;
    }

    private void swap(int[] nums, int i, int current) {

        int temp = nums[i];
        nums[i] = nums[current];
        nums[current] = temp;
    }

    }
}
