package com.jk.leetcode.node.buildtree;

import com.jk.leetcode.node.TreeNode;

public class InsertIntoABinarySearchTree {
    class Solution {
        public TreeNode insertIntoBST(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }

            if (root.val > val) {
                root.left = insertIntoBST(root.left, val);
            }

            if (root.val < val) {
                root.right = insertIntoBST(root.right, val);
            }

            return root;
        }
    }
}
