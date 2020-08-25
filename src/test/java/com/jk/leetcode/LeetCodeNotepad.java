package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {
    @Test
    public void test() {
        String[] words = new String[] {
                "qkuuhjqesjpdrjmkmsiq",
                "bhtbqamxanbwrtrabqzw",
                "ssfthcliekxllsndxluk",
                "ukffypbkgcebqeppsnhw",
                "jlqnyyyypmsfgbeardur"
        };

        String pattern = "ghtxpauhingxekhnoqnk";

        findAndReplacePattern(words, pattern);

        System.out.println("J Tag");
    }

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

    class CustomStack {

        private int[] customStack;
        private int currentIdx;

        public CustomStack(int maxSize) {
            customStack = new int[maxSize];
            currentIdx = -1;
        }

        public void push(int x) {
            if (currentIdx < customStack.length - 1) {
                currentIdx++;
                customStack[currentIdx] = x;
            }
        }

        public int pop() {
            int result = -1;

            if (currentIdx != -1) {
                result = customStack[currentIdx];
                customStack[currentIdx] = 0;
                currentIdx--;
            }

            return result;
        }

        public void increment(int k, int val) {
            k = k > customStack.length ? customStack.length : k;
            for (int i = 0; i < k; i++) {
                customStack[i]+=val;
            }
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
