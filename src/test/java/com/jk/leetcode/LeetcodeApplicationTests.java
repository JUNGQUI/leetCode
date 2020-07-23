package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
        TreeNode treeNode = new TreeNode(
                6,
                new TreeNode(
                        7,
                        new TreeNode(
                                2,
                                new TreeNode(9),
                                null),
                        new TreeNode(
                                7,
                                new TreeNode(1),
                                new TreeNode(4))),
                new TreeNode(
                        8,
                        new TreeNode(1),
                        new TreeNode(
                                3, null, new TreeNode(5)
                        )
                )
        );

        int count = sumEvenGrandparent(treeNode);

        System.out.println("J Tag");
    }

    private int sumEvenGrandparent(TreeNode root) {
        int count = 0;

        if (root == null) return count;

        if (root.val % 2 == 0) {
            if (root.left != null) {
                count += root.left.left != null ? root.left.left.val : 0;
                count += root.left.right != null ? root.left.right.val : 0;
            }

            if (root.right != null) {
                count += root.right.left != null ? root.right.left.val : 0;
                count += root.right.right != null ? root.right.right.val : 0;
            }
        }

        count += sumEvenGrandparent(root.left);
        count += sumEvenGrandparent(root.right);

        return count;
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
