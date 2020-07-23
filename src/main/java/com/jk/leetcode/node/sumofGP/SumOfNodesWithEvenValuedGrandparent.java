package com.jk.leetcode.node.sumofGP;

public class SumOfNodesWithEvenValuedGrandparent {
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

    class Solution {
        public int sumEvenGrandparent(TreeNode root) {
            int count = 0;

            if (root == null) return count;

            if (root.val % 2 == 0) {
                if (root.left != null) {
                    count += root.left.left != null ? root.left.left.val : 0;
                    count += root.left.right != null ? root.left.right.val : 0;
                }

                if (root.right != null) {
                    count += root.right.left != null ? root.right.left.val : 0;
                    count += root.right.right != null ? root.right.right.val : 0;
                }
            }

            count += sumEvenGrandparent(root.left);
            count += sumEvenGrandparent(root.right);

            return count;
        }
    }
}
