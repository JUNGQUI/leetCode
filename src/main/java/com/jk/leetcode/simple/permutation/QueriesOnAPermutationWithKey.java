package com.jk.leetcode.simple.permutation;

import java.util.ArrayList;
import java.util.List;

public class QueriesOnAPermutationWithKey {
    class Solution {
        public int[] processQueries(int[] queries, int m) {
            List<Integer> permutation = new ArrayList<>();

            for (int i = m; i > 0; i--) {
                permutation.add(i);
            }

            int[] results = new int[queries.length];

            for (int j = 0; j < queries.length; j++) {
                results[j] = m-permutation.indexOf(queries[j])-1;
                permutation.remove((Integer) queries[j]);
                permutation.add(queries[j]);
            }

            return results;
        }
    }
}
