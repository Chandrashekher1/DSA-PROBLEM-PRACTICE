package com.CP03;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();  // To store unique characters
        int maxLength = 0; // To store the maximum length of substring found
        int left = 0; // Left pointer for the sliding window

        // Right pointer for the sliding window
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the set, slide the left pointer
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength, right - left + 1); // Update maxLength if needed
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));  // Output: 3 ("wke" or "kew")
    }
}
