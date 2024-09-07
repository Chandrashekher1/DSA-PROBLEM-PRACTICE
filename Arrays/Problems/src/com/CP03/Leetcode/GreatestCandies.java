package com.CP03.Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GreatestCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] arr = new boolean[candies.length];

        int max = 0;
        for (int i =0; i< candies.length; i++){
            if (candies[i] > max){
                max = candies[i];
            }
        }
        for (int i =0; i < candies.length; i++){
            if (candies[i] + extraCandies >= max){
                arr[i] = true;
            }
            else {
                arr[i] = false;
            }
        }
        ArrayList<Boolean> list = new ArrayList<>();
        for (boolean b : arr) {
            list.add(b);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
