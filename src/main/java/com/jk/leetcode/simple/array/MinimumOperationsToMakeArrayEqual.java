package com.jk.leetcode.simple.array;

public class MinimumOperationsToMakeArrayEqual {
    class Solution {
        public int minOperations(int n) {
            int result = 0, minValue = 0;

            for (int i = 0; i < n; i++) {
                minValue += 2*i + 1;
            }

            minValue = minValue/n;

            for (int i = 0; i < n/2; i++) {
                result += minValue - (2*i + 1);
            }

            return result;
        }
    }
}
