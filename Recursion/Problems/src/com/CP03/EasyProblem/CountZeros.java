package com.CP03.EasyProblem;

public class CountZeros {
    static int count = 0;
    public static int Count(int num, int number){
        if (num == 0){
            return 0;
        }
        int rem = num % 10;
        if (rem == number){
            count++;
        }
        Count(num /10, number);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Count(101010,0));
    }
}
