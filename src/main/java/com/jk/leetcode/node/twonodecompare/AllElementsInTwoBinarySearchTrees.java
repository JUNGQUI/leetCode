package com.jk.leetcode.node.twonodecompare;

import com.jk.leetcode.node.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllElementsInTwoBinarySearchTrees {
    class Solution {
        public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
            List<Integer> results = new ArrayList<>();

            List<Integer> root1List = getAllElementsOneNode(root1);
            List<Integer> root2List = getAllElementsOneNode(root2);
            int idx1 = 0, idx2 = 0;

            while(idx1 != root1List.size() || idx2 != root2List.size()) {

                if (idx1 == root1List.size()) {
                    results.add(root2List.get(idx2));
                    idx2++;
                    continue;
                }

                if (idx2 == root2List.size()) {
                    results.add(root1List.get(idx1));
                    idx1++;
                    continue;
                }

                if (root1List.get(idx1) <= root2List.get(idx2)) {
                    results.add(root1List.get(idx1));
                    idx1++;
                } else {
                    results.add(root2List.get(idx2));
                    idx2++;
                }
            }

            return results;
        }

        private List<Integer> getAllElementsOneNode(TreeNode root) {
            List<Integer> tempResults = new ArrayList<>();

            if (root == null) return tempResults;

            tempResults.addAll(getAllElementsOneNode(root.left));
            tempResults.add(root.val);
            tempResults.addAll(getAllElementsOneNode(root.right));

            return tempResults;
        }
    }
}
