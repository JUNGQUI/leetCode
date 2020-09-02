package com.jk.leetcode.simple.arithmetic;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    class Solution {
        public boolean canMakeArithmeticProgression(int[] arr) {
            Arrays.sort(arr);
            boolean flag = true;
            int diff = Math.abs(arr[0] - arr[1]), before = arr[0];

            for (int i = 1; i < arr.length; i++) {
                if (diff != Math.abs(arr[i] - before)) {
                    flag = false;
                    break;
                } else {
                    before = arr[i];
                }
            }

            return flag;
        }
    }
}
