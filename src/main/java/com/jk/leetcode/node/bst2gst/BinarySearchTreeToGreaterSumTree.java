package com.jk.leetcode.node.bst2gst;

import com.jk.leetcode.node.TreeNode;

public class BinarySearchTreeToGreaterSumTree {
    class Solution {
        int sum = 0;

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
    }
}
