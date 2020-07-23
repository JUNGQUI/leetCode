package com.jk.leetcode.simple.palindrome;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String stringX = String.valueOf(x);
        String reverseX = new StringBuilder(stringX).reverse().toString();

        return stringX.equals(reverseX);
    }

    public boolean isPalindromeWithoutConversion(int x) {
        if (x < 0) return false;

        int tmp = x;
        int reverseX = 0;

        while (tmp > 0) {
            reverseX = reverseX * 10 + tmp % 10;
            tmp = tmp / 10;
        }

        return reverseX == x;
    }
}
