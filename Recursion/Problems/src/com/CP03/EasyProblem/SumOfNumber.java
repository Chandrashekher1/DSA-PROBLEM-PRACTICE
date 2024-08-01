package com.CP03.EasyProblem;

// Sum N to 1

public class SumOfNumber {
    public static void main(String[] args) {
        System.out.println(Sum(5));
    }

    public static int Sum(int num){

        if (num == 1){
            return 1;
        }
        return num + Sum(num-1);
    }
}
