package com.CP03.ArrayProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ReturnArrayList {
    public static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    public static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length){
            return list;
        }

        // this will contain answer for that function calls only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansBelowCalls = findAllIndex2(arr,target,index+1);
        list.addAll(ansBelowCalls);

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4};
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
        System.out.println(findAllIndex2(arr,4,0));
    }
}
