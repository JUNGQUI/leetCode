package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int n = 2, m = 3;
        int[][] indices = new int[][] {
                {0, 1},
                {1, 1}
        };

        boolean[] rowOdd = new boolean[n];
        boolean[] colOdd = new boolean[m];

        for (int[] row : indices) {
            rowOdd[row[0]] = !rowOdd[row[0]];
            colOdd[row[1]] = !colOdd[row[1]];
        }

        int result = 0;

        for (boolean ro : rowOdd) {
            for (boolean co : colOdd) {
                result += (ro && !co) || (!ro && co) ? 1 : 0;
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
