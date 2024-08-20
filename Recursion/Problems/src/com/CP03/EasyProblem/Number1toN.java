package com.CP03.EasyProblem;

import java.util.Stack;

public class Number1toN {

    public static void main(String[] args) {
//        Number(5,1);
        Number2(10);
    }


    public static void Number(int n, int idx) {
        if (idx == n){
            System.out.println(n);
            return;
        }

        System.out.println(idx);
        Number(n , idx+1);
    }

    public static void Number2(int num){

        if ( num == 0){
            return ;
        }
        Number2(num-1);
        System.out.println(num);

    }
}
