package com.jk.leetcode.node.queue;

import com.jk.leetcode.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {
    class Solution {
        public int maxLevelSum(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();

            int level = 0, maxLevel = 0, maxValue = Integer.MIN_VALUE;
            queue.add(root);

            while (!queue.isEmpty()) {
                level++;
                int currentValue = 0, currentSize = queue.size();

                for (int i = 0; i < currentSize; i++) {
                    TreeNode temp = queue.poll();
                    currentValue += temp.val;

                    if (temp.left != null) {
                        queue.add(temp.left);
                    }

                    if (temp.right != null) {
                        queue.add(temp.right);
                    }
                }

                if (currentValue > maxValue) {
                    maxValue = currentValue;
                    maxLevel = level;
                }
            }

            return maxLevel;
        }
    }
}
