package com.jk.leetcode.node.buildtree;

import com.jk.leetcode.node.TreeNode;

import java.util.Arrays;

public class MaximumBinaryTree {
    class Solution {
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
    }
}
