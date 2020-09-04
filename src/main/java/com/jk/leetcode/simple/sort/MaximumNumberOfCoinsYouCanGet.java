package com.jk.leetcode.simple.sort;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {
    class Solution {
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);
            int pilesLength = piles.length/3, result = 0;

            for (int i = piles.length-2; i >= pilesLength; i-=2) {
                result += piles[i];
            }

            return result;
        }
    }
}
