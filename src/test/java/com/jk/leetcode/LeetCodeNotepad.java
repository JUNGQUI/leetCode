package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.*;


public class LeetCodeNotepad {
    @Test
    public void test() {
        int[] target = new int[] {1, 2, 3, 4};
        int[] arr = new int[] {4, 3, 1, 2};

        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int tagetElement : target) {
            if (resultMap.containsKey(tagetElement)) {
                resultMap.put(tagetElement, resultMap.get(tagetElement) + 1);
            } else {
                resultMap.put(tagetElement, 1);
            }
        }

        boolean result = true;

        for (int arrElement : arr) {
            if (!resultMap.containsKey(arrElement)) {
                result = false;
                break;
            } else {
                if (resultMap.get(arrElement) - 1 < 0) {
                    result = false;
                    break;
                } else {
                    resultMap.put(arrElement, resultMap.get(arrElement) - 1);
                }
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
