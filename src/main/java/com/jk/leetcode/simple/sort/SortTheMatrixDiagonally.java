package com.jk.leetcode.simple.sort;

import java.util.ArrayList;
import java.util.List;

public class SortTheMatrixDiagonally {
    class Solution {
        public int[][] diagonalSort(int[][] mat) {
            int[][] results = mat.clone();
            int max = Math.min(mat.length, mat[0].length);

            for (int i = mat.length-1; i > 0; i--) {
                List<Integer> diagons = new ArrayList<>();
                int min = Math.min(mat.length - i, max);

                for (int j = 0; j < min; j++) {
                    diagons.add(mat[i+j][j]);
                }

                int idx = 0;
                diagons.sort(null);

                for (int j = 0; j < min; j++) {
                    results[i+j][j] = diagons.get(idx);
                    idx++;
                }
            }

            for (int a = 0; a < mat[0].length; a++) {
                List<Integer> diagons = new ArrayList<>();
                int min = Math.min(mat[0].length - a, max);

                for (int b = 0; b < min; b++) {
                    diagons.add(mat[b][a+b]);
                }

                int idx = 0;
                diagons.sort(null);

                for (int b = 0; b < min; b++) {
                    results[b][a+b] = diagons.get(idx);
                    idx++;
                }
            }

            return results;
        }
    }
}
