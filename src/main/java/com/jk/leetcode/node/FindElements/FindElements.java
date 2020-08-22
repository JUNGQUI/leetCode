package com.jk.leetcode.node.FindElements;

import com.jk.leetcode.node.TreeNode;

import java.util.HashMap;

public class FindElements {
    HashMap<Integer, Integer> values;

    public FindElements(TreeNode root) {
        values = new HashMap<>();
        fixElements(root);
    }

    private void fixElements(TreeNode root) {
        if (root.val == -1) {
            root.val = 0;
            values.put(0, 0);
        }

        if (root.left != null) {
            root.left.val = root.val * 2 + 1;
            values.put(root.val * 2 + 1, root.val * 2 + 1);
            fixElements(root.left);
        }

        if (root.right != null) {
            root.right.val = root.val * 2 + 2;
            values.put(root.val * 2 + 2, root.val * 2 + 2);
            fixElements(root.right);
        }
    }

    public boolean find(int target) {
        return values.containsKey(target);
    }
}
