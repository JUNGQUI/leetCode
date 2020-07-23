package com.jk.leetcode.node.treenode;

public class FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree {

    class Solution {
        public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
            if (original == null || original.val == target.val) {
                return cloned;
            }

            TreeNode result = null;

            if (original.left != null) {
                result = getTargetCopy(original.left, cloned.left, target);
            }

            if (result != null) {
                return result;
            }

            return getTargetCopy(original.right, cloned.right, target);
        }
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
