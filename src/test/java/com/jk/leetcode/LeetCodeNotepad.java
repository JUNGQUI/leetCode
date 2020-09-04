package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    @Test
    public void test() {
        List<Integer> results = pathInZigZagTree(26);
        System.out.println("J Tag");
    }

    public List<Integer> pathInZigZagTree(int label) {
        int floor = (int) (Math.log(label)/Math.log(2));
        int currentValue = label;
        List<Integer> results = new ArrayList<>();
        results.add(label);

        // 짝수가 역, 홀수가 정
        for (int i = floor; i > 0; i--) {
            int max = (int) Math.pow(2, i+1) - 1, min = (int) Math.pow(2, i);
            int sumOfFloor = max + min;
            int real = (sumOfFloor - currentValue)%2 == 0 ? sumOfFloor - currentValue : sumOfFloor - currentValue - 1;

            currentValue = real/2;
            results.add(currentValue);
        }

        results.sort(Comparator.naturalOrder());

        return results;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
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
