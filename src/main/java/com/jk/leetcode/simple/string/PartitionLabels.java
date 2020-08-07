package com.jk.leetcode.simple.string;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String S) {
            List<Integer> results = new ArrayList<>();

            if ("".equals(S) || S == null) {
                return results;
            }
            int lastIndex = S.lastIndexOf(S.substring(0, 1));

            for (int i = 0; i <= lastIndex; i++) {
                if (S.lastIndexOf(S.substring(i, i+1)) > lastIndex) {
                    lastIndex = S.lastIndexOf(S.substring(i, i+1));
                    continue;
                }
                results.clear();
                results.add(i+1);
            }

            S = S.substring(lastIndex + 1);

            results.addAll(partitionLabels(S));

            return results;
        }
    }
}
