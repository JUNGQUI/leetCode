package com.jk.leetcode.useNpercent.subtractWithDigits;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    class Solution {
        public int subtractProductAndSum(int n) {
            int pd = 1, sd = 0, tempN = n;

            while (tempN != 0) {
                sd += tempN%10;
                pd *= tempN%10;
                tempN = tempN / 10;
            }

            return pd - sd;
        }
    }
}
