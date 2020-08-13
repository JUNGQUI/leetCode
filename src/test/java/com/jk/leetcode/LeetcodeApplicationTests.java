package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String s = "spo";

        StringBuilder result = new StringBuilder();
        boolean sortingType = true;
        char charResult = (char) 96;

        while (s.length() != 0) {
            char tempChar = sorting(s, charResult, sortingType);

            if (charResult == tempChar) {
                sortingType = !sortingType;
                charResult = sortingType ? (char) 96 : (char) 123;
            } else {
                result.append(tempChar);
                s = s.replaceFirst(String.valueOf(tempChar), "");
                charResult = tempChar;
            }
        }

        System.out.println("J Tag");
    }

    private char sorting (String s, char prev, boolean sortingType) {
        char inputedchar = prev;
        prev = sortingType ? (char) 123 : (char) 96;

        for (char charS : s.toCharArray()) {
            if (sortingType) {
                prev = inputedchar < charS && charS <= prev ? charS : prev;
            } else {
                prev = inputedchar > charS && charS >= prev ? charS : prev;
            }
        }

        prev = prev == (char) 123 || prev == (char) 96 ? inputedchar : prev;

        return prev;
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
