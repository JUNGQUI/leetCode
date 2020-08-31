package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    @Test
    public void test() {
        int[][] A = new int[][] {
                {0, 0, 1, 1},
                {1, 0, 1, 0},
                {1, 1, 0, 0}
        };

        int row = A.length, column = A[0].length;
        int result = 0;

        for (int i = 0; i < row; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < column; j++) {
                    A[i][j] = A[i][j]^1;
                }
            }
        }

        for (int i = 0; i < column; i++) {
            int numberOf1 = 0;
            for (int[] ints : A) {
                numberOf1 += ints[i];
            }

            if (numberOf1 <= row/2) {
                for (int j = 0; j < row; j++) {
                    A[j][i] = A[j][i]^1;
                }
            }
        }

        for (int i = 0; i < column; i++) {
            for (int[] ints : A) {
                result += ints[i] * Math.pow(2, column - 1 - i);
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
