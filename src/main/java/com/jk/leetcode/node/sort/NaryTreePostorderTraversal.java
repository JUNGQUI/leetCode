package com.jk.leetcode.node.sort;

import com.jk.leetcode.node.Node;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    class Solution {
        List<Integer> results = new ArrayList<>();

        public List<Integer> postorder(Node root) {
            if (root == null) return new ArrayList<>();

            for (Node element : root.children) {
                postorder(element);
            }

            results.add(root.val);

            return results;
        }
    }
}
