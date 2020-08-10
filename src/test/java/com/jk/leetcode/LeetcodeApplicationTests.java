package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] prices = new int[] {
                8,4,6,2,3
        };

        int[] results = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            boolean changedFlag = false;
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] >= prices[j]) {
                    results[i] = prices[i] - prices[j];
                    changedFlag = true;
                    break;
                }
            }

            if (results[i] == 0 && !changedFlag) {
                results[i] = prices[i];
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
