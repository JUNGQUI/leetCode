package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        String S = "(()())(())(()(()))";

        int startIdx = 0, idx = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            idx += S.charAt(i) == '(' ? 1 : -1;

            if (idx == 0) {
                result.append(S, startIdx + 1, i);
                startIdx = i+1;
            }
        }

        System.out.println("J Tag");
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
