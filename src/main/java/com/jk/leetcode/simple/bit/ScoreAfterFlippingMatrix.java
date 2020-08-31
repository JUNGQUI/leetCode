package com.jk.leetcode.simple.bit;

public class ScoreAfterFlippingMatrix {
    class Solution {
        public int matrixScore(int[][] A) {
            int row = A.length, column = A[0].length;
            int result = 0;

            for (int i = 0; i < row; i++) {
                if (A[i][0] == 0) {
                    for (int j = 0; j < column; j++) {
                        A[i][j] = A[i][j]^1;
                    }
                }
            }

            for (int i = 0; i < column; i++) {
                int numberOf1 = 0;
                for (int[] ints : A) {
                    numberOf1 += ints[i];
                }

                if (numberOf1 <= row/2) {
                    for (int j = 0; j < row; j++) {
                        A[j][i] = A[j][i]^1;
                    }
                }
            }

            for (int i = 0; i < column; i++) {
                for (int[] ints : A) {
                    result += ints[i] * Math.pow(2, column - 1 - i);
                }
            }

            return result;
        }
    }
}
