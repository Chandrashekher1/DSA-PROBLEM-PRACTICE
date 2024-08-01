package com.CP03.EasyProblem;

public class Number1toN {

    public static void main(String[] args) {
        Number(5,1);
    }


    public static void Number(int n, int idx) {
        if (idx == n){
            System.out.println(n);
            return;
        }

        System.out.println(idx);
        Number(n , idx+1);
    }
}
