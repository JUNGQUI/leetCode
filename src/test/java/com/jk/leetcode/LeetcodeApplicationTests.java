package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        ListNode head = new ListNode(1, new ListNode(0, new ListNode(1)));

        int length = -1;

        List<Integer> results = new ArrayList<>();
        int result = 0;

        while(head != null) {
            length++;
            results.add(head.val);
            head = head.next;
        }

        for (Integer temp : results) {
            result += temp*Math.pow(2, length);
            length--;
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
