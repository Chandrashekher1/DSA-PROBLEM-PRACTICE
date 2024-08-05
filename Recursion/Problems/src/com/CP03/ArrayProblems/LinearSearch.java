package com.CP03.ArrayProblems;

import java.util.ArrayList;

public class LinearSearch {
    public static int search(int[] arr, int target, int index){
        if (index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }
        return search(arr,target,index+1);

    }
    // for more than one index use ArrayList

    static ArrayList<Integer> list = new ArrayList<>();
    public static void findAllIndex(int[] arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr,target,index+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,6,4};
        System.out.println(search(arr,5,0));
        findAllIndex(arr,4,0);
        System.out.println(list);
    }

    public static boolean Search(int[] arr, int target, int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || Search(arr,target, index+1);
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        System.out.println(Search(arr,4,0));
//    }
}
