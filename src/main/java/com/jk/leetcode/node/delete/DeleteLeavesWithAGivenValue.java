package com.jk.leetcode.node.delete;

import com.jk.leetcode.node.TreeNode;

public class DeleteLeavesWithAGivenValue {
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        if (root == null) return null;

        if (root.left == null && root.right == null) {
            if (root.val == target) {
                return null;
            } else {
                return root;
            }
        }

        root.left = removeLeafNodes(root.left, target);
        root.right = removeLeafNodes(root.right, target);

        if (root.left == null && root.right == null) {
            if (root.val == target) {
                return null;
            }
        }

        return root;
    }
}
