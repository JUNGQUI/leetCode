package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] arr = new int[] {17, 18, 5, 4, 6, 1};
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int maximum = 0;

            for (int j = i+1; j < arr.length; j++) {
                maximum = arr[j] > maximum ? arr[j] : maximum;
            }

            result[i] = maximum;
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
