package com.CP03;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

public class StringHalves {
    public boolean halvesAreAlike(String s) {

        String str1 = s.substring(0,s.length()/2).toLowerCase();
        String str2 = s.substring(s.length()/2);

        int count1 = 0;
        int count2 = 0;
        for (int i=0; i<s.length(); i++){
            char ch = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i'|| ch == 'u'){
                count1++;
            }
            if (ch2 == 'a' || ch2 == 'e' || ch2 == 'o' || ch2 == 'i'|| ch2 == 'u'){
                count2++;
            }
        }
        return count1 == count2;
    }
}
