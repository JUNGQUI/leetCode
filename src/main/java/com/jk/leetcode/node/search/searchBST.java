package com.jk.leetcode.node.search;

import com.jk.leetcode.node.TreeNode;

public class searchBST {
    class Solution {
        public TreeNode searchBST(TreeNode root, int val) {
            if (root == null) {
                return null;
            }

            if (root.val > val) return searchBST(root.left, val);
            else if (root.val < val) return searchBST(root.right, val);
            else return root;
        }
    }
}
