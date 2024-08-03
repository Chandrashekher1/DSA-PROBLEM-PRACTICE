package com.CP03.EasyProblem;

public class GeekonacciSeries {
    public static int geek(int A, int B, int C, int N){
        int[] arr = new int[N];
        arr[0] = A;
        arr[1] = B;
        arr[2] = C;

        for (int i = 3; i<= N-1 ; i++){
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[N-1];
    }

    public static void main(String[] args) {
        System.out.println(geek(1,3,2,4));
    }
}
