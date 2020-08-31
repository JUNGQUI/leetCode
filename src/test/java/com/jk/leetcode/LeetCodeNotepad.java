package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    @Test
    public void test() {
        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(2),
                        null),
                new TreeNode(
                        3,
                        new TreeNode(2),
                        new TreeNode(4))
        );

        root = removeLeafNodes(root, 2);

        System.out.println("J Tag");
    }

    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            if (root.val == target) {
                return null;
            } else {
                return root;
            }
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null) {
            if (root.val == target) {
                return null;
            }
        }

        return root;
    }

    private TreeNode removeHelper(TreeNode root, int target) {
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                return null;
            }
        }

        return root;
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
