package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

        TreeNode root = new TreeNode(
                6,
                new TreeNode(
                        7,
                        new TreeNode(2, new TreeNode(9), null),
                        new TreeNode(7, new TreeNode(1), new TreeNode(4)
                        )
                ),
                new TreeNode(
                        8,
                        new TreeNode(1),
                        new TreeNode(3, null, new TreeNode(5))
                ));


        TreeNode treeNode = new TreeNode(
                1,
                new TreeNode(
                        2,
                        new TreeNode(
                                4,
                                new TreeNode(7),
                                null),
                        new TreeNode(5)
                ),
                new TreeNode(
                        3,
                        null,
                        new TreeNode(
                                6, null, new TreeNode(8)
                        )
                )
        );

        int count = deepestLeavesSum(root);

        System.out.println("J Tag");
    }

    private int calculator(int checkSum, TreeNode treeNode) {
        checkSum += 200;
        int left = 0, right = 0, leftDepth, rightDepth;

        if (treeNode.left == null && treeNode.right == null) return treeNode.val + checkSum;

        if (treeNode.left != null) {
            left = calculator(checkSum, treeNode.left);
        }

        if (treeNode.right != null) {
            right = calculator(checkSum, treeNode.right);
        }

        leftDepth = left/200;
        rightDepth = right/200;

        if (leftDepth == rightDepth) {
            return left + right%200;
        } else if (leftDepth > rightDepth) {
            return left;
        } else {
            return right;
        }
    }

    private int deepestLeavesSum(TreeNode root) {
        int sum = calculator(0, root) % 200;

        return sum;
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
