package com.CP03;

public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        for (int i =0; i< num/2; i++){
            if (i *i == num){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }
}
