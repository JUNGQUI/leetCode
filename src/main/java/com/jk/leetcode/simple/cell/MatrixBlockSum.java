package com.jk.leetcode.simple.cell;

public class MatrixBlockSum {
    class JKSolution {
        public int[][] matrixBlockSum(int[][] mat, int K) {
            int m = mat.length, n = mat[0].length;
            int[][] answer = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    int minRow = Math.max(0, j-K), maxRow = Math.min(n, j+K+1),
                            minCol = Math.max(0, i-K), maxCol = Math.min(m, i+K+1),
                            result = 0;

                    for (int col = minCol; col < maxCol; col++) {
                        for (int row = minRow; row < maxRow; row++) {
                            result+= mat[col][row];
                        }
                    }

                    answer[i][j] = result;
                }
            }

            return answer;
        }
    }

    class GoodSolution {
        public int[][] matrixBlockSum(int[][] mat, int K) {
            int m = mat.length, n = mat[0].length;
            int[][] rangeSum = new int[m + 1][n + 1];
            for (int i = 0; i < m; ++i)
                for (int j = 0; j < n; ++j)
                    rangeSum[i + 1][j + 1] = rangeSum[i + 1][j] + rangeSum[i][j + 1] - rangeSum[i][j] + mat[i][j];
            int[][] ans = new int[m][n];
            for (int i = 0; i < m; ++i)
                for (int j = 0; j < n; ++j) {
                    int r1 = Math.max(0, i - K), c1 = Math.max(0, j - K), r2 = Math.min(m, i + K + 1), c2 = Math.min(n, j + K + 1);
                    ans[i][j] = rangeSum[r2][c2] - rangeSum[r2][c1] - rangeSum[r1][c2] + rangeSum[r1][c1];
                }
            return ans;
        }
    }
}
