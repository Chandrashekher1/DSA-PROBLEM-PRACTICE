package com.CP03;

//https://leetcode.com/problems/goal-parser-interpretation/description/

import java.util.Arrays;

public class GoalParser {
    public static String interpret(String command) {
        StringBuilder str = new StringBuilder();
        
        int i=0;
        while (i< command.length()){
            if (command.charAt(i) == 'G'){
                str.append("G");
                i++;
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                str.append("o");
                i = i+2;
            } else if (command.charAt(i) == '(' && command.startsWith("(al)",i)) {
                str.append("al");
                i = i +4;
            }
        }
        return new String(str);

    }

    public static void main(String[] args) {
        String str = "G()(al)";
        System.out.println(interpret(str));
//        System.out.println(Arrays.toString(str.toCharArray()));
    }
}
