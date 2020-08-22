package com.jk.leetcode;

import org.junit.jupiter.api.Test;


public class LeetCodeNotepad {
    @Test
    public void test() {
        TreeNode t1 = new TreeNode(1,
                new TreeNode(3, new TreeNode(5), null),
                new TreeNode(2));

        TreeNode t2 = new TreeNode(2,
                new TreeNode(1, null, new TreeNode(4)),
                new TreeNode(3, null, new TreeNode(7))
        );

        TreeNode result = mergeTrees(t1, t2);

        System.out.println("J Tag");
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int val = (t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0);

        TreeNode result = new TreeNode(val);
        result.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        result.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

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
