package com.jk.leetcode.simple.reverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        if(x == 0 || x == Integer.MIN_VALUE || x == Integer.MAX_VALUE) return 0;

        StringBuilder result = new StringBuilder();
        char[] temp = String.valueOf(x).toCharArray();
        int endFlag = -1;

        if (x < 0) {
            result.append("-");
            endFlag++;
        }

        for (int i = temp.length-1; i > endFlag; i--) {
            result.append(temp[i]);
        }

        try {
            return Integer.parseInt(result.toString());
        } catch (Exception ex) {
            return 0;
        }
    }
}
