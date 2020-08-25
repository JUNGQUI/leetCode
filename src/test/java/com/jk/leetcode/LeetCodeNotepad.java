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
        matrixBlockSum(new int[][] {{67, 64, 78},{99, 98, 38},{82, 46, 46},{6, 52, 55},{55, 99, 45}}, 3);
        matrixBlockSum(new int[][] {{1,2,3},{4, 5, 6},{7, 8, 9}}, 1);
        System.out.println("J Tag");
    }

    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length, n = mat[0].length;
        int[][] answer = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int minRow = Math.max(0, j-K), maxRow = Math.min(n, j+K+1),
                        minCol = Math.max(0, i-K), maxCol = Math.min(m, i+K+1),
                        result = 0;

                for (int col = minCol; col < maxCol; col++) {
                    for (int row = minRow; row < maxRow; row++) {
                        result += mat[col][row];
                    }
                }

                answer[i][j] = result;
            }
        }

        return answer;
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
