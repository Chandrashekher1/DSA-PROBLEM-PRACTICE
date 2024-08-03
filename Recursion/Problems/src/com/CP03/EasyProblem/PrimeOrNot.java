package com.CP03.EasyProblem;

public class PrimeOrNot {
    public static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        for (int i =2; i<num ; i++){
            if (num % i == 0){
                return false;
            }
            if(i * i > num){
                return true;
            }
        }

        return false;
    }

    // using recursion

    public static boolean isPrime2(int num, int i){
        if (num == 2){
            return true;
        }
        if (num ==0 || num == 1){
            return false;
        }
        if (num % i == 0){
            return false;
        }
        if(i*i > num){
            return true;
        }
        return isPrime2(num,i+1);

    }

    public static void main(String[] args) {
        System.out.println(isPrime(15));
        System.out.println(isPrime2(11,2));
    }
}
