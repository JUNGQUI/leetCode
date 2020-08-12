package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String s = "aaaabbbbcccc";

        StringBuilder result = new StringBuilder();
        boolean sortingType = true;
        char charResult = (char) (sortingType ? 123 : 96);

        while(s.length() != 0) {
            String choosenString = sorting(s, charResult, sortingType);
            if (choosenString == null) {
                sortingType = !sortingType;
                charResult = (char) (sortingType ? 123 : 96);
            } else {
                s = s.replaceFirst(choosenString, "");
                result.append(choosenString);
            }
        }

        System.out.println("J Tag");
    }

    private char sorting (String s, char prev, boolean sortingType) {
        for (int i = 0; i < s.length(); i++) {
            if (sortingType) {
                prev = (int) prev < s.charAt(i) ? prev : s.charAt(i);
            } else {
                prev = (int) prev > s.charAt(i) ? prev : s.charAt(i);
            }
        }

        if (prev == (char) 96 || prev == (char) 123) {
            return (char) 0;
        } else {
            return String.valueOf(prev);
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
