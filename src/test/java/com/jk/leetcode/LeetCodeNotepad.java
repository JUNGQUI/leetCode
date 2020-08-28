package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    @Test
    public void test() {
//        int[][] matrix = new int[][] {
//                {0,1,1,1},
//                {1,1,1,1},
//                {0,1,1,1}
//        };

        int[][] matrix = new int[][] {
                {1,1,0,0,1},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,1,0,1},
                {0,0,1,0,1}
        };

        int result = countSquares(matrix);

        System.out.println("J Tag");
    }

    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int result = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    result++;
                    int maximumRec = Math.min(Math.min(m-i, m), Math.min(n-j, n));

                    for (int rec = 1; rec < maximumRec; rec++) {
                        if (matrix[i][j+rec] == 1 && matrix[i+rec][j] == 1) {
                            for (int )
                        } else {
                            break;
                        }
                    }
                }
            }
        }

        return result;
    }

//    public int uniquePathsIII(int[][] grid) {
//        int i = 0, j = 0, zeros = 0;
//
//        for (int col = 0; col < grid.length; col++) {
//            for (int row = 0; row < grid[col].length; row++) {
//                if (grid[col][row] == 1) {
//                    i = col;
//                    j = row;
//                } else if (grid[col][row] == 0) {
//                    zeros++;
//                }
//            }
//        }
//
//
//    }
//
//    private void countPath(int[][] grid, int i, int j, int zeros) {
//        if (i < 0 || j < 0 || grid[i][j] < 0) {
//            return;
//        }
//    }

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
