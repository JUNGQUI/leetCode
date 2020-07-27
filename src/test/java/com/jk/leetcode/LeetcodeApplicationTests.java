package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        int[] rating = new int[]{2, 5, 3, 4, 1};

        int[] indices = new int[] {4,5,6,7,0,2,1,3};
        String s = "codeleet";

        char[] tempS = s.toCharArray();
        char[] tempResults = new char[s.length()];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            tempResults[indices[i]] = tempS[i];
        }

        for (char temp : tempResults) {
            result.append(temp);
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
