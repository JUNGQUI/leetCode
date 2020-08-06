package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {
//        TreeNode root1 = new TreeNode(2, new TreeNode(1), new TreeNode(4));
//        TreeNode root2 = new TreeNode(1, new TreeNode(0), new TreeNode(3));

        TreeNode root1 = new TreeNode(0, new TreeNode(-10), new TreeNode(10));
        TreeNode root2 = new TreeNode(5, new TreeNode(1, new TreeNode(0), new TreeNode(2)), new TreeNode(7));

        getAllElements(root1, root2);

        System.out.println("J Tag");
    }

    private List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
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

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
