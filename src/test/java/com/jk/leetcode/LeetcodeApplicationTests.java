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
        int[][] mat = new int[][] {
                {3, 3, 1, 1},
                {2, 2, 1, 2},
                {1, 1, 1, 2}
        };
        int[][] results = new int[][] {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}
        };

        int max = Math.min(mat.length, mat[0].length);

        for (int i = mat.length-1; i > 0; i--) {
            List<Integer> diagons = new ArrayList<>();
            int min = Math.min(mat.length - i, max);

            for (int j = 0; j < min; j++) {
                diagons.add(mat[i+j][j]);
            }

            int idx = 0;
            diagons.sort(null);

            for (int j = 0; j < min; j++) {
                results[i+j][j] = diagons.get(idx);
                idx++;
            }
        }

        for (int a = 0; a < mat[0].length; a++) {
            List<Integer> diagons = new ArrayList<>();
            int min = Math.min(mat[0].length - a, max);

            for (int b = 0; b < min; b++) {
                diagons.add(mat[b][a+b]);
            }

            int idx = 0;
            diagons.sort(null);

            for (int b = 0; b < min; b++) {
                results[b][a+b] = diagons.get(idx);
                idx++;
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
