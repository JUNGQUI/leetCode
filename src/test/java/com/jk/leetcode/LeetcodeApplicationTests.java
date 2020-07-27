package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] rating = new int[]{2, 5, 3, 4, 1};

        int result = 0;

        for (int i = 1; i < rating.length-1; i++) {
            int[] left = new int[]{0, 0};
            int[] right = new int[]{0, 0};

            for (int j = 0; j < i; j++) {
                if (rating[j] < rating[i]) {
                    left[0]++;
                } else if (rating[j] > rating[i]) {
                    left[1]++;
                }
            }

            for (int k = i+1; k < rating.length; k++) {
                if (rating[k] > rating[i]) {
                    right[0]++;
                } else if (rating[k] < rating[i]) {
                    right[1]++;
                }
            }

            result += (left[0]*right[0]) + (left[1]*right[1]);
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
}
