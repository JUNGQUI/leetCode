package com.jk.leetcode.simple.cell;

public class CellWithOddValuesInAMatrix {
    class Solution {
        public int oddCells(int n, int m, int[][] indices) {
            boolean[] rowOdd = new boolean[n];
            boolean[] colOdd = new boolean[m];

            for (int[] row : indices) {
                rowOdd[row[0]] = !rowOdd[row[0]];
                colOdd[row[1]] = !colOdd[row[1]];
            }

            int result = 0;

            for (boolean ro : rowOdd) {
                for (boolean co : colOdd) {
                    result += (ro && !co) || (!ro && co) ? 1 : 0;
                }
            }

            return result;
        }
    }
}
