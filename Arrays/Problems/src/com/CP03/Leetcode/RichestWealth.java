package com.CP03.Leetcode;

//https://leetcode.com/problems/richest-customer-wealth/description/

public class RichestWealth {
    public int maximumWealth(int[][] accounts) {
        int sum1 = 0;

        for (int i =0; i < accounts.length; i++){
            int sum2 = 0;

            for (int j = 0; j<accounts[i].length; j++){
                sum2 = sum2 + accounts[j][j+1];
            }
           if (sum2 >= sum1){
               sum1 = sum2;
           }
        }
        return sum1;
    }
}
