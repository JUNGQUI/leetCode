package com.jk.leetcode.simple.sort;

public class ReplaceElementsWithGreatestElementOnRightSide {
    class Solution {
        public int[] replaceElements(int[] arr) {
            int[] result = new int[arr.length];
            int maxValue = -1;
            for(int x = arr.length-1; x >=0; x--) {
                result[x] = maxValue;
                maxValue = Math.max(arr[x], maxValue);
            }
            return result;
        }

        public int[] replaceElements_JK(int[] arr) {
            int[] result = new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                int maximum = 0;

                for (int j = i+1; j < arr.length; j++) {
                    maximum = arr[j] > maximum ? arr[j] : maximum;
                }

                result[i] = maximum;
            }

            result[arr.length-1] = -1;

            return result;
        }
    }
}
