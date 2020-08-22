package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    int[] results = new int[0];
    int idx = 0;

    @Test
    void contextLoads() {

        int[] deck = new int[] {
                17,13,11,2,3,5,7
        };
        results = new int[deck.length];
        deckRevealedIncreasing(deck);

        System.out.println("J Tag");
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        while (deck.length != 0) {
            deck = this.deckHelper(deck);
        }

        return results;
    }

    public int[] deckHelper(int[] deck) {
        results[idx] = deck[0];
        idx++;
        int[] modifiedDeck = new int[deck.length-1];

        if (modifiedDeck.length == 0) {
            return new int[0];
        }

        for (int i = 2; i < deck.length; i++) {
            modifiedDeck[i-2] = deck[i];
        }

        int deckIdx = deck.length == 1 ? 0 : 1;

        modifiedDeck[modifiedDeck.length-1] = deck[deckIdx];

        return modifiedDeck;
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
