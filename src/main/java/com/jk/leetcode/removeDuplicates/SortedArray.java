package com.jk.leetcode.removeDuplicates;

public class SortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length == 0) return 0;

            int prev = nums[0];
            int target = 1;

            for (int i = 1; i < nums.length; i++) {
                if (prev != nums[i]) {
                    nums[target] = nums[i];
                    prev = nums[i];
                    target++;
                }
            }

            return target;
        }
    }
}
