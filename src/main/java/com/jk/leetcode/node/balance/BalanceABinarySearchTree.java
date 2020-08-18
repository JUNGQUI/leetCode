package com.jk.leetcode.node.balance;

import com.jk.leetcode.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {
    class Solution {
        public TreeNode balanceBST(TreeNode root) {
            List<Integer> elements = searchBST(root);
            elements.sort(Integer::compareTo);

            TreeNode result = makeBST(null, elements);

            return result;
        }

        private TreeNode makeBST(TreeNode root, List<Integer> nums) {
            if (nums == null || nums.size() == 0) {
                return null;
            }

            if (nums.size() == 1) {
                return new TreeNode(nums.get(0));
            }

            int index = nums.size()/2;
            root = new TreeNode(nums.get(index));
            root.left = makeBST(root.left, nums.subList(0, index));
            root.right = makeBST(root.right, nums.subList(index+1, nums.size()));

            return root;
        }

        private List<Integer> searchBST(TreeNode root) {
            if (root == null) {
                return new ArrayList<>();
            }
            List<Integer> element = new ArrayList<>();

            element.add(root.val);
            element.addAll(searchBST(root.left));
            element.addAll(searchBST(root.right));

            return element;
        }
    }
}
