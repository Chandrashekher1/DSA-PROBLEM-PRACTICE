package com.CP03;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

// Same as ceiling problems

public class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        // Wrap around using modulus to handle cases where start is out of bounds
        return letters[start % letters.length];
    }

}
