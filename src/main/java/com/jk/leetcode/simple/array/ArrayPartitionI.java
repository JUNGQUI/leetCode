package com.jk.leetcode.simple.array;

import java.util.Arrays;

public class ArrayPartitionI {
    class Solution {
        public int arrayPairSum(int[] nums) {
            int pairs = nums.length/2, result = 0;
            Arrays.sort(nums);

            for (int i = nums.length-2; i > -1; i-=2) {
                result += nums[i];
            }

            return result;
        }
    }
}
