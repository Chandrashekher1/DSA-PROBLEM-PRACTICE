package com.CP03.EasyProblem;

public class NumberNto1 {
    public static void main(String[] args) {
        Number(5);
    }
    public static void Number(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        else {
            System.out.println(n);
            Number(n-1);
        }

    }
}
