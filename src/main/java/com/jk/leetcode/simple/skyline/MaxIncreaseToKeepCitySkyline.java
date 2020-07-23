package com.jk.leetcode.simple.skyline;

public class MaxIncreaseToKeepCitySkyline {
    class Solution {
        public int maxIncreaseKeepingSkyline(int[][] grid) {

            if (grid.length == 0) return 0;

            int[] tb = new int[grid.length];
            int[] lr = new int[grid.length];
            int count = 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    tb[j] = Math.max(tb[j], grid[i][j]);
                    lr[i] = Math.max(lr[i], grid[i][j]);
                }
            }

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid.length; j++) {
                    count += Math.abs(Math.min(tb[j], lr[i]) - grid[i][j]);
                }
            }

            return count;
        }
    }
}
