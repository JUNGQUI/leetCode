package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;


@SpringBootTest
class LeetcodeApplicationTests {

    int sum = 0;

    @Test
    void contextLoads() {
        int[] nums = new int[] {3, 2, 1, 6, 0, 5};

        TreeNode root = constructMaximumBinaryTree(nums);

        System.out.println("J Tag");
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        int highestVal = 0, highestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (highestVal < nums[i]) {
                highestVal = nums[i];
                highestIndex = i;
            }
        }

        int[] leftSub = Arrays.copyOfRange(nums, 0, highestIndex);
        int[] rightSub = Arrays.copyOfRange(nums, highestIndex+1, nums.length);

        TreeNode root = new TreeNode(highestVal);

        root.left = constructMaximumBinaryTree(leftSub);
        root.right = constructMaximumBinaryTree(rightSub);

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
