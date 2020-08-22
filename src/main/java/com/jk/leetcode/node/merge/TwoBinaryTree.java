package com.jk.leetcode.node.merge;

import com.jk.leetcode.node.TreeNode;

public class TwoBinaryTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }

        int val = (t1 != null ? t1.val : 0) + (t2 != null ? t2.val : 0);

        TreeNode result = new TreeNode(val);
        result.left = mergeTrees(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        result.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return result;
    }
}
