package com.jk.leetcode.shuffle;

public class ShuffleTheArray {
    class Solution {
        public int[] shuffle(int[] nums, int n) {
            int[] result = new int[nums.length];

            for (int i = 0; i < n; i++) {
                int idx = i*2;
                result[idx] = nums[i];
                result[idx + 1] = nums[i+n];
            }

            return result;
        }
    }
}
