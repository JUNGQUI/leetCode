package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    int sum = 0;

    @Test
    void contextLoads() {
//        TreeNode root = new TreeNode(
//                4,
//                new TreeNode(
//                        1,
//                        new TreeNode(0),
//                        new TreeNode(
//                                2,
//                                null,
//                                new TreeNode(3))
//                ),
//                new TreeNode(
//                        6,
//                        new TreeNode(5),
//                        new TreeNode(
//                                7,
//                                null,
//                                new TreeNode(8))
//                )
//        );

        TreeNode root = new TreeNode(
                3,
                new TreeNode(2, new TreeNode(1),null),
                new TreeNode(4)
        );

        root = bstToGst(root);

        System.out.println("J Tag");
    }

    public TreeNode bstToGst(TreeNode root) {
        if (root == null) {
            return root;
        }

        return calculator(root);
    }

    private TreeNode calculator(TreeNode root) {
        if (root == null) {
            return root;
        }

        calculator(root.right);
        sum += root.val;
        root.val = sum;
        calculator(root.left);

        return root;
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
