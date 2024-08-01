package com.CP03.EasyProblem;

public class SumOfDigit {
    static int sum =0;
    public static int SUM(int num){
        if (num == 0){
            return 0;
        }
        int rem = num %10;
        return  rem + SUM(num/10);
    }

    public static void main(String[] args) {
        System.out.println(SUM(123));
    }
}
