package com.jk.leetcode.simple.stringPattern;

import java.util.*;

public class FindAndReplacePattern {
    class Solution {
        public List<String> findAndReplacePattern(String[] words, String pattern) {
            int[] patternNumber = makePattern(pattern);
            List<String> results = new ArrayList<>();

            for(String word : words) {
                int[] wordPattern = makePattern(word);

                if (Arrays.equals(wordPattern, patternNumber)) {
                    results.add(word);
                }
            }

            return results;
        }

        private int[] makePattern(String pattern) {
            int[] result = new int[pattern.length()];
            int key = 0;
            char[] patterns = pattern.toCharArray();
            Map<Character, Integer> dictionary = new HashMap<>();

            for (int i = pattern.length()-1; i >= 0; i--) {
                if (!dictionary.containsKey(patterns[i])) {
                    dictionary.put(patterns[i], key);
                    result[i] = key;
                    key++;
                } else {
                    int tempKey = dictionary.get(patterns[i]);
                    result[i] = tempKey;
                }
            }

            return result;
        }
    }
}
