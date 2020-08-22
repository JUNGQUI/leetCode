package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

        int[] deck = new int[] {
                17,13,11,2,3,5,7
        };

        int[] whatDeck = deckRevealedIncreasing(deck);

        System.out.println("J Tag");
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int[] newDeck = new int[] {deck[deck.length-1]};

        for (int i = deck.length-2; i >= 0; i--) {
            newDeck = reorder(newDeck);
            int[] addDeck = new int[newDeck.length+1];
            addDeck[0] = deck[i];
            System.arraycopy(newDeck, 0, addDeck, 1, newDeck.length);
            newDeck = addDeck;
        }

        return newDeck;
    }

    public int[] reorder(int[] tempDeck) {
        int[] reorderDeck = new int[tempDeck.length];

        for (int i = 1; i < tempDeck.length; i++) {
            reorderDeck[i] = tempDeck[i-1];
        }

        reorderDeck[0] = tempDeck[tempDeck.length-1];

        return reorderDeck;
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
