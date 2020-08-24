package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class LeetCodeNotepad {
    @Test
    public void test() {
        String S = "()())()";

        int A = 0, B = 0;

        for (int i = 0; i < S.length(); i++) {
            String s = S.substring(i, i+1);

            switch (s) {
                case "(":
                    A++;
                    break;
                case ")":
                    if (A != 0) {
                        B++;
                    } else {
                        A--;
                    }
                    break;
            }
        }

        System.out.println("J Tag");
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
