package com.jk.leetcode.simple.ratingCount;

public class CountNumberOfTeam {

    class Solution {
        public int numTeams(int[] rating) {
            int result = 0;

            for (int i = 1; i < rating.length-1; i++) {
                int[] left = new int[]{0, 0};
                int[] right = new int[]{0, 0};

                for (int j = 0; j < i; j++) {
                    if (rating[j] < rating[i]) {
                        left[0]++;
                    } else if (rating[j] > rating[i]) {
                        left[1]++;
                    }
                }

                for (int k = i+1; k < rating.length; k++) {
                    if (rating[k] > rating[i]) {
                        right[0]++;
                    } else if (rating[k] < rating[i]) {
                        right[1]++;
                    }
                }

                result += (left[0]*right[0]) + (left[1]*right[1]);
            }

            return result;
        }
    }
}
