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
        char charResult = (char) 96;

        while(s.length() != 0) {
            char choosenString = sorting(s, charResult, sortingType);
            if (choosenString == (char) 0) {
                sortingType = !sortingType;
                charResult = (char) (sortingType ? 96 : 123);
            } else {
                s = s.replaceFirst(String.valueOf(choosenString), "");
                result.append(choosenString);
                charResult = choosenString;
            }
        }

        System.out.println("J Tag");
    }

    private char sorting (String s, char prev, boolean sortingType) {
        char inputedPrev = prev;
        prev = sortingType ? (char) 123 : (char) 96;
        for (int i = 0; i < s.length(); i++) {
            if (sortingType) {
                prev = inputedPrev < s.charAt(i) && s.charAt(i) < prev
                        ? s.charAt(i) :
                        s.charAt(i) < prev ?
                                s.charAt(i) : prev;
            } else {
                prev = prev > s.charAt(i) && s.charAt(i) > inputedPrev
                        ? s.charAt(i) :
                        prev > s.charAt(i) ?
                                prev : s.charAt(i);
            }
        }

        if (prev == (char) 96 || prev == (char) 123 || prev == inputedPrev) {
            return (char) 0;
        } else {
            return prev;
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
