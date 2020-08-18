package com.jk.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.StringUtils;

import java.util.*;

@SpringBootTest
class LeetcodeApplicationTests {

    @Test
    void contextLoads() {

//        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4))));
        TreeNode root = new TreeNode(
                14,
                new TreeNode(9, new TreeNode(2), new TreeNode(13)),
                new TreeNode(16));

        List<Integer> elements = searchBST(root);
        elements.sort(Integer::compareTo);

        TreeNode result = makeBST(null, elements);

        System.out.println("J Tag");
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
