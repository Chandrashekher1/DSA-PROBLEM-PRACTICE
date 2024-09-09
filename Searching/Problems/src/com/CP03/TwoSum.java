package com.CP03;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int last = numbers.length-1;

        while (numbers[start] +numbers[last] != target){
            if (numbers[start] + numbers[last] < target){
                start++;

            }else {
                last--;
            }
        }
        return new int[] {start+1, last+1};

    }

}
