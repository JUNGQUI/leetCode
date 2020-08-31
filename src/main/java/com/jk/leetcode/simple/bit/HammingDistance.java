package com.jk.leetcode.simple.bit;

public class HammingDistance {
    class Solution {
        public int hammingDistance(int x, int y) {
            return Integer.bitCount(x^y);
        }
    }
}
