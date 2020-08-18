package com.jk.leetcode.customstack;

public class CustomStack {
    private final int[] customStack;
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
        k = Math.min(k, customStack.length);
        for (int i = 0; i < k; i++) {
            customStack[i]+=val;
        }
    }
}
