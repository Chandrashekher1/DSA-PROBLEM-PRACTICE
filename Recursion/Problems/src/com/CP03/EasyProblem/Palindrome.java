package com.CP03.EasyProblem;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(1211));
    }
    static int ans = 0;
    public static boolean palindrome(int num){
        if (num == 0){
            return true;
        }
        int rem = num % 10;
        ans = ans * 10 + rem;
        palindrome(num / 10);
        return ans == num;
    }
}
