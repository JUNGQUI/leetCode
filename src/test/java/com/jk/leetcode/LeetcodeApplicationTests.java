package com.jk.leetcode;

import com.jk.leetcode.node.TreeNode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    HashMap<Integer, Integer> values = new HashMap<>();

    @Test
    void contextLoads() {
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

class FindElements {
    HashMap<Integer, Integer> values;

    public FindElements(TreeNode root) {
        values = new HashMap<>();
        fixElements(root);
    }

    private void fixElements(TreeNode root) {
        if (root.val == -1) {
            root.val = 0;
            values.put(0, 0);
        }

        if (root.left != null) {
            root.left.val = root.val * 2 + 1;
            values.put(root.val * 2 + 1, root.val * 2 + 1);
            fixElements(root.left);
        }

        if (root.right != null) {
            root.right.val = root.val * 2 + 2;
            values.put(root.val * 2 + 2, root.val * 2 + 2);
            fixElements(root.right);
        }
    }

    public boolean find(int target) {
        return values.containsKey(target);
    }
}
