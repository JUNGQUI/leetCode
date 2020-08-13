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

        while(s.length() != 0) {

        }

        s = "rat";

        System.out.println("J Tag");
    }

    private String findSmallest(Map<String, String> result, String s) {
        char smallest = s.charAt(0);
        int idx = -1;

        for (int i = 0; i < s.length(); i++) {
            if (smallest > s.charAt(i)) {
                smallest = s.charAt(i);
                idx = i;
            }
        }

        return s.substring(0, idx) + s.substring(idx+1);
    }

    private String findBiggest(String s) {

    }

    public String sortString(String s) {

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
