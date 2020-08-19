package com.jk.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeNotepad {
    @Test
    public void test() {
        int[] deck = new int[] {
            2, 13, 3, 11, 5, 17, 7
        };

        int[] results = new int[deck.length];



        System.out.println("J Tag");
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck.length <= 1) {
            return deck;
        }

        int[] result = new int[deck.length];
        int idx = 0;

        while(true) {
            if (deck[0] == 0) {
                break;
            }

            result[idx] = deck[0];
            idx++;
        }

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
        LeetcodeApplicationTests.TreeNode left;
        LeetcodeApplicationTests.TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, LeetcodeApplicationTests.TreeNode left, LeetcodeApplicationTests.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public class ListNode {
        int val;
        LeetcodeApplicationTests.ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, LeetcodeApplicationTests.ListNode next) { this.val = val; this.next = next; }
    }
}
