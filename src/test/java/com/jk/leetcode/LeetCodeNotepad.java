package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {

    @Test
    public void test() {
        sortArrayByParity(new int[] {4, 3, 2, 1});
        System.out.println("J Tag");
    }

    public int[] sortArrayByParity(int[] A) {
        int[] results = new int[A.length];
        int evenIndex = 0, oddIndex = A.length-1;

        for (int j : A) {
            if (j % 2 == 0) {
                results[evenIndex] = j;
                evenIndex++;
            } else {
                results[oddIndex] = j;
                oddIndex--;
            }
        }

        return results;
    }

    public int[] jkSortArrayByParity(int[] A) {
        int[] results = new int[A.length];

        List<Integer> tempResults = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        for (int element : A) {
            if (element % 2 == 0) {
                even.add(element);
            } else {
                odd.add(element);
            }
        }

        tempResults.addAll(even);
        tempResults.addAll(odd);

        for (int i = 0; i < A.length; i++) {
            results[i] = tempResults.get(i);
        }

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
