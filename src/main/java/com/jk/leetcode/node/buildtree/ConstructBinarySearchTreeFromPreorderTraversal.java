package com.jk.leetcode.node.buildtree;

import com.jk.leetcode.node.TreeNode;

public class ConstructBinarySearchTreeFromPreorderTraversal {
    class Solution {
        public TreeNode bstFromPreorder(int[] preorder) {
            if (preorder == null || preorder.length == 0) {
                return null;
            }

            TreeNode root = new TreeNode(preorder[0]);

            for (int i = 1; i < preorder.length; i++) {
                calculator(root, preorder[i]);
            }

            return root;
        }

        private void calculator (TreeNode root, int val) {
            if (root.val > val) {
                if (root.left != null) {
                    calculator(root.left, val);
                } else {
                    root.left = new TreeNode(val);
                }
            } else {
                if (root.right != null) {
                    calculator(root.right, val);
                } else {
                    root.right = new TreeNode(val);
                }
            }
        }
    }
}
