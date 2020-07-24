package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] queries = new int[] {3, 1, 2, 1};
        int m = 5;

        List<Integer> permutation = new ArrayList<>();

        for (int i = m; i > 0; i--) {
            permutation.add(i);
        }

        int[] results = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            results[j] = m-permutation.indexOf(queries[j])-1;
            permutation.remove((Integer) queries[j]);
            permutation.add(queries[j]);
        }

        System.out.println("J Tag");
    }

    // 12345
    // 31245
    // 13245
    // 21345
    // 12345


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
}
