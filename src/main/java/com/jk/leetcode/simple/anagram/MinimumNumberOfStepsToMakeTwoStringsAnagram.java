package com.jk.leetcode.simple.anagram;

public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    class Solution {
        public int minSteps(String s, String t) {
            int result = 0;
            int[] charDic = new int[26];

            for (int i = 0; i < s.length(); i++) {
                charDic[s.charAt(i) - 'a']++;
                charDic[t.charAt(i) - 'a']--;
            }

            for (int j = 0; j < charDic.length; j++) {
                result += Math.max(charDic[j], 0);
            }

            return result;
        }
    }
}
