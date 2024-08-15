package com.CP03;
//https://www.geeksforgeeks.org/problems/c-corresponding-position-in-the-two-strings-that-hold-exactly-the-same-characters5013/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

public class SameChar {
    static int sameChar(String A, String B)
    {
        String s1 = A.toLowerCase();
        String s2 = B.toLowerCase();

        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        int i =0;
        int j =0;
        int count = 0;

        while (i<ch1.length){
            if (ch1[i] == ch2[i]){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "Geek";
        String B = "gang";

        System.out.println(sameChar(A,B));

    }
}
