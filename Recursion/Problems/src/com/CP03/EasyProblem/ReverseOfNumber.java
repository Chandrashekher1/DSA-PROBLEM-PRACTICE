package com.CP03.EasyProblem;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int ans = 1234;
        reverse(ans);
        System.out.println(sum);
    }

    static int sum = 0;
    public static void reverse(int num){
        if (num == 0){
            return;
        }

        int rem = num % 10;
        sum = sum * 10 + rem;
        reverse(num/10);

    }
}
