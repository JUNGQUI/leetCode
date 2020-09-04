package com.jk.leetcode.simple.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PathInZigzagLabelledBinaryTree {
    class Solution {
        public List<Integer> pathInZigZagTree(int label) {
            int floor = (int) (Math.log(label)/Math.log(2));
            int currentValue = label;
            List<Integer> results = new ArrayList<>();
            results.add(label);

            // 짝수가 역, 홀수가 정
            for (int i = floor; i > 0; i--) {
                int max = (int) Math.pow(2, i+1) - 1, min = (int) Math.pow(2, i);
                int sumOfFloor = max + min;
                int real = (sumOfFloor - currentValue)%2 == 0 ? sumOfFloor - currentValue : sumOfFloor - currentValue - 1;

                currentValue = real/2;
                results.add(currentValue);
            }

            results.sort(Comparator.naturalOrder());

            return results;
        }
    }
}
