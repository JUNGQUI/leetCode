package com.jk.leetcode.node.deepestsum;

import com.jk.leetcode.node.TreeNode;

public class DeepestLeavesSum {
    class Solution {
        public int deepestLeavesSum(TreeNode root) {
            int sum = calculator(0, root) % 200;

            return sum;
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
    }
}
