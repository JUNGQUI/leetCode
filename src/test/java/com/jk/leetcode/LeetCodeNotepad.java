package com.jk.leetcode;

import org.junit.jupiter.api.Test;


public class LeetCodeNotepad {
    @Test
    public void test() {
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        new TreeNode(1,
                                new TreeNode(0),
                                null),
                        new TreeNode(1)),
                new TreeNode(0,
                        new TreeNode(0),
                        new TreeNode(1)
                )
        );

        root = pruneTree(root);

        System.out.println("J Tag");
    }

    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root.val == 1 ? root : null;
        } else {
            if (root.left != null) {
                root.left = pruneTree(root.left);
            }

            if (root.right != null) {
                root.right = pruneTree(root.right);
            }

            if (root.left == null && root.right == null) {
                return root.val == 1 ? root : null;
            } else {
                return root;
            }
        }
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
