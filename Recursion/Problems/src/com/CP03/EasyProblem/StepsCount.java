package com.CP03.EasyProblem;

public class StepsCount {
    public static int Steps(int num, int steps){
        if (num == 0){
            return steps;
        }
        if (num %2 == 0){
            return Steps(num/2, steps+1);
        }
        return Steps(num -1, steps+1);

    }
    public static void main(String[] args) {
        System.out.println(Steps(14,0));
    }
}
