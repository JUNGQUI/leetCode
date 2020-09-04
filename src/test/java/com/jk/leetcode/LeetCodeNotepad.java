package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    List<Integer> results = new ArrayList<>();

    @Test
    public void test() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(7, new TreeNode(7), new TreeNode(-8)),
                new TreeNode(0)
        );

        System.out.println("J Tag");
    }

    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        int level = 0, maxLevel = 0, maxValue = Integer.MIN_VALUE;
        queue.add(root);

        while (!queue.isEmpty()) {
            level++;
            int currentValue = 0, currentSize = queue.size();

            for (int i = 0; i < currentSize; i++) {
                TreeNode temp = queue.poll();
                currentValue += temp.val;

                if (temp.left != null) {
                    queue.add(temp.left);
                }

                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }

            if (currentValue > maxValue) {
                maxValue = currentValue;
                maxLevel = level;
            }
        }

        return maxLevel;
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
