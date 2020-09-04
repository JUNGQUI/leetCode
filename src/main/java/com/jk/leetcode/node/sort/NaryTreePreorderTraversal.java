package com.jk.leetcode.node.sort;

import com.jk.leetcode.node.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    class Solution {
        List<Integer> results = new ArrayList<>();

        public List<Integer> preorder(Node root) {
            if (root == null) return new ArrayList<>();

            results.add(root.val);

            for (Node element : root.children) {
                preorder(element);
            }

            return results;
        }
    }
}
