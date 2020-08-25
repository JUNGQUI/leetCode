package com.jk.leetcode.simple.order;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MakeTwoArraysEqaulByReversingSubArray {
    class GoodSolution {
        public boolean canBeEqual(int[] target, int[] arr) {
            Arrays.sort(target);
            Arrays.sort(arr);

            return Arrays.equals(target, arr);
        }
    }

    class JKSolution {
        public boolean canBeEqual(int[] target, int[] arr) {
            Map<Integer, Integer> resultMap = new HashMap<>();

            for (int tagetElement : target) {
                if (resultMap.containsKey(tagetElement)) {
                    resultMap.put(tagetElement, resultMap.get(tagetElement) + 1);
                } else {
                    resultMap.put(tagetElement, 1);
                }
            }

            boolean result = true;

            for (int arrElement : arr) {
                if (!resultMap.containsKey(arrElement)) {
                    result = false;
                    break;
                } else {
                    if (resultMap.get(arrElement) - 1 < 0) {
                        result = false;
                        break;
                    } else {
                        resultMap.put(arrElement, resultMap.get(arrElement) - 1);
                    }
                }
            }

            return result;
        }
    }
}
