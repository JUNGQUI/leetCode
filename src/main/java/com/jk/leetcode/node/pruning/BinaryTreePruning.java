package com.jk.leetcode.node.pruning;

import com.jk.leetcode.node.TreeNode;

public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return root.val == 1 ? root : null;
        } else {
            if (root.left != null) {
                root.left = pruneTree(root.left);
            }

            if (root.right != null) {
                root.right = pruneTree(root.right);
            }

            if (root.left == null && root.right == null) {
                return root.val == 1 ? root : null;
            } else {
                return root;
            }
        }
    }
}
