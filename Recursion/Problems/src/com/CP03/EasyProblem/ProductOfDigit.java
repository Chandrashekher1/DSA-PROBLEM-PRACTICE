package com.CP03.EasyProblem;

public class ProductOfDigit {
    public static int product(int num){
        if (num == 0){
            return 1;
        }
        int rem = num%10;
        return rem * product(num /10);
    }

    public static void main(String[] args) {
        System.out.println(product(23));
    }
}
