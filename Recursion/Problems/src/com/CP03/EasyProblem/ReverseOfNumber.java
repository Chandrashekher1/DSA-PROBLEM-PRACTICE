package com.CP03.EasyProblem;

public class ReverseOfNumber {
    static int sum = 0;
    public static int Reverse(int num){
        if (num == 0){
            return 0;

        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        Reverse(num /10);
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(Reverse(123));
    }
}
