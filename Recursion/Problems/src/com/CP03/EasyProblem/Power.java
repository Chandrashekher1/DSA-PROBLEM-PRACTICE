package com.CP03.EasyProblem;

//https://leetcode.com/problems/power-of-two/description/

public class Power {
   public static boolean isPowerOfTwo(int n){
       if (n<=0){
           return false;
       }
       while (n % 2 == 0){
           n = n/2;
       }
       return n == 1;
   }

   // using recursion

    public static boolean isPowerTwo2(int n){
       if(n<=0){
           return false;
       }
       if (n % 2 == 0){
           return true;
       }
       return isPowerTwo2(n/2);

    }

    // Power of three
    public static boolean isPowerOfThree1(int num){
       if (num<=0){
           return false;
       }
       while (num % 3 ==0){
           num = num/3;
       }
       return num == 1;
    }

    // Power of three
    public static boolean isPowerOfThree(int num){
       if (num <=0){
           return false;
       }
       if(num == 1){
           return true;
       }
       if (num % 3 == 0 ){
           return isPowerOfThree(num/3);
       }
       return false;
    }
    public static void main(String[] args) {
//        System.out.println(isPowerOfTwo(15));
//        System.out.println(isPowerTwo2(16 ));
        System.out.println(isPowerOfThree(27));
    }
}
